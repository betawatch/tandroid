// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class g71 implements r69 {
    public final /* synthetic */ d79 a;
    public final /* synthetic */ h71 b;

    public g71(h71 h71Var, d79 d79Var) {
        this.b = h71Var;
        this.a = d79Var;
    }

    @Override // r69
    public final void e(int i, View view) {
        w71 w71Var = this.b.f;
        d79 d79Var = this.a;
        i71 i71Var = (i71) d79Var.getAdapter();
        p71 p71Var = (p71) i71Var.e.get(i);
        if (view instanceof jja) {
            int i2 = w71.H;
            w71Var.c(p71Var, (r71) i71Var, d79Var);
        } else {
            l71 l71Var = w71Var.G;
            if (l71Var != null) {
                l71Var.g(p71Var.c, p71Var.d, false);
            }
        }
    }
}
