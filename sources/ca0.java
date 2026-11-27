// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ca0 extends ae6 {
    public final long a;
    public final Integer b;
    public final a80 c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final fa0 h;
    public final t90 i;

    public ca0(long j, Integer num, a80 a80Var, long j2, byte[] bArr, String str, long j3, fa0 fa0Var, t90 t90Var) {
        this.a = j;
        this.b = num;
        this.c = a80Var;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = fa0Var;
        this.i = t90Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ae6)) {
            return false;
        }
        ae6 ae6Var = (ae6) obj;
        ca0 ca0Var = (ca0) ae6Var;
        if (this.a != ca0Var.a) {
            return false;
        }
        Integer num = ca0Var.b;
        Integer num2 = this.b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        a80 a80Var = ca0Var.c;
        a80 a80Var2 = this.c;
        if (a80Var2 == null) {
            if (a80Var != null) {
                return false;
            }
        } else if (!a80Var2.equals(a80Var)) {
            return false;
        }
        if (this.d != ca0Var.d) {
            return false;
        }
        if (!Arrays.equals(this.e, (ae6Var instanceof ca0 ? (ca0) ae6Var : ca0Var).e)) {
            return false;
        }
        String str = ca0Var.f;
        String str2 = this.f;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.g != ca0Var.g) {
            return false;
        }
        fa0 fa0Var = ca0Var.h;
        fa0 fa0Var2 = this.h;
        if (fa0Var2 == null) {
            if (fa0Var != null) {
                return false;
            }
        } else if (!fa0Var2.equals(fa0Var)) {
            return false;
        }
        t90 t90Var = ca0Var.i;
        t90 t90Var2 = this.i;
        return t90Var2 == null ? t90Var == null : t90Var2.equals(t90Var);
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        a80 a80Var = this.c;
        int hashCode2 = (hashCode ^ (a80Var == null ? 0 : a80Var.hashCode())) * 1000003;
        long j2 = this.d;
        int hashCode3 = (((hashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (hashCode4 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        fa0 fa0Var = this.h;
        int hashCode5 = (i2 ^ (fa0Var == null ? 0 : fa0Var.hashCode())) * 1000003;
        t90 t90Var = this.i;
        return hashCode5 ^ (t90Var != null ? t90Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
