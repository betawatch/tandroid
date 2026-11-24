// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a96 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k96 b;
    public final /* synthetic */ int c;

    public /* synthetic */ a96(k96 k96Var, int i, byte b) {
        this.a = b;
        this.b = k96Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        k96 k96Var = this.b;
        switch (b) {
            case 0:
                k96Var.P = false;
                k96Var.j(i);
                break;
            case 1:
                k96Var.P = false;
                k96Var.j(i);
                break;
            case 2:
                k96Var.Z0(i, null, true, null);
                break;
            default:
                k96Var.Z0(i, null, true, null);
                break;
        }
    }
}
