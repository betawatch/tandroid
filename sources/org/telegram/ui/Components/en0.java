package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.qa1;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class en0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ en0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.a = i10;
        this.d = callback;
        this.b = z10;
        this.c = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                hn0 hn0Var = (hn0) this.d;
                qa1 qa1Var = hn0Var.e;
                hn0Var.h0 = null;
                boolean z10 = this.b;
                hn0Var.i0 = z10 ? 1.0f : 0.0f;
                for (int i10 = 0; i10 < qa1Var.getChildCount(); i10++) {
                    qa1Var.getChildAt(i10).invalidate();
                }
                qa1Var.invalidate();
                hn0Var.p();
                if (!z10) {
                    float childCount = hn0Var.k0 * qa1Var.getChildCount();
                    float scrollX = hn0Var.getScrollX();
                    float f7 = this.c;
                    float childCount2 = (scrollX + f7) / (hn0Var.j0 * qa1Var.getChildCount());
                    float measuredWidth = (childCount - hn0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        f7 = 0.0f;
                        childCount2 = measuredWidth;
                    }
                    float f10 = childCount * childCount2;
                    if (f10 - f7 < 0.0f) {
                        f10 = f7;
                    }
                    hn0Var.l0 = (hn0Var.getScrollX() + f7) - f10;
                    int i11 = (int) (f10 - f7);
                    hn0Var.m0 = i11;
                    if (i11 < 0) {
                        hn0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < qa1Var.getChildCount(); i12++) {
                        View childAt = qa1Var.getChildAt(i12);
                        if (childAt instanceof yx0) {
                            ((yx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    hn0Var.g0 = false;
                    hn0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    qa1Var.requestLayout();
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
