package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w61;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class e4 extends w61 {
    public final /* synthetic */ c6 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(c6 c6Var, Context context) {
        super(context, null);
        this.W = c6Var;
    }

    @Override // org.telegram.ui.Components.w61
    public final void D(View view, float f10) {
        View view2;
        bi.b2 b2Var;
        bi.b2 b2Var2;
        h4 h4Var;
        h4 h4Var2;
        h4 h4Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f10);
            return;
        }
        float i7 = Utilities.i(f10 / getMeasuredWidth(), 1.0f, -1.0f);
        c6 c6Var = this.W;
        view.setTranslationX(((-i7) * 2.0f * c6Var.u0) + f10);
        view.setPivotX(i7 <= 0.0f ? view.getMeasuredWidth() : 0.0f);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * i7));
        view.setRotationY(i7 * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                b2Var = c6Var.Y1;
                if (b2Var != null && view2 == b2Var.U1 && (h4Var3 = b2Var.a2) != null) {
                    h4Var3.invalidate();
                }
                if (view2 == c6Var.U1 && (h4Var2 = c6Var.a2) != null) {
                    h4Var2.invalidate();
                }
                b2Var2 = c6Var.Z1;
                if (b2Var2 == null && view2 == b2Var2.U1 && (h4Var = b2Var2.a2) != null) {
                    h4Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        b2Var = c6Var.Y1;
        if (b2Var != null) {
            h4Var3.invalidate();
        }
        if (view2 == c6Var.U1) {
            h4Var2.invalidate();
        }
        b2Var2 = c6Var.Z1;
        if (b2Var2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // org.telegram.ui.Components.w61
    public final void E() {
        super.E();
        int i7 = this.b;
        c6 c6Var = this.W;
        if (i7 != c6Var.I1(false)) {
            org.telegram.messenger.g0.h3(new ai.q(4, this, this.b > c6Var.I1(false)));
        }
    }

    @Override // org.telegram.ui.Components.w61
    public final boolean b(MotionEvent motionEvent) {
        b5 b5Var = this.W.X2;
        return b5Var == null || b5Var.c(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        c6 c6Var = this.W;
        canvas.clipRect(c6Var.u0, -getHeight(), getWidth() - c6Var.u0, getHeight() * 2);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.w61
    public final float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth() - (this.W.u0 * 2));
    }
}
