package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.wq;
import org.telegram.ui.jc1;
import org.telegram.ui.va;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class o2 extends FrameLayout {
    public Activity a;
    public boolean b;
    public h2.f c;
    public VelocityTracker d;
    public boolean e;
    public boolean f;
    public float h;
    public float n;
    public boolean r;

    public static WindowManager.LayoutParams a() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.format = -2;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.screenOrientation = 1;
        org.telegram.messenger.g0.m(layoutParams);
        layoutParams.flags = -2144665216;
        return layoutParams;
    }

    public final void b() {
        c(330L);
    }

    public final void c(long j3) {
        if (this.f) {
            return;
        }
        this.f = true;
        if (jc1.l1 != null) {
            if (VoIPService.getSharedInstance() != null) {
                int measuredHeight = jc1.l1.t0.getMeasuredHeight();
                if (jc1.l1.C0 && !VoIPService.getSharedInstance().isConverting()) {
                    jc1 jc1Var = jc1.l1;
                    e2.f(jc1Var.b, jc1Var.a, jc1Var.t0.getMeasuredWidth(), measuredHeight, 0);
                    WindowInsets windowInsets = jc1.l1.q0;
                    if (windowInsets != null) {
                        e2.V = windowInsets.getSystemWindowInsetTop();
                        jc1.l1.q0.getSystemWindowInsetBottom();
                    }
                }
            }
            jc1.l1.c0.d.release();
            jc1.l1.d0.d.release();
            jc1.l1.b0.release();
            jc1.l1.c();
        }
        jc1.l1 = null;
        f2.d();
        if (this.b) {
            try {
                ((WindowManager) this.a.getSystemService("window")).removeView(this);
            } catch (Exception unused) {
            }
        } else {
            this.c.d();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new va(this, 18)).setDuration(j3).setInterpolator(wq.f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            org.telegram.messenger.g0.Q3(this.a);
            WindowManager windowManager = (WindowManager) this.a.getSystemService("window");
            setVisibility(8);
            windowManager.removeView(this);
            OrientationHelper.cameraRotationDisabled = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.b) {
            return;
        }
        setTranslationY(getMeasuredHeight());
        setAlpha(0.0f);
        animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(wq.f).start();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y10 = motionEvent.getY() - this.n;
                if (!this.r && Math.abs(y10) > org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(y10) / 3.0f > x10) {
                    this.n = motionEvent.getY();
                    this.r = true;
                    y10 = 0.0f;
                }
                if (this.r) {
                    float f10 = y10 >= 0.0f ? y10 : 0.0f;
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f10);
                }
                return this.r;
            }
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                float translationY = getTranslationY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.computeCurrentVelocity(1000);
                float xVelocity = this.d.getXVelocity();
                float yVelocity = this.d.getYVelocity();
                if (translationY >= getMeasuredHeight() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                    c(Math.max((int) ((200.0f / getMeasuredHeight()) * (getMeasuredHeight() - getTranslationY())), 50));
                } else {
                    animate().translationY(0.0f).start();
                }
                this.r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z9) {
        this.b = z9;
    }
}
