// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class dbe {
    public static final void a(cy2 cy2Var, Throwable th) {
        try {
            dl dlVar = (dl) cy2Var.get(nf5.b);
            if (dlVar != null) {
                dlVar.c(th);
            } else {
                xae.a(cy2Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                uhe.a(runtimeException, th);
                th = runtimeException;
            }
            xae.a(cy2Var, th);
        }
    }
}
