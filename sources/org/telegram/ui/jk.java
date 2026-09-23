package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class jk extends ChatActivityEnterView {
    public int o5;
    public int p5;
    public int q5;
    public final /* synthetic */ xn r5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(xn xnVar, Activity activity, org.telegram.ui.Components.pv0 pv0Var, xn xnVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, pv0Var, xnVar2, z10, d6Var);
        this.r5 = xnVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void B0(float f7) {
        this.r5.q7();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void D0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        xn xnVar = this.r5;
        if (xnVar.Y != null) {
            if (xnVar.x0 != null) {
                if (xnVar.Da > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                    if (kVar2.s()) {
                        return;
                    }
                }
            }
            this.m3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.q5 = this.E0.getScrollY();
            xnVar.X0.invalidate();
            xnVar.b0 = xnVar.Y.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void I0() {
        if (this.r5.Ea != null) {
            return;
        }
        super.I0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean O0() {
        return this.r5.N5;
    }

    public final void U1() {
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.r5;
        kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
        final int i10 = 0;
        if (kVar.s() || xnVar.A9()) {
            ValueAnimator valueAnimator = xnVar.q9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = xnVar.p9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            xnVar.b0 = 0;
            this.m3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i11 = xnVar.b0;
        final int i12 = 1;
        if (i11 != 0 && backgroundTop != i11 && this.o5 == xnVar.X0.getMeasuredHeight()) {
            int i13 = (this.S1 + xnVar.b0) - backgroundTop;
            setAnimatedTop(i13);
            this.x1.invalidate();
            ValueAnimator valueAnimator3 = xnVar.p9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                xnVar.p9.cancel();
            }
            View view = this.F1;
            if (view != null && view.getVisibility() == 0) {
                this.F1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.F1.getLayoutParams().height) + this.S1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i13, 0.0f);
            xnVar.p9 = ofFloat;
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
                            xn xnVar2 = jkVar.r5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            jkVar.setAnimatedTop((int) floatValue);
                            View view2 = jkVar.F1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                xnVar2.o9();
                                xnVar2.r9();
                            } else {
                                jkVar.F1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.F1.getLayoutParams().height) + floatValue);
                            }
                            jkVar.x1.invalidate();
                            jkVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            xnVar.p9.addListener(new u4(this, 18));
            xnVar.p9.setDuration(250L);
            xnVar.p9.setInterpolator(ji.n.V);
            if (!xnVar.o9) {
                xnVar.p9.start();
            }
            xnVar.o9();
            xnVar.r9();
            xnVar.b0 = 0;
        } else if (this.o5 != xnVar.X0.getMeasuredHeight()) {
            xnVar.b0 = 0;
        }
        if (this.m3) {
            float scrollY = (this.q5 - this.E0.getScrollY()) + (this.p5 - this.E0.getMeasuredHeight());
            org.telegram.ui.Components.pf pfVar = this.E0;
            pfVar.setOffsetY(pfVar.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
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
                            xn xnVar2 = jkVar.r5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            jkVar.setAnimatedTop((int) floatValue);
                            View view2 = jkVar.F1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                xnVar2.o9();
                                xnVar2.r9();
                            } else {
                                jkVar.F1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.F1.getLayoutParams().height) + floatValue);
                            }
                            jkVar.x1.invalidate();
                            jkVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator4 = xnVar.q9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            xnVar.q9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(ji.n.V);
            ofFloat2.start();
            this.m3 = false;
        }
        this.o5 = xnVar.X0.getMeasuredHeight();
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
    public final void r0(boolean z10) {
        super.r0(z10);
        xn xnVar = this.r5;
        pf pfVar = xnVar.mb;
        if (pfVar != null) {
            AndroidUtilities.runOnUIThread(pfVar);
            xnVar.mb = null;
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        xn xnVar = this.r5;
        j6.l lVar = xnVar.Ac;
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (getMeasuredWidth() > 0 && !xnVar.qc) {
            z10 = true;
        }
        lVar.j(1, z11, z10);
    }
}
