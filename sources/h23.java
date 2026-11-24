// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class h23 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o13 b;
    public final /* synthetic */ us4 c;

    public /* synthetic */ h23(o13 o13Var, us4 us4Var, byte b) {
        this.a = b;
        this.b = o13Var;
        this.c = us4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        o13 o13Var = this.b;
        switch (b) {
            case 0:
                o13Var.L(obj);
                break;
            case 1:
                if (obj == null) {
                    obj = new ts4("No provider data returned", (byte) 2);
                }
                o13Var.L(obj);
                break;
            default:
                o13Var.L(obj);
                break;
        }
    }
}
