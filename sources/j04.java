// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j04 extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ e34 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j04(e34 e34Var, Context context, boolean z) {
        super(context);
        this.b = e34Var;
        this.a = z;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        e34 e34Var = this.b;
        q04 q04Var = e34Var.C0;
        l04 l04Var = e34Var.E0;
        p04 p04Var = e34Var.H0;
        if (this.a || !(view == l04Var || view == p04Var)) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        float y = q04Var.getY() + q04Var.getMeasuredHeight() + 1.0f;
        if (view == l04Var) {
            y = Math.max(y, p04Var.getY() + p04Var.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y - (gm.L(16.0f) * e34Var.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e34 e34Var = this.b;
        e34Var.L0 = true;
        e34Var.Z();
        w04 w04Var = e34Var.U0;
        if (w04Var != null) {
            w04Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e34 e34Var = this.b;
        e34Var.L0 = false;
        e34Var.Z();
        w04 w04Var = e34Var.U0;
        if (w04Var != null) {
            w04Var.a();
        }
    }
}
