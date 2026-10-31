package ea;

import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;
import x9.v;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a {
    public final /* synthetic */ int a = 1;
    public String b;

    public /* synthetic */ a() {
    }

    public static void a(a0 a0Var, f fVar) {
        String str = (String) fVar.b;
        if (str != null) {
            a0Var.t("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        a0Var.t("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        a0Var.t("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.0");
        a0Var.t("Accept", "application/json");
        String str2 = (String) fVar.c;
        if (str2 != null) {
            a0Var.t("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = (String) fVar.d;
        if (str3 != null) {
            a0Var.t("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = (String) fVar.e;
        if (str4 != null) {
            a0Var.t("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = ((v) fVar.i).b().a;
        if (str5 != null) {
            a0Var.t("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", (String) fVar.h);
        hashMap.put("display_version", (String) fVar.g);
        hashMap.put("source", Integer.toString(fVar.a));
        String str = (String) fVar.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject c(ba.a aVar) {
        String str = this.b;
        int i10 = aVar.c;
        u9.c cVar = u9.c.a;
        cVar.c("Settings response code was: " + i10);
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + str;
            if (cVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = aVar.b;
        try {
            return new JSONObject(str3);
        } catch (Exception e) {
            cVar.d("Failed to parse settings JSON from " + str, e);
            cVar.d("Settings response " + str3, null);
            return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "<" + this.b + '>';
            default:
                return super.toString();
        }
    }

    public a(String str) {
        this.b = str;
    }

    public a(String str, jb.b bVar) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
