package bi;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
