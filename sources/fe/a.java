package fe;

import ab.u;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
