// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e14 extends FrameLayout {
    public final /* synthetic */ e34 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e14(e34 e34Var, Context context) {
        super(context);
        this.a = e34Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        e34 e34Var = this.a;
        j14 j14Var = e34Var.J;
        d04 d04Var = e34Var.W;
        r14 r14Var = e34Var.Q;
        if (view != r14Var && view != d04Var) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        float y = j14Var.getY() + j14Var.getMeasuredHeight() + 1.0f;
        if (view == r14Var && d04Var != null) {
            y = Math.max(y, d04Var.getY() + d04Var.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y - (gm.L(16.0f) * e34Var.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }
}
