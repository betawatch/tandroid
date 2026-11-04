package ae;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends CancellationException {
    public final transient Object a;

    public a(zd.c cVar) {
        super("Flow was aborted, no more elements needed");
        this.a = cVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
