package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ak extends ChatActivityEnterView {
    public int j5;
    public int k5;
    public int l5;
    public final /* synthetic */ qn m5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(qn qnVar, Activity activity, org.telegram.ui.Components.xu0 xu0Var, qn qnVar2, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity, xu0Var, qnVar2, z10, b6Var);
        this.m5 = qnVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void B0(int i9, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        qn qnVar = this.m5;
        if (qnVar.U != null) {
            if (qnVar.t0 != null) {
                if (qnVar.za > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                    if (kVar2.s()) {
                        return;
                    }
                }
            }
            this.i3 = true;
            this.k5 = this.A0.getMeasuredHeight();
            this.l5 = this.A0.getScrollY();
            qnVar.T0.invalidate();
            qnVar.X = qnVar.U.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void G0() {
        if (this.m5.Aa != null) {
            return;
        }
        super.G0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean N0() {
        return this.m5.J5;
    }

    public final void T1() {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.m5;
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        final int i9 = 0;
        if (kVar.s() || qnVar.A9()) {
            ValueAnimator valueAnimator = qnVar.m9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = qnVar.l9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            qnVar.X = 0;
            this.i3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i10 = qnVar.X;
        final int i11 = 1;
        if (i10 != 0 && backgroundTop != i10 && this.j5 == qnVar.T0.getMeasuredHeight()) {
            int i12 = (this.O1 + qnVar.X) - backgroundTop;
            setAnimatedTop(i12);
            this.t1.invalidate();
            ValueAnimator valueAnimator3 = qnVar.l9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                qnVar.l9.cancel();
            }
            View view = this.B1;
            if (view != null && view.getVisibility() == 0) {
                this.B1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.B1.getLayoutParams().height) + this.O1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i12, 0.0f);
            qnVar.l9 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.zj
                public final /* synthetic */ ak b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i9) {
                        case 0:
                            ak akVar = this.b;
                            qn qnVar2 = akVar.m5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            akVar.setAnimatedTop((int) floatValue);
                            View view2 = akVar.B1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                qnVar2.o9();
                                qnVar2.r9();
                            } else {
                                akVar.B1.setTranslationY(((1.0f - akVar.getTopViewEnterProgress()) * akVar.B1.getLayoutParams().height) + floatValue);
                            }
                            akVar.t1.invalidate();
                            akVar.invalidate();
                            break;
                        default:
                            this.b.A0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            qnVar.l9.addListener(new mh.x(this, 24));
            qnVar.l9.setDuration(250L);
            qnVar.l9.setInterpolator(rh.m.V);
            if (!qnVar.k9) {
                qnVar.l9.start();
            }
            qnVar.o9();
            qnVar.r9();
            qnVar.X = 0;
        } else if (this.j5 != qnVar.T0.getMeasuredHeight()) {
            qnVar.X = 0;
        }
        if (this.i3) {
            float scrollY = (this.l5 - this.A0.getScrollY()) + (this.k5 - this.A0.getMeasuredHeight());
            org.telegram.ui.Components.ff ffVar = this.A0;
            ffVar.setOffsetY(ffVar.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.A0.getOffsetY(), 0.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.zj
                public final /* synthetic */ ak b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i11) {
                        case 0:
                            ak akVar = this.b;
                            qn qnVar2 = akVar.m5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            akVar.setAnimatedTop((int) floatValue);
                            View view2 = akVar.B1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                qnVar2.o9();
                                qnVar2.r9();
                            } else {
                                akVar.B1.setTranslationY(((1.0f - akVar.getTopViewEnterProgress()) * akVar.B1.getLayoutParams().height) + floatValue);
                            }
                            akVar.t1.invalidate();
                            akVar.invalidate();
                            break;
                        default:
                            this.b.A0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator4 = qnVar.m9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            qnVar.m9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(rh.m.V);
            ofFloat2.start();
            this.i3 = false;
        }
        this.j5 = qnVar.T0.getMeasuredHeight();
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
    public final void p0(boolean z10) {
        super.p0(z10);
        qn qnVar = this.m5;
        gf gfVar = qnVar.jb;
        if (gfVar != null) {
            AndroidUtilities.runOnUIThread(gfVar);
            qnVar.jb = null;
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView, android.view.View
    public final void setVisibility(int i9) {
        super.setVisibility(i9);
        qn qnVar = this.m5;
        d5.w wVar = qnVar.xc;
        boolean z10 = false;
        boolean z11 = i9 == 0;
        if (getMeasuredWidth() > 0 && !qnVar.nc) {
            z10 = true;
        }
        wVar.j(1, z11, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void z0(float f10) {
        this.m5.q7();
    }
}
