// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class crb {
    public static final ThreadLocal a = new ThreadLocal();

    public static z44 a() {
        ThreadLocal threadLocal = a;
        z44 z44Var = (z44) threadLocal.get();
        if (z44Var != null) {
            return z44Var;
        }
        qk0 qk0Var = new qk0(Thread.currentThread());
        threadLocal.set(qk0Var);
        return qk0Var;
    }
}
