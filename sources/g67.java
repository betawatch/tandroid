// default package

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class g67 extends tv3 {
    public final int[] O;
    public final /* synthetic */ q67 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g67(q67 q67Var, f67 f67Var, int i) {
        super(i, f67Var);
        this.P = q67Var;
        this.O = new int[2];
    }

    @Override // tv3
    public final void g(sv3 sv3Var) {
        q67 q67Var = this.P;
        m67 m67Var = q67Var.K;
        if (sv3Var != null) {
            if (q67Var.l0 != null) {
                sv3Var.c = true;
                float f = (tv3.f() * hl.p) / 1.3f;
                float f2 = f / 3.0f;
                sv3Var.d = f2;
                sv3Var.e = f2;
                sv3Var.a = Utilities.i(q67Var.l0.right - (0.75f * f), hl.q.x - f, 0.0f);
                sv3Var.b = q67Var.l0.bottom - (f / 2.0f);
                return;
            }
            wb2 wb2Var = q67Var.Q;
            if (wb2Var == null || !wb2Var.isAttachedToWindow() || q67Var.Q.getMessageObject() == null || q67Var.Q.getMessageObject().e1() != q67Var.R) {
                return;
            }
            q67Var.Q.getLocationOnScreen(this.O);
            sv3Var.c = true;
            float f3 = (tv3.f() * hl.p) / 1.3f;
            float f4 = f3 / 3.0f;
            sv3Var.d = f4;
            sv3Var.e = f4;
            float f5 = f3 / 2.0f;
            sv3Var.a = Utilities.i(((m67Var.getScaleX() * q67Var.Q.getTimeX()) + r9[0]) - f5, hl.q.x - f3, 0.0f);
            sv3Var.b = ((m67Var.getScaleY() * q67Var.Q.getTimeY()) + r9[1]) - f5;
        }
    }
}
