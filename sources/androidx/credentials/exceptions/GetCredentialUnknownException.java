package androidx.credentials.exceptions;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class GetCredentialUnknownException extends GetCredentialException {
    public static final Companion Companion = new Companion(null);

    public GetCredentialUnknownException(CharSequence charSequence) {
        super("android.credentials.GetCredentialException.TYPE_UNKNOWN", charSequence);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
