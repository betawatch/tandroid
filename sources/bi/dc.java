package bi;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class dc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ dc(ce ceVar, boolean z10, int i10) {
        this.a = i10;
        this.b = ceVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f(this.c);
                break;
            case 1:
                ce ceVar = this.b;
                if (!this.c) {
                    ceVar.J0.b(false, false);
                    break;
                } else {
                    ceVar.getClass();
                    break;
                }
            default:
                ce ceVar2 = this.b;
                ceVar2.R = null;
                ceVar2.e = false;
                ceVar2.q(this.c);
                break;
        }
    }
}
