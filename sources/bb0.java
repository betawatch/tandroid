// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bb0 extends c6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mb0 b;

    public /* synthetic */ bb0(mb0 mb0Var, byte b) {
        this.a = b;
        this.b = mb0Var;
    }

    @Override // c6
    public final void b(int i) {
        byte b = this.a;
        mb0 mb0Var = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    mb0Var.h0();
                    break;
                }
                break;
            default:
                if (i == -1) {
                    mb0Var.h0();
                }
                if (i == 1) {
                    mb0Var.j0();
                    break;
                }
                break;
        }
    }
}
