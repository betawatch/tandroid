// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
