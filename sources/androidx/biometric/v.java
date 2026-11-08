package androidx.biometric;

import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class v {
    public final Signature a;
    public final Cipher b;
    public final Mac c;
    public final IdentityCredential d;

    public v(Signature signature) {
        this.a = signature;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public v(Cipher cipher) {
        this.a = null;
        this.b = cipher;
        this.c = null;
        this.d = null;
    }

    public v(Mac mac) {
        this.a = null;
        this.b = null;
        this.c = mac;
        this.d = null;
    }

    public v(IdentityCredential identityCredential) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = identityCredential;
    }
}
