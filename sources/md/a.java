package md;

import ia.v;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a extends CancellationException {
    public final transient v a;

    public a(v vVar) {
        super("Flow was aborted, no more elements needed");
        this.a = vVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
