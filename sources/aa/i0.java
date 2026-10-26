package aa;

import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class i0 extends f2 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final n1 g;
    public final e2 h;
    public final d2 i;
    public final o1 j;
    public final List k;
    public final int l;

    public i0(String str, String str2, String str3, long j10, Long l4, boolean z10, n1 n1Var, e2 e2Var, d2 d2Var, o1 o1Var, List list, int i10) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j10;
        this.e = l4;
        this.f = z10;
        this.g = n1Var;
        this.h = e2Var;
        this.i = d2Var;
        this.j = o1Var;
        this.k = list;
        this.l = i10;
    }

    @Override // aa.f2
    public final h0 a() {
        h0 h0Var = new h0();
        h0Var.a = this.a;
        h0Var.b = this.b;
        h0Var.c = this.c;
        h0Var.d = Long.valueOf(this.d);
        h0Var.e = this.e;
        h0Var.f = Boolean.valueOf(this.f);
        h0Var.g = this.g;
        h0Var.h = this.h;
        h0Var.i = this.i;
        h0Var.j = this.j;
        h0Var.k = this.k;
        h0Var.l = Integer.valueOf(this.l);
        return h0Var;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l4;
        e2 e2Var;
        d2 d2Var;
        o1 o1Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            i0 i0Var = (i0) ((f2) obj);
            List list2 = i0Var.k;
            o1 o1Var2 = i0Var.j;
            d2 d2Var2 = i0Var.i;
            e2 e2Var2 = i0Var.h;
            Long l10 = i0Var.e;
            String str2 = i0Var.c;
            if (this.a.equals(i0Var.a) && this.b.equals(i0Var.b) && ((str = this.c) != null ? str.equals(str2) : str2 == null) && this.d == i0Var.d && ((l4 = this.e) != null ? l4.equals(l10) : l10 == null) && this.f == i0Var.f && this.g.equals(i0Var.g) && ((e2Var = this.h) != null ? e2Var.equals(e2Var2) : e2Var2 == null) && ((d2Var = this.i) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((o1Var = this.j) != null ? o1Var.equals(o1Var2) : o1Var2 == null) && ((list = this.k) != null ? list.equals(list2) : list2 == null) && this.l == i0Var.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.d;
        int i10 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l4 = this.e;
        int hashCode3 = (((((i10 ^ (l4 == null ? 0 : l4.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        e2 e2Var = this.h;
        int hashCode4 = (hashCode3 ^ (e2Var == null ? 0 : e2Var.hashCode())) * 1000003;
        d2 d2Var = this.i;
        int hashCode5 = (hashCode4 ^ (d2Var == null ? 0 : d2Var.hashCode())) * 1000003;
        o1 o1Var = this.j;
        int hashCode6 = (hashCode5 ^ (o1Var == null ? 0 : o1Var.hashCode())) * 1000003;
        List list = this.k;
        return ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.a);
        sb2.append(", identifier=");
        sb2.append(this.b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.e);
        sb2.append(", crashed=");
        sb2.append(this.f);
        sb2.append(", app=");
        sb2.append(this.g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.i);
        sb2.append(", device=");
        sb2.append(this.j);
        sb2.append(", events=");
        sb2.append(this.k);
        sb2.append(", generatorType=");
        return a1.g.n(this.l, "}", sb2);
    }
}
