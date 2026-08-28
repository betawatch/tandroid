package hd;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class h0 {
    public static final k0 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [id.e] */
    /* JADX WARN: Type inference failed for: r0v7, types: [hd.g0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [hd.k0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [hd.g0] */
    static {
        String str;
        ?? r02;
        int i9 = md.v.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            od.e eVar = n0.a;
            r02 = md.o.a;
            id.e eVar2 = r02.e;
            if (!(r02 != 0)) {
                r02 = g0.s;
            }
        } else {
            r02 = g0.s;
        }
        a = r02;
    }
}
