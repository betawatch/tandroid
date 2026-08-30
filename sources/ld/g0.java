package ld;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class g0 {
    public static final j0 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [md.d] */
    /* JADX WARN: Type inference failed for: r0v7, types: [ld.f0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [ld.j0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [ld.f0] */
    static {
        String str;
        ?? r02;
        int i10 = qd.v.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            sd.e eVar = m0.a;
            r02 = qd.o.a;
            md.d dVar = r02.e;
            if (!(r02 != 0)) {
                r02 = f0.s;
            }
        } else {
            r02 = f0.s;
        }
        a = r02;
    }
}
