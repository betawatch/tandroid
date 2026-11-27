// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class b17 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ b17(KeyEvent.Callback callback, boolean z, float f, byte b) {
        this.a = b;
        this.d = callback;
        this.b = z;
        this.c = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = this.b;
        KeyEvent.Callback callback = this.d;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                if (!z) {
                    super/*android.app.Dialog*/.dismiss();
                    break;
                }
                break;
            default:
                xu9 xu9Var = (xu9) callback;
                oob oobVar = xu9Var.e;
                xu9Var.i0 = null;
                xu9Var.j0 = z ? 1.0f : 0.0f;
                for (int i = 0; i < oobVar.getChildCount(); i++) {
                    oobVar.getChildAt(i).invalidate();
                }
                oobVar.invalidate();
                xu9Var.p();
                if (!z) {
                    float childCount = xu9Var.l0 * oobVar.getChildCount();
                    float scrollX = xu9Var.getScrollX();
                    float f = this.c;
                    float childCount2 = (scrollX + f) / (xu9Var.k0 * oobVar.getChildCount());
                    float measuredWidth = (childCount - xu9Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        f = 0.0f;
                        childCount2 = measuredWidth;
                    }
                    float f2 = childCount * childCount2;
                    if (f2 - f < 0.0f) {
                        f2 = f;
                    }
                    xu9Var.m0 = (xu9Var.getScrollX() + f) - f2;
                    int i2 = (int) (f2 - f);
                    xu9Var.n0 = i2;
                    if (i2 < 0) {
                        xu9Var.n0 = 0;
                    }
                    for (int i3 = 0; i3 < oobVar.getChildCount(); i3++) {
                        View childAt = oobVar.getChildAt(i3);
                        if (childAt instanceof v3b) {
                            ((v3b) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = hl.L(33.0f);
                    }
                    xu9Var.h0 = false;
                    xu9Var.getLayoutParams().height = hl.L(36.0f);
                    oobVar.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                c17 c17Var = ((d17) this.d).E;
                c17Var.setVisibility(0);
                if (this.b) {
                    float f = this.c;
                    c17Var.setScaleX(f);
                    c17Var.setScaleY(f);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
