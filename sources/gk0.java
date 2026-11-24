// default package

import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gk0 {
    public final Signature a;
    public final Cipher b;
    public final Mac c;
    public final IdentityCredential d;

    public gk0(Signature signature) {
        this.a = signature;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public gk0(Cipher cipher) {
        this.a = null;
        this.b = cipher;
        this.c = null;
        this.d = null;
    }

    public gk0(Mac mac) {
        this.a = null;
        this.b = null;
        this.c = mac;
        this.d = null;
    }

    public gk0(IdentityCredential identityCredential) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = identityCredential;
    }
}
