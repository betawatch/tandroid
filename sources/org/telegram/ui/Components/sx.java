package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public class sx extends um0 {
    public boolean A0;
    public boolean B0;
    public VelocityTracker C0;
    public final /* synthetic */ lz D0;
    public final int u0;
    public boolean v0;
    public float w0;
    public boolean x0;
    public float y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx(lz lzVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, lzVar.i2);
        this.D0 = lzVar;
        this.x0 = true;
        this.u0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // org.telegram.ui.Components.um0, android.widget.HorizontalScrollView, android.view.ViewGroup
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
            lz lzVar = this.D0;
            if (lzVar.O0 != null && Math.abs(motionEvent.getRawY() - this.z0) >= this.u0) {
                this.A0 = true;
                this.z0 = motionEvent.getRawY();
                ((c2.a) lzVar.O0).e();
                if (this.v0) {
                    lzVar.h.i();
                    this.v0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.um0, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        lz lzVar = this.D0;
        org.telegram.ui.Cells.t6 t6Var = lzVar.f2;
        ax axVar = lzVar.h;
        if (this.s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.x0) {
            this.x0 = false;
            this.w0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            lzVar.W1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.y0 = motionEvent.getRawX();
            this.z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0 && lzVar.O0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.y0);
            float f7 = this.u0;
            if (abs >= f7 && canScrollHorizontally((int) (this.y0 - motionEvent.getRawX()))) {
                this.B0 = true;
                AndroidUtilities.cancelRunOnUIThread(t6Var);
                lzVar.X1 = true;
                lzVar.Y();
            } else if (Math.abs(motionEvent.getRawY() - this.z0) >= f7) {
                this.A0 = true;
                this.z0 = motionEvent.getRawY();
                ((c2.a) lzVar.O0).e();
                if (this.v0) {
                    axVar.i();
                    this.v0 = false;
                }
            }
        }
        if (lzVar.X1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(t6Var, 1500L);
        }
        if (!this.A0) {
            float translationX = getTranslationX();
            if (getScrollX() == 0 && translationX == 0.0f) {
                if (this.v0 || this.w0 - motionEvent.getX() >= 0.0f) {
                    if (this.v0 && this.w0 - motionEvent.getX() > 0.0f && axVar.e0) {
                        axVar.i();
                        this.v0 = false;
                    }
                } else if (!axVar.M) {
                    axVar.e0 = true;
                    axVar.setScrollState(1);
                    axVar.R = 0.0f;
                    axVar.T = 0.0f;
                    VelocityTracker velocityTracker = axVar.W;
                    if (velocityTracker == null) {
                        axVar.W = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    axVar.W.addMovement(obtain);
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
                    axVar.i();
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
                c2.a aVar = (c2.a) lzVar.O0;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.c;
                if (aVar.d()) {
                    chatActivityEnterView.E3 = false;
                    if ((!aVar.a || yVelocity < AndroidUtilities.dp(200.0f)) && ((aVar.a || yVelocity > AndroidUtilities.dp(-200.0f)) && ((!(z10 = aVar.a) || chatActivityEnterView.C3 > 0.6f) && (z10 || chatActivityEnterView.C3 < 0.4f)))) {
                        chatActivityEnterView.n1(z10, true, true, true);
                    } else {
                        chatActivityEnterView.n1(!aVar.a, true, true, true);
                    }
                }
            } else {
                c2.a aVar2 = (c2.a) lzVar.O0;
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) aVar2.c;
                if (chatActivityEnterView2.x3) {
                    chatActivityEnterView2.E3 = false;
                    chatActivityEnterView2.n1(aVar2.a, true, false, true);
                }
            }
            this.x0 = true;
            this.B0 = false;
            this.A0 = false;
        } else {
            rx rxVar = lzVar.O0;
            int round = Math.round(motionEvent.getRawY() - this.z0);
            c2.a aVar3 = (c2.a) rxVar;
            ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) aVar3.c;
            if (aVar3.d()) {
                Point point = AndroidUtilities.displaySize;
                int max = Math.max(Math.min(round + aVar3.b, 0), -(chatActivityEnterView3.D3 - (point.x > point.y ? chatActivityEnterView3.y2 : chatActivityEnterView3.x2)));
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
