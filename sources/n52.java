// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
