package jh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.z71;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class p3 extends z71 {
    public final /* synthetic */ h5 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(h5 h5Var, Context context) {
        super(context, null);
        this.P = h5Var;
    }

    @Override // org.telegram.ui.Components.z71
    public final void E(View view, float f9) {
        int i10;
        View view2;
        ih.m3 m3Var;
        ih.m3 m3Var2;
        r3 r3Var;
        r3 r3Var2;
        r3 r3Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f9);
            return;
        }
        float clamp = Utilities.clamp(f9 / getMeasuredWidth(), 1.0f, -1.0f);
        h5 h5Var = this.P;
        i10 = ((org.telegram.ui.ActionBar.f3) h5Var).backgroundPaddingLeft;
        view.setTranslationX(((-clamp) * 2.0f * i10) + f9);
        view.setPivotX(clamp <= 0.0f ? view.getMeasuredWidth() : 0.0f);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * clamp));
        view.setRotationY(clamp * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                m3Var = h5Var.X;
                if (m3Var != null && view2 == m3Var.U && (r3Var3 = m3Var.Z) != null) {
                    r3Var3.invalidate();
                }
                if (view2 == h5Var.U && (r3Var2 = h5Var.Z) != null) {
                    r3Var2.invalidate();
                }
                m3Var2 = h5Var.Y;
                if (m3Var2 == null && view2 == m3Var2.U && (r3Var = m3Var2.Z) != null) {
                    r3Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        m3Var = h5Var.X;
        if (m3Var != null) {
            r3Var3.invalidate();
        }
        if (view2 == h5Var.U) {
            r3Var2.invalidate();
        }
        m3Var2 = h5Var.Y;
        if (m3Var2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // org.telegram.ui.Components.z71
    public final void F() {
        super.F();
        int i10 = this.b;
        h5 h5Var = this.P;
        if (i10 != h5Var.L1(false)) {
            AndroidUtilities.runOnUIThread(new hh.f(3, this, this.b > h5Var.L1(false)));
        }
    }

    @Override // org.telegram.ui.Components.z71
    public final boolean i(MotionEvent motionEvent) {
        a5.d dVar = this.P.U0;
        return dVar == null || dVar.c(0);
    }
}
