package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class jk extends ChatActivityEnterView {
    public int k5;
    public int l5;
    public int m5;
    public final /* synthetic */ xn n5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(xn xnVar, Activity activity, org.telegram.ui.Components.qv0 qv0Var, xn xnVar2, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, qv0Var, xnVar2, z4, g6Var);
        this.n5 = xnVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f10) {
        this.n5.q7();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        xn xnVar = this.n5;
        if (xnVar.V != null) {
            if (xnVar.u0 != null) {
                if (xnVar.Aa > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                    if (kVar2.s()) {
                        return;
                    }
                }
            }
            this.j3 = true;
            this.l5 = this.B0.getMeasuredHeight();
            this.m5 = this.B0.getScrollY();
            xnVar.U0.invalidate();
            xnVar.Y = xnVar.V.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void H0() {
        if (this.n5.Ba != null) {
            return;
        }
        super.H0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean N0() {
        return this.n5.K5;
    }

    public final void T1() {
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.n5;
        kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        final int i10 = 0;
        if (kVar.s() || xnVar.A9()) {
            ValueAnimator valueAnimator = xnVar.n9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = xnVar.m9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            xnVar.Y = 0;
            this.j3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i11 = xnVar.Y;
        final int i12 = 1;
        if (i11 != 0 && backgroundTop != i11 && this.k5 == xnVar.U0.getMeasuredHeight()) {
            int i13 = (this.P1 + xnVar.Y) - backgroundTop;
            setAnimatedTop(i13);
            this.u1.invalidate();
            ValueAnimator valueAnimator3 = xnVar.m9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                xnVar.m9.cancel();
            }
            View view = this.C1;
            if (view != null && view.getVisibility() == 0) {
                this.C1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.C1.getLayoutParams().height) + this.P1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i13, 0.0f);
            xnVar.m9 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ik
                public final /* synthetic */ jk b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i10) {
                        case 0:
                            jk jkVar = this.b;
                            xn xnVar2 = jkVar.n5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            jkVar.setAnimatedTop((int) floatValue);
                            View view2 = jkVar.C1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                xnVar2.o9();
                                xnVar2.r9();
                            } else {
                                jkVar.C1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.C1.getLayoutParams().height) + floatValue);
                            }
                            jkVar.u1.invalidate();
                            jkVar.invalidate();
                            break;
                        default:
                            this.b.B0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            xnVar.m9.addListener(new s5(this, 17));
            xnVar.m9.setDuration(250L);
            xnVar.m9.setInterpolator(xh.n.V);
            if (!xnVar.l9) {
                xnVar.m9.start();
            }
            xnVar.o9();
            xnVar.r9();
            xnVar.Y = 0;
        } else if (this.k5 != xnVar.U0.getMeasuredHeight()) {
            xnVar.Y = 0;
        }
        if (this.j3) {
            float scrollY = (this.m5 - this.B0.getScrollY()) + (this.l5 - this.B0.getMeasuredHeight());
            org.telegram.ui.Components.ff ffVar = this.B0;
            ffVar.setOffsetY(ffVar.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.B0.getOffsetY(), 0.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ik
                public final /* synthetic */ jk b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i12) {
                        case 0:
                            jk jkVar = this.b;
                            xn xnVar2 = jkVar.n5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            jkVar.setAnimatedTop((int) floatValue);
                            View view2 = jkVar.C1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                xnVar2.o9();
                                xnVar2.r9();
                            } else {
                                jkVar.C1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.C1.getLayoutParams().height) + floatValue);
                            }
                            jkVar.u1.invalidate();
                            jkVar.invalidate();
                            break;
                        default:
                            this.b.B0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator4 = xnVar.n9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            xnVar.n9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(xh.n.V);
            ofFloat2.start();
            this.j3 = false;
        }
        this.k5 = xnVar.U0.getMeasuredHeight();
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
    public final void q0(boolean z4) {
        super.q0(z4);
        xn xnVar = this.n5;
        lf lfVar = xnVar.kb;
        if (lfVar != null) {
            AndroidUtilities.runOnUIThread(lfVar);
            xnVar.kb = null;
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        xn xnVar = this.n5;
        h5.u uVar = xnVar.yc;
        boolean z4 = false;
        boolean z10 = i10 == 0;
        if (getMeasuredWidth() > 0 && !xnVar.oc) {
            z4 = true;
        }
        uVar.h(1, z10, z4);
    }
}
