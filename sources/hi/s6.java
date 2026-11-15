package hi;

import android.os.Build;
import c8.zc;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class s6 implements ri.n, ri.m {
    public final /* synthetic */ v6 a;

    public /* synthetic */ s6(v6 v6Var) {
        this.a = v6Var;
    }

    @Override // ri.n
    public int e() {
        v6 v6Var = this.a;
        v6Var.getClass();
        return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, v6Var.J0);
    }

    @Override // ri.m
    public void l(int i7) {
        v6 v6Var = this.a;
        dh.g gVar = v6Var.h2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (zc.a(i7, 4)) {
            gVar.h(v6Var.Y0.e());
        }
        gVar.e(v6Var.k2, v6Var.b.getWidth(), v6Var.b.getHeight());
    }
}
