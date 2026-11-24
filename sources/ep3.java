// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ep3 implements cv5 {
    public static final ep3 a = new ep3();
    public static final bj8 b = new bj8("kotlin.Double", aj8.c);

    @Override // cv5
    public final void b(c30 c30Var, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        nj1 nj1Var = (nj1) ((e31) c30Var.b).c;
        if (c30Var.a) {
            c30Var.k(String.valueOf(doubleValue));
        } else {
            nj1Var.c(String.valueOf(doubleValue));
        }
        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
            throw new ru5("Unexpected special floating-point value " + Double.valueOf(doubleValue) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) ple.b(-1, nj1Var.toString())));
        }
    }

    @Override // cv5
    public final Object c(igf igfVar) {
        cyb cybVar = (cyb) igfVar.d;
        String k = cybVar.k();
        try {
            double parseDouble = Double.parseDouble(k);
            if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                return Double.valueOf(parseDouble);
            }
            cyb.m(cybVar, "Unexpected special floating-point value " + Double.valueOf(parseDouble) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            cyb.m(cybVar, "Failed to parse type 'double' for input '" + k + '\'', 0, 6);
            throw null;
        }
    }

    @Override // cv5
    public final w4a d() {
        return b;
    }
}
