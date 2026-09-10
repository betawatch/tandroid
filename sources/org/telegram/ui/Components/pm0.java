package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.gc1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class pm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ pm0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.a = i10;
        this.d = callback;
        this.b = z10;
        this.c = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                sm0 sm0Var = (sm0) this.d;
                gc1 gc1Var = sm0Var.e;
                sm0Var.h0 = null;
                boolean z10 = this.b;
                sm0Var.i0 = z10 ? 1.0f : 0.0f;
                for (int i10 = 0; i10 < gc1Var.getChildCount(); i10++) {
                    gc1Var.getChildAt(i10).invalidate();
                }
                gc1Var.invalidate();
                sm0Var.p();
                if (!z10) {
                    float childCount = sm0Var.k0 * gc1Var.getChildCount();
                    float scrollX = sm0Var.getScrollX();
                    float f7 = this.c;
                    float childCount2 = (scrollX + f7) / (sm0Var.j0 * gc1Var.getChildCount());
                    float measuredWidth = (childCount - sm0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        childCount2 = measuredWidth;
                        f7 = 0.0f;
                    }
                    float f10 = childCount * childCount2;
                    if (f10 - f7 < 0.0f) {
                        f10 = f7;
                    }
                    sm0Var.l0 = (sm0Var.getScrollX() + f7) - f10;
                    int i11 = (int) (f10 - f7);
                    sm0Var.m0 = i11;
                    if (i11 < 0) {
                        sm0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < gc1Var.getChildCount(); i12++) {
                        View childAt = gc1Var.getChildAt(i12);
                        if (childAt instanceof ox0) {
                            ((ox0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    sm0Var.g0 = false;
                    sm0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    gc1Var.requestLayout();
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
                vh.n nVar = ((vh.o) this.d).y;
                nVar.setVisibility(0);
                if (this.b) {
                    float f7 = this.c;
                    nVar.setScaleX(f7);
                    nVar.setScaleY(f7);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
