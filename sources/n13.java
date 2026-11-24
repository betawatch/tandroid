// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n13 extends o13 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n13(CharSequence charSequence, byte b) {
        super(charSequence, "androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION");
        switch (b) {
            case 2:
                super(charSequence, "android.credentials.CreateCredentialException.TYPE_UNKNOWN");
                break;
            case 3:
                super(charSequence, "androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION");
                break;
            default:
                break;
        }
    }

    public n13(CharSequence charSequence, String str) {
        super(charSequence, str);
        if (str.length() > 0) {
            return;
        }
        u36.j("type must not be empty");
        throw null;
    }
}
