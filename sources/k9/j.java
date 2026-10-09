package k9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n4.x;
import n6.l;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        pf.b bVar = new pf.b(context, 28);
        String K = bVar.K("google_app_id");
        if (TextUtils.isEmpty(K)) {
            return null;
        }
        return new j(K, bVar.K("google_api_key"), bVar.K("firebase_database_url"), bVar.K("ga_trackingId"), bVar.K("gcm_defaultSenderId"), bVar.K("google_storage_bucket"), bVar.K("project_id"));
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
        x xVar = new x(this);
        xVar.o(this.b, "applicationId");
        xVar.o(this.a, "apiKey");
        xVar.o(this.c, "databaseUrl");
        xVar.o(this.e, "gcmSenderId");
        xVar.o(this.f, "storageBucket");
        xVar.o(this.g, "projectId");
        return xVar.toString();
    }
}
