package di;

import android.os.Build;
import c8.zc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements ri.m, ri.n {
    public final /* synthetic */ i1 a;

    @Override // ri.n
    public int e() {
        return this.a.d1();
    }

    @Override // ri.m
    public void l(int i7) {
        i1 i1Var = this.a;
        dh.g gVar = i1Var.n2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (zc.a(i7, 4)) {
            gVar.h(i1Var.Y0.e());
        }
        gVar.e(i1Var.s2, i1Var.b.getWidth(), i1Var.b.getHeight());
    }
}
