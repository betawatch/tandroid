package ni;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ n(s sVar, int i7) {
        this.a = i7;
        this.b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d dVar = this.b.w;
                if (dVar != null) {
                    dVar.close();
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
