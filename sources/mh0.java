// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class mh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oh0 b;

    public /* synthetic */ mh0(oh0 oh0Var, byte b) {
        this.a = b;
        this.b = oh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        oh0 oh0Var = this.b;
        switch (b) {
            case 0:
                oh0Var.a(null, false);
                break;
            default:
                oh0Var.b(true);
                break;
        }
    }
}
