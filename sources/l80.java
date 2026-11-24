// default package

import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class l80 extends gz2 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final m80 g;
    public final l90 h;
    public final k90 i;
    public final p80 j;
    public final List k;
    public final int l;

    public l80(String str, String str2, String str3, long j, Long l, boolean z, m80 m80Var, l90 l90Var, k90 k90Var, p80 p80Var, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = m80Var;
        this.h = l90Var;
        this.i = k90Var;
        this.j = p80Var;
        this.k = list;
        this.l = i;
    }

    public final k80 a() {
        k80 k80Var = new k80();
        k80Var.a = this.a;
        k80Var.b = this.b;
        k80Var.c = this.c;
        k80Var.d = this.d;
        k80Var.e = this.e;
        k80Var.f = this.f;
        k80Var.g = this.g;
        k80Var.h = this.h;
        k80Var.i = this.i;
        k80Var.j = this.j;
        k80Var.k = this.k;
        k80Var.l = this.l;
        k80Var.m = (byte) 7;
        return k80Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gz2)) {
            return false;
        }
        l80 l80Var = (l80) ((gz2) obj);
        if (!this.a.equals(l80Var.a) || !this.b.equals(l80Var.b)) {
            return false;
        }
        String str = l80Var.c;
        String str2 = this.c;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.d != l80Var.d) {
            return false;
        }
        Long l = l80Var.e;
        Long l2 = this.e;
        if (l2 == null) {
            if (l != null) {
                return false;
            }
        } else if (!l2.equals(l)) {
            return false;
        }
        if (this.f != l80Var.f || !this.g.equals(l80Var.g)) {
            return false;
        }
        l90 l90Var = l80Var.h;
        l90 l90Var2 = this.h;
        if (l90Var2 == null) {
            if (l90Var != null) {
                return false;
            }
        } else if (!l90Var2.equals(l90Var)) {
            return false;
        }
        k90 k90Var = l80Var.i;
        k90 k90Var2 = this.i;
        if (k90Var2 == null) {
            if (k90Var != null) {
                return false;
            }
        } else if (!k90Var2.equals(k90Var)) {
            return false;
        }
        p80 p80Var = l80Var.j;
        p80 p80Var2 = this.j;
        if (p80Var2 == null) {
            if (p80Var != null) {
                return false;
            }
        } else if (!p80Var2.equals(p80Var)) {
            return false;
        }
        List list = l80Var.k;
        List list2 = this.k;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        return this.l == l80Var.l;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = (((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.e;
        int hashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        l90 l90Var = this.h;
        int hashCode4 = (hashCode3 ^ (l90Var == null ? 0 : l90Var.hashCode())) * 1000003;
        k90 k90Var = this.i;
        int hashCode5 = (hashCode4 ^ (k90Var == null ? 0 : k90Var.hashCode())) * 1000003;
        p80 p80Var = this.j;
        int hashCode6 = (hashCode5 ^ (p80Var == null ? 0 : p80Var.hashCode())) * 1000003;
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
        return de9.l(sb, this.l, "}");
    }
}
