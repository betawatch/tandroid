package bi;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ba implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca b;
    public final /* synthetic */ long c;

    public /* synthetic */ ba(ca caVar, long j3, int i7) {
        this.a = i7;
        this.b = caVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ca caVar = this.b;
                caVar.q.b0(caVar.b, caVar.c, this.c, true, true, caVar.n);
                break;
            default:
                ca caVar2 = this.b;
                caVar2.q.b0(caVar2.b, caVar2.c, this.c, true, true, caVar2.n);
                break;
        }
    }
}
