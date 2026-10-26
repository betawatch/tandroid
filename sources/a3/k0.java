package a3;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4.s b;
    public final /* synthetic */ i2.e c;

    public /* synthetic */ k0(n4.s sVar, i2.e eVar, int i10) {
        this.a = i10;
        this.b = sVar;
        this.c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n4.s sVar = this.b;
                i2.e eVar = this.c;
                m0 m0Var = (m0) sVar.c;
                String str = e2.n0.a;
                j2.e eVar2 = ((i2.d0) m0Var).a.s;
                j2.a p10 = eVar2.p();
                eVar2.q(p10, 1015, new j2.d(p10, eVar, 7));
                break;
            default:
                n4.s sVar2 = this.b;
                i2.e eVar3 = this.c;
                synchronized (eVar3) {
                }
                m0 m0Var2 = (m0) sVar2.c;
                String str2 = e2.n0.a;
                i2.j0 j0Var = ((i2.d0) m0Var2).a;
                j2.e eVar4 = j0Var.s;
                j2.a n10 = eVar4.n((u2.g0) eVar4.d.e);
                eVar4.q(n10, 1020, new e1.c(n10, eVar3, 26));
                j0Var.S = null;
                break;
        }
    }
}
