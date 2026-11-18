package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.qf;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements o0, bi.w0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ a0(n0 n0Var, int i7) {
        this.a = i7;
        this.b = n0Var;
    }

    @Override // bi.w0
    public void a(Canvas canvas) {
        switch (this.a) {
            case 1:
                n0 n0Var = this.b;
                qf qfVar = n0Var.f;
                qfVar.a.a2.getLocationInWindow(new int[2]);
                n0Var.w.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r1[0] - r0[0], r1[1] - r0[1]);
                qfVar.a(canvas);
                canvas.restore();
                break;
            default:
                n0 n0Var2 = this.b;
                qf qfVar2 = n0Var2.f;
                qfVar2.a.a2.getLocationInWindow(new int[2]);
                n0Var2.w.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r1[0] - r0[0], r1[1] - r0[1]);
                qfVar2.a(canvas);
                canvas.restore();
                break;
        }
    }

    public int b(float f10, float f11) {
        n0 n0Var = this.b;
        RectF rectF = n0Var.y;
        if (n0Var.k(rectF)) {
            return n0Var.x.a(f10, f11, rectF);
        }
        return 0;
    }
}
