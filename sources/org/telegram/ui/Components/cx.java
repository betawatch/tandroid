package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class cx extends ul0 {
    public boolean A0;
    public boolean B0;
    public VelocityTracker C0;
    public final /* synthetic */ vy D0;
    public final int u0;
    public boolean v0;
    public float w0;
    public boolean x0;
    public float y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(vy vyVar, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var, vyVar.i2);
        this.D0 = vyVar;
        this.x0 = true;
        this.u0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // org.telegram.ui.Components.ul0, android.widget.HorizontalScrollView, android.view.ViewGroup
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
            vy vyVar = this.D0;
            if (vyVar.O0 != null && Math.abs(motionEvent.getRawY() - this.z0) >= this.u0) {
                this.A0 = true;
                this.z0 = motionEvent.getRawY();
                ((c5.e) vyVar.O0).e();
                if (this.v0) {
                    vyVar.h.i();
                    this.v0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ul0, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        vy vyVar = this.D0;
        ew ewVar = vyVar.f2;
        iw iwVar = vyVar.h;
        if (this.s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.x0) {
            this.x0 = false;
            this.w0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            vyVar.W1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.y0 = motionEvent.getRawX();
            this.z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0 && vyVar.O0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.y0);
            float f7 = this.u0;
            if (abs >= f7 && canScrollHorizontally((int) (this.y0 - motionEvent.getRawX()))) {
                this.B0 = true;
                org.telegram.messenger.i0.r(ewVar);
                vyVar.X1 = true;
                vyVar.Z();
            } else if (Math.abs(motionEvent.getRawY() - this.z0) >= f7) {
                this.A0 = true;
                this.z0 = motionEvent.getRawY();
                ((c5.e) vyVar.O0).e();
                if (this.v0) {
                    iwVar.i();
                    this.v0 = false;
                }
            }
        }
        if (vyVar.X1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            org.telegram.messenger.i0.h3(ewVar, 1500L);
        }
        if (!this.A0) {
            float translationX = getTranslationX();
            if (getScrollX() == 0 && translationX == 0.0f) {
                if (this.v0 || this.w0 - motionEvent.getX() >= 0.0f) {
                    if (this.v0 && this.w0 - motionEvent.getX() > 0.0f && iwVar.e0) {
                        iwVar.i();
                        this.v0 = false;
                    }
                } else if (!iwVar.M) {
                    iwVar.e0 = true;
                    iwVar.setScrollState(1);
                    iwVar.R = 0.0f;
                    iwVar.T = 0.0f;
                    VelocityTracker velocityTracker = iwVar.W;
                    if (velocityTracker == null) {
                        iwVar.W = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    iwVar.W.addMovement(obtain);
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
                    iwVar.i();
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
                c5.e eVar = (c5.e) vyVar.O0;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) eVar.c;
                if (eVar.d()) {
                    chatActivityEnterView.E3 = false;
                    if ((!eVar.b || yVelocity < org.telegram.messenger.i0.L(200.0f)) && ((eVar.b || yVelocity > org.telegram.messenger.i0.L(-200.0f)) && ((!(z10 = eVar.b) || chatActivityEnterView.C3 > 0.6f) && (z10 || chatActivityEnterView.C3 < 0.4f)))) {
                        chatActivityEnterView.l1(z10, true, true, true);
                    } else {
                        chatActivityEnterView.l1(!eVar.b, true, true, true);
                    }
                }
            } else {
                c5.e eVar2 = (c5.e) vyVar.O0;
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) eVar2.c;
                if (chatActivityEnterView2.x3) {
                    chatActivityEnterView2.E3 = false;
                    chatActivityEnterView2.l1(eVar2.b, true, false, true);
                }
            }
            this.x0 = true;
            this.B0 = false;
            this.A0 = false;
        } else {
            bx bxVar = vyVar.O0;
            int round = Math.round(motionEvent.getRawY() - this.z0);
            c5.e eVar3 = (c5.e) bxVar;
            ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) eVar3.c;
            if (eVar3.d()) {
                Point point = org.telegram.messenger.i0.q;
                int max = Math.max(Math.min(round + eVar3.a, 0), -(chatActivityEnterView3.D3 - (point.x > point.y ? chatActivityEnterView3.y2 : chatActivityEnterView3.x2)));
                if (chatActivityEnterView3.h5 == null) {
                    float f10 = max;
                    chatActivityEnterView3.U0.setTranslationY(f10);
                    chatActivityEnterView3.setTranslationY(f10);
                }
                chatActivityEnterView3.C3 = max / (-(chatActivityEnterView3.D3 - r4));
                chatActivityEnterView3.m1.invalidate();
            }
        }
        cancelLongPress();
        return true;
    }
}
