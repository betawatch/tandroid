package androidx.biometric;

import a8.b1;
import a8.c1;
import a8.h0;
import a8.z0;
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
import androidx.fragment.app.i0;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class p extends androidx.fragment.app.r {
    public final Handler k0 = new Handler(Looper.getMainLooper());
    public x l0;

    @Override // androidx.fragment.app.r
    public final void H() {
        this.U = true;
        if (Build.VERSION.SDK_INT == 29 && z0.a(this.l0.c())) {
            x xVar = this.l0;
            xVar.q = true;
            this.k0.postDelayed(new o(xVar, 2), 250L);
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

    public final void N(int i10) {
        if (i10 == 3 || !this.l0.q) {
            if (R()) {
                this.l0.l = i10;
                if (i10 == 1) {
                    U(10, c1.a(n(), 10));
                }
            }
            x xVar = this.l0;
            if (xVar.i == null) {
                xVar.i = new rf.b(5, false);
            }
            rf.b bVar = xVar.i;
            CancellationSignal cancellationSignal = (CancellationSignal) bVar.b;
            if (cancellationSignal != null) {
                try {
                    y.a(cancellationSignal);
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                bVar.b = null;
            }
            b2.u uVar = (b2.u) bVar.c;
            if (uVar != null) {
                try {
                    uVar.e();
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
            i0 p10 = p();
            e0 e0Var = (e0) p10.D("androidx.biometric.FingerprintDialogFragment");
            if (e0Var != null) {
                if (e0Var.t()) {
                    e0Var.N(false);
                    return;
                }
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(p10);
                aVar.h(e0Var);
                aVar.e(true, true);
            }
        }
    }

    public final boolean Q() {
        return Build.VERSION.SDK_INT <= 28 && z0.a(this.l0.c());
    }

    public final boolean R() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            androidx.fragment.app.u k10 = k();
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
        androidx.fragment.app.u k10 = k();
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
        k6.m mVar = xVar.f;
        CharSequence charSequence = mVar != null ? (CharSequence) mVar.b : null;
        xVar.getClass();
        k6.m mVar2 = this.l0.f;
        Intent a10 = j.a(a2, charSequence, mVar2 != null ? (CharSequence) mVar2.c : null);
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
            executor.execute(new k9.u(this, sVar, false, 1));
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
        int i11 = 5;
        boolean z10 = false;
        CharSequence charSequence = null;
        r5 = null;
        r5 = null;
        r5 = null;
        h0 h0Var = null;
        if (!R()) {
            BiometricPrompt.Builder d = k.d(K().getApplicationContext());
            x xVar2 = this.l0;
            k6.m mVar = xVar2.f;
            CharSequence charSequence2 = mVar != null ? (CharSequence) mVar.b : null;
            xVar2.getClass();
            k6.m mVar2 = this.l0.f;
            CharSequence charSequence3 = mVar2 != null ? (CharSequence) mVar2.c : null;
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
                k6.m mVar3 = xVar3.f;
                if (mVar3 != null && (charSequence = (CharSequence) mVar3.d) == null) {
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
                k6.m mVar4 = this.l0.f;
                l.a(d, true);
            }
            int c10 = this.l0.c();
            if (i12 >= 30) {
                m.a(d, c10);
            } else if (i12 >= 29) {
                l.b(d, z0.a(c10));
            }
            BiometricPrompt c11 = k.c(d);
            Context n10 = n();
            BiometricPrompt.CryptoObject b10 = b1.b(this.l0.g);
            x xVar5 = this.l0;
            if (xVar5.i == null) {
                xVar5.i = new rf.b(i11, z10);
            }
            rf.b bVar = xVar5.i;
            if (((CancellationSignal) bVar.b) == null) {
                bVar.b = y.b();
            }
            CancellationSignal cancellationSignal = (CancellationSignal) bVar.b;
            n nVar = new n(0);
            x xVar6 = this.l0;
            if (xVar6.h == null) {
                xVar6.h = new h0(new v(xVar6));
            }
            h0 h0Var2 = xVar6.h;
            if (((BiometricPrompt$AuthenticationCallback) h0Var2.b) == null) {
                h0Var2.b = b.a((v) h0Var2.d);
            }
            BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = (BiometricPrompt$AuthenticationCallback) h0Var2.b;
            try {
                if (b10 == null) {
                    k.b(c11, cancellationSignal, nVar, biometricPrompt$AuthenticationCallback);
                } else {
                    k.a(c11, b10, cancellationSignal, nVar, biometricPrompt$AuthenticationCallback);
                }
                return;
            } catch (NullPointerException e) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e);
                T(1, n10 != null ? n10.getString(R.string.default_error_msg) : "");
                return;
            }
        }
        Context applicationContext = K().getApplicationContext();
        l6.h hVar = new l6.h(applicationContext, 3);
        FingerprintManager c12 = l6.h.c(applicationContext);
        if (c12 == null || !c12.isHardwareDetected()) {
            i10 = 12;
        } else {
            FingerprintManager c13 = l6.h.c(applicationContext);
            i10 = (c13 == null || !c13.hasEnrolledFingerprints()) ? 11 : 0;
        }
        if (i10 != 0) {
            T(i10, c1.a(applicationContext, i10));
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
            i0 p10 = p();
            e0Var.x0 = false;
            e0Var.y0 = true;
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(p10);
            aVar.o = true;
            aVar.f(0, e0Var, "androidx.biometric.FingerprintDialogFragment");
            aVar.e(false, true);
            x xVar7 = this.l0;
            xVar7.l = 0;
            t tVar = xVar7.g;
            if (tVar != null) {
                Cipher cipher = tVar.b;
                if (cipher != null) {
                    h0Var = new h0(cipher);
                } else {
                    Signature signature = tVar.a;
                    if (signature != null) {
                        h0Var = new h0(signature);
                    } else {
                        Mac mac = tVar.c;
                        if (mac != null) {
                            h0Var = new h0(mac);
                        } else if (Build.VERSION.SDK_INT >= 30 && tVar.d != null) {
                            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                        }
                    }
                }
            }
            x xVar8 = this.l0;
            if (xVar8.i == null) {
                xVar8.i = new rf.b(i11, z10);
            }
            rf.b bVar2 = xVar8.i;
            if (((b2.u) bVar2.c) == null) {
                bVar2.c = new b2.u(3);
            }
            b2.u uVar = (b2.u) bVar2.c;
            x xVar9 = this.l0;
            if (xVar9.h == null) {
                xVar9.h = new h0(new v(xVar9));
            }
            h0 h0Var3 = xVar9.h;
            if (((rb.c) h0Var3.c) == null) {
                h0Var3.c = new rb.c(h0Var3, 2);
            }
            try {
                hVar.b(h0Var, uVar, (rb.c) h0Var3.c);
            } catch (NullPointerException e10) {
                Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e10);
                T(1, c1.a(applicationContext, 1));
            }
        }
    }

    @Override // androidx.fragment.app.r
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

    @Override // androidx.fragment.app.r
    public final void z(Bundle bundle) {
        super.z(bundle);
        if (k() == null) {
            return;
        }
        x xVar = (x) new h0(k()).m(x.class);
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
        xVar3.t.d(this, new a4.l(this, 2));
        x xVar4 = this.l0;
        if (xVar4.u == null) {
            xVar4.u = new androidx.lifecycle.z();
        }
        xVar4.u.d(this, new rb.c(this, 3));
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
