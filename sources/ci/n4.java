package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.n61;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n4 extends n61 {
    public final /* synthetic */ l6 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(l6 l6Var, Context context) {
        super(context, null);
        this.W = l6Var;
    }

    @Override // org.telegram.ui.Components.n61
    public final void E(View view, float f10) {
        View view2;
        ai.j2 j2Var;
        ai.j2 j2Var2;
        q4 q4Var;
        q4 q4Var2;
        q4 q4Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f10);
            return;
        }
        float i3 = Utilities.i(f10 / getMeasuredWidth(), 1.0f, -1.0f);
        l6 l6Var = this.W;
        view.setTranslationX(((-i3) * 2.0f * l6Var.u0) + f10);
        view.setPivotX(i3 <= 0.0f ? view.getMeasuredWidth() : 0.0f);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * i3));
        view.setRotationY(i3 * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                j2Var = l6Var.V1;
                if (j2Var != null && view2 == j2Var.R1 && (q4Var3 = j2Var.X1) != null) {
                    q4Var3.invalidate();
                }
                if (view2 == l6Var.R1 && (q4Var2 = l6Var.X1) != null) {
                    q4Var2.invalidate();
                }
                j2Var2 = l6Var.W1;
                if (j2Var2 == null && view2 == j2Var2.R1 && (q4Var = j2Var2.X1) != null) {
                    q4Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        j2Var = l6Var.V1;
        if (j2Var != null) {
            q4Var3.invalidate();
        }
        if (view2 == l6Var.R1) {
            q4Var2.invalidate();
        }
        j2Var2 = l6Var.W1;
        if (j2Var2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // org.telegram.ui.Components.n61
    public final void F() {
        super.F();
        int i3 = this.b;
        l6 l6Var = this.W;
        if (i3 != l6Var.I1(false)) {
            org.telegram.messenger.g0.h3(new e1(2, this, this.b > l6Var.I1(false)));
        }
    }

    @Override // org.telegram.ui.Components.n61
    public final boolean c(MotionEvent motionEvent) {
        k5 k5Var = this.W.U2;
        return k5Var == null || k5Var.c(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        l6 l6Var = this.W;
        canvas.clipRect(l6Var.u0, -getHeight(), getWidth() - l6Var.u0, getHeight() * 2);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.n61
    public final float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth() - (this.W.u0 * 2));
    }
}
