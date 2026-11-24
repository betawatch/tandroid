// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hu5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ju5 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ hu5(ju5 ju5Var, boolean z, byte b) {
        this.a = b;
        this.b = ju5Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        ju5 ju5Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new hu5(ju5Var, z, (byte) 1));
                break;
            default:
                ju5Var.setJoinRequest(z);
                break;
        }
    }
}
