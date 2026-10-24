package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.j0;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public class q extends androidx.fragment.app.s {
    public final Handler k0 = new Handler(Looper.getMainLooper());
    public y l0;

    @Override // androidx.fragment.app.s
    public final void H() {
        this.U = true;
        if (Build.VERSION.SDK_INT == 29 && v7.k.a(this.l0.c())) {
            y yVar = this.l0;
            yVar.q = true;
            this.k0.postDelayed(new p(yVar, 2), 250L);
        }
    }

    @Override // androidx.fragment.app.s
    public final void I() {
        this.U = true;
        if (Build.VERSION.SDK_INT >= 29 || this.l0.o) {
            return;
        }
        androidx.fragment.app.v k10 = k();
        if (k10 == null || !k10.isChangingConfigurations()) {
            N(0);
        }
    }

    public final void N(int i10) {
        if (i10 == 3 || !this.l0.q) {
            if (R()) {
                this.l0.l = i10;
                if (i10 == 1) {
                    U(10, v7.n.a(n(), 10));
                }
            }
            y yVar = this.l0;
            if (yVar.i == null) {
                yVar.i = new n4.s(5, false);
            }
            n4.s sVar = yVar.i;
            CancellationSignal cancellationSignal = (CancellationSignal) sVar.b;
            if (cancellationSignal != null) {
                try {
                    z.a(cancellationSignal);
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                sVar.b = null;
            }
            b2.t tVar = (b2.t) sVar.c;
            if (tVar != null) {
                try {
                    tVar.e();
                } catch (NullPointerException e7) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e7);
                }
                sVar.c = null;
            }
        }
    }

    public final void O() {
        this.l0.m = false;
        P();
        if (!this.l0.o && t()) {
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
                        y yVar = this.l0;
                        yVar.p = true;
                        this.k0.postDelayed(new p(yVar, 1), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void P() {
        this.l0.m = false;
        if (t()) {
            j0 p5 = p();
            f0 f0Var = (f0) p5.D("androidx.biometric.FingerprintDialogFragment");
            if (f0Var != null) {
                if (f0Var.t()) {
                    f0Var.N(false);
                    return;
                }
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(p5);
                aVar.h(f0Var);
                aVar.e(true, true);
            }
        }
    }

    public final boolean Q() {
        return Build.VERSION.SDK_INT <= 28 && v7.k.a(this.l0.c());
    }

    public final boolean R() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            androidx.fragment.app.v k10 = k();
            if (k10 != null && this.l0.g != null) {
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
            if (Build.VERSION.SDK_INT != 28) {
                return false;
            }
            Context n10 = n();
            return n10 == null || n10.getPackageManager() == null || !h0.a(n10.getPackageManager());
        }
        return true;
    }

    public final void S() {
        androidx.fragment.app.v k10 = k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager a2 = g0.a(k10);
        if (a2 == null) {
            T(12, q(R.string.generic_error_no_keyguard));
            return;
        }
        y yVar = this.l0;
        j6.l lVar = yVar.f;
        CharSequence charSequence = lVar != null ? (CharSequence) lVar.b : null;
        yVar.getClass();
        j6.l lVar2 = this.l0.f;
        Intent a10 = k.a(a2, charSequence, lVar2 != null ? (CharSequence) lVar2.c : null);
        if (a10 == null) {
            T(14, q(R.string.generic_error_no_device_credential));
            return;
        }
        this.l0.o = true;
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
        y yVar = this.l0;
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
            executor = new o(1);
        }
        executor.execute(new g(this, i10, charSequence, 0));
    }

    public final void V(t tVar) {
        y yVar = this.l0;
        if (yVar.n) {
            yVar.n = false;
            Executor executor = yVar.d;
            if (executor == null) {
                executor = new o(1);
            }
            executor.execute(new j9.u(this, tVar, false, 1));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        O();
    }

    public final void W(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = q(R.string.default_error_msg);
        }
        this.l0.f(2);
        this.l0.e(charSequence);
    }

    public final void X() {
        int i10;
        if (this.l0.m) {
            return;
        }
        if (n() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        y yVar = this.l0;
        yVar.m = true;
        yVar.n = true;
        int i11 = 5;
        boolean z10 = false;
        CharSequence charSequence = null;
        r5 = null;
        r5 = null;
        r5 = null;
        e eVar = null;
        if (!R()) {
            BiometricPrompt.Builder d = l.d(K().getApplicationContext());
            y yVar2 = this.l0;
            j6.l lVar = yVar2.f;
            CharSequence charSequence2 = lVar != null ? (CharSequence) lVar.b : null;
            yVar2.getClass();
            j6.l lVar2 = this.l0.f;
            CharSequence charSequence3 = lVar2 != null ? (CharSequence) lVar2.c : null;
            if (charSequence2 != null) {
                l.g(d, charSequence2);
            }
            if (charSequence3 != null) {
                l.e(d, charSequence3);
            }
            y yVar3 = this.l0;
            String str = yVar3.k;
            if (str != null) {
                charSequence = str;
            } else {
                j6.l lVar3 = yVar3.f;
                if (lVar3 != null && (charSequence = (CharSequence) lVar3.d) == null) {
                    charSequence = "";
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                Executor executor = this.l0.d;
                if (executor == null) {
                    executor = new o(1);
                }
                y yVar4 = this.l0;
                if (yVar4.j == null) {
                    yVar4.j = new x(yVar4);
                }
                l.f(d, charSequence, executor, yVar4.j);
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29) {
                j6.l lVar4 = this.l0.f;
                m.a(d, true);
            }
            int c10 = this.l0.c();
            if (i12 >= 30) {
                n.a(d, c10);
            } else if (i12 >= 29) {
                m.b(d, v7.k.a(c10));
            }
            BiometricPrompt c11 = l.c(d);
            Context n10 = n();
            BiometricPrompt.CryptoObject b10 = v7.m.b(this.l0.g);
            y yVar5 = this.l0;
            if (yVar5.i == null) {
                yVar5.i = new n4.s(i11, z10);
            }
            n4.s sVar = yVar5.i;
            if (((CancellationSignal) sVar.b) == null) {
                sVar.b = z.b();
            }
            CancellationSignal cancellationSignal = (CancellationSignal) sVar.b;
            o oVar = new o(0);
            y yVar6 = this.l0;
            if (yVar6.h == null) {
                yVar6.h = new e(new w(yVar6));
            }
            e eVar2 = yVar6.h;
            if (((BiometricPrompt$AuthenticationCallback) eVar2.b) == null) {
                eVar2.b = b.a((w) eVar2.d);
            }
            BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = (BiometricPrompt$AuthenticationCallback) eVar2.b;
            try {
                if (b10 == null) {
                    l.b(c11, cancellationSignal, oVar, biometricPrompt$AuthenticationCallback);
                } else {
                    l.a(c11, b10, cancellationSignal, oVar, biometricPrompt$AuthenticationCallback);
                }
                return;
            } catch (NullPointerException e) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e);
                T(1, n10 != null ? n10.getString(R.string.default_error_msg) : "");
                return;
            }
        }
        Context applicationContext = K().getApplicationContext();
        k0.b bVar = new k0.b(applicationContext);
        FingerprintManager b11 = k0.b.b(applicationContext);
        if (b11 == null || !b11.isHardwareDetected()) {
            i10 = 12;
        } else {
            FingerprintManager b12 = k0.b.b(applicationContext);
            i10 = (b12 == null || !b12.hasEnrolledFingerprints()) ? 11 : 0;
        }
        if (i10 != 0) {
            T(i10, v7.n.a(applicationContext, i10));
            return;
        }
        if (t()) {
            this.l0.w = true;
            String str2 = Build.MODEL;
            if (Build.VERSION.SDK_INT == 28 && str2 != null) {
                for (String str3 : applicationContext.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                    if (str2.startsWith(str3)) {
                        break;
                    }
                }
            }
            this.k0.postDelayed(new h(this, 1), 500L);
            f0 f0Var = new f0();
            j0 p5 = p();
            f0Var.x0 = false;
            f0Var.y0 = true;
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(p5);
            aVar.o = true;
            aVar.f(0, f0Var, "androidx.biometric.FingerprintDialogFragment");
            aVar.e(false, true);
            y yVar7 = this.l0;
            yVar7.l = 0;
            u uVar = yVar7.g;
            if (uVar != null) {
                Cipher cipher = uVar.b;
                if (cipher != null) {
                    eVar = new e(cipher);
                } else {
                    Signature signature = uVar.a;
                    if (signature != null) {
                        eVar = new e(signature);
                    } else {
                        Mac mac = uVar.c;
                        if (mac != null) {
                            eVar = new e(mac);
                        } else if (Build.VERSION.SDK_INT >= 30 && uVar.d != null) {
                            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                        }
                    }
                }
            }
            y yVar8 = this.l0;
            if (yVar8.i == null) {
                yVar8.i = new n4.s(i11, z10);
            }
            n4.s sVar2 = yVar8.i;
            if (((b2.t) sVar2.c) == null) {
                sVar2.c = new b2.t(3);
            }
            b2.t tVar = (b2.t) sVar2.c;
            y yVar9 = this.l0;
            if (yVar9.h == null) {
                yVar9.h = new e(new w(yVar9));
            }
            e eVar3 = yVar9.h;
            if (((qb.c) eVar3.c) == null) {
                eVar3.c = new qb.c(eVar3, 4);
            }
            try {
                bVar.a(eVar, tVar, (qb.c) eVar3.c);
            } catch (NullPointerException e7) {
                Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e7);
                T(1, v7.n.a(applicationContext, 1));
            }
        }
    }

    @Override // androidx.fragment.app.s
    public final void x(int i10, int i11, Intent intent) {
        super.x(i10, i11, intent);
        if (i10 == 1) {
            this.l0.o = false;
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
        y yVar = (y) new e(k()).j(y.class);
        this.l0 = yVar;
        if (yVar.r == null) {
            yVar.r = new androidx.lifecycle.z();
        }
        yVar.r.d(this, new i(this, 0));
        y yVar2 = this.l0;
        if (yVar2.s == null) {
            yVar2.s = new androidx.lifecycle.z();
        }
        yVar2.s.d(this, new j(this, 0));
        y yVar3 = this.l0;
        if (yVar3.t == null) {
            yVar3.t = new androidx.lifecycle.z();
        }
        yVar3.t.d(this, new a4.l(this, 3));
        y yVar4 = this.l0;
        if (yVar4.u == null) {
            yVar4.u = new androidx.lifecycle.z();
        }
        yVar4.u.d(this, new qb.c(this, 5));
        y yVar5 = this.l0;
        if (yVar5.v == null) {
            yVar5.v = new androidx.lifecycle.z();
        }
        yVar5.v.d(this, new i(this, 1));
        y yVar6 = this.l0;
        if (yVar6.x == null) {
            yVar6.x = new androidx.lifecycle.z();
        }
        yVar6.x.d(this, new j(this, 1));
    }
}
