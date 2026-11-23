package o9;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import j6.k;
import q6.m;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        jb.m mVar = new jb.m(context, 27);
        String y02 = mVar.y0("google_app_id");
        if (TextUtils.isEmpty(y02)) {
            return null;
        }
        return new i(y02, mVar.y0("google_api_key"), mVar.y0("firebase_database_url"), mVar.y0("ga_trackingId"), mVar.y0("gcm_defaultSenderId"), mVar.y0("google_storage_bucket"), mVar.y0("recaptcha_site_key"), mVar.y0("project_id"));
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
        k kVar = new k(this);
        kVar.S(this.b, "applicationId");
        kVar.S(this.a, "apiKey");
        kVar.S(this.c, "databaseUrl");
        kVar.S(this.e, "gcmSenderId");
        kVar.S(this.f, "storageBucket");
        kVar.S(this.g, "recaptchaSiteKey");
        kVar.S(this.h, "projectId");
        return kVar.toString();
    }
}
