package k9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n6.l;
import za.y;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        y yVar = new y(context);
        String a2 = yVar.a("google_app_id");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return new j(a2, yVar.a("google_api_key"), yVar.a("firebase_database_url"), yVar.a("ga_trackingId"), yVar.a("gcm_defaultSenderId"), yVar.a("google_storage_bucket"), yVar.a("project_id"));
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
        of.b bVar = new of.b(this);
        bVar.E(this.b, "applicationId");
        bVar.E(this.a, "apiKey");
        bVar.E(this.c, "databaseUrl");
        bVar.E(this.e, "gcmSenderId");
        bVar.E(this.f, "storageBucket");
        bVar.E(this.g, "projectId");
        return bVar.toString();
    }
}
