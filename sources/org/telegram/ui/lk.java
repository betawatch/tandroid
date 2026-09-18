package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class lk extends ChatActivityEnterView {
    public int n5;
    public int o5;
    public int p5;
    public final /* synthetic */ zn q5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(zn znVar, Activity activity, org.telegram.ui.Components.bw0 bw0Var, zn znVar2, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, bw0Var, znVar2, z10, e6Var);
        this.q5 = znVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f7) {
        this.q5.q7();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        zn znVar = this.q5;
        if (znVar.Y != null) {
            if (znVar.x0 != null) {
                if (znVar.Da > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                    if (kVar2.s()) {
                        return;
                    }
                }
            }
            this.m3 = true;
            this.o5 = this.E0.getMeasuredHeight();
            this.p5 = this.E0.getScrollY();
            znVar.X0.invalidate();
            znVar.b0 = znVar.Y.getBackgroundTop();
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
        zn znVar = this.q5;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        final int i10 = 0;
        if (kVar.s() || znVar.A9()) {
            ValueAnimator valueAnimator = znVar.q9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = znVar.p9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            znVar.b0 = 0;
            this.m3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i11 = znVar.b0;
        final int i12 = 1;
        if (i11 != 0 && backgroundTop != i11 && this.n5 == znVar.X0.getMeasuredHeight()) {
            int i13 = (this.S1 + znVar.b0) - backgroundTop;
            setAnimatedTop(i13);
            this.x1.invalidate();
            ValueAnimator valueAnimator3 = znVar.p9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                znVar.p9.cancel();
            }
            View view = this.F1;
            if (view != null && view.getVisibility() == 0) {
                this.F1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.F1.getLayoutParams().height) + this.S1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i13, 0.0f);
            znVar.p9 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.kk
                public final /* synthetic */ lk b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i10) {
                        case 0:
                            lk lkVar = this.b;
                            zn znVar2 = lkVar.q5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            lkVar.setAnimatedTop((int) floatValue);
                            View view2 = lkVar.F1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                znVar2.o9();
                                znVar2.r9();
                            } else {
                                lkVar.F1.setTranslationY(((1.0f - lkVar.getTopViewEnterProgress()) * lkVar.F1.getLayoutParams().height) + floatValue);
                            }
                            lkVar.x1.invalidate();
                            lkVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            znVar.p9.addListener(new t4(this, 18));
            znVar.p9.setDuration(250L);
            znVar.p9.setInterpolator(ji.n.V);
            if (!znVar.o9) {
                znVar.p9.start();
            }
            znVar.o9();
            znVar.r9();
            znVar.b0 = 0;
        } else if (this.n5 != znVar.X0.getMeasuredHeight()) {
            znVar.b0 = 0;
        }
        if (this.m3) {
            float scrollY = (this.p5 - this.E0.getScrollY()) + (this.o5 - this.E0.getMeasuredHeight());
            org.telegram.ui.Components.pf pfVar = this.E0;
            pfVar.setOffsetY(pfVar.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.kk
                public final /* synthetic */ lk b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i12) {
                        case 0:
                            lk lkVar = this.b;
                            zn znVar2 = lkVar.q5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            lkVar.setAnimatedTop((int) floatValue);
                            View view2 = lkVar.F1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                znVar2.o9();
                                znVar2.r9();
                            } else {
                                lkVar.F1.setTranslationY(((1.0f - lkVar.getTopViewEnterProgress()) * lkVar.F1.getLayoutParams().height) + floatValue);
                            }
                            lkVar.x1.invalidate();
                            lkVar.invalidate();
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
            this.m3 = false;
        }
        this.n5 = znVar.X0.getMeasuredHeight();
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
        zn znVar = this.q5;
        rf rfVar = znVar.mb;
        if (rfVar != null) {
            AndroidUtilities.runOnUIThread(rfVar);
            znVar.mb = null;
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        zn znVar = this.q5;
        j6.l lVar = znVar.Ac;
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (getMeasuredWidth() > 0 && !znVar.qc) {
            z10 = true;
        }
        lVar.j(1, z11, z10);
    }
}
