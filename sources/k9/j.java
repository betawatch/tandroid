package k9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n4.y;
import n6.l;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        y yVar = new y(context, 26);
        String O = yVar.O("google_app_id");
        if (TextUtils.isEmpty(O)) {
            return null;
        }
        return new j(O, yVar.O("google_api_key"), yVar.O("firebase_database_url"), yVar.O("ga_trackingId"), yVar.O("gcm_defaultSenderId"), yVar.O("google_storage_bucket"), yVar.O("project_id"));
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
        m5.e eVar = new m5.e(this);
        eVar.c(this.b, "applicationId");
        eVar.c(this.a, "apiKey");
        eVar.c(this.c, "databaseUrl");
        eVar.c(this.e, "gcmSenderId");
        eVar.c(this.f, "storageBucket");
        eVar.c(this.g, "projectId");
        return eVar.toString();
    }
}
