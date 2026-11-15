package o9;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import ji.j;
import q6.m;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        m.i("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
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
        String K0 = aVar.K0("google_app_id");
        if (TextUtils.isEmpty(K0)) {
            return null;
        }
        return new i(K0, aVar.K0("google_api_key"), aVar.K0("firebase_database_url"), aVar.K0("ga_trackingId"), aVar.K0("gcm_defaultSenderId"), aVar.K0("google_storage_bucket"), aVar.K0("recaptcha_site_key"), aVar.K0("project_id"));
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
        j jVar = new j(this);
        jVar.U(this.b, "applicationId");
        jVar.U(this.a, "apiKey");
        jVar.U(this.c, "databaseUrl");
        jVar.U(this.e, "gcmSenderId");
        jVar.U(this.f, "storageBucket");
        jVar.U(this.g, "recaptchaSiteKey");
        jVar.U(this.h, "projectId");
        return jVar.toString();
    }
}
