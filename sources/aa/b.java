package aa;

import m1.j;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final long b;
    public final int c;

    public b(String str, long j10, int i9) {
        this.a = str;
        this.b = j10;
        this.c = i9;
    }

    public static a6.a a() {
        a6.a aVar = new a6.a((char) 0, 1);
        aVar.d = 0L;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i9 = bVar.c;
        String str = bVar.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.b != bVar.b) {
            return false;
        }
        int i10 = this.c;
        return i10 == 0 ? i9 == 0 : j.a(i10, i9);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.b;
        int i9 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        int i10 = this.c;
        return (i10 != 0 ? j.b(i10) : 0) ^ i9;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.b);
        sb2.append(", responseCode=");
        int i9 = this.c;
        sb2.append(i9 != 1 ? i9 != 2 ? i9 != 3 ? BuildConfig.BETA_URL : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb2.append("}");
        return sb2.toString();
    }
}
