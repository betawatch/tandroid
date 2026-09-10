package bi;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class mc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce b;

    public /* synthetic */ mc(ce ceVar, int i10) {
        this.a = i10;
        this.b = ceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ce ceVar = this.b;
                ceVar.getClass();
                ceVar.g(1.0f, true, new tb(ceVar, 6));
                ceVar.b1.b(true, true);
                break;
            default:
                ce ceVar2 = this.b;
                ceVar2.f(false);
                ceVar2.m2 = null;
                break;
        }
    }
}
