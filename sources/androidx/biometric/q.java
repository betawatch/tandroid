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
import b8.k0;
import b8.m0;
import b8.n0;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class q extends androidx.fragment.app.s {
    public final Handler l0 = new Handler(Looper.getMainLooper());
    public z m0;

    @Override // androidx.fragment.app.s
    public final void H() {
        this.V = true;
        if (Build.VERSION.SDK_INT == 29 && k0.a(this.m0.c())) {
            z zVar = this.m0;
            zVar.q = true;
            this.l0.postDelayed(new p(zVar, 2), 250L);
        }
    }

    @Override // androidx.fragment.app.s
    public final void I() {
        this.V = true;
        if (Build.VERSION.SDK_INT >= 29 || this.m0.o) {
            return;
        }
        androidx.fragment.app.v k10 = k();
        if (k10 == null || !k10.isChangingConfigurations()) {
            N(0);
        }
    }

    public final void N(int i3) {
        if (i3 == 3 || !this.m0.q) {
            if (R()) {
                this.m0.l = i3;
                if (i3 == 1) {
                    U(10, n0.a(n(), 10));
                }
            }
            z zVar = this.m0;
            if (zVar.i == null) {
                zVar.i = new tf.b(2);
            }
            tf.b bVar = zVar.i;
            CancellationSignal cancellationSignal = (CancellationSignal) bVar.a;
            if (cancellationSignal != null) {
                try {
                    a0.a(cancellationSignal);
                } catch (NullPointerException e10) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e10);
                }
                bVar.a = null;
            }
            ba.i iVar = (ba.i) bVar.b;
            if (iVar != null) {
                try {
                    iVar.e();
                } catch (NullPointerException e11) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e11);
                }
                bVar.b = null;
            }
        }
    }

    public final void O() {
        this.m0.m = false;
        P();
        if (!this.m0.o && t()) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(p());
            aVar.h(this);
            aVar.e(true, true);
        }
        Context n4 = n();
        if (n4 != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : n4.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        z zVar = this.m0;
                        zVar.p = true;
                        this.l0.postDelayed(new p(zVar, 1), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void P() {
        this.m0.m = false;
        if (t()) {
            j0 p10 = p();
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
        return Build.VERSION.SDK_INT <= 28 && k0.a(this.m0.c());
    }

    public final boolean R() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            androidx.fragment.app.v k10 = k();
            if (k10 != null && this.m0.g != null) {
                String str = Build.MANUFACTURER;
                String str2 = Build.MODEL;
                if (i3 == 28) {
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
            Context n4 = n();
            return n4 == null || n4.getPackageManager() == null || !i0.a(n4.getPackageManager());
        }
        return true;
    }

    public final void S() {
        androidx.fragment.app.v k10 = k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager a10 = h0.a(k10);
        if (a10 == null) {
            T(12, q(R.string.generic_error_no_keyguard));
            return;
        }
        z zVar = this.m0;
        l6.n nVar = zVar.f;
        CharSequence charSequence = nVar != null ? (CharSequence) nVar.b : null;
        zVar.getClass();
        l6.n nVar2 = this.m0.f;
        Intent intent = k.a(a10, charSequence, nVar2 != null ? (CharSequence) nVar2.c : null);
        if (intent == null) {
            T(14, q(R.string.generic_error_no_device_credential));
            return;
        }
        this.m0.o = true;
        if (R()) {
            P();
        }
        intent.setFlags(134742016);
        if (this.L == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        j0 p10 = p();
        if (p10.C == null) {
            p10.w.getClass();
            kotlin.jvm.internal.j.e(intent, "intent");
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        String str = this.e;
        androidx.fragment.app.f0 f0Var = new androidx.fragment.app.f0();
        f0Var.a = str;
        f0Var.b = 1;
        p10.F.addLast(f0Var);
        p10.C.a(intent);
    }

    public final void T(int i3, CharSequence charSequence) {
        U(i3, charSequence);
        O();
    }

    public final void U(int i3, CharSequence charSequence) {
        z zVar = this.m0;
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
        executor.execute(new f(this, i3, charSequence, 0));
    }

    public final void V(u uVar) {
        z zVar = this.m0;
        if (zVar.n) {
            zVar.n = false;
            Executor executor = zVar.d;
            if (executor == null) {
                executor = new o(1);
            }
            executor.execute(new l9.u(this, uVar, false, 1));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        O();
    }

    public final void W(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = q(R.string.default_error_msg);
        }
        this.m0.f(2);
        this.m0.e(charSequence);
    }

    public final void X() {
        int i3;
        if (this.m0.m) {
            return;
        }
        if (n() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        z zVar = this.m0;
        zVar.m = true;
        zVar.n = true;
        int i10 = 2;
        CharSequence charSequence = null;
        r5 = null;
        r5 = null;
        r5 = null;
        android.support.v4.media.session.a0 a0Var = null;
        if (!R()) {
            BiometricPrompt.Builder d = l.d(K().getApplicationContext());
            z zVar2 = this.m0;
            l6.n nVar = zVar2.f;
            CharSequence charSequence2 = nVar != null ? (CharSequence) nVar.b : null;
            zVar2.getClass();
            l6.n nVar2 = this.m0.f;
            CharSequence charSequence3 = nVar2 != null ? (CharSequence) nVar2.c : null;
            if (charSequence2 != null) {
                l.g(d, charSequence2);
            }
            if (charSequence3 != null) {
                l.e(d, charSequence3);
            }
            z zVar3 = this.m0;
            String str = zVar3.k;
            if (str != null) {
                charSequence = str;
            } else {
                l6.n nVar3 = zVar3.f;
                if (nVar3 != null && (charSequence = (CharSequence) nVar3.d) == null) {
                    charSequence = "";
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                Executor executor = this.m0.d;
                if (executor == null) {
                    executor = new o(1);
                }
                z zVar4 = this.m0;
                if (zVar4.j == null) {
                    zVar4.j = new y(zVar4);
                }
                l.f(d, charSequence, executor, zVar4.j);
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                l6.n nVar4 = this.m0.f;
                m.a(d, true);
            }
            int c2 = this.m0.c();
            if (i11 >= 30) {
                n.a(d, c2);
            } else if (i11 >= 29) {
                m.b(d, k0.a(c2));
            }
            BiometricPrompt c10 = l.c(d);
            Context n4 = n();
            BiometricPrompt.CryptoObject b10 = m0.b(this.m0.g);
            z zVar5 = this.m0;
            if (zVar5.i == null) {
                zVar5.i = new tf.b(2);
            }
            tf.b bVar = zVar5.i;
            if (((CancellationSignal) bVar.a) == null) {
                bVar.a = a0.b();
            }
            CancellationSignal cancellationSignal = (CancellationSignal) bVar.a;
            o oVar = new o(0);
            z zVar6 = this.m0;
            if (zVar6.h == null) {
                zVar6.h = new android.support.v4.media.session.a0(new x(zVar6));
            }
            android.support.v4.media.session.a0 a0Var2 = zVar6.h;
            if (((BiometricPrompt$AuthenticationCallback) a0Var2.b) == null) {
                a0Var2.b = b.a((x) a0Var2.d);
            }
            BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = (BiometricPrompt$AuthenticationCallback) a0Var2.b;
            try {
                if (b10 == null) {
                    l.b(c10, cancellationSignal, oVar, biometricPrompt$AuthenticationCallback);
                } else {
                    l.a(c10, b10, cancellationSignal, oVar, biometricPrompt$AuthenticationCallback);
                }
                return;
            } catch (NullPointerException e10) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e10);
                T(1, n4 != null ? n4.getString(R.string.default_error_msg) : "");
                return;
            }
        }
        Context applicationContext = K().getApplicationContext();
        t tVar = new t(applicationContext, 1);
        FingerprintManager c11 = t.c(applicationContext);
        if (c11 == null || !c11.isHardwareDetected()) {
            i3 = 12;
        } else {
            FingerprintManager c12 = t.c(applicationContext);
            i3 = (c12 == null || !c12.hasEnrolledFingerprints()) ? 11 : 0;
        }
        if (i3 != 0) {
            T(i3, n0.a(applicationContext, i3));
            return;
        }
        if (t()) {
            this.m0.w = true;
            String str2 = Build.MODEL;
            if (Build.VERSION.SDK_INT == 28 && str2 != null) {
                for (String str3 : applicationContext.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                    if (str2.startsWith(str3)) {
                        break;
                    }
                }
            }
            this.l0.postDelayed(new g(this, 1), 500L);
            g0 g0Var = new g0();
            j0 p10 = p();
            g0Var.y0 = false;
            g0Var.z0 = true;
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(p10);
            aVar.o = true;
            aVar.f(0, g0Var, "androidx.biometric.FingerprintDialogFragment");
            aVar.e(false, true);
            z zVar7 = this.m0;
            zVar7.l = 0;
            v vVar = zVar7.g;
            if (vVar != null) {
                Cipher cipher = vVar.b;
                if (cipher != null) {
                    a0Var = new android.support.v4.media.session.a0(cipher);
                } else {
                    Signature signature = vVar.a;
                    if (signature != null) {
                        a0Var = new android.support.v4.media.session.a0(signature);
                    } else {
                        Mac mac = vVar.c;
                        if (mac != null) {
                            a0Var = new android.support.v4.media.session.a0(mac);
                        } else if (Build.VERSION.SDK_INT >= 30 && vVar.d != null) {
                            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                        }
                    }
                }
            }
            z zVar8 = this.m0;
            if (zVar8.i == null) {
                zVar8.i = new tf.b(2);
            }
            tf.b bVar2 = zVar8.i;
            if (((ba.i) bVar2.b) == null) {
                bVar2.b = new ba.i(4);
            }
            ba.i iVar = (ba.i) bVar2.b;
            z zVar9 = this.m0;
            if (zVar9.h == null) {
                zVar9.h = new android.support.v4.media.session.a0(new x(zVar9));
            }
            android.support.v4.media.session.a0 a0Var3 = zVar9.h;
            if (((bb.c) a0Var3.c) == null) {
                a0Var3.c = new bb.c(a0Var3, i10);
            }
            try {
                tVar.a(a0Var, iVar, (bb.c) a0Var3.c);
            } catch (NullPointerException e11) {
                Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e11);
                T(1, n0.a(applicationContext, 1));
            }
        }
    }

    @Override // androidx.fragment.app.s
    public final void x(int i3, int i10, Intent intent) {
        super.x(i3, i10, intent);
        if (i3 == 1) {
            this.m0.o = false;
            if (i10 == -1) {
                V(new u(null, 1));
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
        z zVar = (z) new android.support.v4.media.session.a0(k()).h(z.class);
        this.m0 = zVar;
        if (zVar.r == null) {
            zVar.r = new androidx.lifecycle.z();
        }
        zVar.r.d(this, new h(this, 0));
        z zVar2 = this.m0;
        if (zVar2.s == null) {
            zVar2.s = new androidx.lifecycle.z();
        }
        zVar2.s.d(this, new i(this, 0));
        z zVar3 = this.m0;
        if (zVar3.t == null) {
            zVar3.t = new androidx.lifecycle.z();
        }
        zVar3.t.d(this, new j(this, 0));
        z zVar4 = this.m0;
        if (zVar4.u == null) {
            zVar4.u = new androidx.lifecycle.z();
        }
        zVar4.u.d(this, new h(this, 1));
        z zVar5 = this.m0;
        if (zVar5.v == null) {
            zVar5.v = new androidx.lifecycle.z();
        }
        zVar5.v.d(this, new i(this, 1));
        z zVar6 = this.m0;
        if (zVar6.x == null) {
            zVar6.x = new androidx.lifecycle.z();
        }
        zVar6.x.d(this, new j(this, 1));
    }
}
