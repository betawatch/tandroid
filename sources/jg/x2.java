package jg;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3 b;

    public /* synthetic */ x2(d3 d3Var, int i10) {
        this.a = i10;
        this.b = d3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                org.telegram.messenger.i0.g3(new x2(this.b, 0));
                break;
            case 2:
                this.b.dismiss();
                break;
            default:
                d3 d3Var = this.b;
                ph.h1 h1Var = d3Var.H;
                if (h1Var != null) {
                    h1Var.a(null);
                    d3Var.H = null;
                }
                d3Var.dismiss();
                break;
        }
    }
}
