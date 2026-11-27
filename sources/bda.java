// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class bda extends cda {
    public final uca f;
    public final float g;
    public final float h;
    public final /* synthetic */ dda i;

    public bda(dda ddaVar, uca ucaVar, boolean z, boolean z2) {
        this.i = ddaVar;
        this.b = false;
        this.f = ucaVar;
        this.g = z ? -1.0f : 1.0f;
        this.h = z2 ? -1.0f : 1.0f;
        a();
    }

    @Override // cda
    public final void a() {
        uca ucaVar = this.f;
        if (ucaVar != null) {
            float f = (this.g * ucaVar.d) + ucaVar.b;
            float f2 = (this.h * ucaVar.e) + ucaVar.c;
            dda ddaVar = this.i;
            ddaVar.c(f, f2, true);
            float[] fArr = ddaVar.p;
            float f3 = fArr[0];
            float f4 = fArr[1];
            this.d = f3;
            this.e = f4;
        }
    }

    @Override // cda
    public final void b(float f, float f2) {
        this.d = f;
        this.e = f2;
        uca ucaVar = this.f;
        float f3 = ((-this.g) * ucaVar.d) + ucaVar.b;
        float f4 = ((-this.h) * ucaVar.e) + ucaVar.c;
        dda ddaVar = this.i;
        ddaVar.c(f, f2, false);
        ddaVar.c(f3, f4, true);
        float[] fArr = ddaVar.p;
        float f5 = fArr[0];
        float f6 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f2 - f6, f - f5)) - ucaVar.h;
        double cos = Math.cos(atan2) * dte.a(f, f2, f5, f6);
        double sin = Math.sin(atan2) * dte.a(f, f2, f5, f6);
        ucaVar.d = ((float) Math.abs(cos)) / 2.0f;
        ucaVar.e = ((float) Math.abs(sin)) / 2.0f;
        ucaVar.b = (f + f5) / 2.0f;
        ucaVar.c = (f2 + f6) / 2.0f;
        for (int i = 0; i < ddaVar.m.size(); i++) {
            ((cda) ddaVar.m.get(i)).a();
        }
    }
}
