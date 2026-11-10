package n2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j2.n b;
    public final /* synthetic */ r0 c;

    public /* synthetic */ r(j2.n nVar, r0 r0Var, int i7) {
        this.a = i7;
        this.b = nVar;
        this.c = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        r0 r0Var = this.c;
        j2.n nVar = this.b;
        switch (i7) {
            case 0:
                s sVar = (s) nVar.c;
                String str = h2.m0.a;
                m2.e eVar = ((l2.c0) sVar).a.s;
                m2.a U = eVar.U();
                eVar.V(U, 1032, new m2.d(U, r0Var, 14));
                break;
            default:
                s sVar2 = (s) nVar.c;
                String str2 = h2.m0.a;
                m2.e eVar2 = ((l2.c0) sVar2).a.s;
                m2.a U2 = eVar2.U();
                eVar2.V(U2, 1031, new m2.c(U2, r0Var, 27));
                break;
        }
    }
}
