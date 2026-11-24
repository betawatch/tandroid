// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class k11 extends ri4 {
    public final /* synthetic */ byte a;

    public /* synthetic */ k11(byte b) {
        this.a = b;
    }

    @Override // ri4
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((q11) obj).inOutOffset;
            case 1:
                return ((ch6) obj).O;
            default:
                return ((ch6) obj).N;
        }
    }

    @Override // ri4
    public final void b(Object obj, float f) {
        switch (this.a) {
            case 0:
                ((q11) obj).setInOutOffset(f);
                break;
            case 1:
                ch6 ch6Var = (ch6) obj;
                ch6Var.O = f;
                ch6Var.invalidate();
                break;
            default:
                ch6 ch6Var2 = (ch6) obj;
                ch6Var2.N = f;
                ch6Var2.invalidate();
                break;
        }
    }
}
