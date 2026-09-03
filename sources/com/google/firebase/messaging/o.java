package com.google.firebase.messaging;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class o {
    public final Bundle a;

    public o(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.a = bundle == null ? Bundle.EMPTY : bundle;
    }

    public static boolean g(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String i(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean a(String str) {
        String f10 = f(str);
        return "1".equals(f10) || Boolean.parseBoolean(f10);
    }

    public Integer b(String str) {
        String f10 = f(str);
        if (TextUtils.isEmpty(f10)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(f10));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + i(str) + "(" + f10 + ") into an int");
            return null;
        }
    }

    public JSONArray c(String str) {
        String f10 = f(str);
        if (TextUtils.isEmpty(f10)) {
            return null;
        }
        try {
            return new JSONArray(f10);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + i(str) + ": " + f10 + ", falling back to default");
            return null;
        }
    }

    public String d(Resources resources, String str, String str2) {
        String[] strArr;
        String f10 = f(str2);
        if (!TextUtils.isEmpty(f10)) {
            return f10;
        }
        String f11 = f(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(f11)) {
            return null;
        }
        int identifier = resources.getIdentifier(f11, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", i(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray c3 = c(str2.concat("_loc_args"));
        if (c3 == null) {
            strArr = null;
        } else {
            int length = c3.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = c3.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e6) {
            Log.w("NotificationParams", "Missing format argument for " + i(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e6);
            return null;
        }
    }

    public Boolean e() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public String f(String str) {
        Bundle bundle = this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle h() {
        Bundle bundle = this.a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public o(Bundle bundle) {
        this.a = new Bundle(bundle);
    }
}
