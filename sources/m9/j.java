package m9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import m4.w1;
import o6.l;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        int i10 = v6.e.a;
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
        m4.c cVar = new m4.c(context);
        String T = cVar.T("google_app_id");
        if (TextUtils.isEmpty(T)) {
            return null;
        }
        return new j(T, cVar.T("google_api_key"), cVar.T("firebase_database_url"), cVar.T("ga_trackingId"), cVar.T("gcm_defaultSenderId"), cVar.T("google_storage_bucket"), cVar.T("project_id"));
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
        w1 w1Var = new w1(this);
        w1Var.x(this.b, "applicationId");
        w1Var.x(this.a, "apiKey");
        w1Var.x(this.c, "databaseUrl");
        w1Var.x(this.e, "gcmSenderId");
        w1Var.x(this.f, "storageBucket");
        w1Var.x(this.g, "projectId");
        return w1Var.toString();
    }
}
