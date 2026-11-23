package b3;

import a8.b8;
import h2.l0;
import h9.i0;
import l2.z;
import x2.g0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, int i7, long j3, long j10, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = i7;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Object obj = this.e;
        switch (i7) {
            case 0:
                m2.d dVar = ((c) obj).b;
                b8 b8Var = dVar.d;
                m2.a S = dVar.S(((i0) b8Var.b).isEmpty() ? null : (g0) h9.o.n((i0) b8Var.b));
                dVar.V(S, 1006, new c4.n(S, this.b, this.c, this.d));
                break;
            default:
                n2.s sVar = (n2.s) ((k8.a) obj).c;
                String str = l0.a;
                m2.d dVar2 = ((z) sVar).a.s;
                m2.a U = dVar2.U();
                dVar2.V(U, 1011, new m2.c(U, this.b, this.c, this.d));
                break;
        }
    }
}
