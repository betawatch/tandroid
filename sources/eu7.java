// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class eu7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gu7 b;
    public final /* synthetic */ qx c;

    public /* synthetic */ eu7(gu7 gu7Var, qx qxVar, byte b) {
        this.a = b;
        this.b = gu7Var;
        this.c = qxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qx qxVar = this.c;
        gu7 gu7Var = this.b;
        switch (b) {
            case 0:
                gu7Var.p(qxVar, true);
                break;
            default:
                gu7Var.f.f(new eu7(gu7Var, qxVar, (byte) 0));
                break;
        }
    }
}
