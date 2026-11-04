package le;

import e0.e0;
import g2.q0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c implements he.a {
    public static final c a = new c();
    public static final n b = new n("kotlin.Double", je.b.c);

    @Override // he.a
    public final Object a(g2.d decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        e0 e0Var = (e0) decoder.d;
        String k10 = e0Var.k();
        try {
            double parseDouble = Double.parseDouble(k10);
            ((me.b) decoder.b).a.getClass();
            if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                return Double.valueOf(parseDouble);
            }
            e0.n(e0Var, "Unexpected special floating-point value " + Double.valueOf(parseDouble) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            e0.n(e0Var, "Failed to parse type 'double' for input '" + k10 + '\'', 0, 6);
            throw null;
        }
    }

    @Override // he.a
    public final void c(ne.h hVar, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        ba.i iVar = (ba.i) hVar.b;
        if (hVar.a) {
            hVar.j(String.valueOf(doubleValue));
        } else {
            ((jc.a) iVar.c).c(String.valueOf(doubleValue));
        }
        ((q0) hVar.f).getClass();
        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
            throw new ne.d("Unexpected special floating-point value " + Double.valueOf(doubleValue) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) ne.f.d(-1, ((jc.a) iVar.c).toString())));
        }
    }

    @Override // he.a
    public final je.d d() {
        return b;
    }
}
