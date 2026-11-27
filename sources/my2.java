// default package

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class my2 implements sq4, nr7 {
    public final /* synthetic */ ry2 a;

    public /* synthetic */ my2(ry2 ry2Var) {
        this.a = ry2Var;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        WindowInsets g = l2dVar.g();
        ry2 ry2Var = this.a;
        ry2Var.q0(g);
        ry2Var.T1.a(l2dVar.a.f(8).d > 0, true);
        return l2d.b;
    }

    @Override // sq4
    public final void a(int i) {
        int min = Math.min(i, hl.L(144.0f));
        if (i > 0) {
            min -= hl.L(8.0f);
        }
        ry2 ry2Var = this.a;
        if (ry2Var.g2 != min) {
            ry2Var.g2 = min;
            ry2Var.S1.a(min);
            ry2Var.c2.postOnAnimation(new vd2(ry2Var, (byte) 18));
        }
    }
}
