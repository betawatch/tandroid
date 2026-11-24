// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bb0 extends yd6 {
    public final long a;
    public final long b;
    public final x80 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public bb0(long j, long j2, x80 x80Var, Integer num, String str, ArrayList arrayList) {
        fx8 fx8Var = fx8.a;
        this.a = j;
        this.b = j2;
        this.c = x80Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yd6)) {
            return false;
        }
        bb0 bb0Var = (bb0) ((yd6) obj);
        if (this.a != bb0Var.a || this.b != bb0Var.b || !this.c.equals(bb0Var.c)) {
            return false;
        }
        Integer num = bb0Var.d;
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = bb0Var.e;
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f.equals(bb0Var.f)) {
            return false;
        }
        Object obj2 = fx8.a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ fx8.a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + fx8.a + "}";
    }
}
