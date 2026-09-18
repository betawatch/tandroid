package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.bc1;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class sm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ sm0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.a = i10;
        this.d = callback;
        this.b = z10;
        this.c = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                vm0 vm0Var = (vm0) this.d;
                bc1 bc1Var = vm0Var.e;
                vm0Var.h0 = null;
                boolean z10 = this.b;
                vm0Var.i0 = z10 ? 1.0f : 0.0f;
                for (int i10 = 0; i10 < bc1Var.getChildCount(); i10++) {
                    bc1Var.getChildAt(i10).invalidate();
                }
                bc1Var.invalidate();
                vm0Var.p();
                if (!z10) {
                    float childCount = vm0Var.k0 * bc1Var.getChildCount();
                    float scrollX = vm0Var.getScrollX();
                    float f7 = this.c;
                    float childCount2 = (scrollX + f7) / (vm0Var.j0 * bc1Var.getChildCount());
                    float measuredWidth = (childCount - vm0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        childCount2 = measuredWidth;
                        f7 = 0.0f;
                    }
                    float f10 = childCount * childCount2;
                    if (f10 - f7 < 0.0f) {
                        f10 = f7;
                    }
                    vm0Var.l0 = (vm0Var.getScrollX() + f7) - f10;
                    int i11 = (int) (f10 - f7);
                    vm0Var.m0 = i11;
                    if (i11 < 0) {
                        vm0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < bc1Var.getChildCount(); i12++) {
                        View childAt = bc1Var.getChildAt(i12);
                        if (childAt instanceof px0) {
                            ((px0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    vm0Var.g0 = false;
                    vm0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    bc1Var.requestLayout();
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
                wh.l lVar = ((wh.m) this.d).y;
                lVar.setVisibility(0);
                if (this.b) {
                    float f7 = this.c;
                    lVar.setScaleX(f7);
                    lVar.setScaleY(f7);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
