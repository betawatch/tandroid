package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.v61;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class f5 extends v61 {
    public final /* synthetic */ k7 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(k7 k7Var, Context context) {
        super(context, null);
        this.V = k7Var;
    }

    @Override // org.telegram.ui.Components.v61
    public final void F(View view, float f10) {
        View view2;
        i5 i5Var;
        i5 i5Var2;
        j5 j5Var;
        j5 j5Var2;
        j5 j5Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f10);
            return;
        }
        float i7 = Utilities.i(f10 / getMeasuredWidth(), 1.0f, -1.0f);
        k7 k7Var = this.V;
        view.setTranslationX(((-i7) * 2.0f * k7Var.t0) + f10);
        view.setPivotX(i7 <= 0.0f ? view.getMeasuredWidth() : 0.0f);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * i7));
        view.setRotationY(i7 * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                i5Var = k7Var.U1;
                if (i5Var != null && view2 == i5Var.Q1 && (j5Var3 = i5Var.W1) != null) {
                    j5Var3.invalidate();
                }
                if (view2 == k7Var.Q1 && (j5Var2 = k7Var.W1) != null) {
                    j5Var2.invalidate();
                }
                i5Var2 = k7Var.V1;
                if (i5Var2 == null && view2 == i5Var2.Q1 && (j5Var = i5Var2.W1) != null) {
                    j5Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        i5Var = k7Var.U1;
        if (i5Var != null) {
            j5Var3.invalidate();
        }
        if (view2 == k7Var.Q1) {
            j5Var2.invalidate();
        }
        i5Var2 = k7Var.V1;
        if (i5Var2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // org.telegram.ui.Components.v61
    public final void G() {
        super.G();
        int i7 = this.b;
        k7 k7Var = this.V;
        if (i7 != k7Var.I1(false)) {
            org.telegram.messenger.g0.h3(new k1(2, this, this.b > k7Var.I1(false)));
        }
    }

    @Override // org.telegram.ui.Components.v61
    public final boolean b(MotionEvent motionEvent) {
        g6 g6Var = this.V.T2;
        return g6Var == null || g6Var.c(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        k7 k7Var = this.V;
        canvas.clipRect(k7Var.t0, -getHeight(), getWidth() - k7Var.t0, getHeight() * 2);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.v61
    public final float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth() - (this.V.t0 * 2));
    }
}
