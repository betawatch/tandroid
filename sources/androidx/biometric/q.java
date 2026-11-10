package androidx.biometric;

import a8.k1;
import a8.m1;
import a8.n1;
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
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class q extends androidx.fragment.app.r {
    public final Handler k0 = new Handler(Looper.getMainLooper());
    public z l0;

    @Override // androidx.fragment.app.r
    public final void H() {
        this.U = true;
        if (Build.VERSION.SDK_INT == 29 && k1.a(this.l0.c())) {
            z zVar = this.l0;
            zVar.q = true;
            this.k0.postDelayed(new p(zVar, 2), 250L);
        }
    }

    @Override // androidx.fragment.app.r
    public final void I() {
        this.U = true;
        if (Build.VERSION.SDK_INT >= 29 || this.l0.o) {
            return;
        }
        androidx.fragment.app.u k10 = k();
        if (k10 == null || !k10.isChangingConfigurations()) {
            N(0);
        }
    }

    public final void N(int i7) {
        if (i7 == 3 || !this.l0.q) {
            if (R()) {
                this.l0.l = i7;
                if (i7 == 1) {
                    U(10, n1.a(n(), 10));
                }
            }
            z zVar = this.l0;
            if (zVar.i == null) {
                zVar.i = new q4.q(6, false);
            }
            q4.q qVar = zVar.i;
            CancellationSignal cancellationSignal = (CancellationSignal) qVar.b;
            if (cancellationSignal != null) {
                try {
                    a0.a(cancellationSignal);
                } catch (NullPointerException e10) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e10);
                }
                qVar.b = null;
            }
            ca.i iVar = (ca.i) qVar.c;
            if (iVar != null) {
                try {
                    iVar.e();
                } catch (NullPointerException e11) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e11);
                }
                qVar.c = null;
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
                        z zVar = this.l0;
                        zVar.p = true;
                        this.k0.postDelayed(new p(zVar, 1), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void P() {
        this.l0.m = false;
        if (t()) {
            androidx.fragment.app.i0 p10 = p();
            g0 g0Var = (g0) p10.D("androidx.biometric.FingerprintDialogFragment");
            if (g0Var != null) {
                if (g0Var.t()) {
                    g0Var.N(false);
                    return;
                }
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(p10);
                aVar.h(g0Var);
                aVar.e(true, true);
            }
        }
    }

    public final boolean Q() {
        return Build.VERSION.SDK_INT <= 28 && k1.a(this.l0.c());
    }

    public final boolean R() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            androidx.fragment.app.u k10 = k();
            if (k10 != null && this.l0.g != null) {
                String str = Build.MANUFACTURER;
                String str2 = Build.MODEL;
                if (i7 == 28) {
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
            return n10 == null || n10.getPackageManager() == null || !i0.a(n10.getPackageManager());
        }
        return true;
    }

    public final void S() {
        androidx.fragment.app.u k10 = k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager a10 = h0.a(k10);
        if (a10 == null) {
            T(12, q(R.string.generic_error_no_keyguard));
            return;
        }
        z zVar = this.l0;
        m6.n nVar = zVar.f;
        CharSequence charSequence = nVar != null ? (CharSequence) nVar.b : null;
        zVar.getClass();
        m6.n nVar2 = this.l0.f;
        Intent intent = k.a(a10, charSequence, nVar2 != null ? (CharSequence) nVar2.c : null);
        if (intent == null) {
            T(14, q(R.string.generic_error_no_device_credential));
            return;
        }
        this.l0.o = true;
        if (R()) {
            P();
        }
        intent.setFlags(134742016);
        if (this.K == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        androidx.fragment.app.i0 p10 = p();
        if (p10.C == null) {
            p10.w.getClass();
            kotlin.jvm.internal.j.e(intent, "intent");
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        String str = this.e;
        androidx.fragment.app.e0 e0Var = new androidx.fragment.app.e0();
        e0Var.a = str;
        e0Var.b = 1;
        p10.F.addLast(e0Var);
        p10.C.a(intent);
    }

    public final void T(int i7, CharSequence charSequence) {
        U(i7, charSequence);
        O();
    }

    public final void U(int i7, CharSequence charSequence) {
        z zVar = this.l0;
        if (zVar.o) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
            return;
        }
        if (!zVar.n) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        zVar.n = false;
        Executor executor = zVar.d;
        if (executor == null) {
            executor = new o(1);
        }
        executor.execute(new f(this, i7, charSequence, 0));
    }

    public final void V(u uVar) {
        z zVar = this.l0;
        if (zVar.n) {
            zVar.n = false;
            Executor executor = zVar.d;
            if (executor == null) {
                executor = new o(1);
            }
            executor.execute(new m9.u(this, uVar, false, 7));
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
        int i7;
        if (this.l0.m) {
            return;
        }
        if (n() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        z zVar = this.l0;
        zVar.m = true;
        zVar.n = true;
        int i10 = 6;
        boolean z9 = false;
        CharSequence charSequence = null;
        r5 = null;
        r5 = null;
        r5 = null;
        h6.m mVar = null;
        if (!R()) {
            BiometricPrompt.Builder d = l.d(K().getApplicationContext());
            z zVar2 = this.l0;
            m6.n nVar = zVar2.f;
            CharSequence charSequence2 = nVar != null ? (CharSequence) nVar.b : null;
            zVar2.getClass();
            m6.n nVar2 = this.l0.f;
            CharSequence charSequence3 = nVar2 != null ? (CharSequence) nVar2.c : null;
            if (charSequence2 != null) {
                l.g(d, charSequence2);
            }
            if (charSequence3 != null) {
                l.e(d, charSequence3);
            }
            z zVar3 = this.l0;
            String str = zVar3.k;
            if (str != null) {
                charSequence = str;
            } else {
                m6.n nVar3 = zVar3.f;
                if (nVar3 != null && (charSequence = (CharSequence) nVar3.d) == null) {
                    charSequence = "";
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                Executor executor = this.l0.d;
                if (executor == null) {
                    executor = new o(1);
                }
                z zVar4 = this.l0;
                if (zVar4.j == null) {
                    zVar4.j = new y(zVar4);
                }
                l.f(d, charSequence, executor, zVar4.j);
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                m6.n nVar4 = this.l0.f;
                m.a(d, true);
            }
            int c10 = this.l0.c();
            if (i11 >= 30) {
                n.a(d, c10);
            } else if (i11 >= 29) {
                m.b(d, k1.a(c10));
            }
            BiometricPrompt c11 = l.c(d);
            Context n10 = n();
            BiometricPrompt.CryptoObject b10 = m1.b(this.l0.g);
            z zVar5 = this.l0;
            if (zVar5.i == null) {
                zVar5.i = new q4.q(i10, z9);
            }
            q4.q qVar = zVar5.i;
            if (((CancellationSignal) qVar.b) == null) {
                qVar.b = a0.b();
            }
            CancellationSignal cancellationSignal = (CancellationSignal) qVar.b;
            o oVar = new o(0);
            z zVar6 = this.l0;
            if (zVar6.h == null) {
                zVar6.h = new android.support.v4.media.session.a0(new x(zVar6));
            }
            android.support.v4.media.session.a0 a0Var = zVar6.h;
            if (((BiometricPrompt$AuthenticationCallback) a0Var.b) == null) {
                a0Var.b = b.a((x) a0Var.d);
            }
            BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = (BiometricPrompt$AuthenticationCallback) a0Var.b;
            try {
                if (b10 == null) {
                    l.b(c11, cancellationSignal, oVar, biometricPrompt$AuthenticationCallback);
                } else {
                    l.a(c11, b10, cancellationSignal, oVar, biometricPrompt$AuthenticationCallback);
                }
                return;
            } catch (NullPointerException e10) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e10);
                T(1, n10 != null ? n10.getString(R.string.default_error_msg) : "");
                return;
            }
        }
        Context applicationContext = K().getApplicationContext();
        k0.b bVar = new k0.b(applicationContext, false);
        FingerprintManager d2 = k0.b.d(applicationContext);
        if (d2 == null || !d2.isHardwareDetected()) {
            i7 = 12;
        } else {
            FingerprintManager d10 = k0.b.d(applicationContext);
            i7 = (d10 == null || !d10.hasEnrolledFingerprints()) ? 11 : 0;
        }
        if (i7 != 0) {
            T(i7, n1.a(applicationContext, i7));
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
            g0 g0Var = new g0();
            androidx.fragment.app.i0 p10 = p();
            g0Var.x0 = false;
            g0Var.y0 = true;
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(p10);
            aVar.o = true;
            aVar.f(0, g0Var, "androidx.biometric.FingerprintDialogFragment");
            aVar.e(false, true);
            z zVar7 = this.l0;
            zVar7.l = 0;
            v vVar = zVar7.g;
            if (vVar != null) {
                Cipher cipher = vVar.b;
                if (cipher != null) {
                    mVar = new h6.m(cipher);
                } else {
                    Signature signature = vVar.a;
                    if (signature != null) {
                        mVar = new h6.m(signature);
                    } else {
                        Mac mac = vVar.c;
                        if (mac != null) {
                            mVar = new h6.m(mac);
                        } else if (Build.VERSION.SDK_INT >= 30 && vVar.d != null) {
                            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                        }
                    }
                }
            }
            z zVar8 = this.l0;
            if (zVar8.i == null) {
                zVar8.i = new q4.q(i10, z9);
            }
            q4.q qVar2 = zVar8.i;
            if (((ca.i) qVar2.c) == null) {
                qVar2.c = new ca.i(4);
            }
            ca.i iVar = (ca.i) qVar2.c;
            z zVar9 = this.l0;
            if (zVar9.h == null) {
                zVar9.h = new android.support.v4.media.session.a0(new x(zVar9));
            }
            android.support.v4.media.session.a0 a0Var2 = zVar9.h;
            if (((d6.i) a0Var2.c) == null) {
                a0Var2.c = new d6.i(a0Var2, 5);
            }
            try {
                bVar.a(mVar, iVar, (d6.i) a0Var2.c);
            } catch (NullPointerException e11) {
                Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e11);
                T(1, n1.a(applicationContext, 1));
            }
        }
    }

    @Override // androidx.fragment.app.r
    public final void x(int i7, int i10, Intent intent) {
        super.x(i7, i10, intent);
        if (i7 == 1) {
            this.l0.o = false;
            if (i10 == -1) {
                V(new u(null, 1));
            } else {
                T(10, q(R.string.generic_error_user_canceled));
            }
        }
    }

    @Override // androidx.fragment.app.r
    public final void z(Bundle bundle) {
        super.z(bundle);
        if (k() == null) {
            return;
        }
        z zVar = (z) new android.support.v4.media.session.a0(k()).i(z.class);
        this.l0 = zVar;
        if (zVar.r == null) {
            zVar.r = new androidx.lifecycle.z();
        }
        zVar.r.d(this, new h(this, 0));
        z zVar2 = this.l0;
        if (zVar2.s == null) {
            zVar2.s = new androidx.lifecycle.z();
        }
        zVar2.s.d(this, new i(this, 0));
        z zVar3 = this.l0;
        if (zVar3.t == null) {
            zVar3.t = new androidx.lifecycle.z();
        }
        zVar3.t.d(this, new j(this, 0));
        z zVar4 = this.l0;
        if (zVar4.u == null) {
            zVar4.u = new androidx.lifecycle.z();
        }
        zVar4.u.d(this, new h(this, 1));
        z zVar5 = this.l0;
        if (zVar5.v == null) {
            zVar5.v = new androidx.lifecycle.z();
        }
        zVar5.v.d(this, new i(this, 1));
        z zVar6 = this.l0;
        if (zVar6.x == null) {
            zVar6.x = new androidx.lifecycle.z();
        }
        zVar6.x.d(this, new j(this, 1));
    }
}
