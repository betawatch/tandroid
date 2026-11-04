package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class mw extends vk0 {
    public float A0;
    public boolean B0;
    public boolean C0;
    public VelocityTracker D0;
    public final /* synthetic */ ey E0;
    public final int v0;
    public boolean w0;
    public float x0;
    public boolean y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(ey eyVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, eyVar.j2);
        this.E0 = eyVar;
        this.y0 = true;
        this.v0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // org.telegram.ui.Components.vk0, android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0) {
            ey eyVar = this.E0;
            if (eyVar.P0 != null && Math.abs(motionEvent.getRawY() - this.A0) >= this.v0) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((cg.v0) eyVar.P0).e();
                if (this.w0) {
                    eyVar.h.i();
                    this.w0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.vk0, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        ey eyVar = this.E0;
        lt ltVar = eyVar.g2;
        uv uvVar = eyVar.h;
        if (this.s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.y0) {
            this.y0 = false;
            this.x0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            eyVar.X1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0 && eyVar.P0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.z0);
            float f10 = this.v0;
            if (abs >= f10 && canScrollHorizontally((int) (this.z0 - motionEvent.getRawX()))) {
                this.C0 = true;
                org.telegram.messenger.g0.r(ltVar);
                eyVar.Y1 = true;
                eyVar.Z();
            } else if (Math.abs(motionEvent.getRawY() - this.A0) >= f10) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((cg.v0) eyVar.P0).e();
                if (this.w0) {
                    uvVar.i();
                    this.w0 = false;
                }
            }
        }
        if (eyVar.Y1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            org.telegram.messenger.g0.i3(ltVar, 1500L);
        }
        if (!this.B0) {
            float translationX = getTranslationX();
            if (getScrollX() == 0 && translationX == 0.0f) {
                if (this.w0 || this.x0 - motionEvent.getX() >= 0.0f) {
                    if (this.w0 && this.x0 - motionEvent.getX() > 0.0f && uvVar.f0) {
                        uvVar.i();
                        this.w0 = false;
                    }
                } else if (!uvVar.N) {
                    uvVar.f0 = true;
                    uvVar.setScrollState(1);
                    uvVar.S = 0.0f;
                    uvVar.U = 0.0f;
                    VelocityTracker velocityTracker = uvVar.a0;
                    if (velocityTracker == null) {
                        uvVar.a0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    uvVar.a0.addMovement(obtain);
                    obtain.recycle();
                    this.w0 = true;
                    getTranslationX();
                }
            }
            if (this.w0) {
                motionEvent.getX();
            }
            this.x0 = motionEvent.getX();
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.y0 = true;
                this.C0 = false;
                this.B0 = false;
                if (this.w0) {
                    uvVar.i();
                    this.w0 = false;
                }
            }
            return this.w0 || super.onTouchEvent(motionEvent);
        }
        if (this.D0 == null) {
            this.D0 = VelocityTracker.obtain();
        }
        this.D0.addMovement(motionEvent);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.D0.computeCurrentVelocity(1000);
            float yVelocity = this.D0.getYVelocity();
            this.D0.recycle();
            this.D0 = null;
            if (motionEvent.getAction() == 1) {
                cg.v0 v0Var = (cg.v0) eyVar.P0;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) v0Var.c;
                if (v0Var.d()) {
                    chatActivityEnterView.F3 = false;
                    if ((!v0Var.a || yVelocity < org.telegram.messenger.g0.L(200.0f)) && ((v0Var.a || yVelocity > org.telegram.messenger.g0.L(-200.0f)) && ((!(z10 = v0Var.a) || chatActivityEnterView.D3 > 0.6f) && (z10 || chatActivityEnterView.D3 < 0.4f)))) {
                        chatActivityEnterView.m1(z10, true, true, true);
                    } else {
                        chatActivityEnterView.m1(!v0Var.a, true, true, true);
                    }
                }
            } else {
                cg.v0 v0Var2 = (cg.v0) eyVar.P0;
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) v0Var2.c;
                if (chatActivityEnterView2.y3) {
                    chatActivityEnterView2.F3 = false;
                    chatActivityEnterView2.m1(v0Var2.a, true, false, true);
                }
            }
            this.y0 = true;
            this.C0 = false;
            this.B0 = false;
        } else {
            lw lwVar = eyVar.P0;
            int round = Math.round(motionEvent.getRawY() - this.A0);
            cg.v0 v0Var3 = (cg.v0) lwVar;
            ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) v0Var3.c;
            if (v0Var3.d()) {
                Point point = org.telegram.messenger.g0.q;
                int max = Math.max(Math.min(round + v0Var3.b, 0), -(chatActivityEnterView3.E3 - (point.x > point.y ? chatActivityEnterView3.z2 : chatActivityEnterView3.y2)));
                if (chatActivityEnterView3.i5 == null) {
                    float f11 = max;
                    chatActivityEnterView3.V0.setTranslationY(f11);
                    chatActivityEnterView3.setTranslationY(f11);
                }
                chatActivityEnterView3.D3 = max / (-(chatActivityEnterView3.E3 - r4));
                chatActivityEnterView3.n1.invalidate();
            }
        }
        cancelLongPress();
        return true;
    }
}
