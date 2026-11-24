// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class oo2 extends qo2 {
    public final /* synthetic */ byte f;
    public final /* synthetic */ so2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo2(so2 so2Var, byte b) {
        super(so2Var);
        this.f = b;
        this.h = so2Var;
    }

    @Override // qo2
    public final Object a(int i) {
        byte b = this.f;
        so2 so2Var = this.h;
        switch (b) {
            case 0:
                return so2Var.g(i);
            case 1:
                return new ro2(so2Var, i);
            default:
                return so2Var.l(i);
        }
    }
}
