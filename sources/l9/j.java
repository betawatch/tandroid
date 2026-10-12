package l9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n6.l;
import n6.o;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        l.j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static j a(Context context) {
        o oVar = new o(context, 0);
        String y3 = oVar.y("google_app_id");
        if (TextUtils.isEmpty(y3)) {
            return null;
        }
        return new j(y3, oVar.y("google_api_key"), oVar.y("firebase_database_url"), oVar.y("ga_trackingId"), oVar.y("gcm_defaultSenderId"), oVar.y("google_storage_bucket"), oVar.y("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.l(this.b, jVar.b) && l.l(this.a, jVar.a) && l.l(this.c, jVar.c) && l.l(this.d, jVar.d) && l.l(this.e, jVar.e) && l.l(this.f, jVar.f) && l.l(this.g, jVar.g);
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
