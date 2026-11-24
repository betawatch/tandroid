// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ej8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jj8 b;

    public /* synthetic */ ej8(jj8 jj8Var, byte b) {
        this.a = b;
        this.b = jj8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jj8 jj8Var = this.b;
        switch (b) {
            case 0:
                hj2 hj2Var = jj8Var.h;
                if (hj2Var != null) {
                    hj2Var.close();
                    break;
                }
                break;
            default:
                jj8Var.a();
                break;
        }
    }
}
