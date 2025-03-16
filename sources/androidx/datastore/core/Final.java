package androidx.datastore.core;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class Final extends State {
    private final Throwable finalException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Final(Throwable finalException) {
        super(null);
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.finalException = finalException;
    }

    public final Throwable getFinalException() {
        return this.finalException;
    }
}
