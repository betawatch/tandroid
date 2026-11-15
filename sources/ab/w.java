package ab;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class w {
    public final Bundle a;

    public w(Bundle bundle) {
        this.a = new Bundle(bundle);
    }

    public static boolean f(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String k(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean a(String str) {
        String e10 = e(str);
        return "1".equals(e10) || Boolean.parseBoolean(e10);
    }

    public Integer b(String str) {
        String e10 = e(str);
        if (TextUtils.isEmpty(e10)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(e10));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + k(str) + "(" + e10 + ") into an int");
            return null;
        }
    }

    public JSONArray c(String str) {
        String e10 = e(str);
        if (TextUtils.isEmpty(e10)) {
            return null;
        }
        try {
            return new JSONArray(e10);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + k(str) + ": " + e10 + ", falling back to default");
            return null;
        }
    }

    public String d(Resources resources, String str, String str2) {
        String[] strArr;
        String e10 = e(str2);
        if (!TextUtils.isEmpty(e10)) {
            return e10;
        }
        String e11 = e(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(e11)) {
            return null;
        }
        int identifier = resources.getIdentifier(e11, "string", str);
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
            for (int i7 = 0; i7 < length; i7++) {
                strArr[i7] = c10.optString(i7);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e12) {
            Log.w("NotificationParams", "Missing format argument for " + k(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e12);
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
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(a8.p0.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        this.a.putParcelable(str, bitmap);
    }

    public void i(long j3) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        this.a.putLong("android.media.metadata.DURATION", j3);
    }

    public void j(String str, String str2) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(a8.p0.p("The ", str, " key cannot be used to put a String"));
        }
        this.a.putCharSequence(str, str2);
    }

    public w() {
        this.a = new Bundle();
    }

    public w(MediaMetadataCompat mediaMetadataCompat) {
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.a = bundle;
        android.support.v4.media.session.a0.g(bundle);
    }
}
