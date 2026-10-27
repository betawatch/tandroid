package bi;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aa b;
    public final /* synthetic */ long c;

    public /* synthetic */ z9(aa aaVar, long j10, int i10) {
        this.a = i10;
        this.b = aaVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                aa aaVar = this.b;
                aaVar.q.d0(aaVar.b, aaVar.c, this.c, true, true, aaVar.n);
                break;
            default:
                aa aaVar2 = this.b;
                aaVar2.q.d0(aaVar2.b, aaVar2.c, this.c, true, true, aaVar2.n);
                break;
        }
    }
}
