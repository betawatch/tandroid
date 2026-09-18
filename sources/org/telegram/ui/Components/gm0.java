package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.dc1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ gm0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.a = i10;
        this.d = callback;
        this.b = z10;
        this.c = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                jm0 jm0Var = (jm0) this.d;
                dc1 dc1Var = jm0Var.e;
                jm0Var.h0 = null;
                boolean z10 = this.b;
                jm0Var.i0 = z10 ? 1.0f : 0.0f;
                for (int i10 = 0; i10 < dc1Var.getChildCount(); i10++) {
                    dc1Var.getChildAt(i10).invalidate();
                }
                dc1Var.invalidate();
                jm0Var.p();
                if (!z10) {
                    float childCount = jm0Var.k0 * dc1Var.getChildCount();
                    float scrollX = jm0Var.getScrollX();
                    float f7 = this.c;
                    float childCount2 = (scrollX + f7) / (jm0Var.j0 * dc1Var.getChildCount());
                    float measuredWidth = (childCount - jm0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        childCount2 = measuredWidth;
                        f7 = 0.0f;
                    }
                    float f10 = childCount * childCount2;
                    if (f10 - f7 < 0.0f) {
                        f10 = f7;
                    }
                    jm0Var.l0 = (jm0Var.getScrollX() + f7) - f10;
                    int i11 = (int) (f10 - f7);
                    jm0Var.m0 = i11;
                    if (i11 < 0) {
                        jm0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < dc1Var.getChildCount(); i12++) {
                        View childAt = dc1Var.getChildAt(i12);
                        if (childAt instanceof ex0) {
                            ((ex0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    jm0Var.g0 = false;
                    jm0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
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
