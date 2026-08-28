package g9;

import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b0 extends g1 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final List i;

    public b0(int i9, String str, int i10, int i11, long j10, long j11, long j12, String str2, List list) {
        this.a = i9;
        this.b = str;
        this.c = i10;
        this.d = i11;
        this.e = j10;
        this.f = j11;
        this.g = j12;
        this.h = str2;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.i;
            String str2 = b0Var.h;
            if (this.a == b0Var.a && this.b.equals(b0Var.b) && this.c == b0Var.c && this.d == b0Var.d && this.e == b0Var.e && this.f == b0Var.f && this.g == b0Var.g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j10 = this.e;
        int i9 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f;
        int i10 = (i9 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.g;
        int i11 = (i10 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.h;
        int hashCode2 = (i11 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.i;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.a + ", processName=" + this.b + ", reasonCode=" + this.c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f + ", timestamp=" + this.g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.i + "}";
    }
}
