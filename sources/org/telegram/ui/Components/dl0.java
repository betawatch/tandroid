package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class dl0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ dl0(KeyEvent.Callback callback, boolean z10, float f10, int i7) {
        this.a = i7;
        this.d = callback;
        this.b = z10;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                gl0 gl0Var = (gl0) this.d;
                org.telegram.ui.b61 b61Var = gl0Var.e;
                gl0Var.i0 = null;
                boolean z10 = this.b;
                gl0Var.j0 = z10 ? 1.0f : 0.0f;
                for (int i7 = 0; i7 < b61Var.getChildCount(); i7++) {
                    b61Var.getChildAt(i7).invalidate();
                }
                b61Var.invalidate();
                gl0Var.p();
                if (!z10) {
                    float childCount = gl0Var.l0 * b61Var.getChildCount();
                    float scrollX = gl0Var.getScrollX();
                    float f10 = this.c;
                    float childCount2 = (scrollX + f10) / (gl0Var.k0 * b61Var.getChildCount());
                    float measuredWidth = (childCount - gl0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        f10 = 0.0f;
                        childCount2 = measuredWidth;
                    }
                    float f11 = childCount * childCount2;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    gl0Var.m0 = (gl0Var.getScrollX() + f10) - f11;
                    int i10 = (int) (f11 - f10);
                    gl0Var.n0 = i10;
                    if (i10 < 0) {
                        gl0Var.n0 = 0;
                    }
                    for (int i11 = 0; i11 < b61Var.getChildCount(); i11++) {
                        View childAt = b61Var.getChildAt(i11);
                        if (childAt instanceof rv0) {
                            ((rv0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = org.telegram.messenger.g0.L(33.0f);
                    }
                    gl0Var.h0 = false;
                    gl0Var.getLayoutParams().height = org.telegram.messenger.g0.L(36.0f);
                    b61Var.requestLayout();
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
