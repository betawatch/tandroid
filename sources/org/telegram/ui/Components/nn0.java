package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class nn0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ nn0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.a = i10;
        this.d = callback;
        this.b = z10;
        this.c = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                qn0 qn0Var = (qn0) this.d;
                org.telegram.ui.za1 za1Var = qn0Var.e;
                qn0Var.h0 = null;
                boolean z10 = this.b;
                qn0Var.i0 = z10 ? 1.0f : 0.0f;
                for (int i10 = 0; i10 < za1Var.getChildCount(); i10++) {
                    za1Var.getChildAt(i10).invalidate();
                }
                za1Var.invalidate();
                qn0Var.p();
                if (!z10) {
                    float childCount = qn0Var.k0 * za1Var.getChildCount();
                    float scrollX = qn0Var.getScrollX();
                    float f7 = this.c;
                    float childCount2 = (scrollX + f7) / (qn0Var.j0 * za1Var.getChildCount());
                    float measuredWidth = (childCount - qn0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        f7 = 0.0f;
                        childCount2 = measuredWidth;
                    }
                    float f10 = childCount * childCount2;
                    if (f10 - f7 < 0.0f) {
                        f10 = f7;
                    }
                    qn0Var.l0 = (qn0Var.getScrollX() + f7) - f10;
                    int i11 = (int) (f10 - f7);
                    qn0Var.m0 = i11;
                    if (i11 < 0) {
                        qn0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < za1Var.getChildCount(); i12++) {
                        View childAt = za1Var.getChildAt(i12);
                        if (childAt instanceof ky0) {
                            ((ky0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    qn0Var.g0 = false;
                    qn0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    za1Var.requestLayout();
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
                yh.i iVar = ((yh.j) this.d).y;
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
