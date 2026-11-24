// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class c9e {
    public static final void a(sw2 sw2Var, Throwable th) {
        try {
            dk dkVar = (dk) sw2Var.get(pd5.b);
            if (dkVar != null) {
                dkVar.c(th);
            } else {
                w8e.a(sw2Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                tfe.a(runtimeException, th);
                th = runtimeException;
            }
            w8e.a(sw2Var, th);
        }
    }
}
