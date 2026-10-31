package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mk extends ChatActivityEnterView {
    public int t5;
    public int u5;
    public int v5;
    public final /* synthetic */ un w5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(un unVar, Activity activity, org.telegram.ui.Components.uu0 uu0Var, un unVar2, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity, uu0Var, unVar2, z10, p6Var);
        this.w5 = unVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        un unVar = this.w5;
        if (unVar.Z != null) {
            if (unVar.z0 != null) {
                if (unVar.Xa > 0.0f) {
                    return;
                }
                lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                    if (lVar2.u()) {
                        return;
                    }
                }
            }
            this.n3 = true;
            this.u5 = this.E0.getMeasuredHeight();
            this.v5 = this.E0.getScrollY();
            unVar.l1.invalidate();
            unVar.c0 = unVar.Z.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void F0() {
        if (this.w5.Ya != null) {
            return;
        }
        super.F0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean L0() {
        return this.w5.d6;
    }

    public final void S1() {
        org.telegram.ui.ActionBar.l lVar;
        un unVar = this.w5;
        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        final int i10 = 0;
        if (lVar.u() || unVar.M9()) {
            ValueAnimator valueAnimator = unVar.J9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = unVar.I9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            unVar.c0 = 0;
            this.n3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i11 = unVar.c0;
        final int i12 = 1;
        if (i11 != 0 && backgroundTop != i11 && this.t5 == unVar.l1.getMeasuredHeight()) {
            int i13 = (this.T1 + unVar.c0) - backgroundTop;
            setAnimatedTop(i13);
            this.y1.invalidate();
            ValueAnimator valueAnimator3 = unVar.I9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                unVar.I9.cancel();
            }
            View view = this.G1;
            if (view != null && view.getVisibility() == 0) {
                this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i13, 0.0f);
            unVar.I9 = ofFloat;
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
                            un unVar2 = mkVar.w5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            mkVar.setAnimatedTop((int) floatValue);
                            View view2 = mkVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                unVar2.A9();
                                unVar2.C9();
                            } else {
                                mkVar.G1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.G1.getLayoutParams().height) + floatValue);
                            }
                            mkVar.y1.invalidate();
                            mkVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            unVar.I9.addListener(new s9(this, 16));
            unVar.I9.setDuration(250L);
            unVar.I9.setInterpolator(ci.o.V);
            if (!unVar.H9) {
                unVar.I9.start();
            }
            unVar.A9();
            unVar.C9();
            unVar.c0 = 0;
        } else if (this.t5 != unVar.l1.getMeasuredHeight()) {
            unVar.c0 = 0;
        }
        if (this.n3) {
            float scrollY = (this.v5 - this.E0.getScrollY()) + (this.u5 - this.E0.getMeasuredHeight());
            org.telegram.ui.Components.se seVar = this.E0;
            seVar.setOffsetY(seVar.getOffsetY() - scrollY);
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
                            un unVar2 = mkVar.w5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            mkVar.setAnimatedTop((int) floatValue);
                            View view2 = mkVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                unVar2.A9();
                                unVar2.C9();
                            } else {
                                mkVar.G1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.G1.getLayoutParams().height) + floatValue);
                            }
                            mkVar.y1.invalidate();
                            mkVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator4 = unVar.J9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            unVar.J9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(ci.o.V);
            ofFloat2.start();
            this.n3 = false;
        }
        this.t5 = unVar.l1.getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void m0(boolean z10) {
        super.m0(z10);
        un unVar = this.w5;
        mf mfVar = unVar.Ib;
        if (mfVar != null) {
            org.telegram.messenger.i0.g3(mfVar);
            unVar.Ib = null;
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
        un unVar = this.w5;
        j6.m mVar = unVar.Xc;
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (getMeasuredWidth() > 0 && !unVar.Nc) {
            z10 = true;
        }
        mVar.h(1, z11, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void y0(float f7) {
        this.w5.y7();
    }
}
