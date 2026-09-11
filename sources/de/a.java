package de;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
