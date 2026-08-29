package h7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class e9 {
    public static f7.s a;

    public static synchronized a9 a(x8 x8Var) {
        a9 a9Var;
        synchronized (e9.class) {
            try {
                if (a == null) {
                    a = new f7.s(1);
                }
                a9Var = (a9) a.G(x8Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a9Var;
    }

    public static /* synthetic */ boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
