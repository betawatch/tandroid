package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class mk extends ChatActivityEnterView {
    public int n5;
    public int o5;
    public int p5;
    public final /* synthetic */ co q5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(co coVar, Activity activity, org.telegram.ui.Components.ov0 ov0Var, co coVar2, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, ov0Var, coVar2, z10, f6Var);
        this.q5 = coVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f7) {
        this.q5.q7();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        co coVar = this.q5;
        if (coVar.Y != null) {
            if (coVar.x0 != null) {
                if (coVar.Da > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                    if (kVar2.s()) {
                        return;
                    }
                }
            }
            this.m3 = true;
            this.o5 = this.E0.getMeasuredHeight();
            this.p5 = this.E0.getScrollY();
            coVar.X0.invalidate();
            coVar.b0 = coVar.Y.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void H0() {
        if (this.q5.Ea != null) {
            return;
        }
        super.H0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean N0() {
        return this.q5.N5;
    }

    public final void T1() {
        org.telegram.ui.ActionBar.k kVar;
        co coVar = this.q5;
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        final int i10 = 0;
        if (kVar.s() || coVar.A9()) {
            ValueAnimator valueAnimator = coVar.q9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = coVar.p9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            coVar.b0 = 0;
            this.m3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i11 = coVar.b0;
        final int i12 = 1;
        if (i11 != 0 && backgroundTop != i11 && this.n5 == coVar.X0.getMeasuredHeight()) {
            int i13 = (this.S1 + coVar.b0) - backgroundTop;
            setAnimatedTop(i13);
            this.x1.invalidate();
            ValueAnimator valueAnimator3 = coVar.p9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                coVar.p9.cancel();
            }
            View view = this.F1;
            if (view != null && view.getVisibility() == 0) {
                this.F1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.F1.getLayoutParams().height) + this.S1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i13, 0.0f);
            coVar.p9 = ofFloat;
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
                            co coVar2 = mkVar.q5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            mkVar.setAnimatedTop((int) floatValue);
                            View view2 = mkVar.F1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                coVar2.o9();
                                coVar2.r9();
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
            coVar.p9.addListener(new s0(this, 21));
            coVar.p9.setDuration(250L);
            coVar.p9.setInterpolator(ki.o.V);
            if (!coVar.o9) {
                coVar.p9.start();
            }
            coVar.o9();
            coVar.r9();
            coVar.b0 = 0;
        } else if (this.n5 != coVar.X0.getMeasuredHeight()) {
            coVar.b0 = 0;
        }
        if (this.m3) {
            float scrollY = (this.p5 - this.E0.getScrollY()) + (this.o5 - this.E0.getMeasuredHeight());
            org.telegram.ui.Components.qf qfVar = this.E0;
            qfVar.setOffsetY(qfVar.getOffsetY() - scrollY);
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
                            co coVar2 = mkVar.q5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            mkVar.setAnimatedTop((int) floatValue);
                            View view2 = mkVar.F1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                coVar2.o9();
                                coVar2.r9();
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
            ValueAnimator valueAnimator4 = coVar.q9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            coVar.q9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(ki.o.V);
            ofFloat2.start();
            this.m3 = false;
        }
        this.n5 = coVar.X0.getMeasuredHeight();
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
        co coVar = this.q5;
        qf qfVar = coVar.nb;
        if (qfVar != null) {
            AndroidUtilities.runOnUIThread(qfVar);
            coVar.nb = null;
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        co coVar = this.q5;
        j6.l lVar = coVar.Bc;
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (getMeasuredWidth() > 0 && !coVar.rc) {
            z10 = true;
        }
        lVar.j(1, z11, z10);
    }
}
