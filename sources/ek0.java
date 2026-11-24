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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ek0 {
    public final dk0 a;
    public final BiometricManager b;
    public final k44 c;

    public ek0(dk0 dk0Var) {
        Context context = dk0Var.a;
        this.a = dk0Var;
        int i = Build.VERSION.SDK_INT;
        this.b = i >= 29 ? bk0.b(context) : null;
        this.c = i <= 29 ? new k44(context, (byte) 2) : null;
    }

    public final int a(int i) {
        BiometricPrompt.CryptoObject b;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 1;
        if (i2 >= 30) {
            BiometricManager biometricManager = this.b;
            if (biometricManager != null) {
                return ck0.a(biometricManager, i);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!zod.c(i)) {
            return -2;
        }
        if (i != 0) {
            dk0 dk0Var = this.a;
            Context context = dk0Var.a;
            if (ox5.a(context) != null) {
                int i4 = 0;
                if (zod.b(i)) {
                    KeyguardManager a = ox5.a(context);
                    return a == null ? false : ox5.b(a) ? 0 : 11;
                }
                if (i2 != 29) {
                    if (i2 != 28) {
                        return b();
                    }
                    if (context == null || context.getPackageManager() == null || !lt7.a(context.getPackageManager())) {
                        return 12;
                    }
                    KeyguardManager a2 = ox5.a(dk0Var.a);
                    return !(a2 == null ? false : ox5.b(a2)) ? b() : b() == 0 ? 0 : -1;
                }
                if ((i & nm7.d4) == 255) {
                    BiometricManager biometricManager2 = this.b;
                    if (biometricManager2 != null) {
                        return bk0.a(biometricManager2);
                    }
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                    return 1;
                }
                Method c = bk0.c();
                if (c != null && (b = sce.b(sce.a())) != null) {
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
                    i3 = bk0.a(biometricManager3);
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
                KeyguardManager a3 = ox5.a(dk0Var.a);
                if (!(a3 == null ? false : ox5.b(a3))) {
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
        k44 k44Var = this.c;
        if (k44Var == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = (Context) k44Var.b;
        FingerprintManager c = fi4.c(context);
        if (c == null || !fi4.e(c)) {
            return 12;
        }
        FingerprintManager c2 = fi4.c(context);
        return (c2 == null || !fi4.d(c2)) ? 11 : 0;
    }
}
