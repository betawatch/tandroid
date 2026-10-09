package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.dc1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ln0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ ln0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.a = i10;
        this.d = callback;
        this.b = z10;
        this.c = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                on0 on0Var = (on0) this.d;
                dc1 dc1Var = on0Var.e;
                on0Var.h0 = null;
                boolean z10 = this.b;
                on0Var.i0 = z10 ? 1.0f : 0.0f;
                for (int i10 = 0; i10 < dc1Var.getChildCount(); i10++) {
                    dc1Var.getChildAt(i10).invalidate();
                }
                dc1Var.invalidate();
                on0Var.p();
                if (!z10) {
                    float childCount = on0Var.k0 * dc1Var.getChildCount();
                    float scrollX = on0Var.getScrollX();
                    float f7 = this.c;
                    float childCount2 = (scrollX + f7) / (on0Var.j0 * dc1Var.getChildCount());
                    float measuredWidth = (childCount - on0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        f7 = 0.0f;
                        childCount2 = measuredWidth;
                    }
                    float f10 = childCount * childCount2;
                    if (f10 - f7 < 0.0f) {
                        f10 = f7;
                    }
                    on0Var.l0 = (on0Var.getScrollX() + f7) - f10;
                    int i11 = (int) (f10 - f7);
                    on0Var.m0 = i11;
                    if (i11 < 0) {
                        on0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < dc1Var.getChildCount(); i12++) {
                        View childAt = dc1Var.getChildAt(i12);
                        if (childAt instanceof fy0) {
                            ((fy0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    on0Var.g0 = false;
                    on0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
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
                wh.j jVar = ((wh.k) this.d).y;
                jVar.setVisibility(0);
                if (this.b) {
                    float f7 = this.c;
                    jVar.setScaleX(f7);
                    jVar.setScaleY(f7);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
