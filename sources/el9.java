// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class el9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ul9 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ el9(ul9 ul9Var, Exception exc, byte b) {
        this.a = b;
        this.b = ul9Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        ul9 ul9Var = this.b;
        switch (b) {
            case 0:
                ul9Var.h(exc);
                break;
            case 1:
                ul9Var.h(exc);
                break;
            case 2:
                ul9Var.h(exc);
                break;
            default:
                ul9Var.h(exc);
                break;
        }
    }
}
