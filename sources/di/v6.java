package di;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x6 b;

    public /* synthetic */ v6(x6 x6Var, int i7) {
        this.a = i7;
        this.b = x6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e();
                break;
            default:
                this.b.b();
                break;
        }
    }
}
