// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class dnb {
    public static final ThreadLocal a = new ThreadLocal();

    public static d44 a() {
        ThreadLocal threadLocal = a;
        d44 d44Var = (d44) threadLocal.get();
        if (d44Var != null) {
            return d44Var;
        }
        pk0 pk0Var = new pk0(Thread.currentThread());
        threadLocal.set(pk0Var);
        return pk0Var;
    }
}
