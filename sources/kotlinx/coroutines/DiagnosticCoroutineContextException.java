package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
final class DiagnosticCoroutineContextException extends RuntimeException {
    private final CoroutineContext context;

    public DiagnosticCoroutineContextException(CoroutineContext coroutineContext) {
        this.context = coroutineContext;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.context.toString();
    }
}
