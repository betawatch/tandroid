package k9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n4.y;
import n6.l;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        of.b bVar = new of.b(context, 29);
        String N = bVar.N("google_app_id");
        if (TextUtils.isEmpty(N)) {
            return null;
        }
        return new j(N, bVar.N("google_api_key"), bVar.N("firebase_database_url"), bVar.N("ga_trackingId"), bVar.N("gcm_defaultSenderId"), bVar.N("google_storage_bucket"), bVar.N("project_id"));
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
        y yVar = new y(this);
        yVar.e(this.b, "applicationId");
        yVar.e(this.a, "apiKey");
        yVar.e(this.c, "databaseUrl");
        yVar.e(this.e, "gcmSenderId");
        yVar.e(this.f, "storageBucket");
        yVar.e(this.g, "projectId");
        return yVar.toString();
    }
}
