// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
