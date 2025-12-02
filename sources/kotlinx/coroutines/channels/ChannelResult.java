package kotlinx.coroutines.channels;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class ChannelResult {
    public static final Companion Companion = new Companion(null);
    private static final Failed failed = new Failed();

    public static Object constructor-impl(Object obj) {
        return obj;
    }

    public static final boolean isSuccess-impl(Object obj) {
        return !(obj instanceof Failed);
    }

    public static final boolean isClosed-impl(Object obj) {
        return obj instanceof Closed;
    }

    public static final Object getOrNull-impl(Object obj) {
        if (obj instanceof Failed) {
            return null;
        }
        return obj;
    }

    public static final Throwable exceptionOrNull-impl(Object obj) {
        Closed closed = obj instanceof Closed ? (Closed) obj : null;
        if (closed != null) {
            return closed.cause;
        }
        return null;
    }

    public static class Failed {
        public String toString() {
            return "Failed";
        }
    }

    public static final class Closed extends Failed {
        public final Throwable cause;

        public Closed(Throwable th) {
            this.cause = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Closed) && Intrinsics.areEqual(this.cause, ((Closed) obj).cause);
        }

        public int hashCode() {
            Throwable th = this.cause;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.ChannelResult.Failed
        public String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Object success-JP2dKIU(Object obj) {
            return ChannelResult.constructor-impl(obj);
        }

        public final Object failure-PtdJZtk() {
            return ChannelResult.constructor-impl(ChannelResult.failed);
        }

        public final Object closed-JP2dKIU(Throwable th) {
            return ChannelResult.constructor-impl(new Closed(th));
        }
    }
}
