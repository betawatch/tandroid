package ma;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class t {
    public static final p a;
    public static final q b;
    public static final /* synthetic */ t[] c;

    static {
        p pVar = new p();
        a = pVar;
        q qVar = new q();
        b = qVar;
        c = new t[]{pVar, qVar, new t() { // from class: ma.r
            public static Double b(String str, ua.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite() && !valueOf.isNaN()) {
                        return valueOf;
                    }
                    throw new ua.c("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.j());
                } catch (NumberFormatException e9) {
                    StringBuilder r10 = a9.p.r("Cannot parse ", str, "; at path ");
                    r10.append(aVar.j());
                    throw new a7.c(r10.toString(), e9);
                }
            }

            @Override // ma.t
            public final Number a(ua.a aVar) {
                String v = aVar.v();
                if (v.indexOf(46) >= 0) {
                    return b(v, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(v));
                } catch (NumberFormatException unused) {
                    return b(v, aVar);
                }
            }
        }, new t() { // from class: ma.s
            @Override // ma.t
            public final Number a(ua.a aVar) {
                String v = aVar.v();
                try {
                    return oa.d.i(v);
                } catch (NumberFormatException e9) {
                    StringBuilder r10 = a9.p.r("Cannot parse ", v, "; at path ");
                    r10.append(aVar.j());
                    throw new a7.c(r10.toString(), e9);
                }
            }
        }};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) c.clone();
    }

    public abstract Number a(ua.a aVar);
}
