package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class hk extends ChatActivityEnterView {
    public int o5;
    public int p5;
    public int q5;
    public final /* synthetic */ sn r5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(sn snVar, Activity activity, org.telegram.ui.Components.jw0 jw0Var, sn snVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, jw0Var, snVar2, z10, d6Var);
        this.r5 = snVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        sn snVar = this.r5;
        if (snVar.Y != null) {
            if (snVar.x0 != null) {
                if (snVar.Ea > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                    if (kVar2.s()) {
                        return;
                    }
                }
            }
            this.n3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.q5 = this.E0.getScrollY();
            snVar.X0.invalidate();
            snVar.b0 = snVar.Y.getBackgroundTop();
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
        sn snVar = this.r5;
        kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
        final int i10 = 0;
        if (kVar.s() || snVar.F9()) {
            ValueAnimator valueAnimator = snVar.q9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = snVar.p9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            snVar.b0 = 0;
            this.n3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i11 = snVar.b0;
        final int i12 = 1;
        if (i11 != 0 && backgroundTop != i11 && this.o5 == snVar.X0.getMeasuredHeight()) {
            int i13 = (this.T1 + snVar.b0) - backgroundTop;
            setAnimatedTop(i13);
            this.y1.invalidate();
            ValueAnimator valueAnimator3 = snVar.p9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                snVar.p9.cancel();
            }
            View view = this.G1;
            if (view != null && view.getVisibility() == 0) {
                this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i13, 0.0f);
            snVar.p9 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.gk
                public final /* synthetic */ hk b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i10) {
                        case 0:
                            hk hkVar = this.b;
                            sn snVar2 = hkVar.r5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            hkVar.setAnimatedTop((int) floatValue);
                            View view2 = hkVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                snVar2.t9();
                                snVar2.w9();
                            } else {
                                hkVar.G1.setTranslationY(((1.0f - hkVar.getTopViewEnterProgress()) * hkVar.G1.getLayoutParams().height) + floatValue);
                            }
                            hkVar.y1.invalidate();
                            hkVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            snVar.p9.addListener(new m.a(this, 24));
            snVar.p9.setDuration(250L);
            snVar.p9.setInterpolator(li.m.V);
            if (!snVar.o9) {
                snVar.p9.start();
            }
            snVar.t9();
            snVar.w9();
            snVar.b0 = 0;
        } else if (this.o5 != snVar.X0.getMeasuredHeight()) {
            snVar.b0 = 0;
        }
        if (this.n3) {
            float scrollY = (this.q5 - this.E0.getScrollY()) + (this.p5 - this.E0.getMeasuredHeight());
            org.telegram.ui.Components.pf pfVar = this.E0;
            pfVar.setOffsetY(pfVar.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.gk
                public final /* synthetic */ hk b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i12) {
                        case 0:
                            hk hkVar = this.b;
                            sn snVar2 = hkVar.r5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            hkVar.setAnimatedTop((int) floatValue);
                            View view2 = hkVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                snVar2.t9();
                                snVar2.w9();
                            } else {
                                hkVar.G1.setTranslationY(((1.0f - hkVar.getTopViewEnterProgress()) * hkVar.G1.getLayoutParams().height) + floatValue);
                            }
                            hkVar.y1.invalidate();
                            hkVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator4 = snVar.q9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            snVar.q9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(li.m.V);
            ofFloat2.start();
            this.n3 = false;
        }
        this.o5 = snVar.X0.getMeasuredHeight();
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
        sn snVar = this.r5;
        mf mfVar = snVar.nb;
        if (mfVar != null) {
            AndroidUtilities.runOnUIThread(mfVar);
            snVar.nb = null;
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
        sn snVar = this.r5;
        j6.l lVar = snVar.Cc;
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (getMeasuredWidth() > 0 && !snVar.sc) {
            z10 = true;
        }
        lVar.h(1, z11, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void y0(float f7) {
        this.r5.t7();
    }
}
