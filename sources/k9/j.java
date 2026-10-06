package k9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n4.y;
import n6.l;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
        String G = bVar.G("google_app_id");
        if (TextUtils.isEmpty(G)) {
            return null;
        }
        return new j(G, bVar.G("google_api_key"), bVar.G("firebase_database_url"), bVar.G("ga_trackingId"), bVar.G("gcm_defaultSenderId"), bVar.G("google_storage_bucket"), bVar.G("project_id"));
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
        yVar.m(this.b, "applicationId");
        yVar.m(this.a, "apiKey");
        yVar.m(this.c, "databaseUrl");
        yVar.m(this.e, "gcmSenderId");
        yVar.m(this.f, "storageBucket");
        yVar.m(this.g, "projectId");
        return yVar.toString();
    }
}
