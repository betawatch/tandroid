package androidx.credentials.exceptions;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class CreateCredentialInterruptedException extends CreateCredentialException {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CreateCredentialInterruptedException(CharSequence charSequence) {
        super("android.credentials.CreateCredentialException.TYPE_INTERRUPTED", charSequence);
    }
}
