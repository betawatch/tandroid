package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class dx extends vl0 {
    public final int q0;
    public boolean r0;
    public float s0;
    public boolean t0;
    public float u0;
    public float v0;
    public boolean w0;
    public boolean x0;
    public VelocityTracker y0;
    public final /* synthetic */ yy z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(yy yyVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, yyVar.e2);
        this.z0 = yyVar;
        this.t0 = true;
        this.q0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // org.telegram.ui.Components.vl0, android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.x0 = false;
            this.w0 = false;
            this.u0 = motionEvent.getRawX();
            this.v0 = motionEvent.getRawY();
        } else if (!this.w0 && !this.x0) {
            yy yyVar = this.z0;
            if (yyVar.K0 != null && Math.abs(motionEvent.getRawY() - this.v0) >= this.q0) {
                this.w0 = true;
                this.v0 = motionEvent.getRawY();
                ((m.a) yyVar.K0).e();
                if (this.r0) {
                    yyVar.h.i();
                    this.r0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.vl0, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        yy yyVar = this.z0;
        m.i3 i3Var = yyVar.b2;
        kw kwVar = yyVar.h;
        if (this.s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.t0) {
            this.t0 = false;
            this.s0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            yyVar.S1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.x0 = false;
            this.w0 = false;
            this.u0 = motionEvent.getRawX();
            this.v0 = motionEvent.getRawY();
        } else if (!this.w0 && !this.x0 && yyVar.K0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.u0);
            float f10 = this.q0;
            if (abs >= f10 && canScrollHorizontally((int) (this.u0 - motionEvent.getRawX()))) {
                this.x0 = true;
                AndroidUtilities.cancelRunOnUIThread(i3Var);
                yyVar.T1 = true;
                yyVar.a0();
            } else if (Math.abs(motionEvent.getRawY() - this.v0) >= f10) {
                this.w0 = true;
                this.v0 = motionEvent.getRawY();
                ((m.a) yyVar.K0).e();
                if (this.r0) {
                    kwVar.i();
                    this.r0 = false;
                }
            }
        }
        if (yyVar.T1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(i3Var, 1500L);
        }
        if (!this.w0) {
            float translationX = getTranslationX();
            if (getScrollX() == 0 && translationX == 0.0f) {
                if (this.r0 || this.s0 - motionEvent.getX() >= 0.0f) {
                    if (this.r0 && this.s0 - motionEvent.getX() > 0.0f && kwVar.a0) {
                        kwVar.i();
                        this.r0 = false;
                    }
                } else if (!kwVar.I) {
                    kwVar.a0 = true;
                    kwVar.setScrollState(1);
                    kwVar.N = 0.0f;
                    kwVar.P = 0.0f;
                    VelocityTracker velocityTracker = kwVar.S;
                    if (velocityTracker == null) {
                        kwVar.S = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    kwVar.S.addMovement(obtain);
                    obtain.recycle();
                    this.r0 = true;
                    getTranslationX();
                }
            }
            if (this.r0) {
                motionEvent.getX();
            }
            this.s0 = motionEvent.getX();
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.t0 = true;
                this.x0 = false;
                this.w0 = false;
                if (this.r0) {
                    kwVar.i();
                    this.r0 = false;
                }
            }
            return this.r0 || super.onTouchEvent(motionEvent);
        }
        if (this.y0 == null) {
            this.y0 = VelocityTracker.obtain();
        }
        this.y0.addMovement(motionEvent);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.y0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
            float yVelocity = this.y0.getYVelocity();
            this.y0.recycle();
            this.y0 = null;
            if (motionEvent.getAction() == 1) {
                m.a aVar = (m.a) yyVar.K0;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.c;
                if (aVar.d()) {
                    chatActivityEnterView.z3 = false;
                    if ((!aVar.a || yVelocity < AndroidUtilities.dp(200.0f)) && ((aVar.a || yVelocity > AndroidUtilities.dp(-200.0f)) && ((!(z10 = aVar.a) || chatActivityEnterView.x3 > 0.6f) && (z10 || chatActivityEnterView.x3 < 0.4f)))) {
                        chatActivityEnterView.m1(z10, true, true, true);
                    } else {
                        chatActivityEnterView.m1(!aVar.a, true, true, true);
                    }
                }
            } else {
                m.a aVar2 = (m.a) yyVar.K0;
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) aVar2.c;
                if (chatActivityEnterView2.s3) {
                    chatActivityEnterView2.z3 = false;
                    chatActivityEnterView2.m1(aVar2.a, true, false, true);
                }
            }
            this.t0 = true;
            this.x0 = false;
            this.w0 = false;
        } else {
            cx cxVar = yyVar.K0;
            int round = Math.round(motionEvent.getRawY() - this.v0);
            m.a aVar3 = (m.a) cxVar;
            ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) aVar3.c;
            if (aVar3.d()) {
                Point point = AndroidUtilities.displaySize;
                int max = Math.max(Math.min(round + aVar3.b, 0), -(chatActivityEnterView3.y3 - (point.x > point.y ? chatActivityEnterView3.t2 : chatActivityEnterView3.s2)));
                if (chatActivityEnterView3.Y4 == null) {
                    float f11 = max;
                    chatActivityEnterView3.Q0.setTranslationY(f11);
                    chatActivityEnterView3.setTranslationY(f11);
                }
                chatActivityEnterView3.x3 = max / (-(chatActivityEnterView3.y3 - r4));
                chatActivityEnterView3.h1.invalidate();
            }
        }
        cancelLongPress();
        return true;
    }
}
