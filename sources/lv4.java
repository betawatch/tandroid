// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lv4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nv4 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ lv4(nv4 nv4Var, boolean z, byte b) {
        this.a = b;
        this.b = nv4Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        nv4 nv4Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    nv4Var.H.setVisibility(8);
                    break;
                }
                break;
            default:
                if (!z) {
                    nv4Var.w.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
