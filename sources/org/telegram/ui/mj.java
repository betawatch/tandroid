package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mj extends ChatActivityEnterView {
    public int u5;
    public int v5;
    public int w5;
    public final /* synthetic */ wm x5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj(wm wmVar, Activity activity, org.telegram.ui.Components.qt0 qt0Var, wm wmVar2, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, qt0Var, wmVar2, z10, e6Var);
        this.x5 = wmVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void B0(int i3, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        wm wmVar = this.x5;
        if (wmVar.a0 != null) {
            if (wmVar.A0 != null) {
                if (wmVar.Ya > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                    if (kVar2.v()) {
                        return;
                    }
                }
            }
            this.o3 = true;
            this.v5 = this.F0.getMeasuredHeight();
            this.w5 = this.F0.getScrollY();
            wmVar.m1.invalidate();
            wmVar.d0 = wmVar.a0.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void G0() {
        if (this.x5.Za != null) {
            return;
        }
        super.G0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean M0() {
        return this.x5.e6;
    }

    public final void U1() {
        org.telegram.ui.ActionBar.k kVar;
        wm wmVar = this.x5;
        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        final int i3 = 0;
        if (kVar.v() || wmVar.W9()) {
            ValueAnimator valueAnimator = wmVar.K9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = wmVar.J9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            wmVar.d0 = 0;
            this.o3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i10 = wmVar.d0;
        final int i11 = 1;
        if (i10 != 0 && backgroundTop != i10 && this.u5 == wmVar.m1.getMeasuredHeight()) {
            int i12 = (this.U1 + wmVar.d0) - backgroundTop;
            setAnimatedTop(i12);
            this.z1.invalidate();
            ValueAnimator valueAnimator3 = wmVar.J9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                wmVar.J9.cancel();
            }
            View view = this.H1;
            if (view != null && view.getVisibility() == 0) {
                this.H1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.H1.getLayoutParams().height) + this.U1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i12, 0.0f);
            wmVar.J9 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.lj
                public final /* synthetic */ mj b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i3) {
                        case 0:
                            mj mjVar = this.b;
                            wm wmVar2 = mjVar.x5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            mjVar.setAnimatedTop((int) floatValue);
                            View view2 = mjVar.H1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                wmVar2.K9();
                                wmVar2.M9();
                            } else {
                                mjVar.H1.setTranslationY(((1.0f - mjVar.getTopViewEnterProgress()) * mjVar.H1.getLayoutParams().height) + floatValue);
                            }
                            mjVar.z1.invalidate();
                            mjVar.invalidate();
                            break;
                        default:
                            this.b.F0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            wmVar.J9.addListener(new org.telegram.ui.Cells.w9(this, 6));
            wmVar.J9.setDuration(250L);
            wmVar.J9.setInterpolator(ni.l.V);
            if (!wmVar.I9) {
                wmVar.J9.start();
            }
            wmVar.K9();
            wmVar.M9();
            wmVar.d0 = 0;
        } else if (this.u5 != wmVar.m1.getMeasuredHeight()) {
            wmVar.d0 = 0;
        }
        if (this.o3) {
            float scrollY = (this.w5 - this.F0.getScrollY()) + (this.v5 - this.F0.getMeasuredHeight());
            org.telegram.ui.Components.ve veVar = this.F0;
            veVar.setOffsetY(veVar.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.F0.getOffsetY(), 0.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.lj
                public final /* synthetic */ mj b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i11) {
                        case 0:
                            mj mjVar = this.b;
                            wm wmVar2 = mjVar.x5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            mjVar.setAnimatedTop((int) floatValue);
                            View view2 = mjVar.H1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                wmVar2.K9();
                                wmVar2.M9();
                            } else {
                                mjVar.H1.setTranslationY(((1.0f - mjVar.getTopViewEnterProgress()) * mjVar.H1.getLayoutParams().height) + floatValue);
                            }
                            mjVar.z1.invalidate();
                            mjVar.invalidate();
                            break;
                        default:
                            this.b.F0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator4 = wmVar.K9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            wmVar.K9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(ni.l.V);
            ofFloat2.start();
            this.o3 = false;
        }
        this.u5 = wmVar.m1.getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void n0(boolean z10) {
        super.n0(z10);
        wm wmVar = this.x5;
        xe xeVar = wmVar.Ob;
        if (xeVar != null) {
            org.telegram.messenger.g0.h3(xeVar);
            wmVar.Ob = null;
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
    public final void setVisibility(int i3) {
        super.setVisibility(i3);
        wm wmVar = this.x5;
        l6.n nVar = wmVar.gd;
        boolean z10 = false;
        boolean z11 = i3 == 0;
        if (getMeasuredWidth() > 0 && !wmVar.Wc) {
            z10 = true;
        }
        nVar.h(1, z11, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void z0(float f10) {
        this.x5.E7();
    }
}
