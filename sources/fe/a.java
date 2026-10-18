package fe;

import ab.u;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
