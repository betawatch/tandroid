package ge;

import bb.u;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
