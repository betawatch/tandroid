package ce;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class h0 {
    public static final k0 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [de.e] */
    /* JADX WARN: Type inference failed for: r0v7, types: [ce.g0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [ce.k0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [ce.g0] */
    static {
        String str;
        ?? r02;
        int i10 = he.w.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            je.e eVar = n0.a;
            r02 = he.o.a;
            de.e eVar2 = r02.e;
            if (!(r02 != 0)) {
                r02 = g0.s;
            }
        } else {
            r02 = g0.s;
        }
        a = r02;
    }
}
