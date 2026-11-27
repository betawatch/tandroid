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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class SignInHubActivity extends jp4 {
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

    @Override // jp4, pq2, android.app.Activity
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
                z8d s1 = z8d.s1(this);
                GoogleSignInOptions googleSignInOptions = this.Q.b;
                synchronized (s1) {
                    ((a5b) s1.b).c(googleSignInAccount, googleSignInOptions);
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

    @Override // jp4, pq2, oq2, android.app.Activity
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

    @Override // jp4, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        U = false;
    }

    @Override // pq2, oq2, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.R);
        if (this.R) {
            bundle.putInt("signInResultCode", this.S);
            bundle.putParcelable("signInResultData", this.T);
        }
    }

    public final void w() {
        ta6 ta6Var = (ta6) new pq8(f(), ta6.d).n(ta6.class);
        k09 k09Var = new k09(this, (byte) 24);
        boolean z = ta6Var.c;
        koa koaVar = ta6Var.b;
        if (z) {
            grb.i("Called while creating a loader");
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            grb.i("initLoader must be called on the main thread");
            return;
        }
        koaVar.getClass();
        sa6 sa6Var = (sa6) shd.a(koaVar, 0);
        if (sa6Var == null) {
            try {
                ta6Var.c = true;
                Set set = m05.a;
                synchronized (set) {
                }
                m8d m8dVar = new m8d(this, set);
                if (m8d.class.isMemberClass() && !Modifier.isStatic(m8d.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + m8dVar);
                }
                sa6 sa6Var2 = new sa6(m8dVar);
                koaVar.c(0, sa6Var2);
                ta6Var.c = false;
                n31 n31Var = new n31(sa6Var2.l, k09Var);
                sa6Var2.d(this, n31Var);
                n31 n31Var2 = sa6Var2.n;
                if (n31Var2 != null) {
                    sa6Var2.h(n31Var2);
                }
                sa6Var2.m = this;
                sa6Var2.n = n31Var;
            } catch (Throwable th) {
                ta6Var.c = false;
                throw th;
            }
        } else {
            n31 n31Var3 = new n31(sa6Var.l, k09Var);
            sa6Var.d(this, n31Var3);
            n31 n31Var4 = sa6Var.n;
            if (n31Var4 != null) {
                sa6Var.h(n31Var4);
            }
            sa6Var.m = this;
            sa6Var.n = n31Var3;
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
