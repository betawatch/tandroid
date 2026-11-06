package n5;

import java.util.Arrays;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class s extends e0 {
    public final long a;
    public final Integer b;
    public final a0 c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final i0 h;
    public final b0 i;

    public s(long j3, Integer num, a0 a0Var, long j10, byte[] bArr, String str, long j11, i0 i0Var, b0 b0Var) {
        this.a = j3;
        this.b = num;
        this.c = a0Var;
        this.d = j10;
        this.e = bArr;
        this.f = str;
        this.g = j11;
        this.h = i0Var;
        this.i = b0Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        a0 a0Var;
        String str;
        i0 i0Var;
        b0 b0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            s sVar = (s) e0Var;
            b0 b0Var2 = sVar.i;
            i0 i0Var2 = sVar.h;
            String str2 = sVar.f;
            a0 a0Var2 = sVar.c;
            Integer num2 = sVar.b;
            if (this.a == sVar.a && ((num = this.b) != null ? num.equals(num2) : num2 == null) && ((a0Var = this.c) != null ? a0Var.equals(a0Var2) : a0Var2 == null) && this.d == sVar.d) {
                if (Arrays.equals(this.e, e0Var instanceof s ? ((s) e0Var).e : sVar.e) && ((str = this.f) != null ? str.equals(str2) : str2 == null) && this.g == sVar.g && ((i0Var = this.h) != null ? i0Var.equals(i0Var2) : i0Var2 == null) && ((b0Var = this.i) != null ? b0Var.equals(b0Var2) : b0Var2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.a;
        int i7 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = (i7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        a0 a0Var = this.c;
        int hashCode2 = (hashCode ^ (a0Var == null ? 0 : a0Var.hashCode())) * 1000003;
        long j10 = this.d;
        int hashCode3 = (((hashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.g;
        int i10 = (hashCode4 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        i0 i0Var = this.h;
        int hashCode5 = (i10 ^ (i0Var == null ? 0 : i0Var.hashCode())) * 1000003;
        b0 b0Var = this.i;
        return hashCode5 ^ (b0Var != null ? b0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
