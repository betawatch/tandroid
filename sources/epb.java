// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class epb {
    public static final ThreadLocal a = new ThreadLocal();

    public static o54 a() {
        ThreadLocal threadLocal = a;
        o54 o54Var = (o54) threadLocal.get();
        if (o54Var != null) {
            return o54Var;
        }
        pl0 pl0Var = new pl0(Thread.currentThread());
        threadLocal.set(pl0Var);
        return pl0Var;
    }
}
