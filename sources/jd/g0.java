package jd;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class g0 {
    public static final j0 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [kd.d] */
    /* JADX WARN: Type inference failed for: r0v7, types: [jd.f0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [jd.j0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [jd.f0] */
    static {
        String str;
        ?? r02;
        int i10 = od.w.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            qd.e eVar = m0.a;
            r02 = od.p.a;
            kd.d dVar = r02.e;
            if (!(r02 != 0)) {
                r02 = f0.s;
            }
        } else {
            r02 = f0.s;
        }
        a = r02;
    }
}
