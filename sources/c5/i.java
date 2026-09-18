package c5;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class i {
    public String a;

    public static void a(aa.a aVar, da.d dVar) {
        String str = dVar.a;
        if (str != null) {
            aVar.r("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        aVar.r("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        aVar.r("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.0");
        aVar.r("Accept", "application/json");
        String str2 = dVar.b;
        if (str2 != null) {
            aVar.r("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = dVar.c;
        if (str3 != null) {
            aVar.r("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = dVar.d;
        if (str4 != null) {
            aVar.r("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = dVar.e.b().a;
        if (str5 != null) {
            aVar.r("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(da.d dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", dVar.h);
        hashMap.put("display_version", dVar.g);
        hashMap.put("source", Integer.toString(dVar.i));
        String str = dVar.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject c(aa.b bVar) {
        String str = this.a;
        int i10 = bVar.c;
        t9.b bVar2 = t9.b.a;
        bVar2.c("Settings response code was: " + i10);
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + str;
            if (bVar2.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = bVar.b;
        try {
            return new JSONObject(str3);
        } catch (Exception e) {
            bVar2.d("Failed to parse settings JSON from " + str, e);
            bVar2.d("Settings response " + str3, null);
            return null;
        }
    }
}
