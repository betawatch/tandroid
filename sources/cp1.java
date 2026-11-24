// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
