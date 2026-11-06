package bi;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce b;

    public /* synthetic */ ed(ce ceVar, int i7) {
        this.a = i7;
        this.b = ceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ce ceVar = this.b;
                ceVar.K1 = true;
                ceVar.J0(null);
                org.telegram.messenger.g0.i3(new ed(ceVar, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                ld ldVar = this.b.p1;
                ldVar.F = false;
                ldVar.invalidate();
                break;
        }
    }
}
