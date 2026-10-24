package ai;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class ea implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fa b;
    public final /* synthetic */ long c;

    public /* synthetic */ ea(fa faVar, long j10, int i10) {
        this.a = i10;
        this.b = faVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fa faVar = this.b;
                faVar.q.d0(faVar.b, faVar.c, this.c, true, true, faVar.n);
                break;
            default:
                fa faVar2 = this.b;
                faVar2.q.d0(faVar2.b, faVar2.c, this.c, true, true, faVar2.n);
                break;
        }
    }
}
