package kh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.ob1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                ob1 ob1Var = pm0Var.e;
                pm0Var.e0 = null;
                boolean z4 = this.b;
                pm0Var.f0 = z4 ? 1.0f : 0.0f;
                for (int i10 = 0; i10 < ob1Var.getChildCount(); i10++) {
                    ob1Var.getChildAt(i10).invalidate();
                }
                ob1Var.invalidate();
                pm0Var.p();
                if (!z4) {
                    float childCount = pm0Var.h0 * ob1Var.getChildCount();
                    float scrollX = pm0Var.getScrollX();
                    float f10 = this.c;
                    float childCount2 = (scrollX + f10) / (pm0Var.g0 * ob1Var.getChildCount());
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
                    for (int i12 = 0; i12 < ob1Var.getChildCount(); i12++) {
                        View childAt = ob1Var.getChildAt(i12);
                        if (childAt instanceof fx0) {
                            ((fx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    pm0Var.d0 = false;
                    pm0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    ob1Var.requestLayout();
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
