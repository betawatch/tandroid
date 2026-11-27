// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class da0 extends de6 {
    public final long a;
    public final long b;
    public final z70 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public da0(long j, long j2, z70 z70Var, Integer num, String str, ArrayList arrayList) {
        py8 py8Var = py8.a;
        this.a = j;
        this.b = j2;
        this.c = z70Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof de6)) {
            return false;
        }
        da0 da0Var = (da0) ((de6) obj);
        if (this.a != da0Var.a || this.b != da0Var.b || !this.c.equals(da0Var.c)) {
            return false;
        }
        Integer num = da0Var.d;
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = da0Var.e;
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f.equals(da0Var.f)) {
            return false;
        }
        Object obj2 = py8.a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ py8.a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + py8.a + "}";
    }
}
