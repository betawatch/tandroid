// default package

import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class n80 extends b03 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final o80 g;
    public final n90 h;
    public final m90 i;
    public final r80 j;
    public final List k;
    public final int l;

    public n80(String str, String str2, String str3, long j, Long l, boolean z, o80 o80Var, n90 n90Var, m90 m90Var, r80 r80Var, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = o80Var;
        this.h = n90Var;
        this.i = m90Var;
        this.j = r80Var;
        this.k = list;
        this.l = i;
    }

    public final m80 a() {
        m80 m80Var = new m80();
        m80Var.a = this.a;
        m80Var.b = this.b;
        m80Var.c = this.c;
        m80Var.d = this.d;
        m80Var.e = this.e;
        m80Var.f = this.f;
        m80Var.g = this.g;
        m80Var.h = this.h;
        m80Var.i = this.i;
        m80Var.j = this.j;
        m80Var.k = this.k;
        m80Var.l = this.l;
        m80Var.m = (byte) 7;
        return m80Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b03)) {
            return false;
        }
        n80 n80Var = (n80) ((b03) obj);
        if (!this.a.equals(n80Var.a) || !this.b.equals(n80Var.b)) {
            return false;
        }
        String str = n80Var.c;
        String str2 = this.c;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.d != n80Var.d) {
            return false;
        }
        Long l = n80Var.e;
        Long l2 = this.e;
        if (l2 == null) {
            if (l != null) {
                return false;
            }
        } else if (!l2.equals(l)) {
            return false;
        }
        if (this.f != n80Var.f || !this.g.equals(n80Var.g)) {
            return false;
        }
        n90 n90Var = n80Var.h;
        n90 n90Var2 = this.h;
        if (n90Var2 == null) {
            if (n90Var != null) {
                return false;
            }
        } else if (!n90Var2.equals(n90Var)) {
            return false;
        }
        m90 m90Var = n80Var.i;
        m90 m90Var2 = this.i;
        if (m90Var2 == null) {
            if (m90Var != null) {
                return false;
            }
        } else if (!m90Var2.equals(m90Var)) {
            return false;
        }
        r80 r80Var = n80Var.j;
        r80 r80Var2 = this.j;
        if (r80Var2 == null) {
            if (r80Var != null) {
                return false;
            }
        } else if (!r80Var2.equals(r80Var)) {
            return false;
        }
        List list = n80Var.k;
        List list2 = this.k;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        return this.l == n80Var.l;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = (((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.e;
        int hashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        n90 n90Var = this.h;
        int hashCode4 = (hashCode3 ^ (n90Var == null ? 0 : n90Var.hashCode())) * 1000003;
        m90 m90Var = this.i;
        int hashCode5 = (hashCode4 ^ (m90Var == null ? 0 : m90Var.hashCode())) * 1000003;
        r80 r80Var = this.j;
        int hashCode6 = (hashCode5 ^ (r80Var == null ? 0 : r80Var.hashCode())) * 1000003;
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
        return uh9.l(sb, this.l, "}");
    }
}
