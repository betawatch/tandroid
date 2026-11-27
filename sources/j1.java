// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class j1 extends CancellationException {
    public final transient nm4 a;

    public j1(nm4 nm4Var) {
        super("Flow was aborted, no more elements needed");
        this.a = nm4Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
