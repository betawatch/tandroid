package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.hb1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class r extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ r(KeyEvent.Callback callback, boolean z4, float f10, int i10) {
        this.a = i10;
        this.d = callback;
        this.b = z4;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                if (!this.b) {
                    super/*android.app.Dialog*/.dismiss();
                    break;
                }
                break;
            default:
                pm0 pm0Var = (pm0) this.d;
                hb1 hb1Var = pm0Var.e;
                pm0Var.e0 = null;
                boolean z4 = this.b;
                pm0Var.f0 = z4 ? 1.0f : 0.0f;
                for (int i10 = 0; i10 < hb1Var.getChildCount(); i10++) {
                    hb1Var.getChildAt(i10).invalidate();
                }
                hb1Var.invalidate();
                pm0Var.p();
                if (!z4) {
                    float childCount = pm0Var.h0 * hb1Var.getChildCount();
                    float scrollX = pm0Var.getScrollX();
                    float f10 = this.c;
                    float childCount2 = (scrollX + f10) / (pm0Var.g0 * hb1Var.getChildCount());
                    float measuredWidth = (childCount - pm0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        childCount2 = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * childCount2;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    pm0Var.i0 = (pm0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    pm0Var.j0 = i11;
                    if (i11 < 0) {
                        pm0Var.j0 = 0;
                    }
                    for (int i12 = 0; i12 < hb1Var.getChildCount(); i12++) {
                        View childAt = hb1Var.getChildAt(i12);
                        if (childAt instanceof fx0) {
                            ((fx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    pm0Var.d0 = false;
                    pm0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    hb1Var.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                t tVar = ((u) this.d).y;
                tVar.setVisibility(0);
                if (this.b) {
                    float f10 = this.c;
                    tVar.setScaleX(f10);
                    tVar.setScaleY(f10);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
