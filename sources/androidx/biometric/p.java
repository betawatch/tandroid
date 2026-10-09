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
import androidx.fragment.app.k0;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class p extends androidx.fragment.app.s {
    public final Handler k0 = new Handler(Looper.getMainLooper());
    public x l0;

    @Override // androidx.fragment.app.s
    public final void H() {
        this.U = true;
        if (Build.VERSION.SDK_INT == 29 && te.b.b(this.l0.c())) {
            x xVar = this.l0;
            xVar.q = true;
            this.k0.postDelayed(new o(xVar, 2), 250L);
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
            x xVar = this.l0;
            if (xVar.i == null) {
                xVar.i = new pf.b(3, false);
            }
            pf.b bVar = xVar.i;
            CancellationSignal cancellationSignal = (CancellationSignal) bVar.b;
            if (cancellationSignal != null) {
                try {
                    y.a(cancellationSignal);
                } catch (NullPointerException e7) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e7);
                }
                bVar.b = null;
            }
            b2.p pVar = (b2.p) bVar.c;
            if (pVar != null) {
                try {
                    pVar.e();
                } catch (NullPointerException e10) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e10);
                }
                bVar.c = null;
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
                        x xVar = this.l0;
                        xVar.p = true;
                        this.k0.postDelayed(new o(xVar, 1), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void P() {
        this.l0.m = false;
        if (t()) {
            k0 p5 = p();
            e0 e0Var = (e0) p5.D("androidx.biometric.FingerprintDialogFragment");
            if (e0Var != null) {
                if (e0Var.t()) {
                    e0Var.N(false);
                    return;
                }
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(p5);
                aVar.h(e0Var);
                aVar.e(true, true);
            }
        }
    }

    public final boolean Q() {
        return Build.VERSION.SDK_INT <= 28 && te.b.b(this.l0.c());
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
            return n10 == null || n10.getPackageManager() == null || !g0.a(n10.getPackageManager());
        }
        return true;
    }

    public final void S() {
        androidx.fragment.app.v k10 = k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager a2 = f0.a(k10);
        if (a2 == null) {
            T(12, q(R.string.generic_error_no_keyguard));
            return;
        }
        x xVar = this.l0;
        j6.l lVar = xVar.f;
        CharSequence charSequence = lVar != null ? (CharSequence) lVar.b : null;
        xVar.getClass();
        j6.l lVar2 = this.l0.f;
        Intent a10 = j.a(a2, charSequence, lVar2 != null ? (CharSequence) lVar2.c : null);
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
        x xVar = this.l0;
        if (xVar.o) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
            return;
        }
        if (!xVar.n) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        xVar.n = false;
        Executor executor = xVar.d;
        if (executor == null) {
            executor = new n(1);
        }
        executor.execute(new f(this, i10, charSequence, 0));
    }

    public final void V(s sVar) {
        x xVar = this.l0;
        if (xVar.n) {
            xVar.n = false;
            Executor executor = xVar.d;
            if (executor == null) {
                executor = new n(1);
            }
            executor.execute(new i9.s(this, sVar, false, 2));
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
        x xVar = this.l0;
        xVar.m = true;
        xVar.n = true;
        int i11 = 3;
        boolean z10 = false;
        CharSequence charSequence = null;
        r5 = null;
        r5 = null;
        r5 = null;
        aa.a aVar = null;
        if (!R()) {
            BiometricPrompt.Builder d = k.d(K().getApplicationContext());
            x xVar2 = this.l0;
            j6.l lVar = xVar2.f;
            CharSequence charSequence2 = lVar != null ? (CharSequence) lVar.b : null;
            xVar2.getClass();
            j6.l lVar2 = this.l0.f;
            CharSequence charSequence3 = lVar2 != null ? (CharSequence) lVar2.c : null;
            if (charSequence2 != null) {
                k.g(d, charSequence2);
            }
            if (charSequence3 != null) {
                k.e(d, charSequence3);
            }
            x xVar3 = this.l0;
            String str = xVar3.k;
            if (str != null) {
                charSequence = str;
            } else {
                j6.l lVar3 = xVar3.f;
                if (lVar3 != null && (charSequence = (CharSequence) lVar3.d) == null) {
                    charSequence = "";
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                Executor executor = this.l0.d;
                if (executor == null) {
                    executor = new n(1);
                }
                x xVar4 = this.l0;
                if (xVar4.j == null) {
                    xVar4.j = new w(xVar4);
                }
                k.f(d, charSequence, executor, xVar4.j);
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29) {
                j6.l lVar4 = this.l0.f;
                l.a(d, true);
            }
            int c10 = this.l0.c();
            if (i12 >= 30) {
                m.a(d, c10);
            } else if (i12 >= 29) {
                l.b(d, te.b.b(c10));
            }
            BiometricPrompt c11 = k.c(d);
            Context n10 = n();
            BiometricPrompt.CryptoObject b10 = v7.m.b(this.l0.g);
            x xVar5 = this.l0;
            if (xVar5.i == null) {
                xVar5.i = new pf.b(i11, z10);
            }
            pf.b bVar = xVar5.i;
            if (((CancellationSignal) bVar.b) == null) {
                bVar.b = y.b();
            }
            CancellationSignal cancellationSignal = (CancellationSignal) bVar.b;
            n nVar = new n(0);
            x xVar6 = this.l0;
            if (xVar6.h == null) {
                xVar6.h = new aa.a(new v(xVar6));
            }
            aa.a aVar2 = xVar6.h;
            if (((BiometricPrompt$AuthenticationCallback) aVar2.b) == null) {
                aVar2.b = b.a((v) aVar2.d);
            }
            BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = (BiometricPrompt$AuthenticationCallback) aVar2.b;
            try {
                if (b10 == null) {
                    k.b(c11, cancellationSignal, nVar, biometricPrompt$AuthenticationCallback);
                } else {
                    k.a(c11, b10, cancellationSignal, nVar, biometricPrompt$AuthenticationCallback);
                }
                return;
            } catch (NullPointerException e7) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e7);
                T(1, n10 != null ? n10.getString(R.string.default_error_msg) : "");
                return;
            }
        }
        Context applicationContext = K().getApplicationContext();
        k0.b bVar2 = new k0.b(applicationContext);
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
            this.k0.postDelayed(new g(this, 1), 500L);
            e0 e0Var = new e0();
            k0 p5 = p();
            e0Var.x0 = false;
            e0Var.y0 = true;
            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(p5);
            aVar3.o = true;
            aVar3.f(0, e0Var, "androidx.biometric.FingerprintDialogFragment");
            aVar3.e(false, true);
            x xVar7 = this.l0;
            xVar7.l = 0;
            t tVar = xVar7.g;
            if (tVar != null) {
                Cipher cipher = tVar.b;
                if (cipher != null) {
                    aVar = new aa.a(cipher);
                } else {
                    Signature signature = tVar.a;
                    if (signature != null) {
                        aVar = new aa.a(signature);
                    } else {
                        Mac mac = tVar.c;
                        if (mac != null) {
                            aVar = new aa.a(mac);
                        } else if (Build.VERSION.SDK_INT >= 30 && tVar.d != null) {
                            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                        }
                    }
                }
            }
            x xVar8 = this.l0;
            if (xVar8.i == null) {
                xVar8.i = new pf.b(i11, z10);
            }
            pf.b bVar3 = xVar8.i;
            if (((b2.p) bVar3.c) == null) {
                bVar3.c = new b2.p(3);
            }
            b2.p pVar = (b2.p) bVar3.c;
            x xVar9 = this.l0;
            if (xVar9.h == null) {
                xVar9.h = new aa.a(new v(xVar9));
            }
            aa.a aVar4 = xVar9.h;
            if (((pb.c) aVar4.c) == null) {
                aVar4.c = new pb.c(aVar4, i11);
            }
            try {
                bVar2.a(aVar, pVar, (pb.c) aVar4.c);
            } catch (NullPointerException e10) {
                Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e10);
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
                V(new s(null, 1));
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
        x xVar = (x) new aa.a(k()).j(x.class);
        this.l0 = xVar;
        if (xVar.r == null) {
            xVar.r = new androidx.lifecycle.z();
        }
        xVar.r.d(this, new h(this, 0));
        x xVar2 = this.l0;
        if (xVar2.s == null) {
            xVar2.s = new androidx.lifecycle.z();
        }
        xVar2.s.d(this, new i(this, 0));
        x xVar3 = this.l0;
        if (xVar3.t == null) {
            xVar3.t = new androidx.lifecycle.z();
        }
        xVar3.t.d(this, new a4.l(this, 1));
        x xVar4 = this.l0;
        if (xVar4.u == null) {
            xVar4.u = new androidx.lifecycle.z();
        }
        xVar4.u.d(this, new pb.c(this, 4));
        x xVar5 = this.l0;
        if (xVar5.v == null) {
            xVar5.v = new androidx.lifecycle.z();
        }
        xVar5.v.d(this, new h(this, 1));
        x xVar6 = this.l0;
        if (xVar6.x == null) {
            xVar6.x = new androidx.lifecycle.z();
        }
        xVar6.x.d(this, new i(this, 1));
    }
}
