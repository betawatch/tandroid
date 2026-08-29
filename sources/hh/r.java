package hh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.ua1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ r(KeyEvent.Callback callback, boolean z10, float f9, int i10) {
        this.a = i10;
        this.d = callback;
        this.b = z10;
        this.c = f9;
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
                fm0 fm0Var = (fm0) this.d;
                ua1 ua1Var = fm0Var.e;
                fm0Var.d0 = null;
                boolean z10 = this.b;
                fm0Var.e0 = z10 ? 1.0f : 0.0f;
                for (int i10 = 0; i10 < ua1Var.getChildCount(); i10++) {
                    ua1Var.getChildAt(i10).invalidate();
                }
                ua1Var.invalidate();
                fm0Var.p();
                if (!z10) {
                    float childCount = fm0Var.g0 * ua1Var.getChildCount();
                    float scrollX = fm0Var.getScrollX();
                    float f9 = this.c;
                    float childCount2 = (scrollX + f9) / (fm0Var.f0 * ua1Var.getChildCount());
                    float measuredWidth = (childCount - fm0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        childCount2 = measuredWidth;
                        f9 = 0.0f;
                    }
                    float f10 = childCount * childCount2;
                    if (f10 - f9 < 0.0f) {
                        f10 = f9;
                    }
                    fm0Var.h0 = (fm0Var.getScrollX() + f9) - f10;
                    int i11 = (int) (f10 - f9);
                    fm0Var.i0 = i11;
                    if (i11 < 0) {
                        fm0Var.i0 = 0;
                    }
                    for (int i12 = 0; i12 < ua1Var.getChildCount(); i12++) {
                        View childAt = ua1Var.getChildAt(i12);
                        if (childAt instanceof vw0) {
                            ((vw0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    fm0Var.c0 = false;
                    fm0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    ua1Var.requestLayout();
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
                    float f9 = this.c;
                    tVar.setScaleX(f9);
                    tVar.setScaleY(f9);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
