package b7;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m0 extends b implements Serializable {
    public final MessageDigest e;
    public final int f;
    public final boolean h;
    public final String n;

    public m0() {
        boolean z4;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.e = messageDigest;
            this.f = messageDigest.getDigestLength();
            this.n = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z4 = true;
            } catch (CloneNotSupportedException unused) {
                z4 = false;
            }
            this.h = z4;
        } catch (NoSuchAlgorithmException e6) {
            throw new AssertionError(e6);
        }
    }

    public final String toString() {
        return this.n;
    }
}
