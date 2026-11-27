// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class fv5 extends CancellationException {
    public final transient ev5 a;

    public fv5(String str, Throwable th, ev5 ev5Var) {
        super(str);
        this.a = ev5Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fv5)) {
            return false;
        }
        fv5 fv5Var = (fv5) obj;
        return ur5.a(fv5Var.getMessage(), getMessage()) && ur5.a(fv5Var.a, this.a) && ur5.a(fv5Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = (this.a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.a;
    }
}
