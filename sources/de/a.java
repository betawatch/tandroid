package de;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class a extends CancellationException {
    public final transient Object a;

    public a(ce.d dVar) {
        super("Flow was aborted, no more elements needed");
        this.a = dVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
