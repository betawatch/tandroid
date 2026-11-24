// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g29 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ kl9(g29 g29Var, Exception exc, byte b) {
        this.a = b;
        this.b = g29Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        g29 g29Var = this.b;
        switch (b) {
            case 0:
                ul9 ul9Var = (ul9) g29Var.b;
                ul9Var.m.a("recording segment interrupted in state=".concat(de9.A(ul9Var.a0)), exc);
                int i = ul9Var.a0;
                if (i != 3) {
                    if (i == 2) {
                        ul9Var.D = true;
                        break;
                    }
                } else {
                    ul9Var.q();
                    break;
                }
                break;
            default:
                ((ul9) g29Var.b).h(exc);
                break;
        }
    }
}
