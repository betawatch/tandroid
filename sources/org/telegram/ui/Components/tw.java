package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class tw extends wk0 {
    public float A0;
    public boolean B0;
    public boolean C0;
    public VelocityTracker D0;
    public final /* synthetic */ ly E0;
    public final int v0;
    public boolean w0;
    public float x0;
    public boolean y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(ly lyVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, lyVar.j2);
        this.E0 = lyVar;
        this.y0 = true;
        this.v0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // org.telegram.ui.Components.wk0, android.widget.HorizontalScrollView, android.view.ViewGroup
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
            ly lyVar = this.E0;
            if (lyVar.P0 != null && Math.abs(motionEvent.getRawY() - this.A0) >= this.v0) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((bg.v0) lyVar.P0).e();
                if (this.w0) {
                    lyVar.h.i();
                    this.w0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wk0, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        ly lyVar = this.E0;
        zj zjVar = lyVar.g2;
        bw bwVar = lyVar.h;
        if (this.s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.y0) {
            this.y0 = false;
            this.x0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            lyVar.X1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0 && lyVar.P0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.z0);
            float f10 = this.v0;
            if (abs >= f10 && canScrollHorizontally((int) (this.z0 - motionEvent.getRawX()))) {
                this.C0 = true;
                org.telegram.messenger.g0.r(zjVar);
                lyVar.Y1 = true;
                lyVar.Z();
            } else if (Math.abs(motionEvent.getRawY() - this.A0) >= f10) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((bg.v0) lyVar.P0).e();
                if (this.w0) {
                    bwVar.i();
                    this.w0 = false;
                }
            }
        }
        if (lyVar.Y1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            org.telegram.messenger.g0.i3(zjVar, 1500L);
        }
        if (!this.B0) {
            float translationX = getTranslationX();
            if (getScrollX() == 0 && translationX == 0.0f) {
                if (this.w0 || this.x0 - motionEvent.getX() >= 0.0f) {
                    if (this.w0 && this.x0 - motionEvent.getX() > 0.0f && bwVar.f0) {
                        bwVar.i();
                        this.w0 = false;
                    }
                } else if (!bwVar.N) {
                    bwVar.f0 = true;
                    bwVar.setScrollState(1);
                    bwVar.S = 0.0f;
                    bwVar.U = 0.0f;
                    VelocityTracker velocityTracker = bwVar.a0;
                    if (velocityTracker == null) {
                        bwVar.a0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    bwVar.a0.addMovement(obtain);
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
                    bwVar.i();
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
                bg.v0 v0Var = (bg.v0) lyVar.P0;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) v0Var.c;
                if (v0Var.d()) {
                    chatActivityEnterView.m4 = false;
                    if ((!v0Var.a || yVelocity < org.telegram.messenger.g0.L(200.0f)) && ((v0Var.a || yVelocity > org.telegram.messenger.g0.L(-200.0f)) && ((!(z10 = v0Var.a) || chatActivityEnterView.k4 > 0.6f) && (z10 || chatActivityEnterView.k4 < 0.4f)))) {
                        chatActivityEnterView.E1(z10, true, true, true);
                    } else {
                        chatActivityEnterView.E1(!v0Var.a, true, true, true);
                    }
                }
            } else {
                bg.v0 v0Var2 = (bg.v0) lyVar.P0;
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) v0Var2.c;
                if (chatActivityEnterView2.f4) {
                    chatActivityEnterView2.m4 = false;
                    chatActivityEnterView2.E1(v0Var2.a, true, false, true);
                }
            }
            this.y0 = true;
            this.C0 = false;
            this.B0 = false;
        } else {
            sw swVar = lyVar.P0;
            int round = Math.round(motionEvent.getRawY() - this.A0);
            bg.v0 v0Var3 = (bg.v0) swVar;
            ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) v0Var3.c;
            if (v0Var3.d()) {
                Point point = org.telegram.messenger.g0.q;
                int max = Math.max(Math.min(round + v0Var3.b, 0), -(chatActivityEnterView3.l4 - (point.x > point.y ? chatActivityEnterView3.g3 : chatActivityEnterView3.f3)));
                if (chatActivityEnterView3.C6 == null) {
                    float f11 = max;
                    chatActivityEnterView3.V0.setTranslationY(f11);
                    chatActivityEnterView3.setTranslationY(f11);
                }
                chatActivityEnterView3.k4 = max / (-(chatActivityEnterView3.l4 - r4));
                chatActivityEnterView3.U1.invalidate();
            }
        }
        cancelLongPress();
        return true;
    }
}
