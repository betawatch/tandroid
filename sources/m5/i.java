package m5;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class i {
    public final String a;
    public final byte[] b;
    public final j5.d c;

    public i(String str, byte[] bArr, j5.d dVar) {
        this.a = str;
        this.b = bArr;
        this.c = dVar;
    }

    public static k6.c a() {
        k6.c cVar = new k6.c(6, false);
        cVar.d = j5.d.a;
        return cVar;
    }

    public final i b(j5.d dVar) {
        k6.c a2 = a();
        a2.H(this.a);
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        a2.d = dVar;
        a2.b = this.b;
        return a2.j();
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
        return a1.g.s(sb2, encodeToString, ")");
    }
}
