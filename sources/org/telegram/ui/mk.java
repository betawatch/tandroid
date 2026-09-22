package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class mk extends ChatActivityEnterView {
    public int o5;
    public int p5;
    public int q5;
    public final /* synthetic */ bo r5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(bo boVar, Activity activity, org.telegram.ui.Components.pv0 pv0Var, bo boVar2, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, pv0Var, boVar2, z10, e6Var);
        this.r5 = boVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void B0(float f7) {
        this.r5.q7();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void D0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        bo boVar = this.r5;
        if (boVar.Y != null) {
            if (boVar.x0 != null) {
                if (boVar.Da > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                    if (kVar2.s()) {
                        return;
                    }
                }
            }
            this.m3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.q5 = this.E0.getScrollY();
            boVar.X0.invalidate();
            boVar.b0 = boVar.Y.getBackgroundTop();
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
        bo boVar = this.r5;
        kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
        final int i10 = 0;
        if (kVar.s() || boVar.A9()) {
            ValueAnimator valueAnimator = boVar.q9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = boVar.p9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            boVar.b0 = 0;
            this.m3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i11 = boVar.b0;
        final int i12 = 1;
        if (i11 != 0 && backgroundTop != i11 && this.o5 == boVar.X0.getMeasuredHeight()) {
            int i13 = (this.S1 + boVar.b0) - backgroundTop;
            setAnimatedTop(i13);
            this.x1.invalidate();
            ValueAnimator valueAnimator3 = boVar.p9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                boVar.p9.cancel();
            }
            View view = this.F1;
            if (view != null && view.getVisibility() == 0) {
                this.F1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.F1.getLayoutParams().height) + this.S1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i13, 0.0f);
            boVar.p9 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.lk
                public final /* synthetic */ mk b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i10) {
                        case 0:
                            mk mkVar = this.b;
                            bo boVar2 = mkVar.r5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            mkVar.setAnimatedTop((int) floatValue);
                            View view2 = mkVar.F1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                boVar2.o9();
                                boVar2.r9();
                            } else {
                                mkVar.F1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.F1.getLayoutParams().height) + floatValue);
                            }
                            mkVar.x1.invalidate();
                            mkVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            boVar.p9.addListener(new t4(this, 18));
            boVar.p9.setDuration(250L);
            boVar.p9.setInterpolator(ji.n.V);
            if (!boVar.o9) {
                boVar.p9.start();
            }
            boVar.o9();
            boVar.r9();
            boVar.b0 = 0;
        } else if (this.o5 != boVar.X0.getMeasuredHeight()) {
            boVar.b0 = 0;
        }
        if (this.m3) {
            float scrollY = (this.q5 - this.E0.getScrollY()) + (this.p5 - this.E0.getMeasuredHeight());
            org.telegram.ui.Components.of ofVar = this.E0;
            ofVar.setOffsetY(ofVar.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.lk
                public final /* synthetic */ mk b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i12) {
                        case 0:
                            mk mkVar = this.b;
                            bo boVar2 = mkVar.r5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            mkVar.setAnimatedTop((int) floatValue);
                            View view2 = mkVar.F1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                boVar2.o9();
                                boVar2.r9();
                            } else {
                                mkVar.F1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.F1.getLayoutParams().height) + floatValue);
                            }
                            mkVar.x1.invalidate();
                            mkVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator4 = boVar.q9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            boVar.q9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(ji.n.V);
            ofFloat2.start();
            this.m3 = false;
        }
        this.o5 = boVar.X0.getMeasuredHeight();
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
        bo boVar = this.r5;
        qf qfVar = boVar.mb;
        if (qfVar != null) {
            AndroidUtilities.runOnUIThread(qfVar);
            boVar.mb = null;
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        bo boVar = this.r5;
        j6.l lVar = boVar.Ac;
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (getMeasuredWidth() > 0 && !boVar.qc) {
            z10 = true;
        }
        lVar.j(1, z11, z10);
    }
}
