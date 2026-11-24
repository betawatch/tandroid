// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hd4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jd4 b;

    public /* synthetic */ hd4(jd4 jd4Var, byte b) {
        this.a = b;
        this.b = jd4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jd4 jd4Var = this.b;
        switch (b) {
            case 0:
                jd4Var.d();
                break;
            case 1:
                jd4Var.a();
                break;
            default:
                jd4Var.b(jd4Var.E);
                break;
        }
    }
}
