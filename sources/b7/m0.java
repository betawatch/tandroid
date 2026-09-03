package b7;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        return this.n;
    }
}
