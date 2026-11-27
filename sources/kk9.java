// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class kk9 extends dk9 {
    public final Paint X;

    public kk9(hl9 hl9Var, Rect rect, int i) {
        super(hl9Var, rect, i);
        this.X = new Paint(1);
    }

    @Override // dk9
    public final int H() {
        Rect rect = this.b;
        return uh9.w(6.0f, rect.top, 1) + rect.bottom;
    }

    @Override // dk9
    public final int J() {
        Rect rect = this.b;
        return hl.L(32.0f) + rect.left + rect.right;
    }

    @Override // dk9
    public final void V(Canvas canvas) {
        hl9 hl9Var = this.a;
        int v0 = aob.v0(hl9Var.D() ? aob.xl : aob.wl, hl9Var.D);
        Paint paint = this.X;
        paint.setColor(v0);
        float f = -hl9Var.S;
        int i = hl9Var.C + hl9Var.T;
        Rect rect = this.b;
        float f2 = (i - rect.left) - rect.right;
        if (hl9Var.s) {
            r2 = hl.R1(this.S ? 1.0f : 0.0f, this.R ? 1.0f : 0.0f, hl9Var.t);
        } else if (this.R) {
            r2 = 1.0f;
        }
        float R1 = hl.R1((-1.0f) - (this.M != null ? r8.b.bottom : 0), hl.L(6.0f), r2);
        canvas.drawRect(f, R1, f2, R1 + 1.0f, paint);
    }
}
