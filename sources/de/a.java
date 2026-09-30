package de;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class a extends CancellationException {
    public final transient ce.j a;

    public a(ce.j jVar) {
        super("Flow was aborted, no more elements needed");
        this.a = jVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
