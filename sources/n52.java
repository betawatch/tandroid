// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class n52 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k62 b;
    public final /* synthetic */ int c;

    public /* synthetic */ n52(k62 k62Var, int i, byte b) {
        this.a = b;
        this.b = k62Var;
        this.c = i;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        int i = this.c;
        k62 k62Var = this.b;
        switch (b) {
            case 0:
                k62Var.h0(i, (ld8) obj);
                break;
            default:
                k62Var.h0(i, new qd8((String) obj));
                break;
        }
    }
}
