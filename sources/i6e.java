// default package

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class i6e extends y1f implements Serializable {
    public final MessageDigest a;
    public final int b;
    public final boolean c;
    public final String d;

    public i6e() {
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
            fi7.g(e);
            throw null;
        }
    }

    public final String toString() {
        return this.d;
    }
}
