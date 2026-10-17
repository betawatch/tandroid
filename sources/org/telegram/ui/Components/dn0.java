package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.sa1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class dn0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ dn0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.a = i10;
        this.d = callback;
        this.b = z10;
        this.c = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                gn0 gn0Var = (gn0) this.d;
                sa1 sa1Var = gn0Var.e;
                gn0Var.h0 = null;
                boolean z10 = this.b;
                gn0Var.i0 = z10 ? 1.0f : 0.0f;
                for (int i10 = 0; i10 < sa1Var.getChildCount(); i10++) {
                    sa1Var.getChildAt(i10).invalidate();
                }
                sa1Var.invalidate();
                gn0Var.p();
                if (!z10) {
                    float childCount = gn0Var.k0 * sa1Var.getChildCount();
                    float scrollX = gn0Var.getScrollX();
                    float f7 = this.c;
                    float childCount2 = (scrollX + f7) / (gn0Var.j0 * sa1Var.getChildCount());
                    float measuredWidth = (childCount - gn0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        f7 = 0.0f;
                        childCount2 = measuredWidth;
                    }
                    float f10 = childCount * childCount2;
                    if (f10 - f7 < 0.0f) {
                        f10 = f7;
                    }
                    gn0Var.l0 = (gn0Var.getScrollX() + f7) - f10;
                    int i11 = (int) (f10 - f7);
                    gn0Var.m0 = i11;
                    if (i11 < 0) {
                        gn0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < sa1Var.getChildCount(); i12++) {
                        View childAt = sa1Var.getChildAt(i12);
                        if (childAt instanceof wx0) {
                            ((wx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    gn0Var.g0 = false;
                    gn0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    sa1Var.requestLayout();
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
                xh.i iVar = ((xh.j) this.d).y;
                iVar.setVisibility(0);
                if (this.b) {
                    float f7 = this.c;
                    iVar.setScaleX(f7);
                    iVar.setScaleY(f7);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
