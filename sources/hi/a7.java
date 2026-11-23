package hi;

import android.os.Build;
import c8.ed;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a7 implements ri.n, ri.m {
    public final /* synthetic */ e7 a;

    public /* synthetic */ a7(e7 e7Var) {
        this.a = e7Var;
    }

    @Override // ri.n
    public int j() {
        e7 e7Var = this.a;
        e7Var.getClass();
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, e7Var.J0);
    }

    @Override // ri.m
    public void k(int i7) {
        e7 e7Var = this.a;
        dh.g gVar = e7Var.h2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (ed.a(i7, 4)) {
            gVar.h(e7Var.Y0.e());
        }
        gVar.e(e7Var.k2, e7Var.b.getWidth(), e7Var.b.getHeight());
    }
}
