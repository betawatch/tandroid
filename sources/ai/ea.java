package ai;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
