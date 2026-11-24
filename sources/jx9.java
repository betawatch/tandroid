// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jx9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kx9 b;

    public /* synthetic */ jx9(kx9 kx9Var, byte b) {
        this.a = b;
        this.b = kx9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kx9 kx9Var = this.b;
        switch (b) {
            case 0:
                kx9Var.b();
                break;
            default:
                kx9Var.dismiss();
                break;
        }
    }
}
