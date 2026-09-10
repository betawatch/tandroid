package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ok extends ChatActivityEnterView {
    public int n5;
    public int o5;
    public int p5;
    public final /* synthetic */ eo q5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(eo eoVar, Activity activity, org.telegram.ui.Components.aw0 aw0Var, eo eoVar2, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, aw0Var, eoVar2, z10, f6Var);
        this.q5 = eoVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f7) {
        this.q5.q7();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        eo eoVar = this.q5;
        if (eoVar.Y != null) {
            if (eoVar.x0 != null) {
                if (eoVar.Da > 0.0f) {
                    return;
                }
                lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                    if (lVar2.s()) {
                        return;
                    }
                }
            }
            this.m3 = true;
            this.o5 = this.E0.getMeasuredHeight();
            this.p5 = this.E0.getScrollY();
            eoVar.X0.invalidate();
            eoVar.b0 = eoVar.Y.getBackgroundTop();
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
        org.telegram.ui.ActionBar.l lVar;
        eo eoVar = this.q5;
        lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        final int i10 = 0;
        if (lVar.s() || eoVar.A9()) {
            ValueAnimator valueAnimator = eoVar.q9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = eoVar.p9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            eoVar.b0 = 0;
            this.m3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i11 = eoVar.b0;
        final int i12 = 1;
        if (i11 != 0 && backgroundTop != i11 && this.n5 == eoVar.X0.getMeasuredHeight()) {
            int i13 = (this.S1 + eoVar.b0) - backgroundTop;
            setAnimatedTop(i13);
            this.x1.invalidate();
            ValueAnimator valueAnimator3 = eoVar.p9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                eoVar.p9.cancel();
            }
            View view = this.F1;
            if (view != null && view.getVisibility() == 0) {
                this.F1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.F1.getLayoutParams().height) + this.S1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i13, 0.0f);
            eoVar.p9 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.nk
                public final /* synthetic */ ok b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i10) {
                        case 0:
                            ok okVar = this.b;
                            eo eoVar2 = okVar.q5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            okVar.setAnimatedTop((int) floatValue);
                            View view2 = okVar.F1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                eoVar2.o9();
                                eoVar2.r9();
                            } else {
                                okVar.F1.setTranslationY(((1.0f - okVar.getTopViewEnterProgress()) * okVar.F1.getLayoutParams().height) + floatValue);
                            }
                            okVar.x1.invalidate();
                            okVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            eoVar.p9.addListener(new org.telegram.ui.Cells.v5(this, 8));
            eoVar.p9.setDuration(250L);
            eoVar.p9.setInterpolator(ii.n.V);
            if (!eoVar.o9) {
                eoVar.p9.start();
            }
            eoVar.o9();
            eoVar.r9();
            eoVar.b0 = 0;
        } else if (this.n5 != eoVar.X0.getMeasuredHeight()) {
            eoVar.b0 = 0;
        }
        if (this.m3) {
            float scrollY = (this.p5 - this.E0.getScrollY()) + (this.o5 - this.E0.getMeasuredHeight());
            org.telegram.ui.Components.rf rfVar = this.E0;
            rfVar.setOffsetY(rfVar.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.nk
                public final /* synthetic */ ok b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i12) {
                        case 0:
                            ok okVar = this.b;
                            eo eoVar2 = okVar.q5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            okVar.setAnimatedTop((int) floatValue);
                            View view2 = okVar.F1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                eoVar2.o9();
                                eoVar2.r9();
                            } else {
                                okVar.F1.setTranslationY(((1.0f - okVar.getTopViewEnterProgress()) * okVar.F1.getLayoutParams().height) + floatValue);
                            }
                            okVar.x1.invalidate();
                            okVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator4 = eoVar.q9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            eoVar.q9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(ii.n.V);
            ofFloat2.start();
            this.m3 = false;
        }
        this.n5 = eoVar.X0.getMeasuredHeight();
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
        eo eoVar = this.q5;
        sf sfVar = eoVar.nb;
        if (sfVar != null) {
            AndroidUtilities.runOnUIThread(sfVar);
            eoVar.nb = null;
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        eo eoVar = this.q5;
        j6.l lVar = eoVar.Bc;
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (getMeasuredWidth() > 0 && !eoVar.rc) {
            z10 = true;
        }
        lVar.j(1, z11, z10);
    }
}
