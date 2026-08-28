package la;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        c = new t[]{pVar, qVar, new t() { // from class: la.r
            public static Double b(String str, ta.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite() && !valueOf.isNaN()) {
                        return valueOf;
                    }
                    throw new ta.d("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.j());
                } catch (NumberFormatException e10) {
                    StringBuilder t10 = aa.d.t("Cannot parse ", str, "; at path ");
                    t10.append(aVar.j());
                    throw new androidx.car.app.j(t10.toString(), e10);
                }
            }

            @Override // la.t
            public final Number a(ta.a aVar) {
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
        }, new t() { // from class: la.s
            @Override // la.t
            public final Number a(ta.a aVar) {
                String v = aVar.v();
                try {
                    return na.d.i(v);
                } catch (NumberFormatException e10) {
                    StringBuilder t10 = aa.d.t("Cannot parse ", v, "; at path ");
                    t10.append(aVar.j());
                    throw new androidx.car.app.j(t10.toString(), e10);
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

    public abstract Number a(ta.a aVar);
}
