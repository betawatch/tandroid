// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ab0 extends vd6 {
    public final long a;
    public final Integer b;
    public final y80 c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final db0 h;
    public final ra0 i;

    public ab0(long j, Integer num, y80 y80Var, long j2, byte[] bArr, String str, long j3, db0 db0Var, ra0 ra0Var) {
        this.a = j;
        this.b = num;
        this.c = y80Var;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = db0Var;
        this.i = ra0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vd6)) {
            return false;
        }
        vd6 vd6Var = (vd6) obj;
        ab0 ab0Var = (ab0) vd6Var;
        if (this.a != ab0Var.a) {
            return false;
        }
        Integer num = ab0Var.b;
        Integer num2 = this.b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        y80 y80Var = ab0Var.c;
        y80 y80Var2 = this.c;
        if (y80Var2 == null) {
            if (y80Var != null) {
                return false;
            }
        } else if (!y80Var2.equals(y80Var)) {
            return false;
        }
        if (this.d != ab0Var.d) {
            return false;
        }
        if (!Arrays.equals(this.e, (vd6Var instanceof ab0 ? (ab0) vd6Var : ab0Var).e)) {
            return false;
        }
        String str = ab0Var.f;
        String str2 = this.f;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.g != ab0Var.g) {
            return false;
        }
        db0 db0Var = ab0Var.h;
        db0 db0Var2 = this.h;
        if (db0Var2 == null) {
            if (db0Var != null) {
                return false;
            }
        } else if (!db0Var2.equals(db0Var)) {
            return false;
        }
        ra0 ra0Var = ab0Var.i;
        ra0 ra0Var2 = this.i;
        return ra0Var2 == null ? ra0Var == null : ra0Var2.equals(ra0Var);
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        y80 y80Var = this.c;
        int hashCode2 = (hashCode ^ (y80Var == null ? 0 : y80Var.hashCode())) * 1000003;
        long j2 = this.d;
        int hashCode3 = (((hashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (hashCode4 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        db0 db0Var = this.h;
        int hashCode5 = (i2 ^ (db0Var == null ? 0 : db0Var.hashCode())) * 1000003;
        ra0 ra0Var = this.i;
        return hashCode5 ^ (ra0Var != null ? ra0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
