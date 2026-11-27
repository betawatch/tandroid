// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
