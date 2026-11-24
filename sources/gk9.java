// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gk9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jk9 b;

    public /* synthetic */ gk9(jk9 jk9Var, byte b) {
        this.a = b;
        this.b = jk9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jk9 jk9Var = this.b;
        switch (b) {
            case 0:
                if (jk9Var.W != 0) {
                    jk9Var.V = true;
                    break;
                }
                break;
            default:
                jk9Var.c();
                break;
        }
    }
}
