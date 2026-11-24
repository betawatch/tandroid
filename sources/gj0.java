// default package

import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class gj0 {
    public final Signature a;
    public final Cipher b;
    public final Mac c;
    public final IdentityCredential d;

    public gj0(Signature signature) {
        this.a = signature;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public gj0(Cipher cipher) {
        this.a = null;
        this.b = cipher;
        this.c = null;
        this.d = null;
    }

    public gj0(Mac mac) {
        this.a = null;
        this.b = null;
        this.c = mac;
        this.d = null;
    }

    public gj0(IdentityCredential identityCredential) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = identityCredential;
    }
}
