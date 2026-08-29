package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dk extends ChatActivityEnterView {
    public int j5;
    public int k5;
    public int l5;
    public final /* synthetic */ tn m5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(tn tnVar, Activity activity, org.telegram.ui.Components.hv0 hv0Var, tn tnVar2, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, hv0Var, tnVar2, z10, c6Var);
        this.m5 = tnVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f9) {
        this.m5.q7();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        tn tnVar = this.m5;
        if (tnVar.U != null) {
            if (tnVar.t0 != null) {
                if (tnVar.za > 0.0f) {
                    return;
                }
                lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                    if (lVar2.s()) {
                        return;
                    }
                }
            }
            this.i3 = true;
            this.k5 = this.A0.getMeasuredHeight();
            this.l5 = this.A0.getScrollY();
            tnVar.T0.invalidate();
            tnVar.X = tnVar.U.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void H0() {
        if (this.m5.Aa != null) {
            return;
        }
        super.H0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean N0() {
        return this.m5.J5;
    }

    public final void T1() {
        org.telegram.ui.ActionBar.l lVar;
        tn tnVar = this.m5;
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        final int i10 = 0;
        if (lVar.s() || tnVar.A9()) {
            ValueAnimator valueAnimator = tnVar.m9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = tnVar.l9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            tnVar.X = 0;
            this.i3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i11 = tnVar.X;
        final int i12 = 1;
        if (i11 != 0 && backgroundTop != i11 && this.j5 == tnVar.T0.getMeasuredHeight()) {
            int i13 = (this.O1 + tnVar.X) - backgroundTop;
            setAnimatedTop(i13);
            this.t1.invalidate();
            ValueAnimator valueAnimator3 = tnVar.l9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                tnVar.l9.cancel();
            }
            View view = this.B1;
            if (view != null && view.getVisibility() == 0) {
                this.B1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.B1.getLayoutParams().height) + this.O1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i13, 0.0f);
            tnVar.l9 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ck
                public final /* synthetic */ dk b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i10) {
                        case 0:
                            dk dkVar = this.b;
                            tn tnVar2 = dkVar.m5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            dkVar.setAnimatedTop((int) floatValue);
                            View view2 = dkVar.B1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                tnVar2.o9();
                                tnVar2.r9();
                            } else {
                                dkVar.B1.setTranslationY(((1.0f - dkVar.getTopViewEnterProgress()) * dkVar.B1.getLayoutParams().height) + floatValue);
                            }
                            dkVar.t1.invalidate();
                            dkVar.invalidate();
                            break;
                        default:
                            this.b.A0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            tnVar.l9.addListener(new nh.q5(this, 26));
            tnVar.l9.setDuration(250L);
            tnVar.l9.setInterpolator(uh.m.V);
            if (!tnVar.k9) {
                tnVar.l9.start();
            }
            tnVar.o9();
            tnVar.r9();
            tnVar.X = 0;
        } else if (this.j5 != tnVar.T0.getMeasuredHeight()) {
            tnVar.X = 0;
        }
        if (this.i3) {
            float scrollY = (this.l5 - this.A0.getScrollY()) + (this.k5 - this.A0.getMeasuredHeight());
            org.telegram.ui.Components.jf jfVar = this.A0;
            jfVar.setOffsetY(jfVar.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.A0.getOffsetY(), 0.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ck
                public final /* synthetic */ dk b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i12) {
                        case 0:
                            dk dkVar = this.b;
                            tn tnVar2 = dkVar.m5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            dkVar.setAnimatedTop((int) floatValue);
                            View view2 = dkVar.B1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                tnVar2.o9();
                                tnVar2.r9();
                            } else {
                                dkVar.B1.setTranslationY(((1.0f - dkVar.getTopViewEnterProgress()) * dkVar.B1.getLayoutParams().height) + floatValue);
                            }
                            dkVar.t1.invalidate();
                            dkVar.invalidate();
                            break;
                        default:
                            this.b.A0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator4 = tnVar.m9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            tnVar.m9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(uh.m.V);
            ofFloat2.start();
            this.i3 = false;
        }
        this.j5 = tnVar.T0.getMeasuredHeight();
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
        tn tnVar = this.m5;
        df dfVar = tnVar.jb;
        if (dfVar != null) {
            AndroidUtilities.runOnUIThread(dfVar);
            tnVar.jb = null;
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        tn tnVar = this.m5;
        f5.u uVar = tnVar.xc;
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (getMeasuredWidth() > 0 && !tnVar.nc) {
            z10 = true;
        }
        uVar.j(1, z11, z10);
    }
}
