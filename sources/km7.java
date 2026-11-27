// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class km7 {
    public float a;
    public float b;
    public vpa c;
    public final /* synthetic */ lm7 d;

    public km7(lm7 lm7Var, float f, float f2) {
        this.d = lm7Var;
        this.a = f;
        this.b = f2;
    }

    public final void a(float f) {
        this.b = f;
        if (this.c == null) {
            vpa vpaVar = new vpa(new xk4(this.a));
            this.c = vpaVar;
            vpaVar.m = bp1.j(f, 460.0f, 1.0f);
            this.c.f(0.001f);
            this.c.b(new i10(this, (byte) 8));
            this.c.a(new iw0(this, (byte) 5));
        }
        vpa vpaVar2 = this.c;
        if (!vpaVar2.f) {
            float f2 = this.a;
            if (f2 == f) {
                return;
            }
            vpaVar2.b = f2;
            vpaVar2.c = true;
        }
        vpaVar2.c(f);
    }

    public final boolean b() {
        vpa vpaVar = this.c;
        return vpaVar != null && vpaVar.f;
    }
}
