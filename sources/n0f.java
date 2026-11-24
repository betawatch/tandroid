// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class n0f {
    public static final y6a a(y6a y6aVar, dhf dhfVar) {
        y6aVar.getClass();
        dhfVar.getClass();
        if (!rr5.a(y6aVar.e(), a7a.b)) {
            return y6aVar.isInline() ? a(y6aVar.i(0), dhfVar) : y6aVar;
        }
        awd.a(y6aVar);
        return y6aVar;
    }

    public static final v0d b(lw5 lw5Var, y6a y6aVar) {
        y6aVar.getClass();
        yve e = y6aVar.e();
        if (e instanceof jh8) {
            return v0d.f;
        }
        if (rr5.a(e, xbb.c)) {
            return v0d.d;
        }
        if (!rr5.a(e, xbb.d)) {
            return v0d.c;
        }
        y6a a = a(y6aVar.i(0), lw5Var.b);
        yve e2 = a.e();
        if ((e2 instanceof dl8) || rr5.a(e2, a7a.c)) {
            return v0d.e;
        }
        throw new rw5("Value of type '" + a.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + a.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }
}
