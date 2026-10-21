package fe;

import ab.u;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
