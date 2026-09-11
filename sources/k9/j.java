package k9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n4.y;
import n6.l;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        pf.b bVar = new pf.b(context, 29);
        String X = bVar.X("google_app_id");
        if (TextUtils.isEmpty(X)) {
            return null;
        }
        return new j(X, bVar.X("google_api_key"), bVar.X("firebase_database_url"), bVar.X("ga_trackingId"), bVar.X("gcm_defaultSenderId"), bVar.X("google_storage_bucket"), bVar.X("project_id"));
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
        yVar.y(this.b, "applicationId");
        yVar.y(this.a, "apiKey");
        yVar.y(this.c, "databaseUrl");
        yVar.y(this.e, "gcmSenderId");
        yVar.y(this.f, "storageBucket");
        yVar.y(this.g, "projectId");
        return yVar.toString();
    }
}
