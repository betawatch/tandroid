// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class n54 implements x56, us2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;

    public /* synthetic */ n54(float f, byte b) {
        this.a = b;
        this.b = f;
    }

    @Override // us2
    public final void accept(Object obj) {
        byte b = this.a;
        float f = this.b;
        ad8 ad8Var = (ad8) obj;
        switch (b) {
            case 1:
                ad8Var.c(f);
                break;
            default:
                ad8Var.R(f);
                break;
        }
    }

    @Override // x56
    public final void invoke(Object obj) {
        ((mc8) obj).q(this.b);
    }
}
