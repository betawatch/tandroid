package com.google.android.gms.auth.api.signin.internal;

import a0.m;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.session.a0;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.v;
import cb.c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import d6.b;
import d6.d;
import d6.i;
import java.lang.reflect.Modifier;
import java.util.Set;
import z1.a;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public class SignInHubActivity extends v {
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

    @Override // androidx.fragment.app.v, androidx.activity.l, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.P) {
            return;
        }
        setResult(0);
        if (i7 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.b) != null) {
                i B = i.B(this);
                GoogleSignInOptions googleSignInOptions = this.Q.b;
                synchronized (B) {
                    synchronized (B) {
                        ((b) B.b).c(googleSignInAccount, googleSignInOptions);
                    }
                    intent.removeExtra("signInAccount");
                    intent.putExtra("googleSignInAccount", googleSignInAccount);
                    this.R = true;
                    this.S = i10;
                    this.T = intent;
                    u();
                    return;
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.R = true;
                this.S = i10;
                this.T = intent;
                u();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                v(intExtra);
                return;
            }
        }
        v(8);
    }

    @Override // androidx.fragment.app.v, androidx.activity.l, e0.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            v(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            v(12500);
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
            boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
            this.R = z10;
            if (z10) {
                this.S = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.T = intent2;
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
        if (U) {
            setResult(0);
            v(12502);
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
            v(17);
        }
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        U = false;
    }

    @Override // androidx.activity.l, e0.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.R);
        if (this.R) {
            bundle.putInt("signInResultCode", this.S);
            bundle.putParcelable("signInResultData", this.T);
        }
    }

    public final void u() {
        z1.b bVar = (z1.b) new a0(g(), z1.b.f).j(z1.b.class);
        c cVar = new c(this, 15);
        boolean z10 = bVar.e;
        m mVar = bVar.d;
        if (z10) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a aVar = (a) mVar.c(0);
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
                mVar.d(0, aVar2);
                bVar.e = false;
                ca.i iVar = new ca.i(aVar2.l, cVar);
                aVar2.d(this, iVar);
                ca.i iVar2 = aVar2.n;
                if (iVar2 != null) {
                    aVar2.i(iVar2);
                }
                aVar2.m = this;
                aVar2.n = iVar;
            } catch (Throwable th2) {
                bVar.e = false;
                throw th2;
            }
        } else {
            ca.i iVar3 = new ca.i(aVar.l, cVar);
            aVar.d(this, iVar3);
            ca.i iVar4 = aVar.n;
            if (iVar4 != null) {
                aVar.i(iVar4);
            }
            aVar.m = this;
            aVar.n = iVar3;
        }
        U = false;
    }

    public final void v(int i7) {
        Status status = new Status(i7, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        U = false;
    }
}
