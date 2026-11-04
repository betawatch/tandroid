package n5;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i {
    public final String a;
    public final byte[] b;
    public final k5.d c;

    public i(String str, byte[] bArr, k5.d dVar) {
        this.a = str;
        this.b = bArr;
        this.c = dVar;
    }

    public static k4.j a() {
        k4.j jVar = new k4.j();
        jVar.c = k5.d.a;
        return jVar;
    }

    public final i b(k5.d dVar) {
        k4.j a10 = a();
        a10.I(this.a);
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        a10.c = dVar;
        a10.b = this.b;
        return a10.l();
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
