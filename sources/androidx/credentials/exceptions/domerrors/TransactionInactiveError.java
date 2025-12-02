package androidx.credentials.exceptions.domerrors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class TransactionInactiveError extends DomError {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TransactionInactiveError() {
        super("androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR");
    }
}
