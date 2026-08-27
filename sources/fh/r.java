package fh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ r(KeyEvent.Callback callback, boolean z10, float f10, int i10) {
        this.a = i10;
        this.d = callback;
        this.b = z10;
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
                vl0 vl0Var = (vl0) this.d;
                ra1 ra1Var = vl0Var.e;
                vl0Var.d0 = null;
                boolean z10 = this.b;
                vl0Var.e0 = z10 ? 1.0f : 0.0f;
                for (int i10 = 0; i10 < ra1Var.getChildCount(); i10++) {
                    ra1Var.getChildAt(i10).invalidate();
                }
                ra1Var.invalidate();
                vl0Var.p();
                if (!z10) {
                    float childCount = vl0Var.g0 * ra1Var.getChildCount();
                    float scrollX = vl0Var.getScrollX();
                    float f10 = this.c;
                    float childCount2 = (scrollX + f10) / (vl0Var.f0 * ra1Var.getChildCount());
                    float measuredWidth = (childCount - vl0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        childCount2 = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * childCount2;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    vl0Var.h0 = (vl0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    vl0Var.i0 = i11;
                    if (i11 < 0) {
                        vl0Var.i0 = 0;
                    }
                    for (int i12 = 0; i12 < ra1Var.getChildCount(); i12++) {
                        View childAt = ra1Var.getChildAt(i12);
                        if (childAt instanceof nw0) {
                            ((nw0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    vl0Var.c0 = false;
                    vl0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    ra1Var.requestLayout();
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
