package de;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
