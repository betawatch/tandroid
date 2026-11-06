package de;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
