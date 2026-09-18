package androidx.biometric;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public abstract class k {
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
