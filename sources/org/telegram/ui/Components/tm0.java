package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.dc1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class tm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ tm0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.a = i10;
        this.d = callback;
        this.b = z10;
        this.c = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                wm0 wm0Var = (wm0) this.d;
                dc1 dc1Var = wm0Var.e;
                wm0Var.h0 = null;
                boolean z10 = this.b;
                wm0Var.i0 = z10 ? 1.0f : 0.0f;
                for (int i10 = 0; i10 < dc1Var.getChildCount(); i10++) {
                    dc1Var.getChildAt(i10).invalidate();
                }
                dc1Var.invalidate();
                wm0Var.p();
                if (!z10) {
                    float childCount = wm0Var.k0 * dc1Var.getChildCount();
                    float scrollX = wm0Var.getScrollX();
                    float f7 = this.c;
                    float childCount2 = (scrollX + f7) / (wm0Var.j0 * dc1Var.getChildCount());
                    float measuredWidth = (childCount - wm0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        childCount2 = measuredWidth;
                        f7 = 0.0f;
                    }
                    float f10 = childCount * childCount2;
                    if (f10 - f7 < 0.0f) {
                        f10 = f7;
                    }
                    wm0Var.l0 = (wm0Var.getScrollX() + f7) - f10;
                    int i11 = (int) (f10 - f7);
                    wm0Var.m0 = i11;
                    if (i11 < 0) {
                        wm0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < dc1Var.getChildCount(); i12++) {
                        View childAt = dc1Var.getChildAt(i12);
                        if (childAt instanceof qx0) {
                            ((qx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    wm0Var.g0 = false;
                    wm0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    dc1Var.requestLayout();
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
