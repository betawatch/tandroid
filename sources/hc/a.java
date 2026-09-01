package hc;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.clearcut.z0;
import java.util.HashMap;
import l7.w0;
import org.json.JSONObject;
import pa.j;
import ra.m;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a implements m {
    public final String a;

    public /* synthetic */ a(String str) {
        this.a = str;
    }

    public static void a(w0 w0Var, p9.c cVar) {
        String str = cVar.a;
        if (str != null) {
            w0Var.w("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        w0Var.w("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        w0Var.w("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.0");
        w0Var.w("Accept", "application/json");
        String str2 = cVar.b;
        if (str2 != null) {
            w0Var.w("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = cVar.c;
        if (str3 != null) {
            w0Var.w("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = cVar.d;
        if (str4 != null) {
            w0Var.w("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = cVar.e.b().a;
        if (str5 != null) {
            w0Var.w("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(p9.c cVar) {
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

    public JSONObject c(z0 z0Var) {
        int i10 = z0Var.b;
        f9.b bVar = f9.b.a;
        bVar.c("Settings response code was: " + i10);
        String str = this.a;
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + str;
            if (bVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = z0Var.c;
        try {
            return new JSONObject(str3);
        } catch (Exception e6) {
            bVar.d("Failed to parse settings JSON from " + str, e6);
            bVar.d("Settings response " + str3, null);
            return null;
        }
    }

    @Override // ra.m
    public Object y2() {
        throw new j(this.a);
    }

    public a(String str, db.a aVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.a = str;
    }
}
