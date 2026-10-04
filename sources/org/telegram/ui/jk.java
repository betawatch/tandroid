package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class jk extends ChatActivityEnterView {
    public int o5;
    public int p5;
    public int q5;
    public final /* synthetic */ yn r5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(yn ynVar, Activity activity, org.telegram.ui.Components.lw0 lw0Var, yn ynVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, lw0Var, ynVar2, z10, d6Var);
        this.r5 = ynVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f7) {
        this.r5.q7();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        yn ynVar = this.r5;
        if (ynVar.W != null) {
            if (ynVar.v0 != null) {
                if (ynVar.Ba > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                    if (kVar2.s()) {
                        return;
                    }
                }
            }
            this.n3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.q5 = this.E0.getScrollY();
            ynVar.V0.invalidate();
            ynVar.Z = ynVar.W.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void H0() {
        if (this.r5.Ca != null) {
            return;
        }
        super.H0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean N0() {
        return this.r5.L5;
    }

    public final void T1() {
        org.telegram.ui.ActionBar.k kVar;
        yn ynVar = this.r5;
        kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        final int i10 = 0;
        if (kVar.s() || ynVar.z9()) {
            ValueAnimator valueAnimator = ynVar.o9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = ynVar.n9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ynVar.Z = 0;
            this.n3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i11 = ynVar.Z;
        final int i12 = 1;
        if (i11 != 0 && backgroundTop != i11 && this.o5 == ynVar.V0.getMeasuredHeight()) {
            int i13 = (this.T1 + ynVar.Z) - backgroundTop;
            setAnimatedTop(i13);
            this.y1.invalidate();
            ValueAnimator valueAnimator3 = ynVar.n9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                ynVar.n9.cancel();
            }
            View view = this.G1;
            if (view != null && view.getVisibility() == 0) {
                this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i13, 0.0f);
            ynVar.n9 = ofFloat;
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
                            yn ynVar2 = jkVar.r5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            jkVar.setAnimatedTop((int) floatValue);
                            View view2 = jkVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                ynVar2.o9();
                                ynVar2.q9();
                            } else {
                                jkVar.G1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.G1.getLayoutParams().height) + floatValue);
                            }
                            jkVar.y1.invalidate();
                            jkVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ynVar.n9.addListener(new u4(this, 18));
            ynVar.n9.setDuration(250L);
            ynVar.n9.setInterpolator(ji.n.V);
            if (!ynVar.m9) {
                ynVar.n9.start();
            }
            ynVar.o9();
            ynVar.q9();
            ynVar.Z = 0;
        } else if (this.o5 != ynVar.V0.getMeasuredHeight()) {
            ynVar.Z = 0;
        }
        if (this.n3) {
            float scrollY = (this.q5 - this.E0.getScrollY()) + (this.p5 - this.E0.getMeasuredHeight());
            org.telegram.ui.Components.rf rfVar = this.E0;
            rfVar.setOffsetY(rfVar.getOffsetY() - scrollY);
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
                            yn ynVar2 = jkVar.r5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            jkVar.setAnimatedTop((int) floatValue);
                            View view2 = jkVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                ynVar2.o9();
                                ynVar2.q9();
                            } else {
                                jkVar.G1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.G1.getLayoutParams().height) + floatValue);
                            }
                            jkVar.y1.invalidate();
                            jkVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator4 = ynVar.o9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            ynVar.o9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(ji.n.V);
            ofFloat2.start();
            this.n3 = false;
        }
        this.o5 = ynVar.V0.getMeasuredHeight();
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
        yn ynVar = this.r5;
        yf yfVar = ynVar.kb;
        if (yfVar != null) {
            AndroidUtilities.runOnUIThread(yfVar);
            ynVar.kb = null;
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        yn ynVar = this.r5;
        j6.l lVar = ynVar.yc;
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (getMeasuredWidth() > 0 && !ynVar.oc) {
            z10 = true;
        }
        lVar.j(1, z11, z10);
    }
}
