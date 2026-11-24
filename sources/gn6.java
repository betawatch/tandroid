// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class gn6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hq6 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ gn6(hq6 hq6Var, boolean z, int i, byte b) {
        this.a = b;
        this.b = hq6Var;
        this.c = z;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.d;
        boolean z = this.c;
        hq6 hq6Var = this.b;
        switch (b) {
            case 0:
                hq6Var.x0[z ? 1 : 0] = false;
                hq6Var.y0[z ? 1 : 0] = true;
                hq6Var.r0[z ? 1 : 0] = i;
                break;
            default:
                hq6Var.r0[z ? 1 : 0] = i;
                break;
        }
    }
}
