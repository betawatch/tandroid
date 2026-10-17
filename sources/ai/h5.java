package ai;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.c91;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class h5 extends c91 {
    public final /* synthetic */ k7 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(k7 k7Var, Context context) {
        super(context, null);
        this.T = k7Var;
    }

    @Override // org.telegram.ui.Components.c91
    public final void E(View view, float f7) {
        int i10;
        View view2;
        yh.l2 l2Var;
        yh.l2 l2Var2;
        k5 k5Var;
        k5 k5Var2;
        k5 k5Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f7);
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        k7 k7Var = this.T;
        i10 = ((org.telegram.ui.ActionBar.f3) k7Var).backgroundPaddingLeft;
        view.setTranslationX(((-clamp) * 2.0f * i10) + f7);
        view.setPivotX(clamp <= 0.0f ? view.getMeasuredWidth() : 0.0f);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * clamp));
        view.setRotationY(clamp * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                l2Var = k7Var.c0;
                if (l2Var != null && view2 == l2Var.Y && (k5Var3 = l2Var.e0) != null) {
                    k5Var3.invalidate();
                }
                if (view2 == k7Var.Y && (k5Var2 = k7Var.e0) != null) {
                    k5Var2.invalidate();
                }
                l2Var2 = k7Var.d0;
                if (l2Var2 == null && view2 == l2Var2.Y && (k5Var = l2Var2.e0) != null) {
                    k5Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        l2Var = k7Var.c0;
        if (l2Var != null) {
            k5Var3.invalidate();
        }
        if (view2 == k7Var.Y) {
            k5Var2.invalidate();
        }
        l2Var2 = k7Var.d0;
        if (l2Var2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // org.telegram.ui.Components.c91
    public final void F() {
        super.F();
        int i10 = this.b;
        k7 k7Var = this.T;
        if (i10 != k7Var.Y1(false)) {
            AndroidUtilities.runOnUIThread(new ah.t(3, this, this.b > k7Var.Y1(false)));
        }
    }

    @Override // org.telegram.ui.Components.c91
    public final boolean i(MotionEvent motionEvent) {
        g6 g6Var = this.T.b1;
        return g6Var == null || g6Var.c(0);
    }
}
