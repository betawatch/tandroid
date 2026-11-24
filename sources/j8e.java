// default package

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j8e extends a4f implements Serializable {
    public final MessageDigest a;
    public final int b;
    public final boolean c;
    public final String d;

    public j8e() {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.a = messageDigest;
            this.b = messageDigest.getDigestLength();
            this.d = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.c = z;
        } catch (NoSuchAlgorithmException e) {
            bh7.j(e);
            throw null;
        }
    }

    public final String toString() {
        return this.d;
    }
}
