package de;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
