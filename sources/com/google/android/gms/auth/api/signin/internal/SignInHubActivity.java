package com.google.android.gms.auth.api.signin.internal;

import a6.b;
import a6.d;
import a6.i;
import a6.m;
import aa.a;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.u;
import b2.p;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Modifier;
import java.util.Set;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class SignInHubActivity extends u {
    public static boolean T = false;
    public boolean O = false;
    public SignInConfiguration P;
    public boolean Q;
    public int R;
    public Intent S;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.u, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.O) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.b) != null) {
                i G = i.G(this);
                GoogleSignInOptions googleSignInOptions = this.P.b;
                synchronized (G) {
                    synchronized (G) {
                        ((b) G.b).c(googleSignInAccount, googleSignInOptions);
                    }
                    intent.removeExtra("signInAccount");
                    intent.putExtra("googleSignInAccount", googleSignInAccount);
                    this.Q = true;
                    this.R = i11;
                    this.S = intent;
                    v();
                    return;
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.Q = true;
                this.R = i11;
                this.S = intent;
                v();
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

    @Override // androidx.fragment.app.u, androidx.activity.m, e0.h, android.app.Activity
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
        this.P = signInConfiguration;
        if (bundle != null) {
            boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
            this.Q = z10;
            if (z10) {
                this.R = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.S = intent2;
                    v();
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
        if (T) {
            setResult(0);
            w(12502);
            return;
        }
        T = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.P);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.O = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            w(17);
        }
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        T = false;
    }

    @Override // androidx.activity.m, e0.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.Q);
        if (this.Q) {
            bundle.putInt("signInResultCode", this.R);
            bundle.putParcelable("signInResultData", this.S);
        }
    }

    public final void v() {
        w1.b bVar = (w1.b) new a(f(), w1.b.f).n(w1.b.class);
        m mVar = new m(this, 0);
        boolean z10 = bVar.e;
        a0.m mVar2 = bVar.d;
        if (z10) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        w1.a aVar = (w1.a) mVar2.c(0);
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
                w1.a aVar2 = new w1.a(dVar);
                mVar2.d(0, aVar2);
                bVar.e = false;
                p pVar = new p(aVar2.l, mVar);
                aVar2.d(this, pVar);
                p pVar2 = aVar2.n;
                if (pVar2 != null) {
                    aVar2.i(pVar2);
                }
                aVar2.m = this;
                aVar2.n = pVar;
            } catch (Throwable th2) {
                bVar.e = false;
                throw th2;
            }
        } else {
            p pVar3 = new p(aVar.l, mVar);
            aVar.d(this, pVar3);
            p pVar4 = aVar.n;
            if (pVar4 != null) {
                aVar.i(pVar4);
            }
            aVar.m = this;
            aVar.n = pVar3;
        }
        T = false;
    }

    public final void w(int i10) {
        Status status = new Status(i10, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        T = false;
    }
}
