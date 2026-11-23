package n2;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8.a b;
    public final /* synthetic */ s0 c;

    public /* synthetic */ r(k8.a aVar, s0 s0Var, int i7) {
        this.a = i7;
        this.b = aVar;
        this.c = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        s0 s0Var = this.c;
        k8.a aVar = this.b;
        switch (i7) {
            case 0:
                s sVar = (s) aVar.c;
                String str = h2.l0.a;
                m2.d dVar = ((l2.z) sVar).a.s;
                m2.a U = dVar.U();
                dVar.V(U, 1032, new m2.c(U, s0Var, 21));
                break;
            default:
                s sVar2 = (s) aVar.c;
                String str2 = h2.l0.a;
                m2.d dVar2 = ((l2.z) sVar2).a.s;
                m2.a U2 = dVar2.U();
                dVar2.V(U2, 1031, new m2.c(U2, s0Var, 4));
                break;
        }
    }
}
