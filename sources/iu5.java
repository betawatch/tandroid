// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class iu5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ju5 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ iu5(ju5 ju5Var, boolean z, boolean z2, byte b) {
        this.a = b;
        this.b = ju5Var;
        this.c = z;
        this.d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        boolean z2 = this.c;
        ju5 ju5Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new iu5(ju5Var, z2, z, (byte) 1));
                break;
            default:
                ju5Var.setJoinRequest(z2);
                ju5Var.setJoinToSend(z);
                break;
        }
    }
}
