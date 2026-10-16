package l9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import m2.t;
import n6.l;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        n3.b bVar = new n3.b(context);
        String D = bVar.D("google_app_id");
        if (TextUtils.isEmpty(D)) {
            return null;
        }
        return new j(D, bVar.D("google_api_key"), bVar.D("firebase_database_url"), bVar.D("ga_trackingId"), bVar.D("gcm_defaultSenderId"), bVar.D("google_storage_bucket"), bVar.D("project_id"));
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
        t tVar = new t(this);
        tVar.q(this.b, "applicationId");
        tVar.q(this.a, "apiKey");
        tVar.q(this.c, "databaseUrl");
        tVar.q(this.e, "gcmSenderId");
        tVar.q(this.f, "storageBucket");
        tVar.q(this.g, "projectId");
        return tVar.toString();
    }
}
