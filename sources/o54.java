// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class o54 implements x56 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y54 b;

    public /* synthetic */ o54(y54 y54Var, byte b) {
        this.a = b;
        this.b = y54Var;
    }

    @Override // x56
    public final void invoke(Object obj) {
        byte b = this.a;
        y54 y54Var = this.b;
        mc8 mc8Var = (mc8) obj;
        switch (b) {
            case 2:
                mc8Var.K(y54Var.P);
                break;
            default:
                mc8Var.C(y54Var.R);
                break;
        }
    }
}
