package hi;

import android.os.Build;
import c8.dd;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class q6 implements ri.n, ri.m {
    public final /* synthetic */ u6 a;

    public /* synthetic */ q6(u6 u6Var) {
        this.a = u6Var;
    }

    @Override // ri.n
    public int e() {
        u6 u6Var = this.a;
        u6Var.getClass();
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, u6Var.J0);
    }

    @Override // ri.m
    public void l(int i7) {
        u6 u6Var = this.a;
        dh.g gVar = u6Var.h2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (dd.a(i7, 4)) {
            gVar.h(u6Var.Y0.e());
        }
        gVar.e(u6Var.k2, u6Var.b.getWidth(), u6Var.b.getHeight());
    }
}
