package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class jk extends ChatActivityEnterView {
    public int o5;
    public int p5;
    public int q5;
    public final /* synthetic */ wn r5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(wn wnVar, Activity activity, org.telegram.ui.Components.aw0 aw0Var, wn wnVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, aw0Var, wnVar2, z10, d6Var);
        this.r5 = wnVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f7) {
        this.r5.q7();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        wn wnVar = this.r5;
        if (wnVar.Y != null) {
            if (wnVar.x0 != null) {
                if (wnVar.Da > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                    if (kVar2.s()) {
                        return;
                    }
                }
            }
            this.n3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.q5 = this.E0.getScrollY();
            wnVar.X0.invalidate();
            wnVar.b0 = wnVar.Y.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void H0() {
        if (this.r5.Ea != null) {
            return;
        }
        super.H0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean N0() {
        return this.r5.N5;
    }

    public final void T1() {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.r5;
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        final int i10 = 0;
        if (kVar.s() || wnVar.A9()) {
            ValueAnimator valueAnimator = wnVar.q9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = wnVar.p9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            wnVar.b0 = 0;
            this.n3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i11 = wnVar.b0;
        final int i12 = 1;
        if (i11 != 0 && backgroundTop != i11 && this.o5 == wnVar.X0.getMeasuredHeight()) {
            int i13 = (this.T1 + wnVar.b0) - backgroundTop;
            setAnimatedTop(i13);
            this.y1.invalidate();
            ValueAnimator valueAnimator3 = wnVar.p9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                wnVar.p9.cancel();
            }
            View view = this.G1;
            if (view != null && view.getVisibility() == 0) {
                this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i13, 0.0f);
            wnVar.p9 = ofFloat;
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
                            wn wnVar2 = jkVar.r5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            jkVar.setAnimatedTop((int) floatValue);
                            View view2 = jkVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                wnVar2.o9();
                                wnVar2.r9();
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
            wnVar.p9.addListener(new t4(this, 18));
            wnVar.p9.setDuration(250L);
            wnVar.p9.setInterpolator(ji.n.V);
            if (!wnVar.o9) {
                wnVar.p9.start();
            }
            wnVar.o9();
            wnVar.r9();
            wnVar.b0 = 0;
        } else if (this.o5 != wnVar.X0.getMeasuredHeight()) {
            wnVar.b0 = 0;
        }
        if (this.n3) {
            float scrollY = (this.q5 - this.E0.getScrollY()) + (this.p5 - this.E0.getMeasuredHeight());
            org.telegram.ui.Components.qf qfVar = this.E0;
            qfVar.setOffsetY(qfVar.getOffsetY() - scrollY);
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
                            wn wnVar2 = jkVar.r5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            jkVar.setAnimatedTop((int) floatValue);
                            View view2 = jkVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                wnVar2.o9();
                                wnVar2.r9();
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
            ValueAnimator valueAnimator4 = wnVar.q9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            wnVar.q9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(ji.n.V);
            ofFloat2.start();
            this.n3 = false;
        }
        this.o5 = wnVar.X0.getMeasuredHeight();
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
        wn wnVar = this.r5;
        of ofVar = wnVar.mb;
        if (ofVar != null) {
            AndroidUtilities.runOnUIThread(ofVar);
            wnVar.mb = null;
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        wn wnVar = this.r5;
        j6.l lVar = wnVar.Ac;
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (getMeasuredWidth() > 0 && !wnVar.qc) {
            z10 = true;
        }
        lVar.j(1, z11, z10);
    }
}
