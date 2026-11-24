// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class i1 extends CancellationException {
    public final transient ik4 a;

    public i1(ik4 ik4Var) {
        super("Flow was aborted, no more elements needed");
        this.a = ik4Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
