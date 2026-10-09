package android.support.v4.media;

import a0.f;
import a1.g;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class c {
    public final Bundle a;

    public c(Bundle bundle) {
        this.a = new Bundle(bundle);
    }

    public static boolean f(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String k(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean a(String str) {
        String e7 = e(str);
        return "1".equals(e7) || Boolean.parseBoolean(e7);
    }

    public Integer b(String str) {
        String e7 = e(str);
        if (TextUtils.isEmpty(e7)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(e7));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + k(str) + "(" + e7 + ") into an int");
            return null;
        }
    }

    public JSONArray c(String str) {
        String e7 = e(str);
        if (TextUtils.isEmpty(e7)) {
            return null;
        }
        try {
            return new JSONArray(e7);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + k(str) + ": " + e7 + ", falling back to default");
            return null;
        }
    }

    public String d(Resources resources, String str, String str2) {
        String[] strArr;
        String e7 = e(str2);
        if (!TextUtils.isEmpty(e7)) {
            return e7;
        }
        String e10 = e(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(e10)) {
            return null;
        }
        int identifier = resources.getIdentifier(e10, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", k(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray c10 = c(str2.concat("_loc_args"));
        if (c10 == null) {
            strArr = null;
        } else {
            int length = c10.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = c10.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e11) {
            Log.w("NotificationParams", "Missing format argument for " + k(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e11);
            return null;
        }
    }

    public String e(String str) {
        Bundle bundle = this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle g() {
        Bundle bundle = this.a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public void h(String str, Bitmap bitmap) {
        f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(g.q("The ", str, " key cannot be used to put a Bitmap"));
        }
        this.a.putParcelable(str, bitmap);
    }

    public void i(long j3) {
        f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        this.a.putLong("android.media.metadata.DURATION", j3);
    }

    public void j(String str, String str2) {
        f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(g.q("The ", str, " key cannot be used to put a String"));
        }
        this.a.putCharSequence(str, str2);
    }

    public c() {
        this.a = new Bundle();
    }

    public c(MediaMetadataCompat mediaMetadataCompat) {
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.a = bundle;
        a0.a(bundle);
    }
}
