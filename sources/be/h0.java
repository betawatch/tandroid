package be;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
