package na;

import a4.w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        c = new t[]{pVar, qVar, new t() { // from class: na.r
            public static Double b(String str, va.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite() && !valueOf.isNaN()) {
                        return valueOf;
                    }
                    throw new va.c("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.j());
                } catch (NumberFormatException e10) {
                    StringBuilder s10 = w.s("Cannot parse ", str, "; at path ");
                    s10.append(aVar.j());
                    throw new a6.b(s10.toString(), e10);
                }
            }

            @Override // na.t
            public final Number a(va.a aVar) {
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
        }, new t() { // from class: na.s
            @Override // na.t
            public final Number a(va.a aVar) {
                String v = aVar.v();
                try {
                    return pa.d.i(v);
                } catch (NumberFormatException e10) {
                    StringBuilder s10 = w.s("Cannot parse ", v, "; at path ");
                    s10.append(aVar.j());
                    throw new a6.b(s10.toString(), e10);
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

    public abstract Number a(va.a aVar);
}
