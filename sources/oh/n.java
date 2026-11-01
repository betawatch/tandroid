package oh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.s71;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                vl0 vl0Var = (vl0) this.d;
                s71 s71Var = vl0Var.e;
                vl0Var.h0 = null;
                boolean z10 = this.b;
                vl0Var.i0 = z10 ? 1.0f : 0.0f;
                for (int i10 = 0; i10 < s71Var.getChildCount(); i10++) {
                    s71Var.getChildAt(i10).invalidate();
                }
                s71Var.invalidate();
                vl0Var.p();
                if (!z10) {
                    float childCount = vl0Var.k0 * s71Var.getChildCount();
                    float scrollX = vl0Var.getScrollX();
                    float f7 = this.c;
                    float childCount2 = (scrollX + f7) / (vl0Var.j0 * s71Var.getChildCount());
                    float measuredWidth = (childCount - vl0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        f7 = 0.0f;
                        childCount2 = measuredWidth;
                    }
                    float f10 = childCount * childCount2;
                    if (f10 - f7 < 0.0f) {
                        f10 = f7;
                    }
                    vl0Var.l0 = (vl0Var.getScrollX() + f7) - f10;
                    int i11 = (int) (f10 - f7);
                    vl0Var.m0 = i11;
                    if (i11 < 0) {
                        vl0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < s71Var.getChildCount(); i12++) {
                        View childAt = s71Var.getChildAt(i12);
                        if (childAt instanceof kw0) {
                            ((kw0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = i0.L(33.0f);
                    }
                    vl0Var.g0 = false;
                    vl0Var.getLayoutParams().height = i0.L(36.0f);
                    s71Var.requestLayout();
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
