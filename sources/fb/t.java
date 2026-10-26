package fb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        c = new t[]{pVar, qVar, new t() { // from class: fb.r
            public static Double b(String str, nb.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite() && !valueOf.isNaN()) {
                        return valueOf;
                    }
                    throw new nb.c("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.j());
                } catch (NumberFormatException e) {
                    StringBuilder v = a1.g.v("Cannot parse ", str, "; at path ");
                    v.append(aVar.j());
                    throw new androidx.car.app.j(v.toString(), e);
                }
            }

            @Override // fb.t
            public final Number a(nb.a aVar) {
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
        }, new t() { // from class: fb.s
            @Override // fb.t
            public final Number a(nb.a aVar) {
                String v = aVar.v();
                try {
                    return hb.d.i(v);
                } catch (NumberFormatException e) {
                    StringBuilder v10 = a1.g.v("Cannot parse ", v, "; at path ");
                    v10.append(aVar.j());
                    throw new androidx.car.app.j(v10.toString(), e);
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

    public abstract Number a(nb.a aVar);
}
