package kh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gx0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.ib1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                qm0 qm0Var = (qm0) this.d;
                ib1 ib1Var = qm0Var.e;
                qm0Var.e0 = null;
                boolean z4 = this.b;
                qm0Var.f0 = z4 ? 1.0f : 0.0f;
                for (int i10 = 0; i10 < ib1Var.getChildCount(); i10++) {
                    ib1Var.getChildAt(i10).invalidate();
                }
                ib1Var.invalidate();
                qm0Var.p();
                if (!z4) {
                    float childCount = qm0Var.h0 * ib1Var.getChildCount();
                    float scrollX = qm0Var.getScrollX();
                    float f10 = this.c;
                    float childCount2 = (scrollX + f10) / (qm0Var.g0 * ib1Var.getChildCount());
                    float measuredWidth = (childCount - qm0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        childCount2 = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * childCount2;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    qm0Var.i0 = (qm0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    qm0Var.j0 = i11;
                    if (i11 < 0) {
                        qm0Var.j0 = 0;
                    }
                    for (int i12 = 0; i12 < ib1Var.getChildCount(); i12++) {
                        View childAt = ib1Var.getChildAt(i12);
                        if (childAt instanceof gx0) {
                            ((gx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    qm0Var.d0 = false;
                    qm0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    ib1Var.requestLayout();
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
