// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class l90 extends r03 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final m90 g;
    public final la0 h;
    public final ka0 i;
    public final p90 j;
    public final List k;
    public final int l;

    public l90(String str, String str2, String str3, long j, Long l, boolean z, m90 m90Var, la0 la0Var, ka0 ka0Var, p90 p90Var, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = m90Var;
        this.h = la0Var;
        this.i = ka0Var;
        this.j = p90Var;
        this.k = list;
        this.l = i;
    }

    public final k90 a() {
        k90 k90Var = new k90();
        k90Var.a = this.a;
        k90Var.b = this.b;
        k90Var.c = this.c;
        k90Var.d = this.d;
        k90Var.e = this.e;
        k90Var.f = this.f;
        k90Var.g = this.g;
        k90Var.h = this.h;
        k90Var.i = this.i;
        k90Var.j = this.j;
        k90Var.k = this.k;
        k90Var.l = this.l;
        k90Var.m = (byte) 7;
        return k90Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r03)) {
            return false;
        }
        l90 l90Var = (l90) ((r03) obj);
        if (!this.a.equals(l90Var.a) || !this.b.equals(l90Var.b)) {
            return false;
        }
        String str = l90Var.c;
        String str2 = this.c;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.d != l90Var.d) {
            return false;
        }
        Long l = l90Var.e;
        Long l2 = this.e;
        if (l2 == null) {
            if (l != null) {
                return false;
            }
        } else if (!l2.equals(l)) {
            return false;
        }
        if (this.f != l90Var.f || !this.g.equals(l90Var.g)) {
            return false;
        }
        la0 la0Var = l90Var.h;
        la0 la0Var2 = this.h;
        if (la0Var2 == null) {
            if (la0Var != null) {
                return false;
            }
        } else if (!la0Var2.equals(la0Var)) {
            return false;
        }
        ka0 ka0Var = l90Var.i;
        ka0 ka0Var2 = this.i;
        if (ka0Var2 == null) {
            if (ka0Var != null) {
                return false;
            }
        } else if (!ka0Var2.equals(ka0Var)) {
            return false;
        }
        p90 p90Var = l90Var.j;
        p90 p90Var2 = this.j;
        if (p90Var2 == null) {
            if (p90Var != null) {
                return false;
            }
        } else if (!p90Var2.equals(p90Var)) {
            return false;
        }
        List list = l90Var.k;
        List list2 = this.k;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        return this.l == l90Var.l;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = (((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.e;
        int hashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        la0 la0Var = this.h;
        int hashCode4 = (hashCode3 ^ (la0Var == null ? 0 : la0Var.hashCode())) * 1000003;
        ka0 ka0Var = this.i;
        int hashCode5 = (hashCode4 ^ (ka0Var == null ? 0 : ka0Var.hashCode())) * 1000003;
        p90 p90Var = this.j;
        int hashCode6 = (hashCode5 ^ (p90Var == null ? 0 : p90Var.hashCode())) * 1000003;
        List list = this.k;
        return ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return hg9.k(sb, this.l, "}");
    }
}
