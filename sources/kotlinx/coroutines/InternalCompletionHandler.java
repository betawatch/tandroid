package kotlinx.coroutines;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public interface InternalCompletionHandler {
    void invoke(Throwable th);

    public static final class UserSupplied implements InternalCompletionHandler {
        private final Function1 handler;

        public UserSupplied(Function1 function1) {
            this.handler = function1;
        }

        @Override // kotlinx.coroutines.InternalCompletionHandler
        public void invoke(Throwable th) {
            this.handler.invoke(th);
        }

        public String toString() {
            return "InternalCompletionHandler.UserSupplied[" + DebugStringsKt.getClassSimpleName(this.handler) + '@' + DebugStringsKt.getHexAddress(this) + ']';
        }
    }
}
