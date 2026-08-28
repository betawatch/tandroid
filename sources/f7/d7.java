package f7;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d7 implements na.n {
    public String a;

    public static void a(a5.m mVar, l9.c cVar) {
        String str = cVar.a;
        if (str != null) {
            mVar.x("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        mVar.x("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        mVar.x("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.0");
        mVar.x("Accept", "application/json");
        String str2 = cVar.b;
        if (str2 != null) {
            mVar.x("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = cVar.c;
        if (str3 != null) {
            mVar.x("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = cVar.d;
        if (str4 != null) {
            mVar.x("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = cVar.e.b().a;
        if (str5 != null) {
            mVar.x("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(l9.c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", cVar.h);
        hashMap.put("display_version", cVar.g);
        hashMap.put("source", Integer.toString(cVar.i));
        String str = cVar.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // na.n
    public Object Y1() {
        throw new la.j(this.a);
    }

    public JSONObject c(com.google.android.gms.internal.clearcut.a1 a1Var) {
        String str = this.a;
        int i9 = a1Var.b;
        b9.d dVar = b9.d.a;
        dVar.c("Settings response code was: " + i9);
        if (i9 != 200 && i9 != 201 && i9 != 202 && i9 != 203) {
            String str2 = "Settings request failed; (status: " + i9 + ") from " + str;
            if (dVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = a1Var.c;
        try {
            return new JSONObject(str3);
        } catch (Exception e10) {
            dVar.d("Failed to parse settings JSON from " + str, e10);
            dVar.d("Settings response " + str3, null);
            return null;
        }
    }
}
