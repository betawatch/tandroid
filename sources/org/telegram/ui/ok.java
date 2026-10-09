package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ok extends ChatActivityEnterView {
    public int o5;
    public int p5;
    public int q5;
    public final /* synthetic */ zn r5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(zn znVar, Activity activity, org.telegram.ui.Components.sw0 sw0Var, zn znVar2, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, sw0Var, znVar2, z10, e6Var);
        this.r5 = znVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        zn znVar = this.r5;
        if (znVar.Y != null) {
            if (znVar.x0 != null) {
                if (znVar.Ea > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                    if (kVar2.t()) {
                        return;
                    }
                }
            }
            this.n3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.q5 = this.E0.getScrollY();
            znVar.X0.invalidate();
            znVar.b0 = znVar.Y.getBackgroundTop();
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

    public final void S1() {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.r5;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        final int i10 = 0;
        if (kVar.t() || znVar.F9()) {
            ValueAnimator valueAnimator = znVar.q9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = znVar.p9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            znVar.b0 = 0;
            this.n3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i11 = znVar.b0;
        final int i12 = 1;
        if (i11 != 0 && backgroundTop != i11 && this.o5 == znVar.X0.getMeasuredHeight()) {
            int i13 = (this.T1 + znVar.b0) - backgroundTop;
            setAnimatedTop(i13);
            this.y1.invalidate();
            ValueAnimator valueAnimator3 = znVar.p9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                znVar.p9.cancel();
            }
            View view = this.G1;
            if (view != null && view.getVisibility() == 0) {
                this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i13, 0.0f);
            znVar.p9 = ofFloat;
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
                            zn znVar2 = okVar.r5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            okVar.setAnimatedTop((int) floatValue);
                            View view2 = okVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                znVar2.t9();
                                znVar2.w9();
                            } else {
                                okVar.G1.setTranslationY(((1.0f - okVar.getTopViewEnterProgress()) * okVar.G1.getLayoutParams().height) + floatValue);
                            }
                            okVar.y1.invalidate();
                            okVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            znVar.p9.addListener(new t4(this, 19));
            znVar.p9.setDuration(250L);
            znVar.p9.setInterpolator(ji.n.V);
            if (!znVar.o9) {
                znVar.p9.start();
            }
            znVar.t9();
            znVar.w9();
            znVar.b0 = 0;
        } else if (this.o5 != znVar.X0.getMeasuredHeight()) {
            znVar.b0 = 0;
        }
        if (this.n3) {
            float scrollY = (this.q5 - this.E0.getScrollY()) + (this.p5 - this.E0.getMeasuredHeight());
            org.telegram.ui.Components.sf sfVar = this.E0;
            sfVar.setOffsetY(sfVar.getOffsetY() - scrollY);
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
                            zn znVar2 = okVar.r5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            okVar.setAnimatedTop((int) floatValue);
                            View view2 = okVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                znVar2.t9();
                                znVar2.w9();
                            } else {
                                okVar.G1.setTranslationY(((1.0f - okVar.getTopViewEnterProgress()) * okVar.G1.getLayoutParams().height) + floatValue);
                            }
                            okVar.y1.invalidate();
                            okVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator4 = znVar.q9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            znVar.q9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(ji.n.V);
            ofFloat2.start();
            this.n3 = false;
        }
        this.o5 = znVar.X0.getMeasuredHeight();
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
        zn znVar = this.r5;
        rf rfVar = znVar.nb;
        if (rfVar != null) {
            AndroidUtilities.runOnUIThread(rfVar);
            znVar.nb = null;
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
        zn znVar = this.r5;
        j6.l lVar = znVar.Bc;
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (getMeasuredWidth() > 0 && !znVar.rc) {
            z10 = true;
        }
        lVar.i(1, z11, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void y0(float f7) {
        this.r5.t7();
    }
}
