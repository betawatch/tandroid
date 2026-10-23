package fe;

import ab.u;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class a extends CancellationException {
    public final transient u a;

    public a(u uVar) {
        super("Flow was aborted, no more elements needed");
        this.a = uVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
