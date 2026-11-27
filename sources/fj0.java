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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class fj0 {
    public final ej0 a;
    public final BiometricManager b;
    public final di4 c;

    public fj0(ej0 ej0Var) {
        Context context = ej0Var.a;
        this.a = ej0Var;
        int i = Build.VERSION.SDK_INT;
        this.b = i >= 29 ? cj0.b(context) : null;
        this.c = i <= 29 ? new di4(context) : null;
    }

    public final int a(int i) {
        BiometricPrompt.CryptoObject b;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 1;
        if (i2 >= 30) {
            BiometricManager biometricManager = this.b;
            if (biometricManager != null) {
                return dj0.a(biometricManager, i);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!nrd.c(i)) {
            return -2;
        }
        if (i != 0) {
            ej0 ej0Var = this.a;
            Context context = ej0Var.a;
            if (tx5.a(context) != null) {
                int i4 = 0;
                if (nrd.b(i)) {
                    KeyguardManager a = tx5.a(context);
                    return a == null ? false : tx5.b(a) ? 0 : 11;
                }
                if (i2 != 29) {
                    if (i2 != 28) {
                        return b();
                    }
                    if (context == null || context.getPackageManager() == null || !qu7.a(context.getPackageManager())) {
                        return 12;
                    }
                    KeyguardManager a2 = tx5.a(ej0Var.a);
                    return !(a2 == null ? false : tx5.b(a2)) ? b() : b() == 0 ? 0 : -1;
                }
                if ((i & jn7.d4) == 255) {
                    BiometricManager biometricManager2 = this.b;
                    if (biometricManager2 != null) {
                        return cj0.a(biometricManager2);
                    }
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                    return 1;
                }
                Method c = cj0.c();
                if (c != null && (b = hfe.b(hfe.a())) != null) {
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
                    i3 = cj0.a(biometricManager3);
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
                KeyguardManager a3 = tx5.a(ej0Var.a);
                if (!(a3 == null ? false : tx5.b(a3))) {
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
        di4 di4Var = this.c;
        if (di4Var == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = di4Var.a;
        FingerprintManager c = ci4.c(context);
        if (c == null || !ci4.e(c)) {
            return 12;
        }
        FingerprintManager c2 = ci4.c(context);
        return (c2 == null || !ci4.d(c2)) ? 11 : 0;
    }
}
