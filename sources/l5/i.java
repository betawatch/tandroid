package l5;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class i {
    public final String a;
    public final byte[] b;
    public final i5.d c;

    public i(String str, byte[] bArr, i5.d dVar) {
        this.a = str;
        this.b = bArr;
        this.c = dVar;
    }

    public static aa.a a() {
        aa.a aVar = new aa.a(28);
        aVar.d = i5.d.a;
        return aVar;
    }

    public final i b(i5.d dVar) {
        aa.a a2 = a();
        a2.t(this.a);
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        a2.d = dVar;
        a2.c = this.b;
        return a2.e();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.a.equals(iVar.a) && Arrays.equals(this.b, iVar.b) && this.c.equals(iVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.b;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.a);
        sb2.append(", ");
        sb2.append(this.c);
        sb2.append(", ");
        return a4.a.t(sb2, encodeToString, ")");
    }
}
