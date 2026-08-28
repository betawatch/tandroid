package com.google.android.gms.auth.api.signin.internal;

import a0.l;
import a5.m;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.v;
import c2.t;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Modifier;
import java.util.Set;
import k5.b;
import k5.d;
import k5.i;
import w1.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class SignInHubActivity extends v {
    public static boolean P = false;
    public boolean K = false;
    public SignInConfiguration L;
    public boolean M;
    public int N;
    public Intent O;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.v, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i9, int i10, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.K) {
            return;
        }
        setResult(0);
        if (i9 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.b) != null) {
                i Q = i.Q(this);
                GoogleSignInOptions googleSignInOptions = this.L.b;
                synchronized (Q) {
                    synchronized (Q) {
                        ((b) Q.b).c(googleSignInAccount, googleSignInOptions);
                    }
                    intent.removeExtra("signInAccount");
                    intent.putExtra("googleSignInAccount", googleSignInAccount);
                    this.M = true;
                    this.N = i10;
                    this.O = intent;
                    u();
                    return;
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.M = true;
                this.N = i10;
                this.O = intent;
                u();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                w(intExtra);
                return;
            }
        }
        w(8);
    }

    @Override // androidx.fragment.app.v, androidx.activity.m, e0.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            w(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            w(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.L = signInConfiguration;
        if (bundle != null) {
            boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
            this.M = z10;
            if (z10) {
                this.N = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.O = intent2;
                    u();
                    return;
                } else {
                    Log.e("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                }
            }
            return;
        }
        if (P) {
            setResult(0);
            w(12502);
            return;
        }
        P = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.L);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.K = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            w(17);
        }
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        P = false;
    }

    @Override // androidx.activity.m, e0.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.M);
        if (this.M) {
            bundle.putInt("signInResultCode", this.N);
            bundle.putParcelable("signInResultData", this.O);
        }
    }

    public final void u() {
        w1.b bVar = (w1.b) new m(f(), w1.b.f).n(w1.b.class);
        i iVar = new i(this, 21);
        boolean z10 = bVar.e;
        l lVar = bVar.d;
        if (z10) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a aVar = (a) lVar.c(0);
        if (aVar == null) {
            try {
                bVar.e = true;
                Set set = com.google.android.gms.common.api.m.a;
                synchronized (set) {
                }
                d dVar = new d(this, set);
                if (d.class.isMemberClass() && !Modifier.isStatic(d.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + dVar);
                }
                a aVar2 = new a(dVar);
                lVar.d(0, aVar2);
                bVar.e = false;
                t tVar = new t(aVar2.l, iVar);
                aVar2.d(this, tVar);
                t tVar2 = aVar2.n;
                if (tVar2 != null) {
                    aVar2.i(tVar2);
                }
                aVar2.m = this;
                aVar2.n = tVar;
            } catch (Throwable th) {
                bVar.e = false;
                throw th;
            }
        } else {
            t tVar3 = new t(aVar.l, iVar);
            aVar.d(this, tVar3);
            t tVar4 = aVar.n;
            if (tVar4 != null) {
                aVar.i(tVar4);
            }
            aVar.m = this;
            aVar.n = tVar3;
        }
        P = false;
    }

    public final void w(int i9) {
        Status status = new Status(i9, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        P = false;
    }
}
