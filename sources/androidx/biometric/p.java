package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.j0;
import com.google.android.gms.internal.play_billing.r1;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class p extends androidx.fragment.app.s {
    public final Handler g0 = new Handler(Looper.getMainLooper());
    public y h0;

    @Override // androidx.fragment.app.s
    public final void H() {
        this.Q = true;
        if (Build.VERSION.SDK_INT == 29 && r1.a(this.h0.c())) {
            y yVar = this.h0;
            yVar.q = true;
            this.g0.postDelayed(new o(yVar, 2), 250L);
        }
    }

    @Override // androidx.fragment.app.s
    public final void I() {
        this.Q = true;
        if (Build.VERSION.SDK_INT >= 29 || this.h0.o) {
            return;
        }
        androidx.fragment.app.v k10 = k();
        if (k10 == null || !k10.isChangingConfigurations()) {
            N(0);
        }
    }

    public final void N(int i10) {
        if (i10 == 3 || !this.h0.q) {
            if (R()) {
                this.h0.l = i10;
                if (i10 == 1) {
                    U(10, g7.n.a(n(), 10));
                }
            }
            y yVar = this.h0;
            if (yVar.i == null) {
                yVar.i = new xe.b(2, (byte) 0);
            }
            xe.b bVar = yVar.i;
            CancellationSignal cancellationSignal = (CancellationSignal) bVar.b;
            if (cancellationSignal != null) {
                try {
                    z.a(cancellationSignal);
                } catch (NullPointerException e9) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e9);
                }
                bVar.b = null;
            }
            c2.t tVar = (c2.t) bVar.c;
            if (tVar != null) {
                try {
                    tVar.d();
                } catch (NullPointerException e10) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e10);
                }
                bVar.c = null;
            }
        }
    }

    public final void O() {
        this.h0.m = false;
        P();
        if (!this.h0.o && t()) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(p());
            aVar.h(this);
            aVar.e(true, true);
        }
        Context n10 = n();
        if (n10 != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : n10.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        y yVar = this.h0;
                        yVar.p = true;
                        this.g0.postDelayed(new o(yVar, 1), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void P() {
        this.h0.m = false;
        if (t()) {
            j0 p6 = p();
            f0 f0Var = (f0) p6.D("androidx.biometric.FingerprintDialogFragment");
            if (f0Var != null) {
                if (f0Var.t()) {
                    f0Var.N(false);
                    return;
                }
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(p6);
                aVar.h(f0Var);
                aVar.e(true, true);
            }
        }
    }

    public final boolean Q() {
        return Build.VERSION.SDK_INT <= 28 && r1.a(this.h0.c());
    }

    public final boolean R() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            androidx.fragment.app.v k10 = k();
            if (k10 != null && this.h0.g != null) {
                String str = Build.MANUFACTURER;
                String str2 = Build.MODEL;
                if (i10 == 28) {
                    if (str != null) {
                        for (String str3 : k10.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                            if (str.equalsIgnoreCase(str3)) {
                                break;
                            }
                        }
                    }
                    String str4 = Build.MODEL;
                    if (str4 != null) {
                        for (String str5 : k10.getResources().getStringArray(R.array.crypto_fingerprint_fallback_prefixes)) {
                            if (!str4.startsWith(str5)) {
                            }
                        }
                    }
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 != 28) {
                return false;
            }
            Context n10 = n();
            return i11 < 23 || n10 == null || n10.getPackageManager() == null || !i0.a(n10.getPackageManager());
        }
        return true;
    }

    public final void S() {
        androidx.fragment.app.v k10 = k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager a2 = g7.o.a(k10);
        if (a2 == null) {
            T(12, q(R.string.generic_error_no_keyguard));
            return;
        }
        y yVar = this.h0;
        u5.k kVar = yVar.f;
        CharSequence charSequence = kVar != null ? (CharSequence) kVar.b : null;
        yVar.getClass();
        u5.k kVar2 = this.h0.f;
        Intent a3 = j.a(a2, charSequence, kVar2 != null ? (CharSequence) kVar2.c : null);
        if (a3 == null) {
            T(14, q(R.string.generic_error_no_device_credential));
            return;
        }
        this.h0.o = true;
        if (R()) {
            P();
        }
        a3.setFlags(134742016);
        startActivityForResult(a3, 1);
    }

    public final void T(int i10, CharSequence charSequence) {
        U(i10, charSequence);
        O();
    }

    public final void U(int i10, CharSequence charSequence) {
        y yVar = this.h0;
        if (yVar.o) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
            return;
        }
        if (!yVar.n) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        yVar.n = false;
        Executor executor = yVar.d;
        if (executor == null) {
            executor = new n(1);
        }
        executor.execute(new f(this, i10, charSequence, 0));
    }

    public final void V(t tVar) {
        y yVar = this.h0;
        if (yVar.n) {
            yVar.n = false;
            Executor executor = yVar.d;
            if (executor == null) {
                executor = new n(1);
            }
            executor.execute(new a9.o(1, this, tVar));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        O();
    }

    public final void W(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = q(R.string.default_error_msg);
        }
        this.h0.f(2);
        this.h0.e(charSequence);
    }

    public final void X() {
        FingerprintManager f10;
        FingerprintManager f11;
        if (this.h0.m) {
            return;
        }
        if (n() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        y yVar = this.h0;
        yVar.m = true;
        yVar.n = true;
        CharSequence charSequence = null;
        r3 = null;
        r3 = null;
        r3 = null;
        j9.a aVar = null;
        if (!R()) {
            BiometricPrompt.Builder d = k.d(K().getApplicationContext());
            y yVar2 = this.h0;
            u5.k kVar = yVar2.f;
            CharSequence charSequence2 = kVar != null ? (CharSequence) kVar.b : null;
            yVar2.getClass();
            u5.k kVar2 = this.h0.f;
            CharSequence charSequence3 = kVar2 != null ? (CharSequence) kVar2.c : null;
            if (charSequence2 != null) {
                k.g(d, charSequence2);
            }
            if (charSequence3 != null) {
                k.e(d, charSequence3);
            }
            y yVar3 = this.h0;
            String str = yVar3.k;
            if (str != null) {
                charSequence = str;
            } else {
                u5.k kVar3 = yVar3.f;
                if (kVar3 != null && (charSequence = (CharSequence) kVar3.d) == null) {
                    charSequence = "";
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                Executor executor = this.h0.d;
                if (executor == null) {
                    executor = new n(1);
                }
                y yVar4 = this.h0;
                if (yVar4.j == null) {
                    yVar4.j = new x(yVar4);
                }
                k.f(d, charSequence, executor, yVar4.j);
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                u5.k kVar4 = this.h0.f;
                l.a(d, true);
            }
            int c10 = this.h0.c();
            if (i10 >= 30) {
                m.a(d, c10);
            } else if (i10 >= 29) {
                l.b(d, r1.a(c10));
            }
            BiometricPrompt c11 = k.c(d);
            Context n10 = n();
            BiometricPrompt.CryptoObject b10 = g7.m.b(this.h0.g);
            y yVar5 = this.h0;
            if (yVar5.i == null) {
                yVar5.i = new xe.b(2, (byte) 0);
            }
            xe.b bVar = yVar5.i;
            if (((CancellationSignal) bVar.b) == null) {
                bVar.b = z.b();
            }
            CancellationSignal cancellationSignal = (CancellationSignal) bVar.b;
            n nVar = new n(0);
            y yVar6 = this.h0;
            if (yVar6.h == null) {
                yVar6.h = new a5.n(new w(yVar6));
            }
            a5.n nVar2 = yVar6.h;
            if (((BiometricPrompt.AuthenticationCallback) nVar2.b) == null) {
                nVar2.b = b.a((w) nVar2.d);
            }
            BiometricPrompt.AuthenticationCallback authenticationCallback = (BiometricPrompt.AuthenticationCallback) nVar2.b;
            try {
                if (b10 == null) {
                    k.b(c11, cancellationSignal, nVar, authenticationCallback);
                } else {
                    k.a(c11, b10, cancellationSignal, nVar, authenticationCallback);
                }
                return;
            } catch (NullPointerException e9) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e9);
                T(1, n10 != null ? n10.getString(R.string.default_error_msg) : "");
                return;
            }
        }
        Context applicationContext = K().getApplicationContext();
        ae.b bVar2 = new ae.b(applicationContext, 21);
        int i11 = Build.VERSION.SDK_INT;
        int i12 = (i11 < 23 || (f10 = e0.b.f(applicationContext)) == null || !e0.b.n(f10)) ? 12 : (i11 < 23 || (f11 = e0.b.f(applicationContext)) == null || !e0.b.k(f11)) ? 11 : 0;
        if (i12 != 0) {
            T(i12, g7.n.a(applicationContext, i12));
            return;
        }
        if (t()) {
            this.h0.w = true;
            String str2 = Build.MODEL;
            if (i11 == 28 && str2 != null) {
                for (String str3 : applicationContext.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                    if (str2.startsWith(str3)) {
                        break;
                    }
                }
            }
            this.g0.postDelayed(new g(this, 1), 500L);
            f0 f0Var = new f0();
            j0 p6 = p();
            f0Var.t0 = false;
            f0Var.u0 = true;
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(p6);
            aVar2.o = true;
            aVar2.f(0, f0Var, "androidx.biometric.FingerprintDialogFragment");
            aVar2.e(false, true);
            y yVar7 = this.h0;
            yVar7.l = 0;
            u uVar = yVar7.g;
            if (uVar != null) {
                Cipher cipher = uVar.b;
                if (cipher != null) {
                    aVar = new j9.a(cipher);
                } else {
                    Signature signature = uVar.a;
                    if (signature != null) {
                        aVar = new j9.a(signature);
                    } else {
                        Mac mac = uVar.c;
                        if (mac != null) {
                            aVar = new j9.a(mac);
                        } else if (Build.VERSION.SDK_INT >= 30 && uVar.d != null) {
                            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                        }
                    }
                }
            }
            y yVar8 = this.h0;
            if (yVar8.i == null) {
                yVar8.i = new xe.b(2, (byte) 0);
            }
            xe.b bVar3 = yVar8.i;
            if (((c2.t) bVar3.c) == null) {
                bVar3.c = new c2.t(4);
            }
            c2.t tVar = (c2.t) bVar3.c;
            y yVar9 = this.h0;
            if (yVar9.h == null) {
                yVar9.h = new a5.n(new w(yVar9));
            }
            a5.n nVar3 = yVar9.h;
            if (((a9.i) nVar3.c) == null) {
                nVar3.c = new a9.i(nVar3, 1);
            }
            try {
                bVar2.F(aVar, tVar, (a9.i) nVar3.c);
            } catch (NullPointerException e10) {
                Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e10);
                T(1, g7.n.a(applicationContext, 1));
            }
        }
    }

    @Override // androidx.fragment.app.s
    public final void x(int i10, int i11, Intent intent) {
        super.x(i10, i11, intent);
        if (i10 == 1) {
            this.h0.o = false;
            if (i11 == -1) {
                V(new t(null, 1));
            } else {
                T(10, q(R.string.generic_error_user_canceled));
            }
        }
    }

    @Override // androidx.fragment.app.s
    public final void z(Bundle bundle) {
        super.z(bundle);
        if (k() == null) {
            return;
        }
        y yVar = (y) new a5.n(k()).l(y.class);
        this.h0 = yVar;
        if (yVar.r == null) {
            yVar.r = new androidx.lifecycle.z();
        }
        yVar.r.d(this, new h(this, 0));
        y yVar2 = this.h0;
        if (yVar2.s == null) {
            yVar2.s = new androidx.lifecycle.z();
        }
        yVar2.s.d(this, new i(this, 0));
        y yVar3 = this.h0;
        if (yVar3.t == null) {
            yVar3.t = new androidx.lifecycle.z();
        }
        yVar3.t.d(this, new k5.i(this, 2));
        y yVar4 = this.h0;
        if (yVar4.u == null) {
            yVar4.u = new androidx.lifecycle.z();
        }
        yVar4.u.d(this, new a9.i(this, 2));
        y yVar5 = this.h0;
        if (yVar5.v == null) {
            yVar5.v = new androidx.lifecycle.z();
        }
        yVar5.v.d(this, new h(this, 1));
        y yVar6 = this.h0;
        if (yVar6.x == null) {
            yVar6.x = new androidx.lifecycle.z();
        }
        yVar6.x.d(this, new i(this, 1));
    }
}
