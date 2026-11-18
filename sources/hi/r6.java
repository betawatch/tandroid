package hi;

import android.os.Build;
import c8.dd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class r6 implements ri.n, ri.m {
    public final /* synthetic */ v6 a;

    public /* synthetic */ r6(v6 v6Var) {
        this.a = v6Var;
    }

    @Override // ri.n
    public int e() {
        v6 v6Var = this.a;
        v6Var.getClass();
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, v6Var.J0);
    }

    @Override // ri.m
    public void l(int i7) {
        v6 v6Var = this.a;
        dh.g gVar = v6Var.h2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (dd.a(i7, 4)) {
            gVar.h(v6Var.Y0.e());
        }
        gVar.e(v6Var.k2, v6Var.b.getWidth(), v6Var.b.getHeight());
    }
}
