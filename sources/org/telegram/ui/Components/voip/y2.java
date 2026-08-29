package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.p11;
import org.telegram.ui.oh1;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class y2 extends FrameLayout {
    public Activity a;
    public boolean b;
    public AnimationNotificationsLocker c;
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
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
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
        if (oh1.j1 != null) {
            if (VoIPService.getSharedInstance() != null) {
                int measuredHeight = oh1.j1.q0.getMeasuredHeight();
                if (oh1.j1.z0 && !VoIPService.getSharedInstance().isConverting()) {
                    oh1 oh1Var = oh1.j1;
                    o2.l(oh1Var.b, oh1Var.a, oh1Var.q0.getMeasuredWidth(), measuredHeight, 0);
                    WindowInsets windowInsets = oh1.j1.n0;
                    if (windowInsets != null) {
                        o2.S = windowInsets.getSystemWindowInsetTop();
                        oh1.j1.n0.getSystemWindowInsetBottom();
                    }
                }
            }
            oh1.j1.Y.d.release();
            oh1.j1.Z.d.release();
            oh1.j1.X.release();
            oh1.j1.l();
        }
        oh1.j1 = null;
        if (this.b) {
            try {
                ((WindowManager) this.a.getSystemService("window")).removeView(this);
            } catch (Exception unused) {
            }
        } else {
            this.c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new p11(this, 18)).setDuration(j10).setInterpolator(jr.f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.a);
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.b) {
            return;
        }
        setTranslationY(getMeasuredHeight());
        setAlpha(0.0f);
        animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(jr.f).start();
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
                float x4 = motionEvent.getX() - this.h;
                float y8 = motionEvent.getY() - this.n;
                if (!this.r && Math.abs(y8) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y8) / 3.0f > x4) {
                    this.n = motionEvent.getY();
                    this.r = true;
                    y8 = 0.0f;
                }
                if (this.r) {
                    float f9 = y8 >= 0.0f ? y8 : 0.0f;
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f9);
                }
                return this.r;
            }
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                float translationY = getTranslationY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
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
