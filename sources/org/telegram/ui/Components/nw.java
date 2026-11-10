package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class nw extends rk0 {
    public boolean A0;
    public boolean B0;
    public VelocityTracker C0;
    public final /* synthetic */ gy D0;
    public final int u0;
    public boolean v0;
    public float w0;
    public boolean x0;
    public float y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(gy gyVar, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var, gyVar.i2);
        this.D0 = gyVar;
        this.x0 = true;
        this.u0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // org.telegram.ui.Components.rk0, android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.y0 = motionEvent.getRawX();
            this.z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0) {
            gy gyVar = this.D0;
            if (gyVar.O0 != null && Math.abs(motionEvent.getRawY() - this.z0) >= this.u0) {
                this.A0 = true;
                this.z0 = motionEvent.getRawY();
                ((bg.w0) gyVar.O0).e();
                if (this.v0) {
                    gyVar.h.i();
                    this.v0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.rk0, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        gy gyVar = this.D0;
        dt dtVar = gyVar.f2;
        vv vvVar = gyVar.h;
        if (this.s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.x0) {
            this.x0 = false;
            this.w0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            gyVar.W1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.y0 = motionEvent.getRawX();
            this.z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0 && gyVar.O0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.y0);
            float f10 = this.u0;
            if (abs >= f10 && canScrollHorizontally((int) (this.y0 - motionEvent.getRawX()))) {
                this.B0 = true;
                org.telegram.messenger.g0.r(dtVar);
                gyVar.X1 = true;
                gyVar.Z();
            } else if (Math.abs(motionEvent.getRawY() - this.z0) >= f10) {
                this.A0 = true;
                this.z0 = motionEvent.getRawY();
                ((bg.w0) gyVar.O0).e();
                if (this.v0) {
                    vvVar.i();
                    this.v0 = false;
                }
            }
        }
        if (gyVar.X1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            org.telegram.messenger.g0.i3(dtVar, 1500L);
        }
        if (!this.A0) {
            float translationX = getTranslationX();
            if (getScrollX() == 0 && translationX == 0.0f) {
                if (this.v0 || this.w0 - motionEvent.getX() >= 0.0f) {
                    if (this.v0 && this.w0 - motionEvent.getX() > 0.0f && vvVar.e0) {
                        vvVar.i();
                        this.v0 = false;
                    }
                } else if (!vvVar.M) {
                    vvVar.e0 = true;
                    vvVar.setScrollState(1);
                    vvVar.R = 0.0f;
                    vvVar.T = 0.0f;
                    VelocityTracker velocityTracker = vvVar.W;
                    if (velocityTracker == null) {
                        vvVar.W = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    vvVar.W.addMovement(obtain);
                    obtain.recycle();
                    this.v0 = true;
                    getTranslationX();
                }
            }
            if (this.v0) {
                motionEvent.getX();
            }
            this.w0 = motionEvent.getX();
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.x0 = true;
                this.B0 = false;
                this.A0 = false;
                if (this.v0) {
                    vvVar.i();
                    this.v0 = false;
                }
            }
            return this.v0 || super.onTouchEvent(motionEvent);
        }
        if (this.C0 == null) {
            this.C0 = VelocityTracker.obtain();
        }
        this.C0.addMovement(motionEvent);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.C0.computeCurrentVelocity(1000);
            float yVelocity = this.C0.getYVelocity();
            this.C0.recycle();
            this.C0 = null;
            if (motionEvent.getAction() == 1) {
                bg.w0 w0Var = (bg.w0) gyVar.O0;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) w0Var.c;
                if (w0Var.d()) {
                    chatActivityEnterView.E3 = false;
                    if ((!w0Var.a || yVelocity < org.telegram.messenger.g0.L(200.0f)) && ((w0Var.a || yVelocity > org.telegram.messenger.g0.L(-200.0f)) && ((!(z9 = w0Var.a) || chatActivityEnterView.C3 > 0.6f) && (z9 || chatActivityEnterView.C3 < 0.4f)))) {
                        chatActivityEnterView.n1(z9, true, true, true);
                    } else {
                        chatActivityEnterView.n1(!w0Var.a, true, true, true);
                    }
                }
            } else {
                bg.w0 w0Var2 = (bg.w0) gyVar.O0;
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) w0Var2.c;
                if (chatActivityEnterView2.x3) {
                    chatActivityEnterView2.E3 = false;
                    chatActivityEnterView2.n1(w0Var2.a, true, false, true);
                }
            }
            this.x0 = true;
            this.B0 = false;
            this.A0 = false;
        } else {
            mw mwVar = gyVar.O0;
            int round = Math.round(motionEvent.getRawY() - this.z0);
            bg.w0 w0Var3 = (bg.w0) mwVar;
            ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) w0Var3.c;
            if (w0Var3.d()) {
                Point point = org.telegram.messenger.g0.q;
                int max = Math.max(Math.min(round + w0Var3.b, 0), -(chatActivityEnterView3.D3 - (point.x > point.y ? chatActivityEnterView3.y2 : chatActivityEnterView3.x2)));
                if (chatActivityEnterView3.h5 == null) {
                    float f11 = max;
                    chatActivityEnterView3.U0.setTranslationY(f11);
                    chatActivityEnterView3.setTranslationY(f11);
                }
                chatActivityEnterView3.C3 = max / (-(chatActivityEnterView3.D3 - r4));
                chatActivityEnterView3.m1.invalidate();
            }
        }
        cancelLongPress();
        return true;
    }
}
