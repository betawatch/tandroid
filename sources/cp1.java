// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cp1 implements qf8 {
    public boolean a = true;
    public final /* synthetic */ t09 b;

    public cp1(t09 t09Var) {
        this.b = t09Var;
    }

    @Override // qf8
    public final void a(float f, float f2) {
        t09 t09Var = this.b;
        if (f == 0.0f && !this.a) {
            t09Var.p(false);
            this.a = true;
        } else if (f == 1.0f && this.a) {
            t09Var.setAlpha(1.0f - f2);
            if (f2 == 1.0f) {
                this.a = false;
            }
        }
    }
}
