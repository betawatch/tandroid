package oh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.u71;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ n(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.a = i10;
        this.d = callback;
        this.b = z10;
        this.c = f7;
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
                ul0 ul0Var = (ul0) this.d;
                u71 u71Var = ul0Var.e;
                ul0Var.h0 = null;
                boolean z10 = this.b;
                ul0Var.i0 = z10 ? 1.0f : 0.0f;
                for (int i10 = 0; i10 < u71Var.getChildCount(); i10++) {
                    u71Var.getChildAt(i10).invalidate();
                }
                u71Var.invalidate();
                ul0Var.p();
                if (!z10) {
                    float childCount = ul0Var.k0 * u71Var.getChildCount();
                    float scrollX = ul0Var.getScrollX();
                    float f7 = this.c;
                    float childCount2 = (scrollX + f7) / (ul0Var.j0 * u71Var.getChildCount());
                    float measuredWidth = (childCount - ul0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        f7 = 0.0f;
                        childCount2 = measuredWidth;
                    }
                    float f10 = childCount * childCount2;
                    if (f10 - f7 < 0.0f) {
                        f10 = f7;
                    }
                    ul0Var.l0 = (ul0Var.getScrollX() + f7) - f10;
                    int i11 = (int) (f10 - f7);
                    ul0Var.m0 = i11;
                    if (i11 < 0) {
                        ul0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < u71Var.getChildCount(); i12++) {
                        View childAt = u71Var.getChildAt(i12);
                        if (childAt instanceof jw0) {
                            ((jw0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = i0.L(33.0f);
                    }
                    ul0Var.g0 = false;
                    ul0Var.getLayoutParams().height = i0.L(36.0f);
                    u71Var.requestLayout();
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
                o oVar = ((p) this.d).D;
                oVar.setVisibility(0);
                if (this.b) {
                    float f7 = this.c;
                    oVar.setScaleX(f7);
                    oVar.setScaleY(f7);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
