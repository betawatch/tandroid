// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
