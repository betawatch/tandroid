package eh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ t(KeyEvent.Callback callback, boolean z10, float f10, int i9) {
        this.a = i9;
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
                sl0 sl0Var = (sl0) this.d;
                ta1 ta1Var = sl0Var.e;
                sl0Var.d0 = null;
                boolean z10 = this.b;
                sl0Var.e0 = z10 ? 1.0f : 0.0f;
                for (int i9 = 0; i9 < ta1Var.getChildCount(); i9++) {
                    ta1Var.getChildAt(i9).invalidate();
                }
                ta1Var.invalidate();
                sl0Var.p();
                if (!z10) {
                    float childCount = sl0Var.g0 * ta1Var.getChildCount();
                    float scrollX = sl0Var.getScrollX();
                    float f10 = this.c;
                    float childCount2 = (scrollX + f10) / (sl0Var.f0 * ta1Var.getChildCount());
                    float measuredWidth = (childCount - sl0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        childCount2 = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * childCount2;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    sl0Var.h0 = (sl0Var.getScrollX() + f10) - f11;
                    int i10 = (int) (f11 - f10);
                    sl0Var.i0 = i10;
                    if (i10 < 0) {
                        sl0Var.i0 = 0;
                    }
                    for (int i11 = 0; i11 < ta1Var.getChildCount(); i11++) {
                        View childAt = ta1Var.getChildAt(i11);
                        if (childAt instanceof lw0) {
                            ((lw0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    sl0Var.c0 = false;
                    sl0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    ta1Var.requestLayout();
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
                v vVar = ((w) this.d).y;
                vVar.setVisibility(0);
                if (this.b) {
                    float f10 = this.c;
                    vVar.setScaleX(f10);
                    vVar.setScaleY(f10);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
