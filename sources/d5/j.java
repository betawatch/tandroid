package d5;

import a8.h0;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class j {
    public String a;

    public j(String str) {
        str.getClass();
        this.a = str;
    }

    public static void b(h0 h0Var, fa.c cVar) {
        String str = cVar.a;
        if (str != null) {
            h0Var.r("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        h0Var.r("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        h0Var.r("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.0");
        h0Var.r("Accept", "application/json");
        String str2 = cVar.b;
        if (str2 != null) {
            h0Var.r("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = cVar.c;
        if (str3 != null) {
            h0Var.r("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = cVar.d;
        if (str4 != null) {
            h0Var.r("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = cVar.e.b().a;
        if (str5 != null) {
            h0Var.r("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap c(fa.c cVar) {
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

    public static CharSequence f(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public void a(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                sb2.append(f(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.a);
                    sb2.append(f(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public JSONObject d(ca.a aVar) {
        String str = this.a;
        int i10 = aVar.c;
        v9.b bVar = v9.b.a;
        bVar.c("Settings response code was: " + i10);
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + str;
            if (bVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = aVar.b;
        try {
            return new JSONObject(str3);
        } catch (Exception e) {
            bVar.d("Failed to parse settings JSON from " + str, e);
            bVar.d("Settings response " + str3, null);
            return null;
        }
    }

    public String e(List list) {
        Iterator it = list.iterator();
        StringBuilder sb2 = new StringBuilder();
        a(sb2, it);
        return sb2.toString();
    }
}
