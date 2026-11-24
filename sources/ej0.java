// default package

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ej0 {
    public final dj0 a;
    public final BiometricManager b;
    public final uj0 c;

    public ej0(dj0 dj0Var) {
        Context context = dj0Var.a;
        this.a = dj0Var;
        int i = Build.VERSION.SDK_INT;
        this.b = i >= 29 ? bj0.b(context) : null;
        this.c = i <= 29 ? new uj0(context, (char) 0) : null;
    }

    public final int a(int i) {
        BiometricPrompt.CryptoObject b;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 1;
        if (i2 >= 30) {
            BiometricManager biometricManager = this.b;
            if (biometricManager != null) {
                return cj0.a(biometricManager, i);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!wmd.c(i)) {
            return -2;
        }
        if (i != 0) {
            dj0 dj0Var = this.a;
            Context context = dj0Var.a;
            if (ov5.a(context) != null) {
                int i4 = 0;
                if (wmd.b(i)) {
                    KeyguardManager a = ov5.a(context);
                    return a == null ? false : ov5.b(a) ? 0 : 11;
                }
                if (i2 != 29) {
                    if (i2 != 28) {
                        return b();
                    }
                    if (context == null || context.getPackageManager() == null || !kr7.a(context.getPackageManager())) {
                        return 12;
                    }
                    KeyguardManager a2 = ov5.a(dj0Var.a);
                    return !(a2 == null ? false : ov5.b(a2)) ? b() : b() == 0 ? 0 : -1;
                }
                if ((i & kk7.d4) == 255) {
                    BiometricManager biometricManager2 = this.b;
                    if (biometricManager2 != null) {
                        return bj0.a(biometricManager2);
                    }
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                    return 1;
                }
                Method c = bj0.c();
                if (c != null && (b = rae.b(rae.a())) != null) {
                    try {
                        Object invoke = c.invoke(this.b, b);
                        if (invoke instanceof Integer) {
                            return ((Integer) invoke).intValue();
                        }
                        Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                        Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                    }
                }
                BiometricManager biometricManager3 = this.b;
                if (biometricManager3 == null) {
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                } else {
                    i3 = bj0.a(biometricManager3);
                }
                String str = Build.MODEL;
                if (Build.VERSION.SDK_INT < 30 && str != null) {
                    for (String str2 : context.getResources().getStringArray(R.array.assume_strong_biometrics_models)) {
                        if (str.equals(str2)) {
                            return i3;
                        }
                    }
                }
                if (i3 != 0) {
                    return i3;
                }
                KeyguardManager a3 = ov5.a(dj0Var.a);
                if (!(a3 == null ? false : ov5.b(a3))) {
                    i4 = b();
                } else if (b() != 0) {
                    i4 = -1;
                }
                return i4;
            }
        }
        return 12;
    }

    public final int b() {
        uj0 uj0Var = this.c;
        if (uj0Var == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = uj0Var.a;
        FingerprintManager c = dg4.c(context);
        if (c == null || !dg4.e(c)) {
            return 12;
        }
        FingerprintManager c2 = dg4.c(context);
        return (c2 == null || !dg4.d(c2)) ? 11 : 0;
    }
}
