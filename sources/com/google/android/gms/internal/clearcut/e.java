package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.ui.yh;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements h, ra.m {
    public final String a;

    public /* synthetic */ e(String str) {
        this.a = str;
    }

    public static void a(l7.w0 w0Var, p9.c cVar) {
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
        } catch (Exception e) {
            bVar.d("Failed to parse settings JSON from " + str, e);
            bVar.d("Settings response " + str3, null);
            return null;
        }
    }

    @Override // ra.m
    public Object s2() {
        throw new pa.j(this.a);
    }

    @Override // com.google.android.gms.internal.clearcut.h
    public Object zzp() {
        Object obj;
        boolean z4;
        String str = this.a;
        ContentResolver contentResolver = d.g.getContentResolver();
        Uri uri = f2.a;
        synchronized (f2.class) {
            f2.c(contentResolver);
            obj = f2.k;
        }
        HashMap hashMap = f2.g;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) f2.a(hashMap, str, bool);
        if (bool2 != null) {
            z4 = bool2.booleanValue();
        } else {
            String b10 = f2.b(contentResolver, str);
            boolean z10 = false;
            if (b10 != null && !b10.equals("")) {
                if (f2.c.matcher(b10).matches()) {
                    bool = Boolean.TRUE;
                    z10 = true;
                } else if (!f2.d.matcher(b10).matches()) {
                    Log.w("Gservices", yh.l("attempt to read gservices key ", str, " (value \"", b10, "\") as boolean"));
                }
                f2.e(obj, hashMap, str, bool);
                z4 = z10;
            }
            bool = bool2;
            f2.e(obj, hashMap, str, bool);
            z4 = z10;
        }
        return Boolean.valueOf(z4);
    }

    public e(String str, db.a aVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.a = str;
    }
}
