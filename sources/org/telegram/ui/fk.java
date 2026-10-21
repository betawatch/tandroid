package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class fk extends ChatActivityEnterView {
    public int o5;
    public int p5;
    public int q5;
    public final /* synthetic */ qn r5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(qn qnVar, Activity activity, org.telegram.ui.Components.lw0 lw0Var, qn qnVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, lw0Var, qnVar2, z10, d6Var);
        this.r5 = qnVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        qn qnVar = this.r5;
        if (qnVar.Y != null) {
            if (qnVar.x0 != null) {
                if (qnVar.Ea > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                    if (kVar2.t()) {
                        return;
                    }
                }
            }
            this.n3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.q5 = this.E0.getScrollY();
            qnVar.X0.invalidate();
            qnVar.b0 = qnVar.Y.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void F0() {
        if (this.r5.Fa != null) {
            return;
        }
        super.F0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean L0() {
        return this.r5.N5;
    }

    public final void Q1() {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.r5;
        kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        final int i10 = 0;
        if (kVar.t() || qnVar.F9()) {
            ValueAnimator valueAnimator = qnVar.q9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = qnVar.p9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            qnVar.b0 = 0;
            this.n3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i11 = qnVar.b0;
        final int i12 = 1;
        if (i11 != 0 && backgroundTop != i11 && this.o5 == qnVar.X0.getMeasuredHeight()) {
            int i13 = (this.T1 + qnVar.b0) - backgroundTop;
            setAnimatedTop(i13);
            this.y1.invalidate();
            ValueAnimator valueAnimator3 = qnVar.p9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                qnVar.p9.cancel();
            }
            View view = this.G1;
            if (view != null && view.getVisibility() == 0) {
                this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i13, 0.0f);
            qnVar.p9 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ek
                public final /* synthetic */ fk b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i10) {
                        case 0:
                            fk fkVar = this.b;
                            qn qnVar2 = fkVar.r5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            fkVar.setAnimatedTop((int) floatValue);
                            View view2 = fkVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                qnVar2.t9();
                                qnVar2.w9();
                            } else {
                                fkVar.G1.setTranslationY(((1.0f - fkVar.getTopViewEnterProgress()) * fkVar.G1.getLayoutParams().height) + floatValue);
                            }
                            fkVar.y1.invalidate();
                            fkVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            qnVar.p9.addListener(new m.a(this, 24));
            qnVar.p9.setDuration(250L);
            qnVar.p9.setInterpolator(li.m.V);
            if (!qnVar.o9) {
                qnVar.p9.start();
            }
            qnVar.t9();
            qnVar.w9();
            qnVar.b0 = 0;
        } else if (this.o5 != qnVar.X0.getMeasuredHeight()) {
            qnVar.b0 = 0;
        }
        if (this.n3) {
            float scrollY = (this.q5 - this.E0.getScrollY()) + (this.p5 - this.E0.getMeasuredHeight());
            org.telegram.ui.Components.pf pfVar = this.E0;
            pfVar.setOffsetY(pfVar.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ek
                public final /* synthetic */ fk b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i12) {
                        case 0:
                            fk fkVar = this.b;
                            qn qnVar2 = fkVar.r5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            fkVar.setAnimatedTop((int) floatValue);
                            View view2 = fkVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                qnVar2.t9();
                                qnVar2.w9();
                            } else {
                                fkVar.G1.setTranslationY(((1.0f - fkVar.getTopViewEnterProgress()) * fkVar.G1.getLayoutParams().height) + floatValue);
                            }
                            fkVar.y1.invalidate();
                            fkVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator4 = qnVar.q9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            qnVar.q9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(li.m.V);
            ofFloat2.start();
            this.n3 = false;
        }
        this.o5 = qnVar.X0.getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void o0(boolean z10) {
        super.o0(z10);
        qn qnVar = this.r5;
        kf kfVar = qnVar.nb;
        if (kfVar != null) {
            AndroidUtilities.runOnUIThread(kfVar);
            qnVar.nb = null;
        }
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

    @Override // org.telegram.ui.Components.ChatActivityEnterView, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        qn qnVar = this.r5;
        j6.l lVar = qnVar.Cc;
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (getMeasuredWidth() > 0 && !qnVar.sc) {
            z10 = true;
        }
        lVar.h(1, z11, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void y0(float f7) {
        this.r5.t7();
    }
}
