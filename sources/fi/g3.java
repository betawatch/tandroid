package fi;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j3 b;

    public /* synthetic */ g3(j3 j3Var, int i7) {
        this.a = i7;
        this.b = j3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                super/*org.telegram.ui.ActionBar.v2*/.dismiss();
                break;
        }
    }
}
