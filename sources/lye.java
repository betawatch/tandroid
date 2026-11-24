// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class lye {
    public static final w4a a(w4a w4aVar, cff cffVar) {
        w4aVar.getClass();
        cffVar.getClass();
        if (!rp5.a(w4aVar.e(), y4a.b)) {
            return w4aVar.isInline() ? a(w4aVar.i(0), cffVar) : w4aVar;
        }
        xtd.a(w4aVar);
        return w4aVar;
    }

    public static final uyc b(lu5 lu5Var, w4a w4aVar) {
        w4aVar.getClass();
        vte e = w4aVar.e();
        if (e instanceof hf8) {
            return uyc.f;
        }
        if (rp5.a(e, v9b.c)) {
            return uyc.d;
        }
        if (!rp5.a(e, v9b.d)) {
            return uyc.c;
        }
        w4a a = a(w4aVar.i(0), lu5Var.b);
        vte e2 = a.e();
        if ((e2 instanceof aj8) || rp5.a(e2, y4a.c)) {
            return uyc.e;
        }
        throw new ru5("Value of type '" + a.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + a.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }
}
