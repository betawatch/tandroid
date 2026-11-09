package oe;

import h2.p0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class c implements ke.a {
    public static final c a = new c();
    public static final n b = new n("kotlin.Double", me.b.c);

    @Override // ke.a
    public final void a(qe.h hVar, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        ca.i iVar = (ca.i) hVar.b;
        if (hVar.a) {
            hVar.j(String.valueOf(doubleValue));
        } else {
            ((mc.a) iVar.c).c(String.valueOf(doubleValue));
        }
        ((p0) hVar.f).getClass();
        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
            throw new qe.d("Unexpected special floating-point value " + Double.valueOf(doubleValue) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) qe.f.d(-1, ((mc.a) iVar.c).toString())));
        }
    }

    @Override // ke.a
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        a4.k kVar = (a4.k) decoder.d;
        String k10 = kVar.k();
        try {
            double parseDouble = Double.parseDouble(k10);
            ((pe.b) decoder.b).a.getClass();
            if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                return Double.valueOf(parseDouble);
            }
            a4.k.n(kVar, "Unexpected special floating-point value " + Double.valueOf(parseDouble) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            a4.k.n(kVar, "Failed to parse type 'double' for input '" + k10 + '\'', 0, 6);
            throw null;
        }
    }

    @Override // ke.a
    public final me.d d() {
        return b;
    }
}
