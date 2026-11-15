package de;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
