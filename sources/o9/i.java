package o9;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import ji.l;
import q6.m;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        int i7 = x6.e.a;
        m.j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public static i a(Context context) {
        k8.a aVar = new k8.a(context, 26);
        String E0 = aVar.E0("google_app_id");
        if (TextUtils.isEmpty(E0)) {
            return null;
        }
        return new i(E0, aVar.E0("google_api_key"), aVar.E0("firebase_database_url"), aVar.E0("ga_trackingId"), aVar.E0("gcm_defaultSenderId"), aVar.E0("google_storage_bucket"), aVar.E0("recaptcha_site_key"), aVar.E0("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Objects.equals(this.b, iVar.b) && Objects.equals(this.a, iVar.a) && Objects.equals(this.c, iVar.c) && Objects.equals(this.d, iVar.d) && Objects.equals(this.e, iVar.e) && Objects.equals(this.f, iVar.f) && Objects.equals(this.g, iVar.g) && Objects.equals(this.h, iVar.h);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final String toString() {
        l lVar = new l(this);
        lVar.E(this.b, "applicationId");
        lVar.E(this.a, "apiKey");
        lVar.E(this.c, "databaseUrl");
        lVar.E(this.e, "gcmSenderId");
        lVar.E(this.f, "storageBucket");
        lVar.E(this.g, "recaptchaSiteKey");
        lVar.E(this.h, "projectId");
        return lVar.toString();
    }
}
