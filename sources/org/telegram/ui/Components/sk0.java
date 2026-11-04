package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sk0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ sk0(KeyEvent.Callback callback, boolean z10, float f10, int i3) {
        this.a = i3;
        this.d = callback;
        this.b = z10;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                vk0 vk0Var = (vk0) this.d;
                org.telegram.ui.s51 s51Var = vk0Var.e;
                vk0Var.i0 = null;
                boolean z10 = this.b;
                vk0Var.j0 = z10 ? 1.0f : 0.0f;
                for (int i3 = 0; i3 < s51Var.getChildCount(); i3++) {
                    s51Var.getChildAt(i3).invalidate();
                }
                s51Var.invalidate();
                vk0Var.p();
                if (!z10) {
                    float childCount = vk0Var.l0 * s51Var.getChildCount();
                    float scrollX = vk0Var.getScrollX();
                    float f10 = this.c;
                    float childCount2 = (scrollX + f10) / (vk0Var.k0 * s51Var.getChildCount());
                    float measuredWidth = (childCount - vk0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        f10 = 0.0f;
                        childCount2 = measuredWidth;
                    }
                    float f11 = childCount * childCount2;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    vk0Var.m0 = (vk0Var.getScrollX() + f10) - f11;
                    int i10 = (int) (f11 - f10);
                    vk0Var.n0 = i10;
                    if (i10 < 0) {
                        vk0Var.n0 = 0;
                    }
                    for (int i11 = 0; i11 < s51Var.getChildCount(); i11++) {
                        View childAt = s51Var.getChildAt(i11);
                        if (childAt instanceof ev0) {
                            ((ev0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = org.telegram.messenger.g0.L(33.0f);
                    }
                    vk0Var.h0 = false;
                    vk0Var.getLayoutParams().height = org.telegram.messenger.g0.L(36.0f);
                    s51Var.requestLayout();
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
                zh.i iVar = ((zh.j) this.d).E;
                iVar.setVisibility(0);
                if (this.b) {
                    float f10 = this.c;
                    iVar.setScaleX(f10);
                    iVar.setScaleY(f10);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
