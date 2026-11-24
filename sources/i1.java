// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
