package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class rx extends qm0 {
    public final /* synthetic */ mz A0;
    public final int r0;
    public boolean s0;
    public float t0;
    public boolean u0;
    public float v0;
    public float w0;
    public boolean x0;
    public boolean y0;
    public VelocityTracker z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx(mz mzVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, mzVar.f2);
        this.A0 = mzVar;
        this.u0 = true;
        this.r0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // org.telegram.ui.Components.qm0, android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.y0 = false;
            this.x0 = false;
            this.v0 = motionEvent.getRawX();
            this.w0 = motionEvent.getRawY();
        } else if (!this.x0 && !this.y0) {
            mz mzVar = this.A0;
            if (mzVar.L0 != null && Math.abs(motionEvent.getRawY() - this.w0) >= this.r0) {
                this.x0 = true;
                this.w0 = motionEvent.getRawY();
                ((b7.l0) mzVar.L0).e();
                if (this.s0) {
                    mzVar.h.i();
                    this.s0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.qm0, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        mz mzVar = this.A0;
        m2.b bVar = mzVar.c2;
        xw xwVar = mzVar.h;
        if (this.s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.u0) {
            this.u0 = false;
            this.t0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            mzVar.T1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.y0 = false;
            this.x0 = false;
            this.v0 = motionEvent.getRawX();
            this.w0 = motionEvent.getRawY();
        } else if (!this.x0 && !this.y0 && mzVar.L0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.v0);
            float f10 = this.r0;
            if (abs >= f10 && canScrollHorizontally((int) (this.v0 - motionEvent.getRawX()))) {
                this.y0 = true;
                AndroidUtilities.cancelRunOnUIThread(bVar);
                mzVar.U1 = true;
                mzVar.a0();
            } else if (Math.abs(motionEvent.getRawY() - this.w0) >= f10) {
                this.x0 = true;
                this.w0 = motionEvent.getRawY();
                ((b7.l0) mzVar.L0).e();
                if (this.s0) {
                    xwVar.i();
                    this.s0 = false;
                }
            }
        }
        if (mzVar.U1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(bVar, 1500L);
        }
        if (!this.x0) {
            float translationX = getTranslationX();
            if (getScrollX() == 0 && translationX == 0.0f) {
                if (this.s0 || this.t0 - motionEvent.getX() >= 0.0f) {
                    if (this.s0 && this.t0 - motionEvent.getX() > 0.0f && xwVar.b0) {
                        xwVar.i();
                        this.s0 = false;
                    }
                } else if (!xwVar.J) {
                    xwVar.b0 = true;
                    xwVar.setScrollState(1);
                    xwVar.O = 0.0f;
                    xwVar.Q = 0.0f;
                    VelocityTracker velocityTracker = xwVar.T;
                    if (velocityTracker == null) {
                        xwVar.T = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    xwVar.T.addMovement(obtain);
                    obtain.recycle();
                    this.s0 = true;
                    getTranslationX();
                }
            }
            if (this.s0) {
                motionEvent.getX();
            }
            this.t0 = motionEvent.getX();
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.u0 = true;
                this.y0 = false;
                this.x0 = false;
                if (this.s0) {
                    xwVar.i();
                    this.s0 = false;
                }
            }
            return this.s0 || super.onTouchEvent(motionEvent);
        }
        if (this.z0 == null) {
            this.z0 = VelocityTracker.obtain();
        }
        this.z0.addMovement(motionEvent);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.z0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
            float yVelocity = this.z0.getYVelocity();
            this.z0.recycle();
            this.z0 = null;
            if (motionEvent.getAction() == 1) {
                b7.l0 l0Var = (b7.l0) mzVar.L0;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) l0Var.c;
                if (l0Var.d()) {
                    chatActivityEnterView.A3 = false;
                    if ((!l0Var.a || yVelocity < AndroidUtilities.dp(200.0f)) && ((l0Var.a || yVelocity > AndroidUtilities.dp(-200.0f)) && ((!(z4 = l0Var.a) || chatActivityEnterView.y3 > 0.6f) && (z4 || chatActivityEnterView.y3 < 0.4f)))) {
                        chatActivityEnterView.n1(z4, true, true, true);
                    } else {
                        chatActivityEnterView.n1(!l0Var.a, true, true, true);
                    }
                }
            } else {
                b7.l0 l0Var2 = (b7.l0) mzVar.L0;
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) l0Var2.c;
                if (chatActivityEnterView2.t3) {
                    chatActivityEnterView2.A3 = false;
                    chatActivityEnterView2.n1(l0Var2.a, true, false, true);
                }
            }
            this.u0 = true;
            this.y0 = false;
            this.x0 = false;
        } else {
            qx qxVar = mzVar.L0;
            int round = Math.round(motionEvent.getRawY() - this.w0);
            b7.l0 l0Var3 = (b7.l0) qxVar;
            ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) l0Var3.c;
            if (l0Var3.d()) {
                Point point = AndroidUtilities.displaySize;
                int max = Math.max(Math.min(round + l0Var3.b, 0), -(chatActivityEnterView3.z3 - (point.x > point.y ? chatActivityEnterView3.u2 : chatActivityEnterView3.t2)));
                if (chatActivityEnterView3.Z4 == null) {
                    float f11 = max;
                    chatActivityEnterView3.R0.setTranslationY(f11);
                    chatActivityEnterView3.setTranslationY(f11);
                }
                chatActivityEnterView3.y3 = max / (-(chatActivityEnterView3.z3 - r4));
                chatActivityEnterView3.i1.invalidate();
            }
        }
        cancelLongPress();
        return true;
    }
}
