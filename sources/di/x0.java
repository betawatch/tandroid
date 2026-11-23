package di;

import android.os.Build;
import c8.ed;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements ri.m, ri.n {
    public final /* synthetic */ h1 a;

    @Override // ri.n
    public int j() {
        return this.a.e1();
    }

    @Override // ri.m
    public void k(int i7) {
        h1 h1Var = this.a;
        dh.g gVar = h1Var.n2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (ed.a(i7, 4)) {
            gVar.h(h1Var.Y0.e());
        }
        gVar.e(h1Var.s2, h1Var.b.getWidth(), h1Var.b.getHeight());
    }
}
