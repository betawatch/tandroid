// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
