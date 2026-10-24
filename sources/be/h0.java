package be;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class h0 {
    public static final k0 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [ce.e] */
    /* JADX WARN: Type inference failed for: r0v7, types: [be.g0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [be.k0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [be.g0] */
    static {
        String str;
        ?? r02;
        int i10 = ge.v.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            ie.e eVar = n0.a;
            r02 = ge.o.a;
            ce.e eVar2 = r02.e;
            if (!(r02 != 0)) {
                r02 = g0.s;
            }
        } else {
            r02 = g0.s;
        }
        a = r02;
    }
}
