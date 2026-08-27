package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ck extends ChatActivityEnterView {
    public int j5;
    public int k5;
    public int l5;
    public final /* synthetic */ rn m5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(rn rnVar, Activity activity, org.telegram.ui.Components.zu0 zu0Var, rn rnVar2, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, zu0Var, rnVar2, z10, c6Var);
        this.m5 = rnVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f10) {
        this.m5.q7();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        rn rnVar = this.m5;
        if (rnVar.U != null) {
            if (rnVar.t0 != null) {
                if (rnVar.za > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                    if (kVar2.t()) {
                        return;
                    }
                }
            }
            this.i3 = true;
            this.k5 = this.A0.getMeasuredHeight();
            this.l5 = this.A0.getScrollY();
            rnVar.T0.invalidate();
            rnVar.X = rnVar.U.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void H0() {
        if (this.m5.Aa != null) {
            return;
        }
        super.H0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean N0() {
        return this.m5.J5;
    }

    public final void S1() {
        org.telegram.ui.ActionBar.k kVar;
        rn rnVar = this.m5;
        kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
        final int i10 = 0;
        if (kVar.t() || rnVar.A9()) {
            ValueAnimator valueAnimator = rnVar.m9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = rnVar.l9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            rnVar.X = 0;
            this.i3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i11 = rnVar.X;
        final int i12 = 1;
        if (i11 != 0 && backgroundTop != i11 && this.j5 == rnVar.T0.getMeasuredHeight()) {
            int i13 = (this.O1 + rnVar.X) - backgroundTop;
            setAnimatedTop(i13);
            this.t1.invalidate();
            ValueAnimator valueAnimator3 = rnVar.l9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                rnVar.l9.cancel();
            }
            View view = this.B1;
            if (view != null && view.getVisibility() == 0) {
                this.B1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.B1.getLayoutParams().height) + this.O1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i13, 0.0f);
            rnVar.l9 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.bk
                public final /* synthetic */ ck b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i10) {
                        case 0:
                            ck ckVar = this.b;
                            rn rnVar2 = ckVar.m5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            ckVar.setAnimatedTop((int) floatValue);
                            View view2 = ckVar.B1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                rnVar2.o9();
                                rnVar2.r9();
                            } else {
                                ckVar.B1.setTranslationY(((1.0f - ckVar.getTopViewEnterProgress()) * ckVar.B1.getLayoutParams().height) + floatValue);
                            }
                            ckVar.t1.invalidate();
                            ckVar.invalidate();
                            break;
                        default:
                            this.b.A0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            rnVar.l9.addListener(new lh.h9(this, 26));
            rnVar.l9.setDuration(250L);
            rnVar.l9.setInterpolator(sh.m.V);
            if (!rnVar.k9) {
                rnVar.l9.start();
            }
            rnVar.o9();
            rnVar.r9();
            rnVar.X = 0;
        } else if (this.j5 != rnVar.T0.getMeasuredHeight()) {
            rnVar.X = 0;
        }
        if (this.i3) {
            float scrollY = (this.l5 - this.A0.getScrollY()) + (this.k5 - this.A0.getMeasuredHeight());
            org.telegram.ui.Components.bf bfVar = this.A0;
            bfVar.setOffsetY(bfVar.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.A0.getOffsetY(), 0.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.bk
                public final /* synthetic */ ck b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i12) {
                        case 0:
                            ck ckVar = this.b;
                            rn rnVar2 = ckVar.m5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            ckVar.setAnimatedTop((int) floatValue);
                            View view2 = ckVar.B1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                rnVar2.o9();
                                rnVar2.r9();
                            } else {
                                ckVar.B1.setTranslationY(((1.0f - ckVar.getTopViewEnterProgress()) * ckVar.B1.getLayoutParams().height) + floatValue);
                            }
                            ckVar.t1.invalidate();
                            ckVar.invalidate();
                            break;
                        default:
                            this.b.A0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator4 = rnVar.m9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            rnVar.m9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(sh.m.V);
            ofFloat2.start();
            this.i3 = false;
        }
        this.j5 = rnVar.T0.getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void q0(boolean z10) {
        super.q0(z10);
        rn rnVar = this.m5;
        gf gfVar = rnVar.jb;
        if (gfVar != null) {
            AndroidUtilities.runOnUIThread(gfVar);
            rnVar.jb = null;
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        rn rnVar = this.m5;
        d5.x xVar = rnVar.xc;
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (getMeasuredWidth() > 0 && !rnVar.nc) {
            z10 = true;
        }
        xVar.j(1, z11, z10);
    }
}
