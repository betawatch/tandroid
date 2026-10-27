package aa;

import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c0 extends i1 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final List i;

    public c0(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.a = i10;
        this.b = str;
        this.c = i11;
        this.d = i12;
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
        if (obj instanceof i1) {
            c0 c0Var = (c0) ((i1) obj);
            List list2 = c0Var.i;
            String str2 = c0Var.h;
            if (this.a == c0Var.a && this.b.equals(c0Var.b) && this.c == c0Var.c && this.d == c0Var.d && this.e == c0Var.e && this.f == c0Var.f && this.g == c0Var.g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j10 = this.e;
        int i10 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.h;
        int hashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.i;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.a + ", processName=" + this.b + ", reasonCode=" + this.c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f + ", timestamp=" + this.g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.i + "}";
    }
}
