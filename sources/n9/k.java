package n9;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import m2.t;
import mi.h0;
import p6.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        int i3 = w6.e.a;
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

    public static k a(Context context) {
        h0 h0Var = new h0(context, 18);
        String J = h0Var.J("google_app_id");
        if (TextUtils.isEmpty(J)) {
            return null;
        }
        return new k(J, h0Var.J("google_api_key"), h0Var.J("firebase_database_url"), h0Var.J("ga_trackingId"), h0Var.J("gcm_defaultSenderId"), h0Var.J("google_storage_bucket"), h0Var.J("recaptcha_site_key"), h0Var.J("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Objects.equals(this.b, kVar.b) && Objects.equals(this.a, kVar.a) && Objects.equals(this.c, kVar.c) && Objects.equals(this.d, kVar.d) && Objects.equals(this.e, kVar.e) && Objects.equals(this.f, kVar.f) && Objects.equals(this.g, kVar.g) && Objects.equals(this.h, kVar.h);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final String toString() {
        t tVar = new t(this);
        tVar.A(this.b, "applicationId");
        tVar.A(this.a, "apiKey");
        tVar.A(this.c, "databaseUrl");
        tVar.A(this.e, "gcmSenderId");
        tVar.A(this.f, "storageBucket");
        tVar.A(this.g, "recaptchaSiteKey");
        tVar.A(this.h, "projectId");
        return tVar.toString();
    }
}
