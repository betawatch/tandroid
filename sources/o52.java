// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class o52 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k62 b;
    public final /* synthetic */ int c;

    public /* synthetic */ o52(k62 k62Var, int i, byte b) {
        this.a = b;
        this.b = k62Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        k62 k62Var = this.b;
        switch (b) {
            case 0:
                k62Var.h0(i, null);
                break;
            case 1:
                k62Var.d0(i);
                break;
            default:
                k62Var.h0(i, null);
                break;
        }
    }
}
