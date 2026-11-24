// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ba0 extends zb6 {
    public final long a;
    public final long b;
    public final x70 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public ba0(long j, long j2, x70 x70Var, Integer num, String str, ArrayList arrayList) {
        ev8 ev8Var = ev8.a;
        this.a = j;
        this.b = j2;
        this.c = x70Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zb6)) {
            return false;
        }
        ba0 ba0Var = (ba0) ((zb6) obj);
        if (this.a != ba0Var.a || this.b != ba0Var.b || !this.c.equals(ba0Var.c)) {
            return false;
        }
        Integer num = ba0Var.d;
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = ba0Var.e;
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f.equals(ba0Var.f)) {
            return false;
        }
        Object obj2 = ev8.a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ ev8.a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + ev8.a + "}";
    }
}
