package de;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
