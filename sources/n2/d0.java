package n2;

import p4.i1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements h2.o, h2.j {
    public final /* synthetic */ long a;

    public /* synthetic */ d0(long j3) {
        this.a = j3;
    }

    @Override // h2.j
    public void accept(Object obj) {
        ((i1) obj).c(this.a);
    }

    @Override // h2.o
    public void invoke(Object obj) {
        v vVar;
        n0 n0Var = (n0) obj;
        r0 r0Var = n0Var.b;
        if (n0Var.equals(r0Var.j) && (vVar = r0Var.n) != null) {
            vVar.j(this.a);
        }
    }
}
