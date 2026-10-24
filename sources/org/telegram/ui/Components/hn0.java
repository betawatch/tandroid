package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.va1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class hn0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ hn0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.a = i10;
        this.d = callback;
        this.b = z10;
        this.c = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                kn0 kn0Var = (kn0) this.d;
                va1 va1Var = kn0Var.e;
                kn0Var.h0 = null;
                boolean z10 = this.b;
                kn0Var.i0 = z10 ? 1.0f : 0.0f;
                for (int i10 = 0; i10 < va1Var.getChildCount(); i10++) {
                    va1Var.getChildAt(i10).invalidate();
                }
                va1Var.invalidate();
                kn0Var.p();
                if (!z10) {
                    float childCount = kn0Var.k0 * va1Var.getChildCount();
                    float scrollX = kn0Var.getScrollX();
                    float f7 = this.c;
                    float childCount2 = (scrollX + f7) / (kn0Var.j0 * va1Var.getChildCount());
                    float measuredWidth = (childCount - kn0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        f7 = 0.0f;
                        childCount2 = measuredWidth;
                    }
                    float f10 = childCount * childCount2;
                    if (f10 - f7 < 0.0f) {
                        f10 = f7;
                    }
                    kn0Var.l0 = (kn0Var.getScrollX() + f7) - f10;
                    int i11 = (int) (f10 - f7);
                    kn0Var.m0 = i11;
                    if (i11 < 0) {
                        kn0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < va1Var.getChildCount(); i12++) {
                        View childAt = va1Var.getChildAt(i12);
                        if (childAt instanceof by0) {
                            ((by0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    kn0Var.g0 = false;
                    kn0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    va1Var.requestLayout();
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
