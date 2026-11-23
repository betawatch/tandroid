package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class yw extends gl0 {
    public float A0;
    public boolean B0;
    public boolean C0;
    public VelocityTracker D0;
    public final /* synthetic */ qy E0;
    public final int v0;
    public boolean w0;
    public float x0;
    public boolean y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(qy qyVar, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var, qyVar.j2);
        this.E0 = qyVar;
        this.y0 = true;
        this.v0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // org.telegram.ui.Components.gl0, android.widget.HorizontalScrollView, android.view.ViewGroup
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
            qy qyVar = this.E0;
            if (qyVar.P0 != null && Math.abs(motionEvent.getRawY() - this.A0) >= this.v0) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((bg.w0) qyVar.P0).e();
                if (this.w0) {
                    qyVar.h.i();
                    this.w0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.gl0, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        qy qyVar = this.E0;
        rc rcVar = qyVar.g2;
        gw gwVar = qyVar.h;
        if (this.s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.y0) {
            this.y0 = false;
            this.x0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            qyVar.X1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0 && qyVar.P0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.z0);
            float f10 = this.v0;
            if (abs >= f10 && canScrollHorizontally((int) (this.z0 - motionEvent.getRawX()))) {
                this.C0 = true;
                org.telegram.messenger.g0.r(rcVar);
                qyVar.Y1 = true;
                qyVar.Z();
            } else if (Math.abs(motionEvent.getRawY() - this.A0) >= f10) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((bg.w0) qyVar.P0).e();
                if (this.w0) {
                    gwVar.i();
                    this.w0 = false;
                }
            }
        }
        if (qyVar.Y1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            org.telegram.messenger.g0.h3(rcVar, 1500L);
        }
        if (!this.B0) {
            float translationX = getTranslationX();
            if (getScrollX() == 0 && translationX == 0.0f) {
                if (this.w0 || this.x0 - motionEvent.getX() >= 0.0f) {
                    if (this.w0 && this.x0 - motionEvent.getX() > 0.0f && gwVar.f0) {
                        gwVar.i();
                        this.w0 = false;
                    }
                } else if (!gwVar.N) {
                    gwVar.f0 = true;
                    gwVar.setScrollState(1);
                    gwVar.S = 0.0f;
                    gwVar.U = 0.0f;
                    VelocityTracker velocityTracker = gwVar.a0;
                    if (velocityTracker == null) {
                        gwVar.a0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    gwVar.a0.addMovement(obtain);
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
                    gwVar.i();
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
                bg.w0 w0Var = (bg.w0) qyVar.P0;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) w0Var.c;
                if (w0Var.d()) {
                    chatActivityEnterView.u4 = false;
                    if ((!w0Var.a || yVelocity < org.telegram.messenger.g0.L(200.0f)) && ((w0Var.a || yVelocity > org.telegram.messenger.g0.L(-200.0f)) && ((!(z10 = w0Var.a) || chatActivityEnterView.s4 > 0.6f) && (z10 || chatActivityEnterView.s4 < 0.4f)))) {
                        chatActivityEnterView.S1(z10, true, true, true);
                    } else {
                        chatActivityEnterView.S1(!w0Var.a, true, true, true);
                    }
                }
            } else {
                bg.w0 w0Var2 = (bg.w0) qyVar.P0;
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) w0Var2.c;
                if (chatActivityEnterView2.n4) {
                    chatActivityEnterView2.u4 = false;
                    chatActivityEnterView2.S1(w0Var2.a, true, false, true);
                }
            }
            this.y0 = true;
            this.C0 = false;
            this.B0 = false;
        } else {
            xw xwVar = qyVar.P0;
            int round = Math.round(motionEvent.getRawY() - this.A0);
            bg.w0 w0Var3 = (bg.w0) xwVar;
            ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) w0Var3.c;
            if (w0Var3.d()) {
                Point point = org.telegram.messenger.g0.q;
                int max = Math.max(Math.min(round + w0Var3.b, 0), -(chatActivityEnterView3.t4 - (point.x > point.y ? chatActivityEnterView3.o3 : chatActivityEnterView3.n3)));
                if (chatActivityEnterView3.e7 == null) {
                    float f11 = max;
                    chatActivityEnterView3.V0.setTranslationY(f11);
                    chatActivityEnterView3.setTranslationY(f11);
                }
                chatActivityEnterView3.s4 = max / (-(chatActivityEnterView3.t4 - r4));
                chatActivityEnterView3.c2.invalidate();
            }
        }
        cancelLongPress();
        return true;
    }
}
