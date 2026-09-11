package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cc1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class fm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ fm0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.a = i10;
        this.d = callback;
        this.b = z10;
        this.c = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                im0 im0Var = (im0) this.d;
                cc1 cc1Var = im0Var.e;
                im0Var.h0 = null;
                boolean z10 = this.b;
                im0Var.i0 = z10 ? 1.0f : 0.0f;
                for (int i10 = 0; i10 < cc1Var.getChildCount(); i10++) {
                    cc1Var.getChildAt(i10).invalidate();
                }
                cc1Var.invalidate();
                im0Var.p();
                if (!z10) {
                    float childCount = im0Var.k0 * cc1Var.getChildCount();
                    float scrollX = im0Var.getScrollX();
                    float f7 = this.c;
                    float childCount2 = (scrollX + f7) / (im0Var.j0 * cc1Var.getChildCount());
                    float measuredWidth = (childCount - im0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        childCount2 = measuredWidth;
                        f7 = 0.0f;
                    }
                    float f10 = childCount * childCount2;
                    if (f10 - f7 < 0.0f) {
                        f10 = f7;
                    }
                    im0Var.l0 = (im0Var.getScrollX() + f7) - f10;
                    int i11 = (int) (f10 - f7);
                    im0Var.m0 = i11;
                    if (i11 < 0) {
                        im0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < cc1Var.getChildCount(); i12++) {
                        View childAt = cc1Var.getChildAt(i12);
                        if (childAt instanceof cx0) {
                            ((cx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    im0Var.g0 = false;
                    im0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    cc1Var.requestLayout();
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
                xh.l lVar = ((xh.m) this.d).y;
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
