// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
