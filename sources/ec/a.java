package ec;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.clearcut.a1;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a {
    public final /* synthetic */ int a;
    public String b;

    public /* synthetic */ a() {
        this.a = 2;
    }

    public static void a(j9.a aVar, m9.c cVar) {
        String str = cVar.a;
        if (str != null) {
            aVar.E("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        aVar.E("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        aVar.E("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.0");
        aVar.E("Accept", "application/json");
        String str2 = cVar.b;
        if (str2 != null) {
            aVar.E("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = cVar.c;
        if (str3 != null) {
            aVar.E("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = cVar.d;
        if (str4 != null) {
            aVar.E("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = cVar.e.b().a;
        if (str5 != null) {
            aVar.E("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(m9.c cVar) {
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

    public JSONObject c(a1 a1Var) {
        String str = this.b;
        int i10 = a1Var.b;
        c9.c cVar = c9.c.a;
        cVar.c("Settings response code was: " + i10);
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + str;
            if (cVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = a1Var.c;
        try {
            return new JSONObject(str3);
        } catch (Exception e9) {
            cVar.d("Failed to parse settings JSON from " + str, e9);
            cVar.d("Settings response " + str3, null);
            return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "<" + this.b + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(String str, int i10) {
        this.a = i10;
        this.b = str;
    }

    public a(String str, xa.a aVar) {
        this.a = 1;
        if (str != null) {
            this.b = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
