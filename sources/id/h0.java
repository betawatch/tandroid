package id;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class h0 {
    public static final k0 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [jd.e] */
    /* JADX WARN: Type inference failed for: r0v7, types: [id.g0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [id.k0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [id.g0] */
    static {
        String str;
        ?? r02;
        int i10 = nd.v.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            pd.e eVar = n0.a;
            r02 = nd.o.a;
            jd.e eVar2 = r02.e;
            if (!(r02 != 0)) {
                r02 = g0.s;
            }
        } else {
            r02 = g0.s;
        }
        a = r02;
    }
}
