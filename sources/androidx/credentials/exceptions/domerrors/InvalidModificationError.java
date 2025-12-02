package androidx.credentials.exceptions.domerrors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class InvalidModificationError extends DomError {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public InvalidModificationError() {
        super("androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR");
    }
}
