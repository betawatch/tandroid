package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jk extends ChatActivityEnterView {
    public int s5;
    public int t5;
    public int u5;
    public final /* synthetic */ wn v5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(wn wnVar, Activity activity, org.telegram.ui.Components.ww0 ww0Var, wn wnVar2, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, ww0Var, wnVar2, z10, u6Var);
        this.v5 = wnVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void E0() {
        if (this.v5.Va != null) {
            return;
        }
        super.E0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean K0() {
        return this.v5.d6;
    }

    public final void Q1() {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.v5;
        kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        final int i10 = 0;
        if (kVar.q() || wnVar.M9()) {
            ValueAnimator valueAnimator = wnVar.G9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = wnVar.F9;
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
        if (i11 != 0 && backgroundTop != i11 && this.s5 == wnVar.j1.getMeasuredHeight()) {
            int i13 = (this.T1 + wnVar.b0) - backgroundTop;
            setAnimatedTop(i13);
            this.y1.invalidate();
            ValueAnimator valueAnimator3 = wnVar.F9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                wnVar.F9.cancel();
            }
            View view = this.G1;
            if (view != null && view.getVisibility() == 0) {
                this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i13, 0.0f);
            wnVar.F9 = ofFloat;
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
                            wn wnVar2 = jkVar.v5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            jkVar.setAnimatedTop((int) floatValue);
                            View view2 = jkVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                wnVar2.A9();
                                wnVar2.C9();
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
            wnVar.F9.addListener(new kg.e(this, 26));
            wnVar.F9.setDuration(250L);
            wnVar.F9.setInterpolator(mi.m.V);
            if (!wnVar.E9) {
                wnVar.F9.start();
            }
            wnVar.A9();
            wnVar.C9();
            wnVar.b0 = 0;
        } else if (this.s5 != wnVar.j1.getMeasuredHeight()) {
            wnVar.b0 = 0;
        }
        if (this.n3) {
            float scrollY = (this.u5 - this.E0.getScrollY()) + (this.t5 - this.E0.getMeasuredHeight());
            org.telegram.ui.Components.pf pfVar = this.E0;
            pfVar.setOffsetY(pfVar.getOffsetY() - scrollY);
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
                            wn wnVar2 = jkVar.v5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            jkVar.setAnimatedTop((int) floatValue);
                            View view2 = jkVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                wnVar2.A9();
                                wnVar2.C9();
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
            ValueAnimator valueAnimator4 = wnVar.G9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            wnVar.G9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(mi.m.V);
            ofFloat2.start();
            this.n3 = false;
        }
        this.s5 = wnVar.j1.getMeasuredHeight();
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
        wn wnVar = this.v5;
        jf jfVar = wnVar.Nb;
        if (jfVar != null) {
            AndroidUtilities.runOnUIThread(jfVar);
            wnVar.Nb = null;
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
        wn wnVar = this.v5;
        k6.m mVar = wnVar.cd;
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (getMeasuredWidth() > 0 && !wnVar.Sc) {
            z10 = true;
        }
        mVar.h(1, z11, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void x0(float f7) {
        this.v5.z7();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void z0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        wn wnVar = this.v5;
        if (wnVar.Y != null) {
            if (wnVar.x0 != null) {
                if (wnVar.Ua > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                    if (kVar2.q()) {
                        return;
                    }
                }
            }
            this.n3 = true;
            this.t5 = this.E0.getMeasuredHeight();
            this.u5 = this.E0.getScrollY();
            wnVar.j1.invalidate();
            wnVar.b0 = wnVar.Y.getBackgroundTop();
        }
    }
}
