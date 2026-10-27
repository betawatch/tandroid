package ce;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class d2 {
    public static final ThreadLocal a = new ThreadLocal();

    public static x0 a() {
        ThreadLocal threadLocal = a;
        x0 x0Var = (x0) threadLocal.get();
        if (x0Var != null) {
            return x0Var;
        }
        i iVar = new i(Thread.currentThread());
        threadLocal.set(iVar);
        return iVar;
    }
}
