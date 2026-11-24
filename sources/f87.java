// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vs2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ f87(vs2 vs2Var, int i, byte b) {
        this.a = b;
        this.b = vs2Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        vs2 vs2Var = this.b;
        switch (b) {
            case 0:
                vs2Var.accept(Integer.valueOf(i));
                break;
            default:
                vs2Var.accept(Integer.valueOf(i));
                break;
        }
    }
}
