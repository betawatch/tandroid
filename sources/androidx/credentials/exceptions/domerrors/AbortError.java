package androidx.credentials.exceptions.domerrors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class AbortError extends DomError {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AbortError() {
        super("androidx.credentials.TYPE_ABORT_ERROR");
    }
}
