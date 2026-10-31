package l9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n6.l;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i10 = u6.e.a;
        l.i("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static j a(Context context) {
        m5.e eVar = new m5.e(context);
        String R = eVar.R("google_app_id");
        if (TextUtils.isEmpty(R)) {
            return null;
        }
        return new j(R, eVar.R("google_api_key"), eVar.R("firebase_database_url"), eVar.R("ga_trackingId"), eVar.R("gcm_defaultSenderId"), eVar.R("google_storage_bucket"), eVar.R("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.k(this.b, jVar.b) && l.k(this.a, jVar.a) && l.k(this.c, jVar.c) && l.k(this.d, jVar.d) && l.k(this.e, jVar.e) && l.k(this.f, jVar.f) && l.k(this.g, jVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        m4.c cVar = new m4.c(this);
        cVar.u(this.b, "applicationId");
        cVar.u(this.a, "apiKey");
        cVar.u(this.c, "databaseUrl");
        cVar.u(this.e, "gcmSenderId");
        cVar.u(this.f, "storageBucket");
        cVar.u(this.g, "projectId");
        return cVar.toString();
    }
}
