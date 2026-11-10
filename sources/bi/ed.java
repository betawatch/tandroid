package bi;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                ceVar.N1 = true;
                ceVar.J0(null);
                org.telegram.messenger.g0.i3(new ed(ceVar, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                ld ldVar = this.b.s1;
                ldVar.F = false;
                ldVar.invalidate();
                break;
        }
    }
}
