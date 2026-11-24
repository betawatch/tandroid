// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e81 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z81 b;

    public /* synthetic */ e81(z81 z81Var, byte b) {
        this.a = b;
        this.b = z81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        z81 z81Var = this.b;
        switch (b) {
            case 0:
                z81Var.k0(false);
                break;
            default:
                z81Var.b0();
                break;
        }
    }
}
