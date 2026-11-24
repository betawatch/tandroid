// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hi4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mi4 b;
    public final /* synthetic */ ae9 c;

    public /* synthetic */ hi4(mi4 mi4Var, ae9 ae9Var, byte b) {
        this.a = b;
        this.b = mi4Var;
        this.c = ae9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ae9 ae9Var = this.c;
        mi4 mi4Var = this.b;
        mi4Var.getClass();
        switch (b) {
            case 0:
                gl.e3(new hi4(mi4Var, ae9Var, (byte) 1), 320L);
                break;
            default:
                ae9Var.a(new hj3(mi4Var, (byte) 9));
                break;
        }
    }
}
