// default package

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class aa0 extends wb6 {
    public final long a;
    public final Integer b;
    public final y70 c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final da0 h;
    public final r90 i;

    public aa0(long j, Integer num, y70 y70Var, long j2, byte[] bArr, String str, long j3, da0 da0Var, r90 r90Var) {
        this.a = j;
        this.b = num;
        this.c = y70Var;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = da0Var;
        this.i = r90Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wb6)) {
            return false;
        }
        wb6 wb6Var = (wb6) obj;
        aa0 aa0Var = (aa0) wb6Var;
        if (this.a != aa0Var.a) {
            return false;
        }
        Integer num = aa0Var.b;
        Integer num2 = this.b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        y70 y70Var = aa0Var.c;
        y70 y70Var2 = this.c;
        if (y70Var2 == null) {
            if (y70Var != null) {
                return false;
            }
        } else if (!y70Var2.equals(y70Var)) {
            return false;
        }
        if (this.d != aa0Var.d) {
            return false;
        }
        if (!Arrays.equals(this.e, (wb6Var instanceof aa0 ? (aa0) wb6Var : aa0Var).e)) {
            return false;
        }
        String str = aa0Var.f;
        String str2 = this.f;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.g != aa0Var.g) {
            return false;
        }
        da0 da0Var = aa0Var.h;
        da0 da0Var2 = this.h;
        if (da0Var2 == null) {
            if (da0Var != null) {
                return false;
            }
        } else if (!da0Var2.equals(da0Var)) {
            return false;
        }
        r90 r90Var = aa0Var.i;
        r90 r90Var2 = this.i;
        return r90Var2 == null ? r90Var == null : r90Var2.equals(r90Var);
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        y70 y70Var = this.c;
        int hashCode2 = (hashCode ^ (y70Var == null ? 0 : y70Var.hashCode())) * 1000003;
        long j2 = this.d;
        int hashCode3 = (((hashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (hashCode4 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        da0 da0Var = this.h;
        int hashCode5 = (i2 ^ (da0Var == null ? 0 : da0Var.hashCode())) * 1000003;
        r90 r90Var = this.i;
        return hashCode5 ^ (r90Var != null ? r90Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
