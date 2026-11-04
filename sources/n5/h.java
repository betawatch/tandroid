package n5;

import g2.f0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h {
    public final String a;
    public final Integer b;
    public final l c;
    public final long d;
    public final long e;
    public final Map f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    public h(String str, Integer num, l lVar, long j10, long j11, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = num;
        this.c = lVar;
        this.d = j10;
        this.e = j11;
        this.f = hashMap;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final f0 c() {
        f0 f0Var = new f0();
        String str = this.a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        f0Var.a = str;
        f0Var.b = this.b;
        f0Var.g = this.g;
        f0Var.h = this.h;
        f0Var.i = this.i;
        f0Var.j = this.j;
        l lVar = this.c;
        if (lVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        f0Var.c = lVar;
        f0Var.d = Long.valueOf(this.d);
        f0Var.e = Long.valueOf(this.e);
        f0Var.f = new HashMap(this.f);
        return f0Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String str2 = hVar.h;
            Integer num3 = hVar.g;
            Integer num4 = hVar.b;
            if (this.a.equals(hVar.a) && ((num = this.b) != null ? num.equals(num4) : num4 == null) && this.c.equals(hVar.c) && this.d == hVar.d && this.e == hVar.e && this.f.equals(hVar.f) && ((num2 = this.g) != null ? num2.equals(num3) : num3 == null) && ((str = this.h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.i, hVar.i) && Arrays.equals(this.j, hVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j10 = this.d;
        int i3 = (hashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.e;
        int hashCode3 = (((i3 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.h;
        return ((((hashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
