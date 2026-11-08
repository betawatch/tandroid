package o9;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import j$.util.Objects;
import j2.n;
import m4.d0;
import org.telegram.messenger.beta.R;
import q6.m;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
        d0 d0Var = new d0();
        m.g(context);
        Resources resources = context.getResources();
        d0Var.a = resources;
        d0Var.b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        String L = d0Var.L("google_app_id");
        if (TextUtils.isEmpty(L)) {
            return null;
        }
        return new i(L, d0Var.L("google_api_key"), d0Var.L("firebase_database_url"), d0Var.L("ga_trackingId"), d0Var.L("gcm_defaultSenderId"), d0Var.L("google_storage_bucket"), d0Var.L("recaptcha_site_key"), d0Var.L("project_id"));
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
        n nVar = new n(this);
        nVar.X(this.b, "applicationId");
        nVar.X(this.a, "apiKey");
        nVar.X(this.c, "databaseUrl");
        nVar.X(this.e, "gcmSenderId");
        nVar.X(this.f, "storageBucket");
        nVar.X(this.g, "recaptchaSiteKey");
        nVar.X(this.h, "projectId");
        return nVar.toString();
    }
}
