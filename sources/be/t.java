package be;

import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ t(String str, int i3) {
        this.a = i3;
        this.b = str;
    }

    public static void a(a0 a0Var, ha.e eVar) {
        String str = (String) eVar.b;
        if (str != null) {
            a0Var.n("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        a0Var.n("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        a0Var.n("X-CRASHLYTICS-API-CLIENT-VERSION", "20.1.1");
        a0Var.n("Accept", "application/json");
        String str2 = (String) eVar.c;
        if (str2 != null) {
            a0Var.n("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = (String) eVar.d;
        if (str3 != null) {
            a0Var.n("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = (String) eVar.e;
        if (str4 != null) {
            a0Var.n("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = ((z9.v) eVar.i).c().a;
        if (str5 != null) {
            a0Var.n("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(ha.e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", (String) eVar.h);
        hashMap.put("display_version", (String) eVar.g);
        hashMap.put("source", Integer.toString(eVar.a));
        String str = (String) eVar.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject c(ad.b bVar) {
        int i3 = bVar.c;
        w9.c cVar = w9.c.a;
        cVar.c("Settings response code was: " + i3);
        String str = this.b;
        if (i3 != 200 && i3 != 201 && i3 != 202 && i3 != 203) {
            String str2 = "Settings request failed; (status: " + i3 + ") from " + str;
            if (cVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = bVar.b;
        try {
            return new JSONObject(str3);
        } catch (Exception e10) {
            cVar.d("Failed to parse settings JSON from " + str, e10);
            cVar.d("Settings response " + str3, null);
            return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "<" + this.b + '>';
            default:
                return super.toString();
        }
    }

    public t(String str, kb.a aVar) {
        this.a = 1;
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.b = str;
    }
}
