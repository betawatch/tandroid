package lh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l81;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class o3 extends l81 {
    public final /* synthetic */ g5 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(g5 g5Var, Context context) {
        super(context, null);
        this.Q = g5Var;
    }

    @Override // org.telegram.ui.Components.l81
    public final void E(View view, float f10) {
        int i10;
        View view2;
        kh.m3 m3Var;
        kh.m3 m3Var2;
        q3 q3Var;
        q3 q3Var2;
        q3 q3Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f10);
            return;
        }
        float clamp = Utilities.clamp(f10 / getMeasuredWidth(), 1.0f, -1.0f);
        g5 g5Var = this.Q;
        i10 = ((org.telegram.ui.ActionBar.g3) g5Var).backgroundPaddingLeft;
        view.setTranslationX(((-clamp) * 2.0f * i10) + f10);
        view.setPivotX(clamp <= 0.0f ? view.getMeasuredWidth() : 0.0f);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * clamp));
        view.setRotationY(clamp * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                m3Var = g5Var.Y;
                if (m3Var != null && view2 == m3Var.V && (q3Var3 = m3Var.a0) != null) {
                    q3Var3.invalidate();
                }
                if (view2 == g5Var.V && (q3Var2 = g5Var.a0) != null) {
                    q3Var2.invalidate();
                }
                m3Var2 = g5Var.Z;
                if (m3Var2 == null && view2 == m3Var2.V && (q3Var = m3Var2.a0) != null) {
                    q3Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        m3Var = g5Var.Y;
        if (m3Var != null) {
            q3Var3.invalidate();
        }
        if (view2 == g5Var.V) {
            q3Var2.invalidate();
        }
        m3Var2 = g5Var.Z;
        if (m3Var2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // org.telegram.ui.Components.l81
    public final void F() {
        super.F();
        int i10 = this.b;
        g5 g5Var = this.Q;
        if (i10 != g5Var.L1(false)) {
            AndroidUtilities.runOnUIThread(new jh.f(4, this, this.b > g5Var.L1(false)));
        }
    }

    @Override // org.telegram.ui.Components.l81
    public final boolean i(MotionEvent motionEvent) {
        c5.d dVar = this.Q.V0;
        return dVar == null || dVar.c(0);
    }
}
