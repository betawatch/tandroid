package da;

import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class n0 extends t2 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final b2 g;
    public final s2 h;
    public final r2 i;
    public final c2 j;
    public final List k;
    public final int l;

    public n0(String str, String str2, String str3, long j3, Long l10, boolean z9, b2 b2Var, s2 s2Var, r2 r2Var, c2 c2Var, List list, int i7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j3;
        this.e = l10;
        this.f = z9;
        this.g = b2Var;
        this.h = s2Var;
        this.i = r2Var;
        this.j = c2Var;
        this.k = list;
        this.l = i7;
    }

    @Override // da.t2
    public final m0 a() {
        m0 m0Var = new m0();
        m0Var.a = this.a;
        m0Var.b = this.b;
        m0Var.c = this.c;
        m0Var.d = this.d;
        m0Var.e = this.e;
        m0Var.f = this.f;
        m0Var.g = this.g;
        m0Var.h = this.h;
        m0Var.i = this.i;
        m0Var.j = this.j;
        m0Var.k = this.k;
        m0Var.l = this.l;
        m0Var.m = (byte) 7;
        return m0Var;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l10;
        s2 s2Var;
        r2 r2Var;
        c2 c2Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t2) {
            n0 n0Var = (n0) ((t2) obj);
            List list2 = n0Var.k;
            c2 c2Var2 = n0Var.j;
            r2 r2Var2 = n0Var.i;
            s2 s2Var2 = n0Var.h;
            Long l11 = n0Var.e;
            String str2 = n0Var.c;
            if (this.a.equals(n0Var.a) && this.b.equals(n0Var.b) && ((str = this.c) != null ? str.equals(str2) : str2 == null) && this.d == n0Var.d && ((l10 = this.e) != null ? l10.equals(l11) : l11 == null) && this.f == n0Var.f && this.g.equals(n0Var.g) && ((s2Var = this.h) != null ? s2Var.equals(s2Var2) : s2Var2 == null) && ((r2Var = this.i) != null ? r2Var.equals(r2Var2) : r2Var2 == null) && ((c2Var = this.j) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((list = this.k) != null ? list.equals(list2) : list2 == null) && this.l == n0Var.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j3 = this.d;
        int i7 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l10 = this.e;
        int hashCode3 = (((((i7 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        s2 s2Var = this.h;
        int hashCode4 = (hashCode3 ^ (s2Var == null ? 0 : s2Var.hashCode())) * 1000003;
        r2 r2Var = this.i;
        int hashCode5 = (hashCode4 ^ (r2Var == null ? 0 : r2Var.hashCode())) * 1000003;
        c2 c2Var = this.j;
        int hashCode6 = (hashCode5 ^ (c2Var == null ? 0 : c2Var.hashCode())) * 1000003;
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
        return a8.p0.n(this.l, "}", sb2);
    }
}
