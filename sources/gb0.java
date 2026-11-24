// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gb0 {
    public static final /* synthetic */ int h = 0;
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    static {
        byte b = (byte) (((byte) (0 | 2)) | 1);
        if (b == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        dq9.m(ts2.n("Missing required properties:", sb));
    }

    public gb0(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = str4;
    }

    public final fb0 a() {
        fb0 fb0Var = new fb0();
        fb0Var.a = this.a;
        fb0Var.b = this.b;
        fb0Var.c = this.c;
        fb0Var.d = this.d;
        fb0Var.e = this.e;
        fb0Var.f = this.f;
        fb0Var.g = this.g;
        fb0Var.h = (byte) 3;
        return fb0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gb0)) {
            return false;
        }
        gb0 gb0Var = (gb0) obj;
        String str = gb0Var.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!wi8.c(this.b, gb0Var.b)) {
            return false;
        }
        String str3 = gb0Var.c;
        String str4 = this.c;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = gb0Var.d;
        String str6 = this.d;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (this.e != gb0Var.e || this.f != gb0Var.f) {
            return false;
        }
        String str7 = gb0Var.g;
        String str8 = this.g;
        return str8 == null ? str7 == null : str8.equals(str7);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ wi8.F(this.b)) * 1000003;
        String str2 = this.c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.e;
        int i = (hashCode3 ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        String str4 = this.g;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.a);
        sb.append(", registrationStatus=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.c);
        sb.append(", refreshToken=");
        sb.append(this.d);
        sb.append(", expiresInSecs=");
        sb.append(this.e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f);
        sb.append(", fisError=");
        return b10.j(sb, this.g, "}");
    }
}
