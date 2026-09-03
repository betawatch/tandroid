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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class q extends androidx.fragment.app.s {
    public final Handler h0 = new Handler(Looper.getMainLooper());
    public z i0;

    @Override // androidx.fragment.app.s
    public final void H() {
        this.R = true;
        if (Build.VERSION.SDK_INT == 29 && com.google.android.gms.internal.cast.n.a(this.i0.c())) {
            z zVar = this.i0;
            zVar.q = true;
            this.h0.postDelayed(new p(zVar, 2), 250L);
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
            z zVar = this.i0;
            if (zVar.i == null) {
                zVar.i = new af.c((char) 0, 4);
            }
            af.c cVar = zVar.i;
            CancellationSignal cancellationSignal = (CancellationSignal) cVar.b;
            if (cancellationSignal != null) {
                try {
                    a0.a(cancellationSignal);
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                cVar.b = null;
            }
            c2.u uVar = (c2.u) cVar.c;
            if (uVar != null) {
                try {
                    uVar.d();
                } catch (NullPointerException e6) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e6);
                }
                cVar.c = null;
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
                        z zVar = this.i0;
                        zVar.p = true;
                        this.h0.postDelayed(new p(zVar, 1), 600L);
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
            h0 h0Var = (h0) p10.D("androidx.biometric.FingerprintDialogFragment");
            if (h0Var != null) {
                if (h0Var.t()) {
                    h0Var.N(false);
                    return;
                }
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(p10);
                aVar.h(h0Var);
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
            return i11 < 23 || n10 == null || n10.getPackageManager() == null || !k0.a(n10.getPackageManager());
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
        z zVar = this.i0;
        x5.k kVar = zVar.f;
        CharSequence charSequence = kVar != null ? (CharSequence) kVar.b : null;
        zVar.getClass();
        x5.k kVar2 = this.i0.f;
        Intent a10 = k.a(a2, charSequence, kVar2 != null ? (CharSequence) kVar2.c : null);
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
        z zVar = this.i0;
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
        executor.execute(new f(this, i10, charSequence, 0));
    }

    public final void V(u uVar) {
        z zVar = this.i0;
        if (zVar.n) {
            zVar.n = false;
            Executor executor = zVar.d;
            if (executor == null) {
                executor = new o(1);
            }
            executor.execute(new j(0, this, uVar));
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
        z zVar = this.i0;
        int i10 = 1;
        zVar.m = true;
        zVar.n = true;
        int i11 = 4;
        char c3 = 0;
        CharSequence charSequence = null;
        r5 = null;
        r5 = null;
        r5 = null;
        af.d dVar = null;
        if (!R()) {
            BiometricPrompt.Builder d = l.d(K().getApplicationContext());
            z zVar2 = this.i0;
            x5.k kVar = zVar2.f;
            CharSequence charSequence2 = kVar != null ? (CharSequence) kVar.b : null;
            zVar2.getClass();
            x5.k kVar2 = this.i0.f;
            CharSequence charSequence3 = kVar2 != null ? (CharSequence) kVar2.c : null;
            if (charSequence2 != null) {
                l.g(d, charSequence2);
            }
            if (charSequence3 != null) {
                l.e(d, charSequence3);
            }
            z zVar3 = this.i0;
            String str = zVar3.k;
            if (str != null) {
                charSequence = str;
            } else {
                x5.k kVar3 = zVar3.f;
                if (kVar3 != null && (charSequence = (CharSequence) kVar3.d) == null) {
                    charSequence = "";
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                Executor executor = this.i0.d;
                if (executor == null) {
                    executor = new o(1);
                }
                z zVar4 = this.i0;
                if (zVar4.j == null) {
                    zVar4.j = new y(zVar4);
                }
                l.f(d, charSequence, executor, zVar4.j);
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29) {
                x5.k kVar4 = this.i0.f;
                m.a(d, true);
            }
            int c10 = this.i0.c();
            if (i12 >= 30) {
                n.a(d, c10);
            } else if (i12 >= 29) {
                m.b(d, com.google.android.gms.internal.cast.n.a(c10));
            }
            BiometricPrompt c11 = l.c(d);
            Context n10 = n();
            BiometricPrompt.CryptoObject c12 = ee.b.c(this.i0.g);
            z zVar5 = this.i0;
            if (zVar5.i == null) {
                zVar5.i = new af.c(c3, i11);
            }
            af.c cVar = zVar5.i;
            if (((CancellationSignal) cVar.b) == null) {
                cVar.b = a0.b();
            }
            CancellationSignal cancellationSignal = (CancellationSignal) cVar.b;
            o oVar = new o(0);
            z zVar6 = this.i0;
            if (zVar6.h == null) {
                zVar6.h = new af.d(new x(zVar6));
            }
            af.d dVar2 = zVar6.h;
            if (((BiometricPrompt.AuthenticationCallback) dVar2.b) == null) {
                dVar2.b = b.a((x) dVar2.d);
            }
            BiometricPrompt.AuthenticationCallback authenticationCallback = (BiometricPrompt.AuthenticationCallback) dVar2.b;
            try {
                if (c12 == null) {
                    l.b(c11, cancellationSignal, oVar, authenticationCallback);
                } else {
                    l.a(c11, c12, cancellationSignal, oVar, authenticationCallback);
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
            this.h0.postDelayed(new g(this, 1), 500L);
            h0 h0Var = new h0();
            androidx.fragment.app.j0 p10 = p();
            h0Var.u0 = false;
            h0Var.v0 = true;
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(p10);
            aVar.o = true;
            aVar.f(0, h0Var, "androidx.biometric.FingerprintDialogFragment");
            aVar.e(false, true);
            z zVar7 = this.i0;
            zVar7.l = 0;
            v vVar = zVar7.g;
            if (vVar != null) {
                Cipher cipher = vVar.b;
                if (cipher != null) {
                    dVar = new af.d(cipher);
                } else {
                    Signature signature = vVar.a;
                    if (signature != null) {
                        dVar = new af.d(signature);
                    } else {
                        Mac mac = vVar.c;
                        if (mac != null) {
                            dVar = new af.d(mac);
                        } else if (Build.VERSION.SDK_INT >= 30 && vVar.d != null) {
                            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                        }
                    }
                }
            }
            z zVar8 = this.i0;
            if (zVar8.i == null) {
                zVar8.i = new af.c(c3, i11);
            }
            af.c cVar2 = zVar8.i;
            if (((c2.u) cVar2.c) == null) {
                cVar2.c = new c2.u(3);
            }
            c2.u uVar = (c2.u) cVar2.c;
            z zVar9 = this.i0;
            if (zVar9.h == null) {
                zVar9.h = new af.d(new x(zVar9));
            }
            af.d dVar3 = zVar9.h;
            if (((o5.i) dVar3.c) == null) {
                dVar3.c = new o5.i(dVar3, i10);
            }
            try {
                hVar.a(dVar, uVar, (o5.i) dVar3.c);
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
        z zVar = (z) new af.d(k()).m(z.class);
        this.i0 = zVar;
        if (zVar.r == null) {
            zVar.r = new androidx.lifecycle.z();
        }
        zVar.r.d(this, new h(this, 0));
        z zVar2 = this.i0;
        if (zVar2.s == null) {
            zVar2.s = new androidx.lifecycle.z();
        }
        zVar2.s.d(this, new i(this, 0));
        z zVar3 = this.i0;
        if (zVar3.t == null) {
            zVar3.t = new androidx.lifecycle.z();
        }
        zVar3.t.d(this, new ja.c(this, 1));
        z zVar4 = this.i0;
        if (zVar4.u == null) {
            zVar4.u = new androidx.lifecycle.z();
        }
        zVar4.u.d(this, new o5.i(this, 2));
        z zVar5 = this.i0;
        if (zVar5.v == null) {
            zVar5.v = new androidx.lifecycle.z();
        }
        zVar5.v.d(this, new h(this, 1));
        z zVar6 = this.i0;
        if (zVar6.x == null) {
            zVar6.x = new androidx.lifecycle.z();
        }
        zVar6.x.d(this, new i(this, 1));
    }
}
