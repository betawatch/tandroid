package de;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
