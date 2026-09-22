package androidx.biometric;

import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class t {
    public final Signature a;
    public final Cipher b;
    public final Mac c;
    public final IdentityCredential d;

    public t(Signature signature) {
        this.a = signature;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public t(Cipher cipher) {
        this.a = null;
        this.b = cipher;
        this.c = null;
        this.d = null;
    }

    public t(Mac mac) {
        this.a = null;
        this.b = null;
        this.c = mac;
        this.d = null;
    }

    public t(IdentityCredential identityCredential) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = identityCredential;
    }
}
