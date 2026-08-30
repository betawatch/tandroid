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
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class r extends androidx.fragment.app.s {
    public final Handler h0 = new Handler(Looper.getMainLooper());
    public a0 i0;

    @Override // androidx.fragment.app.s
    public final void H() {
        this.R = true;
        if (Build.VERSION.SDK_INT == 29 && com.google.android.gms.internal.cast.n.a(this.i0.c())) {
            a0 a0Var = this.i0;
            a0Var.q = true;
            this.h0.postDelayed(new q(a0Var, 2), 250L);
        }
    }

    @Override // androidx.fragment.app.s
    public final void I() {
        this.R = true;
        if (Build.VERSION.SDK_INT >= 29 || this.i0.o) {
            return;
        }
        androidx.fragment.app.v k10 = k();
        if (k10 == null || !k10.isChangingConfigurations()) {
            N(0);
        }
    }

    public final void N(int i10) {
        if (i10 == 3 || !this.i0.q) {
            if (R()) {
                this.i0.l = i10;
                if (i10 == 1) {
                    U(10, h7.s.a(n(), 10));
                }
            }
            a0 a0Var = this.i0;
            if (a0Var.i == null) {
                a0Var.i = new bf.b((char) 0, 4);
            }
            bf.b bVar = a0Var.i;
            CancellationSignal cancellationSignal = (CancellationSignal) bVar.b;
            if (cancellationSignal != null) {
                try {
                    b0.a(cancellationSignal);
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                bVar.b = null;
            }
            c2.u uVar = (c2.u) bVar.c;
            if (uVar != null) {
                try {
                    uVar.d();
                } catch (NullPointerException e6) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e6);
                }
                bVar.c = null;
            }
        }
    }

    public final void O() {
        this.i0.m = false;
        P();
        if (!this.i0.o && t()) {
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
                        a0 a0Var = this.i0;
                        a0Var.p = true;
                        this.h0.postDelayed(new q(a0Var, 1), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void P() {
        this.i0.m = false;
        if (t()) {
            androidx.fragment.app.j0 p10 = p();
            i0 i0Var = (i0) p10.D("androidx.biometric.FingerprintDialogFragment");
            if (i0Var != null) {
                if (i0Var.t()) {
                    i0Var.N(false);
                    return;
                }
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(p10);
                aVar.h(i0Var);
                aVar.e(true, true);
            }
        }
    }

    public final boolean Q() {
        return Build.VERSION.SDK_INT <= 28 && com.google.android.gms.internal.cast.n.a(this.i0.c());
    }

    public final boolean R() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            androidx.fragment.app.v k10 = k();
            if (k10 != null && this.i0.g != null) {
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
            return i11 < 23 || n10 == null || n10.getPackageManager() == null || !l0.a(n10.getPackageManager());
        }
        return true;
    }

    public final void S() {
        androidx.fragment.app.v k10 = k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager a2 = j7.m.a(k10);
        if (a2 == null) {
            T(12, q(R.string.generic_error_no_keyguard));
            return;
        }
        a0 a0Var = this.i0;
        x5.k kVar = a0Var.f;
        CharSequence charSequence = kVar != null ? (CharSequence) kVar.b : null;
        a0Var.getClass();
        x5.k kVar2 = this.i0.f;
        Intent a10 = l.a(a2, charSequence, kVar2 != null ? (CharSequence) kVar2.c : null);
        if (a10 == null) {
            T(14, q(R.string.generic_error_no_device_credential));
            return;
        }
        this.i0.o = true;
        if (R()) {
            P();
        }
        a10.setFlags(134742016);
        startActivityForResult(a10, 1);
    }

    public final void T(int i10, CharSequence charSequence) {
        U(i10, charSequence);
        O();
    }

    public final void U(int i10, CharSequence charSequence) {
        a0 a0Var = this.i0;
        if (a0Var.o) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
            return;
        }
        if (!a0Var.n) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        a0Var.n = false;
        Executor executor = a0Var.d;
        if (executor == null) {
            executor = new p(1);
        }
        executor.execute(new g(this, i10, charSequence, 0));
    }

    public final void V(v vVar) {
        a0 a0Var = this.i0;
        if (a0Var.n) {
            a0Var.n = false;
            Executor executor = a0Var.d;
            if (executor == null) {
                executor = new p(1);
            }
            executor.execute(new k(0, this, vVar));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        O();
    }

    public final void W(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = q(R.string.default_error_msg);
        }
        this.i0.f(2);
        this.i0.e(charSequence);
    }

    public final void X() {
        FingerprintManager f10;
        FingerprintManager f11;
        if (this.i0.m) {
            return;
        }
        if (n() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        a0 a0Var = this.i0;
        int i10 = 1;
        a0Var.m = true;
        a0Var.n = true;
        int i11 = 4;
        char c3 = 0;
        CharSequence charSequence = null;
        r5 = null;
        r5 = null;
        r5 = null;
        e eVar = null;
        if (!R()) {
            BiometricPrompt.Builder d = m.d(K().getApplicationContext());
            a0 a0Var2 = this.i0;
            x5.k kVar = a0Var2.f;
            CharSequence charSequence2 = kVar != null ? (CharSequence) kVar.b : null;
            a0Var2.getClass();
            x5.k kVar2 = this.i0.f;
            CharSequence charSequence3 = kVar2 != null ? (CharSequence) kVar2.c : null;
            if (charSequence2 != null) {
                m.g(d, charSequence2);
            }
            if (charSequence3 != null) {
                m.e(d, charSequence3);
            }
            a0 a0Var3 = this.i0;
            String str = a0Var3.k;
            if (str != null) {
                charSequence = str;
            } else {
                x5.k kVar3 = a0Var3.f;
                if (kVar3 != null && (charSequence = (CharSequence) kVar3.d) == null) {
                    charSequence = "";
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                Executor executor = this.i0.d;
                if (executor == null) {
                    executor = new p(1);
                }
                a0 a0Var4 = this.i0;
                if (a0Var4.j == null) {
                    a0Var4.j = new z(a0Var4);
                }
                m.f(d, charSequence, executor, a0Var4.j);
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29) {
                x5.k kVar4 = this.i0.f;
                n.a(d, true);
            }
            int c10 = this.i0.c();
            if (i12 >= 30) {
                o.a(d, c10);
            } else if (i12 >= 29) {
                n.b(d, com.google.android.gms.internal.cast.n.a(c10));
            }
            BiometricPrompt c11 = m.c(d);
            Context n10 = n();
            BiometricPrompt.CryptoObject c12 = ee.b.c(this.i0.g);
            a0 a0Var5 = this.i0;
            if (a0Var5.i == null) {
                a0Var5.i = new bf.b(c3, i11);
            }
            bf.b bVar = a0Var5.i;
            if (((CancellationSignal) bVar.b) == null) {
                bVar.b = b0.b();
            }
            CancellationSignal cancellationSignal = (CancellationSignal) bVar.b;
            p pVar = new p(0);
            a0 a0Var6 = this.i0;
            if (a0Var6.h == null) {
                a0Var6.h = new e(new y(a0Var6));
            }
            e eVar2 = a0Var6.h;
            if (((BiometricPrompt.AuthenticationCallback) eVar2.b) == null) {
                eVar2.b = b.a((y) eVar2.d);
            }
            BiometricPrompt.AuthenticationCallback authenticationCallback = (BiometricPrompt.AuthenticationCallback) eVar2.b;
            try {
                if (c12 == null) {
                    m.b(c11, cancellationSignal, pVar, authenticationCallback);
                } else {
                    m.a(c11, c12, cancellationSignal, pVar, authenticationCallback);
                }
                return;
            } catch (NullPointerException e) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e);
                T(1, n10 != null ? n10.getString(R.string.default_error_msg) : "");
                return;
            }
        }
        Context applicationContext = K().getApplicationContext();
        y5.h hVar = new y5.h(applicationContext, 1);
        int i13 = Build.VERSION.SDK_INT;
        int i14 = (i13 < 23 || (f10 = e0.b.f(applicationContext)) == null || !e0.b.n(f10)) ? 12 : (i13 < 23 || (f11 = e0.b.f(applicationContext)) == null || !e0.b.k(f11)) ? 11 : 0;
        if (i14 != 0) {
            T(i14, h7.s.a(applicationContext, i14));
            return;
        }
        if (t()) {
            this.i0.w = true;
            String str2 = Build.MODEL;
            if (i13 == 28 && str2 != null) {
                for (String str3 : applicationContext.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                    if (str2.startsWith(str3)) {
                        break;
                    }
                }
            }
            this.h0.postDelayed(new h(this, 1), 500L);
            i0 i0Var = new i0();
            androidx.fragment.app.j0 p10 = p();
            i0Var.u0 = false;
            i0Var.v0 = true;
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(p10);
            aVar.o = true;
            aVar.f(0, i0Var, "androidx.biometric.FingerprintDialogFragment");
            aVar.e(false, true);
            a0 a0Var7 = this.i0;
            a0Var7.l = 0;
            w wVar = a0Var7.g;
            if (wVar != null) {
                Cipher cipher = wVar.b;
                if (cipher != null) {
                    eVar = new e(cipher);
                } else {
                    Signature signature = wVar.a;
                    if (signature != null) {
                        eVar = new e(signature);
                    } else {
                        Mac mac = wVar.c;
                        if (mac != null) {
                            eVar = new e(mac);
                        } else if (Build.VERSION.SDK_INT >= 30 && wVar.d != null) {
                            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                        }
                    }
                }
            }
            a0 a0Var8 = this.i0;
            if (a0Var8.i == null) {
                a0Var8.i = new bf.b(c3, i11);
            }
            bf.b bVar2 = a0Var8.i;
            if (((c2.u) bVar2.c) == null) {
                bVar2.c = new c2.u(3);
            }
            c2.u uVar = (c2.u) bVar2.c;
            a0 a0Var9 = this.i0;
            if (a0Var9.h == null) {
                a0Var9.h = new e(new y(a0Var9));
            }
            e eVar3 = a0Var9.h;
            if (((o5.i) eVar3.c) == null) {
                eVar3.c = new o5.i(eVar3, i10);
            }
            try {
                hVar.a(eVar, uVar, (o5.i) eVar3.c);
            } catch (NullPointerException e6) {
                Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e6);
                T(1, h7.s.a(applicationContext, 1));
            }
        }
    }

    @Override // androidx.fragment.app.s
    public final void x(int i10, int i11, Intent intent) {
        super.x(i10, i11, intent);
        if (i10 == 1) {
            this.i0.o = false;
            if (i11 == -1) {
                V(new v(null, 1));
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
        a0 a0Var = (a0) new e(k()).n(a0.class);
        this.i0 = a0Var;
        if (a0Var.r == null) {
            a0Var.r = new androidx.lifecycle.z();
        }
        a0Var.r.d(this, new i(this, 0));
        a0 a0Var2 = this.i0;
        if (a0Var2.s == null) {
            a0Var2.s = new androidx.lifecycle.z();
        }
        a0Var2.s.d(this, new j(this, 0));
        a0 a0Var3 = this.i0;
        if (a0Var3.t == null) {
            a0Var3.t = new androidx.lifecycle.z();
        }
        a0Var3.t.d(this, new ja.c(this, 1));
        a0 a0Var4 = this.i0;
        if (a0Var4.u == null) {
            a0Var4.u = new androidx.lifecycle.z();
        }
        a0Var4.u.d(this, new o5.i(this, 2));
        a0 a0Var5 = this.i0;
        if (a0Var5.v == null) {
            a0Var5.v = new androidx.lifecycle.z();
        }
        a0Var5.v.d(this, new i(this, 1));
        a0 a0Var6 = this.i0;
        if (a0Var6.x == null) {
            a0Var6.x = new androidx.lifecycle.z();
        }
        a0Var6.x.d(this, new j(this, 1));
    }
}
