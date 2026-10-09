package ae;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class i0 {
    public static final l0 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [be.e] */
    /* JADX WARN: Type inference failed for: r0v7, types: [ae.h0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [ae.l0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [ae.h0] */
    static {
        String str;
        ?? r02;
        int i10 = fe.v.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            he.e eVar = o0.a;
            r02 = fe.o.a;
            be.e eVar2 = r02.e;
            if (!(r02 != 0)) {
                r02 = h0.s;
            }
        } else {
            r02 = h0.s;
        }
        a = r02;
    }
}
