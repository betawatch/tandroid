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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class SignInHubActivity extends en4 {
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

    @Override // en4, wp2, android.app.Activity
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
                i4d N2 = i4d.N2(this);
                GoogleSignInOptions googleSignInOptions = this.Q.b;
                synchronized (N2) {
                    ((d1b) N2.a).c(googleSignInAccount, googleSignInOptions);
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

    @Override // en4, wp2, vp2, android.app.Activity
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

    @Override // en4, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        U = false;
    }

    @Override // wp2, vp2, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.R);
        if (this.R) {
            bundle.putInt("signInResultCode", this.S);
            bundle.putParcelable("signInResultData", this.T);
        }
    }

    public final void w() {
        p86 p86Var = (p86) new g29(f(), p86.d).k(p86.class);
        v39 v39Var = new v39(this, (byte) 24);
        boolean z = p86Var.c;
        qka qkaVar = p86Var.b;
        if (z) {
            sc8.j("Called while creating a loader");
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            sc8.j("initLoader must be called on the main thread");
            return;
        }
        qkaVar.getClass();
        o86 o86Var = (o86) zcd.a(qkaVar, 0);
        if (o86Var == null) {
            try {
                p86Var.c = true;
                Set set = gy4.a;
                synchronized (set) {
                }
                v3d v3dVar = new v3d(this, set);
                if (v3d.class.isMemberClass() && !Modifier.isStatic(v3d.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + v3dVar);
                }
                o86 o86Var2 = new o86(v3dVar);
                qkaVar.c(0, o86Var2);
                p86Var.c = false;
                e31 e31Var = new e31(o86Var2.l, v39Var);
                o86Var2.d(this, e31Var);
                e31 e31Var2 = o86Var2.n;
                if (e31Var2 != null) {
                    o86Var2.h(e31Var2);
                }
                o86Var2.m = this;
                o86Var2.n = e31Var;
            } catch (Throwable th) {
                p86Var.c = false;
                throw th;
            }
        } else {
            e31 e31Var3 = new e31(o86Var.l, v39Var);
            o86Var.d(this, e31Var3);
            e31 e31Var4 = o86Var.n;
            if (e31Var4 != null) {
                o86Var.h(e31Var4);
            }
            o86Var.m = this;
            o86Var.n = e31Var3;
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
