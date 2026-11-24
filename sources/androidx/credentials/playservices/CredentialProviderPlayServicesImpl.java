package androidx.credentials.playservices;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements d33 {
    public static final w33 Companion = new w33();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private d05 googleApiAvailability;

    public CredentialProviderPlayServicesImpl(Context context) {
        context.getClass();
        this.context = context;
        this.googleApiAvailability = d05.e;
    }

    private final int isGooglePlayServicesAvailable(Context context, int i) {
        return this.googleApiAvailability.c(context, i);
    }

    private static final g7c onClearCredential$lambda$10(CancellationSignal cancellationSignal, Executor executor, a33 a33Var, Boolean bool) {
        Companion.getClass();
        if (!w33.a(cancellationSignal)) {
            onClearCredential$lambda$10$lambda$9(executor, a33Var);
        }
        return g7c.a;
    }

    private static final g7c onClearCredential$lambda$10$lambda$9(Executor executor, a33 a33Var) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new d23(a33Var, (byte) 2));
        return g7c.a;
    }

    private static final void onClearCredential$lambda$14(CancellationSignal cancellationSignal, Executor executor, a33 a33Var, Exception exc) {
        exc.getClass();
        Log.w(TAG, "Clearing restore credential failed", exc);
        e79 e79Var = new e79();
        e79Var.a = new jj2("Clear restore credential failed for unknown reason.");
        if ((exc instanceof ap) && ((ap) exc).getStatusCode() == 40201) {
            e79Var.a = new jj2("The restore credential internal service had a failure.");
        }
        Companion.getClass();
        if (w33.a(cancellationSignal)) {
            return;
        }
        onClearCredential$lambda$14$lambda$13(executor, a33Var, e79Var);
    }

    private static final g7c onClearCredential$lambda$14$lambda$13(Executor executor, a33 a33Var, e79 e79Var) {
        executor.execute(new mv2((Object) a33Var, (Object) e79Var, (byte) 23));
        return g7c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$14$lambda$13$lambda$12(a33 a33Var, e79 e79Var) {
        a33Var.A(e79Var.a);
    }

    private static final g7c onClearCredential$lambda$17(CancellationSignal cancellationSignal, Executor executor, a33 a33Var, lj2 lj2Var) {
        Companion.getClass();
        if (!w33.a(cancellationSignal)) {
            onClearCredential$lambda$17$lambda$16(executor, a33Var);
        }
        return g7c.a;
    }

    private static final g7c onClearCredential$lambda$17$lambda$16(Executor executor, a33 a33Var) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new d23(a33Var, (byte) 6));
        return g7c.a;
    }

    private static final void onClearCredential$lambda$19(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, kj2 kj2Var, CancellationSignal cancellationSignal, Executor executor, a33 a33Var, Exception exc) {
        exc.getClass();
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(kj2Var, cancellationSignal, executor, a33Var);
    }

    private static final g7c onClearCredential$lambda$7(Executor executor, a33 a33Var) {
        executor.execute(new d23(a33Var, (byte) 7));
        return g7c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$7$lambda$6(a33 a33Var) {
        a33Var.A(new jj2("androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", "clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    private static final g7c onCreateCredential$lambda$5(Executor executor, a33 a33Var) {
        executor.execute(new d23(a33Var, (byte) 3));
        return g7c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$5$lambda$4(a33 a33Var) {
        a33Var.A(new n13("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", (byte) 1));
    }

    private static final g7c onGetCredential$lambda$1(Executor executor, a33 a33Var) {
        executor.execute(new d23(a33Var, (byte) 5));
        return g7c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$lambda$0(a33 a33Var) {
        a33Var.A(new uu4("this device requires a Google Play Services update for the given feature to be supported", (byte) 1));
    }

    private static final g7c onGetCredential$lambda$3(Executor executor, a33 a33Var) {
        executor.execute(new d23(a33Var, (byte) 4));
        return g7c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$3$lambda$2(a33 a33Var) {
        a33Var.A(new uu4("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", (byte) 1));
    }

    private final void runFallbackClearCredFlow(kj2 kj2Var, final CancellationSignal cancellationSignal, final Executor executor, final a33 a33Var) {
        s5d a = ume.a(this.context);
        a.a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = h05.a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((h05) it.next()).b();
        }
        i05.a();
        bib b = cib.b();
        b.c = new o94[]{bgd.a};
        b.a = new x59(a, (byte) 26);
        b.b = false;
        b.d = (char) 1554;
        a.e(1, b.a()).addOnSuccessListener(new wm2(new rr4() { // from class: v33
            @Override // rr4
            public final Object invoke(Object obj) {
                g7c runFallbackClearCredFlow$lambda$22;
                runFallbackClearCredFlow$lambda$22 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$22(cancellationSignal, executor, a33Var, (Void) obj);
                return runFallbackClearCredFlow$lambda$22;
            }
        }, (byte) 12)).addOnFailureListener(new lu((Object) this, (Object) cancellationSignal, (Object) executor, (Object) a33Var, (byte) 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g7c runFallbackClearCredFlow$lambda$22(CancellationSignal cancellationSignal, Executor executor, a33 a33Var, Void r3) {
        Companion.getClass();
        if (!w33.a(cancellationSignal)) {
            runFallbackClearCredFlow$lambda$22$lambda$21(executor, a33Var);
        }
        return g7c.a;
    }

    private static final g7c runFallbackClearCredFlow$lambda$22$lambda$21(Executor executor, a33 a33Var) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new d23(a33Var, (byte) 8));
        return g7c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, a33 a33Var, Exception exc) {
        exc.getClass();
        Companion.getClass();
        if (w33.a(cancellationSignal)) {
            return;
        }
        runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(exc, executor, a33Var);
    }

    private static final g7c runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(Exception exc, Executor executor, a33 a33Var) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new mv2((Object) a33Var, (Object) exc, (byte) 22));
        return g7c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24(a33 a33Var, Exception exc) {
        a33Var.A(new jj2(exc.getMessage()));
    }

    public final d05 getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int i) {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, i);
        boolean z = isGooglePlayServicesAvailable == 0;
        if (!z) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new ot2(isGooglePlayServicesAvailable, null, null));
        }
        return z;
    }

    public void onClearCredential(kj2 kj2Var, CancellationSignal cancellationSignal, Executor executor, a33 a33Var) {
        throw null;
    }

    @Override // d33
    public void onCreateCredential(Context context, u13 u13Var, CancellationSignal cancellationSignal, Executor executor, a33 a33Var) {
        context.getClass();
        u13Var.getClass();
        executor.getClass();
        a33Var.getClass();
        w33 w33Var = Companion;
        w33Var.getClass();
        if (w33.a(cancellationSignal)) {
            return;
        }
        if (!(u13Var instanceof m23)) {
            rjb.j("Create Credential request is unsupported, not password or publickeycredential");
            return;
        }
        boolean isAvailableOnDevice = isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION);
        byte b = 1;
        vo voVar = wo.g;
        if (isAvailableOnDevice) {
            k23 k23Var = new k23(context);
            m23 m23Var = (m23) u13Var;
            k23Var.h = cancellationSignal;
            k23Var.f = a33Var;
            k23Var.g = executor;
            w33Var.getClass();
            if (w33.a(cancellationSignal)) {
                return;
            }
            t13 t13Var = new t13("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", m23Var.a, m23Var.b, null, m23Var.d, null);
            ua4 ua4Var = new ua4(context, ua4.m, voVar, b05.c);
            bib b2 = cib.b();
            b2.c = new o94[]{mgd.b};
            b2.a = new eod((Object) t13Var, (byte) 2);
            b2.d = (char) 32704;
            Task e = ua4Var.e(1, b2.a());
            e.getClass();
            e.addOnSuccessListener(new wm2(new f23(cancellationSignal, k23Var, executor, a33Var, (byte) 0), (byte) 8)).addOnFailureListener(new lu((Object) cancellationSignal, (Object) k23Var, (Object) executor, (Object) a33Var, (byte) 9));
            return;
        }
        m23 m23Var2 = (m23) u13Var;
        o33 o33Var = new o33(context);
        o33Var.h = cancellationSignal;
        o33Var.f = a33Var;
        o33Var.g = executor;
        try {
            nw8 d = o33Var.d(m23Var2);
            w33Var.getClass();
            if (w33.a(cancellationSignal)) {
                return;
            }
            byte b3 = 13;
            ua4 ua4Var2 = new ua4(context, ua4.l, voVar, new fgf(b3));
            bib b4 = cib.b();
            b4.a = new et8(ua4Var2, d);
            b4.d = (char) 5407;
            ua4Var2.e(0, b4.a()).addOnSuccessListener(new wm2(new f33(cancellationSignal, o33Var, b), (byte) 10)).addOnFailureListener(new x92(o33Var, cancellationSignal, b3));
        } catch (JSONException e2) {
            Companion.getClass();
            if (w33.a(cancellationSignal)) {
                return;
            }
            Executor executor2 = o33Var.g;
            if (executor2 != null) {
                executor2.execute(new k33(o33Var, e2, b));
            } else {
                rr5.e("executor");
                throw null;
            }
        } catch (Throwable th) {
            Companion.getClass();
            if (w33.a(cancellationSignal)) {
                return;
            }
            Executor executor3 = o33Var.g;
            if (executor3 != null) {
                executor3.execute(new l33(o33Var, th, b));
            } else {
                rr5.e("executor");
                throw null;
            }
        }
    }

    @Override // d33
    public void onGetCredential(Context context, xu4 xu4Var, CancellationSignal cancellationSignal, Executor executor, a33 a33Var) {
        vo voVar;
        zo zoVar = ua4.m;
        context.getClass();
        xu4Var.getClass();
        boolean z = xu4Var.b;
        List<c33> list = xu4Var.a;
        executor.getClass();
        a33Var.getClass();
        Companion.getClass();
        if (w33.a(cancellationSignal)) {
            return;
        }
        Iterator it = list.iterator();
        do {
            boolean hasNext = it.hasNext();
            voVar = wo.g;
            if (!hasNext) {
                Companion.getClass();
                for (c33 c33Var : list) {
                }
                if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                    Companion.getClass();
                    for (c33 c33Var2 : list) {
                    }
                    new h33(context).g(xu4Var, cancellationSignal, executor, a33Var);
                    return;
                }
                tu4 tu4Var = new tu4(context);
                tu4Var.h = cancellationSignal;
                tu4Var.f = a33Var;
                tu4Var.g = executor;
                Companion.getClass();
                if (w33.a(cancellationSignal)) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
                bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z);
                bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
                List<c33> list2 = list;
                ArrayList arrayList = new ArrayList(mm2.c(list2, 10));
                for (c33 c33Var3 : list2) {
                    arrayList.add(new b33(c33Var3.a, c33Var3.b, c33Var3.c, "", "", ""));
                }
                GetCredentialRequest getCredentialRequest = new GetCredentialRequest(arrayList, bundle, null, new ResultReceiver(null));
                Context context2 = tu4Var.e;
                context2.getClass();
                new ua4(context2, zoVar, voVar, b05.c).g(getCredentialRequest).addOnSuccessListener(new yu3(new f23(cancellationSignal, tu4Var, executor, a33Var, (byte) 1), (byte) 26)).addOnFailureListener(new ki(xu4Var, tu4Var, a33Var, executor, cancellationSignal));
                return;
            }
        } while (!(((c33) it.next()) instanceof zu4));
        if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_DIGITAL_CRED)) {
            Companion.getClass();
            if (w33.a(cancellationSignal)) {
                return;
            }
            onGetCredential$lambda$1(executor, a33Var);
            return;
        }
        t33 t33Var = new t33(context);
        t33Var.h = cancellationSignal;
        t33Var.f = a33Var;
        t33Var.g = executor;
        Companion.getClass();
        if (w33.a(cancellationSignal)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (c33 c33Var4 : list) {
            if (c33Var4 instanceof zu4) {
                arrayList2.add(new b33(c33Var4.a, c33Var4.b, c33Var4.c, ((zu4) c33Var4).e, "", ""));
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z);
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest getCredentialRequest2 = new GetCredentialRequest(arrayList2, bundle2, null, new ResultReceiver(null));
        Context context3 = t33Var.e;
        context3.getClass();
        new ua4(context3, zoVar, voVar, b05.c).g(getCredentialRequest2).addOnSuccessListener(new wm2(new f33(cancellationSignal, t33Var, (byte) 2), (byte) 11)).addOnFailureListener(new wu2(t33Var, cancellationSignal, executor, a33Var));
    }

    @Override // d33
    public /* bridge */ /* synthetic */ void onPrepareCredential(xu4 xu4Var, CancellationSignal cancellationSignal, Executor executor, a33 a33Var) {
        super.onPrepareCredential(xu4Var, cancellationSignal, executor, a33Var);
    }

    public void onSignalCredentialState(lja ljaVar, Executor executor, a33 a33Var) {
        throw null;
    }

    public final void setGoogleApiAvailability(d05 d05Var) {
        d05Var.getClass();
        this.googleApiAvailability = d05Var;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    @Override // d33
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    @Override // d33
    public /* bridge */ /* synthetic */ void onGetCredential(Context context, uk8 uk8Var, CancellationSignal cancellationSignal, Executor executor, a33 a33Var) {
        super.onGetCredential(context, uk8Var, cancellationSignal, executor, a33Var);
    }
}
