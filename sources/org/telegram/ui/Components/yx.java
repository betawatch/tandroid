package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public class yx extends gn0 {
    public boolean A0;
    public boolean B0;
    public VelocityTracker C0;
    public final /* synthetic */ tz D0;
    public final int u0;
    public boolean v0;
    public float w0;
    public boolean x0;
    public float y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx(tz tzVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, tzVar.i2);
        this.D0 = tzVar;
        this.x0 = true;
        this.u0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // org.telegram.ui.Components.gn0, android.widget.HorizontalScrollView, android.view.ViewGroup
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
            tz tzVar = this.D0;
            if (tzVar.O0 != null && Math.abs(motionEvent.getRawY() - this.z0) >= this.u0) {
                this.A0 = true;
                this.z0 = motionEvent.getRawY();
                ((c5.f) tzVar.O0).e();
                if (this.v0) {
                    tzVar.h.i();
                    this.v0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.gn0, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        tz tzVar = this.D0;
        org.telegram.ui.Cells.k7 k7Var = tzVar.f2;
        gx gxVar = tzVar.h;
        if (this.s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.x0) {
            this.x0 = false;
            this.w0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            tzVar.W1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.y0 = motionEvent.getRawX();
            this.z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0 && tzVar.O0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.y0);
            float f7 = this.u0;
            if (abs >= f7 && canScrollHorizontally((int) (this.y0 - motionEvent.getRawX()))) {
                this.B0 = true;
                AndroidUtilities.cancelRunOnUIThread(k7Var);
                tzVar.X1 = true;
                tzVar.Y();
            } else if (Math.abs(motionEvent.getRawY() - this.z0) >= f7) {
                this.A0 = true;
                this.z0 = motionEvent.getRawY();
                ((c5.f) tzVar.O0).e();
                if (this.v0) {
                    gxVar.i();
                    this.v0 = false;
                }
            }
        }
        if (tzVar.X1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(k7Var, 1500L);
        }
        if (!this.A0) {
            float translationX = getTranslationX();
            if (getScrollX() == 0 && translationX == 0.0f) {
                if (this.v0 || this.w0 - motionEvent.getX() >= 0.0f) {
                    if (this.v0 && this.w0 - motionEvent.getX() > 0.0f && gxVar.e0) {
                        gxVar.i();
                        this.v0 = false;
                    }
                } else if (!gxVar.M) {
                    gxVar.e0 = true;
                    gxVar.setScrollState(1);
                    gxVar.R = 0.0f;
                    gxVar.T = 0.0f;
                    VelocityTracker velocityTracker = gxVar.W;
                    if (velocityTracker == null) {
                        gxVar.W = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    gxVar.W.addMovement(obtain);
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
                    gxVar.i();
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
            this.C0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
            float yVelocity = this.C0.getYVelocity();
            this.C0.recycle();
            this.C0 = null;
            if (motionEvent.getAction() == 1) {
                c5.f fVar = (c5.f) tzVar.O0;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) fVar.c;
                if (fVar.d()) {
                    chatActivityEnterView.E3 = false;
                    if ((!fVar.b || yVelocity < AndroidUtilities.dp(200.0f)) && ((fVar.b || yVelocity > AndroidUtilities.dp(-200.0f)) && ((!(z10 = fVar.b) || chatActivityEnterView.C3 > 0.6f) && (z10 || chatActivityEnterView.C3 < 0.4f)))) {
                        chatActivityEnterView.l1(z10, true, true, true);
                    } else {
                        chatActivityEnterView.l1(!fVar.b, true, true, true);
                    }
                }
            } else {
                c5.f fVar2 = (c5.f) tzVar.O0;
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) fVar2.c;
                if (chatActivityEnterView2.x3) {
                    chatActivityEnterView2.E3 = false;
                    chatActivityEnterView2.l1(fVar2.b, true, false, true);
                }
            }
            this.x0 = true;
            this.B0 = false;
            this.A0 = false;
        } else {
            xx xxVar = tzVar.O0;
            int round = Math.round(motionEvent.getRawY() - this.z0);
            c5.f fVar3 = (c5.f) xxVar;
            ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) fVar3.c;
            if (fVar3.d()) {
                Point point = AndroidUtilities.displaySize;
                int max = Math.max(Math.min(round + fVar3.a, 0), -(chatActivityEnterView3.D3 - (point.x > point.y ? chatActivityEnterView3.y2 : chatActivityEnterView3.x2)));
                if (chatActivityEnterView3.d5 == null) {
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
