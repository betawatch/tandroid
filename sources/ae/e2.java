package ae;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class e2 {
    public static final ThreadLocal a = new ThreadLocal();

    public static y0 a() {
        ThreadLocal threadLocal = a;
        y0 y0Var = (y0) threadLocal.get();
        if (y0Var != null) {
            return y0Var;
        }
        i iVar = new i(Thread.currentThread());
        threadLocal.set(iVar);
        return iVar;
    }
}
