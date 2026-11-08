package a8;

import android.content.Context;
import android.util.Log;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class n1 {
    public static String a(Context context, int i7) {
        if (context == null) {
            return "";
        }
        if (i7 == 1) {
            return context.getString(R.string.fingerprint_error_hw_not_available);
        }
        if (i7 != 7) {
            switch (i7) {
                case 9:
                    break;
                case 10:
                    return context.getString(R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(R.string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i7);
                    return context.getString(R.string.default_error_msg);
            }
        }
        return context.getString(R.string.fingerprint_error_lockout);
    }
}
