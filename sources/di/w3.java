package di;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi.s8 b;

    public /* synthetic */ w3(fi.s8 s8Var, int i7) {
        this.a = i7;
        this.b = s8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                this.b.onBackPressed();
                break;
        }
    }
}
