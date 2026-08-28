package androidx.biometric;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class l {
    public static void a(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
        biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, authenticationCallback);
    }

    public static void b(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
        biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
    }

    public static BiometricPrompt c(BiometricPrompt.Builder builder) {
        return builder.build();
    }

    public static BiometricPrompt.Builder d(Context context) {
        return new BiometricPrompt.Builder(context);
    }

    public static void e(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    public static void f(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
        builder.setNegativeButton(charSequence, executor, onClickListener);
    }

    public static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }
}
