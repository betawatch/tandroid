package db;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        c = new t[]{pVar, qVar, new t() { // from class: db.r
            public static Double b(String str, lb.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite() && !valueOf.isNaN()) {
                        return valueOf;
                    }
                    throw new lb.c("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.j());
                } catch (NumberFormatException e7) {
                    StringBuilder v = a4.a.v("Cannot parse ", str, "; at path ");
                    v.append(aVar.j());
                    throw new androidx.car.app.j(v.toString(), e7);
                }
            }

            @Override // db.t
            public final Number a(lb.a aVar) {
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
        }, new t() { // from class: db.s
            @Override // db.t
            public final Number a(lb.a aVar) {
                String v = aVar.v();
                try {
                    return fb.d.i(v);
                } catch (NumberFormatException e7) {
                    StringBuilder v9 = a4.a.v("Cannot parse ", v, "; at path ");
                    v9.append(aVar.j());
                    throw new androidx.car.app.j(v9.toString(), e7);
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

    public abstract Number a(lb.a aVar);
}
