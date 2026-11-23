package n2;

import p4.h1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements h2.o, h2.j {
    public final /* synthetic */ long a;

    public /* synthetic */ e0(long j3) {
        this.a = j3;
    }

    @Override // h2.j
    public void accept(Object obj) {
        ((h1) obj).c(this.a);
    }

    @Override // h2.o
    public void invoke(Object obj) {
        v vVar;
        o0 o0Var = (o0) obj;
        s0 s0Var = o0Var.b;
        if (o0Var.equals(s0Var.j) && (vVar = s0Var.n) != null) {
            vVar.b(this.a);
        }
    }
}
