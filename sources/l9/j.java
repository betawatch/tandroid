package l9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import mi.q;
import n6.l;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        n2.e eVar = new n2.e(context);
        String E = eVar.E("google_app_id");
        if (TextUtils.isEmpty(E)) {
            return null;
        }
        return new j(E, eVar.E("google_api_key"), eVar.E("firebase_database_url"), eVar.E("ga_trackingId"), eVar.E("gcm_defaultSenderId"), eVar.E("google_storage_bucket"), eVar.E("project_id"));
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
        q qVar = new q(this);
        qVar.z(this.b, "applicationId");
        qVar.z(this.a, "apiKey");
        qVar.z(this.c, "databaseUrl");
        qVar.z(this.e, "gcmSenderId");
        qVar.z(this.f, "storageBucket");
        qVar.z(this.g, "projectId");
        return qVar.toString();
    }
}
