package ea;

import m1.j;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final b d;
    public final int e;

    public a(String str, String str2, String str3, b bVar, int i10) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bVar;
        this.e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i10 = aVar.e;
        b bVar = aVar.d;
        String str = aVar.c;
        String str2 = aVar.b;
        String str3 = aVar.a;
        String str4 = this.a;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = this.b;
        if (str5 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str5.equals(str2)) {
            return false;
        }
        String str6 = this.c;
        if (str6 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str6.equals(str)) {
            return false;
        }
        b bVar2 = this.d;
        if (bVar2 == null) {
            if (bVar != null) {
                return false;
            }
        } else if (!bVar2.equals(bVar)) {
            return false;
        }
        int i11 = this.e;
        return i11 == 0 ? i10 == 0 : j.b(i11, i10);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.d;
        int hashCode4 = (hashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i10 = this.e;
        return (i10 != 0 ? j.c(i10) : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.a);
        sb.append(", fid=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        int i10 = this.e;
        sb.append(i10 != 1 ? i10 != 2 ? BuildConfig.BETA_URL : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
