package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Modifier;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class SignInHubActivity extends gp4 {
    public static boolean U = false;
    public boolean P = false;
    public SignInConfiguration Q;
    public boolean R;
    public int S;
    public Intent T;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // gp4, hr2, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.P) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.b) != null) {
                k6d r1 = k6d.r1(this);
                GoogleSignInOptions googleSignInOptions = this.Q.b;
                synchronized (r1) {
                    ((f3b) r1.b).c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.R = true;
                this.S = i2;
                this.T = intent;
                w();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                x(intExtra);
                return;
            }
        }
        x(8);
    }

    @Override // gp4, hr2, gr2, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            x(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            x(12500);
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
        this.Q = signInConfiguration;
        if (bundle != null) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.R = z;
            if (z) {
                this.S = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.T = intent2;
                    w();
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
        if (U) {
            setResult(0);
            x(12502);
            return;
        }
        U = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.Q);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.P = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            x(17);
        }
    }

    @Override // gp4, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        U = false;
    }

    @Override // hr2, gr2, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.R);
        if (this.R) {
            bundle.putInt("signInResultCode", this.S);
            bundle.putParcelable("signInResultData", this.T);
        }
    }

    public final void w() {
        oa6 oa6Var = (oa6) new et8(f(), oa6.d).l(oa6.class);
        oo8 oo8Var = new oo8(this, (byte) 27);
        boolean z = oa6Var.c;
        rma rmaVar = oa6Var.b;
        if (z) {
            dq9.m("Called while creating a loader");
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            dq9.m("initLoader must be called on the main thread");
            return;
        }
        rmaVar.getClass();
        na6 na6Var = (na6) bfd.a(rmaVar, 0);
        if (na6Var == null) {
            try {
                oa6Var.c = true;
                Set set = h05.a;
                synchronized (set) {
                }
                x5d x5dVar = new x5d(this, set);
                if (x5d.class.isMemberClass() && !Modifier.isStatic(x5d.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + x5dVar);
                }
                na6 na6Var2 = new na6(x5dVar);
                rmaVar.c(0, na6Var2);
                oa6Var.c = false;
                m41 m41Var = new m41(na6Var2.l, oo8Var);
                na6Var2.d(this, m41Var);
                m41 m41Var2 = na6Var2.n;
                if (m41Var2 != null) {
                    na6Var2.h(m41Var2);
                }
                na6Var2.m = this;
                na6Var2.n = m41Var;
            } catch (Throwable th) {
                oa6Var.c = false;
                throw th;
            }
        } else {
            m41 m41Var3 = new m41(na6Var.l, oo8Var);
            na6Var.d(this, m41Var3);
            m41 m41Var4 = na6Var.n;
            if (m41Var4 != null) {
                na6Var.h(m41Var4);
            }
            na6Var.m = this;
            na6Var.n = m41Var3;
        }
        U = false;
    }

    public final void x(int i) {
        Status status = new Status(i, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        U = false;
    }
}
