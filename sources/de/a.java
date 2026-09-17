package de;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
