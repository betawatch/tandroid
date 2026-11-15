package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.ae;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements n0, bi.w0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ z(m0 m0Var, int i7) {
        this.a = i7;
        this.b = m0Var;
    }

    @Override // bi.w0
    public void a(Canvas canvas) {
        switch (this.a) {
            case 1:
                m0 m0Var = this.b;
                ae aeVar = m0Var.f;
                aeVar.b.U1.getLocationInWindow(new int[2]);
                m0Var.w.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r1[0] - r0[0], r1[1] - r0[1]);
                aeVar.a(canvas);
                canvas.restore();
                break;
            default:
                m0 m0Var2 = this.b;
                ae aeVar2 = m0Var2.f;
                aeVar2.b.U1.getLocationInWindow(new int[2]);
                m0Var2.w.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r1[0] - r0[0], r1[1] - r0[1]);
                aeVar2.a(canvas);
                canvas.restore();
                break;
        }
    }

    public int b(float f10, float f11) {
        m0 m0Var = this.b;
        RectF rectF = m0Var.y;
        if (m0Var.j(rectF)) {
            return m0Var.x.a(f10, f11, rectF);
        }
        return 0;
    }
}
