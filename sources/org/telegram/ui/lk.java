package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class lk extends ChatActivityEnterView {
    public int k5;
    public int l5;
    public int m5;
    public final /* synthetic */ zn n5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(zn znVar, Activity activity, org.telegram.ui.Components.qv0 qv0Var, zn znVar2, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, qv0Var, znVar2, z4, f6Var);
        this.n5 = znVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f10) {
        this.n5.q7();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        zn znVar = this.n5;
        if (znVar.V != null) {
            if (znVar.u0 != null) {
                if (znVar.Aa > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                    if (kVar2.s()) {
                        return;
                    }
                }
            }
            this.j3 = true;
            this.l5 = this.B0.getMeasuredHeight();
            this.m5 = this.B0.getScrollY();
            znVar.U0.invalidate();
            znVar.Y = znVar.V.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void H0() {
        if (this.n5.Ba != null) {
            return;
        }
        super.H0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean N0() {
        return this.n5.K5;
    }

    public final void T1() {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.n5;
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        final int i10 = 0;
        if (kVar.s() || znVar.A9()) {
            ValueAnimator valueAnimator = znVar.n9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = znVar.m9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            znVar.Y = 0;
            this.j3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i11 = znVar.Y;
        final int i12 = 1;
        if (i11 != 0 && backgroundTop != i11 && this.k5 == znVar.U0.getMeasuredHeight()) {
            int i13 = (this.P1 + znVar.Y) - backgroundTop;
            setAnimatedTop(i13);
            this.u1.invalidate();
            ValueAnimator valueAnimator3 = znVar.m9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                znVar.m9.cancel();
            }
            View view = this.C1;
            if (view != null && view.getVisibility() == 0) {
                this.C1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.C1.getLayoutParams().height) + this.P1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i13, 0.0f);
            znVar.m9 = ofFloat;
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
                            zn znVar2 = lkVar.n5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            lkVar.setAnimatedTop((int) floatValue);
                            View view2 = lkVar.C1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                znVar2.o9();
                                znVar2.r9();
                            } else {
                                lkVar.C1.setTranslationY(((1.0f - lkVar.getTopViewEnterProgress()) * lkVar.C1.getLayoutParams().height) + floatValue);
                            }
                            lkVar.u1.invalidate();
                            lkVar.invalidate();
                            break;
                        default:
                            this.b.B0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            znVar.m9.addListener(new u5(this, 17));
            znVar.m9.setDuration(250L);
            znVar.m9.setInterpolator(wh.n.V);
            if (!znVar.l9) {
                znVar.m9.start();
            }
            znVar.o9();
            znVar.r9();
            znVar.Y = 0;
        } else if (this.k5 != znVar.U0.getMeasuredHeight()) {
            znVar.Y = 0;
        }
        if (this.j3) {
            float scrollY = (this.m5 - this.B0.getScrollY()) + (this.l5 - this.B0.getMeasuredHeight());
            org.telegram.ui.Components.ff ffVar = this.B0;
            ffVar.setOffsetY(ffVar.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.B0.getOffsetY(), 0.0f);
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
                            zn znVar2 = lkVar.n5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            lkVar.setAnimatedTop((int) floatValue);
                            View view2 = lkVar.C1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                znVar2.o9();
                                znVar2.r9();
                            } else {
                                lkVar.C1.setTranslationY(((1.0f - lkVar.getTopViewEnterProgress()) * lkVar.C1.getLayoutParams().height) + floatValue);
                            }
                            lkVar.u1.invalidate();
                            lkVar.invalidate();
                            break;
                        default:
                            this.b.B0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator4 = znVar.n9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            znVar.n9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(wh.n.V);
            ofFloat2.start();
            this.j3 = false;
        }
        this.k5 = znVar.U0.getMeasuredHeight();
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
    public final void q0(boolean z4) {
        super.q0(z4);
        zn znVar = this.n5;
        nf nfVar = znVar.kb;
        if (nfVar != null) {
            AndroidUtilities.runOnUIThread(nfVar);
            znVar.kb = null;
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        zn znVar = this.n5;
        h5.u uVar = znVar.yc;
        boolean z4 = false;
        boolean z10 = i10 == 0;
        if (getMeasuredWidth() > 0 && !znVar.oc) {
            z4 = true;
        }
        uVar.h(1, z10, z4);
    }
}
