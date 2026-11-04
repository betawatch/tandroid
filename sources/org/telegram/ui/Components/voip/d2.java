package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.xq;
import org.telegram.ui.zb1;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class d2 extends FrameLayout {
    public Activity a;
    public boolean b;
    public g2.g c;
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

    public final void c(long j10) {
        if (this.f) {
            return;
        }
        this.f = true;
        if (zb1.o1 != null) {
            if (VoIPService.getSharedInstance() != null) {
                int measuredHeight = zb1.o1.v0.getMeasuredHeight();
                if (zb1.o1.E0 && !VoIPService.getSharedInstance().isConverting()) {
                    zb1 zb1Var = zb1.o1;
                    u1.e(zb1Var.b, zb1Var.a, zb1Var.v0.getMeasuredWidth(), measuredHeight, 0);
                    WindowInsets windowInsets = zb1.o1.s0;
                    if (windowInsets != null) {
                        u1.Y = windowInsets.getSystemWindowInsetTop();
                        zb1.o1.s0.getSystemWindowInsetBottom();
                    }
                }
            }
            zb1.o1.d0.d.release();
            zb1.o1.e0.d.release();
            zb1.o1.c0.release();
            zb1.o1.d();
        }
        zb1.o1 = null;
        if (this.b) {
            try {
                ((WindowManager) this.a.getSystemService("window")).removeView(this);
            } catch (Exception unused) {
            }
        } else {
            this.c.d();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new w9(this, 18)).setDuration(j10).setInterpolator(xq.f).start();
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.b) {
            return;
        }
        setTranslationY(getMeasuredHeight());
        setAlpha(0.0f);
        animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(xq.f).start();
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
                float y9 = motionEvent.getY() - this.n;
                if (!this.r && Math.abs(y9) > org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(y9) / 3.0f > x10) {
                    this.n = motionEvent.getY();
                    this.r = true;
                    y9 = 0.0f;
                }
                if (this.r) {
                    float f10 = y9 >= 0.0f ? y9 : 0.0f;
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

    public void setLockOnScreen(boolean z10) {
        this.b = z10;
    }
}
