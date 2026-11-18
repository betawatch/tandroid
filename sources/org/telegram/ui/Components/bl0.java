package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class bl0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ bl0(KeyEvent.Callback callback, boolean z10, float f10, int i7) {
        this.a = i7;
        this.d = callback;
        this.b = z10;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                el0 el0Var = (el0) this.d;
                org.telegram.ui.d61 d61Var = el0Var.e;
                el0Var.i0 = null;
                boolean z10 = this.b;
                el0Var.j0 = z10 ? 1.0f : 0.0f;
                for (int i7 = 0; i7 < d61Var.getChildCount(); i7++) {
                    d61Var.getChildAt(i7).invalidate();
                }
                d61Var.invalidate();
                el0Var.p();
                if (!z10) {
                    float childCount = el0Var.l0 * d61Var.getChildCount();
                    float scrollX = el0Var.getScrollX();
                    float f10 = this.c;
                    float childCount2 = (scrollX + f10) / (el0Var.k0 * d61Var.getChildCount());
                    float measuredWidth = (childCount - el0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        f10 = 0.0f;
                        childCount2 = measuredWidth;
                    }
                    float f11 = childCount * childCount2;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    el0Var.m0 = (el0Var.getScrollX() + f10) - f11;
                    int i10 = (int) (f11 - f10);
                    el0Var.n0 = i10;
                    if (i10 < 0) {
                        el0Var.n0 = 0;
                    }
                    for (int i11 = 0; i11 < d61Var.getChildCount(); i11++) {
                        View childAt = d61Var.getChildAt(i11);
                        if (childAt instanceof pv0) {
                            ((pv0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = org.telegram.messenger.g0.L(33.0f);
                    }
                    el0Var.h0 = false;
                    el0Var.getLayoutParams().height = org.telegram.messenger.g0.L(36.0f);
                    d61Var.requestLayout();
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
