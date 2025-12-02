package androidx.credentials.exceptions;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ClearCredentialUnknownException extends ClearCredentialException {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ClearCredentialUnknownException(CharSequence charSequence) {
        super("android.credentials.ClearCredentialStateException.TYPE_UNKNOWN", charSequence);
    }
}
