package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ok0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ ok0(KeyEvent.Callback callback, boolean z9, float f10, int i7) {
        this.a = i7;
        this.d = callback;
        this.b = z9;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                rk0 rk0Var = (rk0) this.d;
                org.telegram.ui.c61 c61Var = rk0Var.e;
                rk0Var.h0 = null;
                boolean z9 = this.b;
                rk0Var.i0 = z9 ? 1.0f : 0.0f;
                for (int i7 = 0; i7 < c61Var.getChildCount(); i7++) {
                    c61Var.getChildAt(i7).invalidate();
                }
                c61Var.invalidate();
                rk0Var.p();
                if (!z9) {
                    float childCount = rk0Var.k0 * c61Var.getChildCount();
                    float scrollX = rk0Var.getScrollX();
                    float f10 = this.c;
                    float childCount2 = (scrollX + f10) / (rk0Var.j0 * c61Var.getChildCount());
                    float measuredWidth = (childCount - rk0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        f10 = 0.0f;
                        childCount2 = measuredWidth;
                    }
                    float f11 = childCount * childCount2;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    rk0Var.l0 = (rk0Var.getScrollX() + f10) - f11;
                    int i10 = (int) (f11 - f10);
                    rk0Var.m0 = i10;
                    if (i10 < 0) {
                        rk0Var.m0 = 0;
                    }
                    for (int i11 = 0; i11 < c61Var.getChildCount(); i11++) {
                        View childAt = c61Var.getChildAt(i11);
                        if (childAt instanceof fv0) {
                            ((fv0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = org.telegram.messenger.g0.L(33.0f);
                    }
                    rk0Var.g0 = false;
                    rk0Var.getLayoutParams().height = org.telegram.messenger.g0.L(36.0f);
                    c61Var.requestLayout();
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
                yh.k kVar = ((yh.l) this.d).D;
                kVar.setVisibility(0);
                if (this.b) {
                    float f10 = this.c;
                    kVar.setScaleX(f10);
                    kVar.setScaleY(f10);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
