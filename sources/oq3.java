// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class oq3 implements cx5 {
    public static final oq3 a = new oq3();
    public static final el8 b = new el8("kotlin.Double", dl8.c);

    @Override // cx5
    public final void b(c40 c40Var, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        vk1 vk1Var = (vk1) ((m41) c40Var.b).c;
        if (c40Var.a) {
            c40Var.k(String.valueOf(doubleValue));
        } else {
            vk1Var.c(String.valueOf(doubleValue));
        }
        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
            throw new rw5("Unexpected special floating-point value " + Double.valueOf(doubleValue) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) rne.b(-1, vk1Var.toString())));
        }
    }

    @Override // cx5
    public final Object c(jif jifVar) {
        e0c e0cVar = (e0c) jifVar.d;
        String k = e0cVar.k();
        try {
            double parseDouble = Double.parseDouble(k);
            if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                return Double.valueOf(parseDouble);
            }
            e0c.m(e0cVar, "Unexpected special floating-point value " + Double.valueOf(parseDouble) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            e0c.m(e0cVar, "Failed to parse type 'double' for input '" + k + '\'', 0, 6);
            throw null;
        }
    }

    @Override // cx5
    public final y6a d() {
        return b;
    }
}
