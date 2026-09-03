package da;

import m1.j;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    public b(String str, int i10, String str2, String str3, long j10, long j11, String str4) {
        this.a = str;
        this.b = i10;
        this.c = str2;
        this.d = str3;
        this.e = j10;
        this.f = j11;
        this.g = str4;
    }

    public final a a() {
        a aVar = new a(0);
        aVar.c = this.a;
        aVar.b = this.b;
        aVar.d = this.c;
        aVar.e = this.d;
        aVar.g = Long.valueOf(this.e);
        aVar.h = Long.valueOf(this.f);
        aVar.f = this.g;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = bVar.g;
        String str2 = bVar.d;
        String str3 = bVar.c;
        String str4 = bVar.a;
        String str5 = this.a;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (!j.b(this.b, bVar.b)) {
            return false;
        }
        String str6 = this.c;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        String str7 = this.d;
        if (str7 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str7.equals(str2)) {
            return false;
        }
        if (this.e != bVar.e || this.f != bVar.f) {
            return false;
        }
        String str8 = this.g;
        return str8 == null ? str == null : str8.equals(str);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ j.c(this.b)) * 1000003;
        String str2 = this.c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.e;
        int i10 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.g;
        return (str4 != null ? str4.hashCode() : 0) ^ i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.a);
        sb.append(", registrationStatus=");
        int i10 = this.b;
        sb.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? BuildConfig.BETA_URL : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.c);
        sb.append(", refreshToken=");
        sb.append(this.d);
        sb.append(", expiresInSecs=");
        sb.append(this.e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f);
        sb.append(", fisError=");
        return android.support.v4.media.a.r(sb, this.g, "}");
    }
}
