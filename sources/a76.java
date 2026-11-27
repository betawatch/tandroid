// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class a76 {
    public final x66 a;
    public final adc b = new adc(0.0f);
    public final adc c = new adc(0.0f);
    public final adc d = new adc(0.0f);
    public final adc e = new adc(0.0f);
    public final adc f = new adc(0.0f);
    public final adc g = new adc(0.0f);

    public a76(b76 b76Var, x66 x66Var) {
        this.a = x66Var;
    }

    public final void a(int i, boolean z) {
        adc adcVar = this.c;
        adc adcVar2 = this.b;
        if (z) {
            adcVar2.c = i;
            adcVar.c = i > 0 ? 1.0f : 0.0f;
        } else {
            adcVar2.d(i);
            adcVar.d(i > 0 ? 1.0f : 0.0f);
        }
    }
}
