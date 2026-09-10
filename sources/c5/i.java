package c5;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class i implements fb.n {
    public String a;

    public /* synthetic */ i(String str) {
        this.a = str;
    }

    public static void a(aa.a aVar, da.d dVar) {
        String str = dVar.a;
        if (str != null) {
            aVar.t("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        aVar.t("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        aVar.t("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.0");
        aVar.t("Accept", "application/json");
        String str2 = dVar.b;
        if (str2 != null) {
            aVar.t("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = dVar.c;
        if (str3 != null) {
            aVar.t("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = dVar.d;
        if (str4 != null) {
            aVar.t("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = dVar.e.b().a;
        if (str5 != null) {
            aVar.t("X-CRASHLYTICS-INSTALLATION-ID", str5);
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

    public static i d(e2.v vVar) {
        String str;
        vVar.K(2);
        int x10 = vVar.x();
        int i10 = x10 >> 1;
        int x11 = ((vVar.x() >> 3) & 31) | ((x10 & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder u10 = a4.a.u(str);
        u10.append(i10 < 10 ? ".0" : ".");
        u10.append(i10);
        u10.append(x11 < 10 ? ".0" : ".");
        u10.append(x11);
        return new i(u10.toString());
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

    @Override // fb.n
    public Object n2() {
        throw new db.j(this.a);
    }
}
