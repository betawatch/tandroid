package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class tk0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ tk0(KeyEvent.Callback callback, boolean z10, float f10, int i7) {
        this.a = i7;
        this.d = callback;
        this.b = z10;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                wk0 wk0Var = (wk0) this.d;
                org.telegram.ui.z51 z51Var = wk0Var.e;
                wk0Var.i0 = null;
                boolean z10 = this.b;
                wk0Var.j0 = z10 ? 1.0f : 0.0f;
                for (int i7 = 0; i7 < z51Var.getChildCount(); i7++) {
                    z51Var.getChildAt(i7).invalidate();
                }
                z51Var.invalidate();
                wk0Var.p();
                if (!z10) {
                    float childCount = wk0Var.l0 * z51Var.getChildCount();
                    float scrollX = wk0Var.getScrollX();
                    float f10 = this.c;
                    float childCount2 = (scrollX + f10) / (wk0Var.k0 * z51Var.getChildCount());
                    float measuredWidth = (childCount - wk0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        f10 = 0.0f;
                        childCount2 = measuredWidth;
                    }
                    float f11 = childCount * childCount2;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    wk0Var.m0 = (wk0Var.getScrollX() + f10) - f11;
                    int i10 = (int) (f11 - f10);
                    wk0Var.n0 = i10;
                    if (i10 < 0) {
                        wk0Var.n0 = 0;
                    }
                    for (int i11 = 0; i11 < z51Var.getChildCount(); i11++) {
                        View childAt = z51Var.getChildAt(i11);
                        if (childAt instanceof hv0) {
                            ((hv0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = org.telegram.messenger.g0.L(33.0f);
                    }
                    wk0Var.h0 = false;
                    wk0Var.getLayoutParams().height = org.telegram.messenger.g0.L(36.0f);
                    z51Var.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                if (!this.b) {
                    super/*android.app.Dialog*/.dismiss();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationStart(animator);
                zh.j jVar = ((zh.k) this.d).E;
                jVar.setVisibility(0);
                if (this.b) {
                    float f10 = this.c;
                    jVar.setScaleX(f10);
                    jVar.setScaleY(f10);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
