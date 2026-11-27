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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements k23 {
    public static final d33 Companion = new d33();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private i05 googleApiAvailability;

    public CredentialProviderPlayServicesImpl(Context context) {
        context.getClass();
        this.context = context;
        this.googleApiAvailability = i05.e;
    }

    private final int isGooglePlayServicesAvailable(Context context, int i) {
        return this.googleApiAvailability.c(context, i);
    }

    private static final f9c onClearCredential$lambda$10(CancellationSignal cancellationSignal, Executor executor, h23 h23Var, Boolean bool) {
        Companion.getClass();
        if (!d33.a(cancellationSignal)) {
            onClearCredential$lambda$10$lambda$9(executor, h23Var);
        }
        return f9c.a;
    }

    private static final f9c onClearCredential$lambda$10$lambda$9(Executor executor, h23 h23Var) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new k13(h23Var, (byte) 2));
        return f9c.a;
    }

    private static final void onClearCredential$lambda$14(CancellationSignal cancellationSignal, Executor executor, h23 h23Var, Exception exc) {
        exc.getClass();
        Log.w(TAG, "Clearing restore credential failed", exc);
        p89 p89Var = new p89();
        p89Var.a = new ri2("Clear restore credential failed for unknown reason.");
        if ((exc instanceof ao) && ((ao) exc).getStatusCode() == 40201) {
            p89Var.a = new ri2("The restore credential internal service had a failure.");
        }
        Companion.getClass();
        if (d33.a(cancellationSignal)) {
            return;
        }
        onClearCredential$lambda$14$lambda$13(executor, h23Var, p89Var);
    }

    private static final f9c onClearCredential$lambda$14$lambda$13(Executor executor, h23 h23Var, p89 p89Var) {
        executor.execute(new bv2((Object) h23Var, (Object) p89Var, (byte) 21));
        return f9c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$14$lambda$13$lambda$12(h23 h23Var, p89 p89Var) {
        h23Var.B(p89Var.a);
    }

    private static final f9c onClearCredential$lambda$17(CancellationSignal cancellationSignal, Executor executor, h23 h23Var, ti2 ti2Var) {
        Companion.getClass();
        if (!d33.a(cancellationSignal)) {
            onClearCredential$lambda$17$lambda$16(executor, h23Var);
        }
        return f9c.a;
    }

    private static final f9c onClearCredential$lambda$17$lambda$16(Executor executor, h23 h23Var) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new k13(h23Var, (byte) 6));
        return f9c.a;
    }

    private static final void onClearCredential$lambda$19(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, si2 si2Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var, Exception exc) {
        exc.getClass();
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(si2Var, cancellationSignal, executor, h23Var);
    }

    private static final f9c onClearCredential$lambda$7(Executor executor, h23 h23Var) {
        executor.execute(new k13(h23Var, (byte) 7));
        return f9c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$7$lambda$6(h23 h23Var) {
        h23Var.B(new ri2("androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", "clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    private static final f9c onCreateCredential$lambda$5(Executor executor, h23 h23Var) {
        executor.execute(new k13(h23Var, (byte) 3));
        return f9c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$5$lambda$4(h23 h23Var) {
        h23Var.B(new v03("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", (byte) 1));
    }

    private static final f9c onGetCredential$lambda$1(Executor executor, h23 h23Var) {
        executor.execute(new k13(h23Var, (byte) 5));
        return f9c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$lambda$0(h23 h23Var) {
        h23Var.B(new xu4("this device requires a Google Play Services update for the given feature to be supported", (byte) 1));
    }

    private static final f9c onGetCredential$lambda$3(Executor executor, h23 h23Var) {
        executor.execute(new k13(h23Var, (byte) 4));
        return f9c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$3$lambda$2(h23 h23Var) {
        h23Var.B(new xu4("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", (byte) 1));
    }

    private final void runFallbackClearCredFlow(si2 si2Var, final CancellationSignal cancellationSignal, final Executor executor, final h23 h23Var) {
        h8d a = kpe.a(this.context);
        a.a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = m05.a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((m05) it.next()).b();
        }
        n05.a();
        wjb b = xjb.b();
        b.c = new a94[]{rid.a};
        b.a = new ve9((Object) a, (byte) 23);
        b.b = false;
        b.d = (char) 1554;
        a.e(1, b.a()).addOnSuccessListener(new ht2(new ur4() { // from class: c33
            @Override // ur4
            public final Object invoke(Object obj) {
                f9c runFallbackClearCredFlow$lambda$22;
                runFallbackClearCredFlow$lambda$22 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$22(cancellationSignal, executor, h23Var, (Void) obj);
                return runFallbackClearCredFlow$lambda$22;
            }
        }, (byte) 11)).addOnFailureListener(new pt((Object) this, (Object) cancellationSignal, (Object) executor, (Object) h23Var, (byte) 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f9c runFallbackClearCredFlow$lambda$22(CancellationSignal cancellationSignal, Executor executor, h23 h23Var, Void r3) {
        Companion.getClass();
        if (!d33.a(cancellationSignal)) {
            runFallbackClearCredFlow$lambda$22$lambda$21(executor, h23Var);
        }
        return f9c.a;
    }

    private static final f9c runFallbackClearCredFlow$lambda$22$lambda$21(Executor executor, h23 h23Var) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new k13(h23Var, (byte) 8));
        return f9c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, h23 h23Var, Exception exc) {
        exc.getClass();
        Companion.getClass();
        if (d33.a(cancellationSignal)) {
            return;
        }
        runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(exc, executor, h23Var);
    }

    private static final f9c runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(Exception exc, Executor executor, h23 h23Var) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new bv2((Object) h23Var, (Object) exc, (byte) 20));
        return f9c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24(h23 h23Var, Exception exc) {
        h23Var.B(new ri2(exc.getMessage()));
    }

    public final i05 getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int i) {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, i);
        boolean z = isGooglePlayServicesAvailable == 0;
        if (!z) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new ws2(isGooglePlayServicesAvailable, null, null));
        }
        return z;
    }

    public void onClearCredential(si2 si2Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var) {
        throw null;
    }

    @Override // k23
    public void onCreateCredential(Context context, b13 b13Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var) {
        context.getClass();
        b13Var.getClass();
        executor.getClass();
        h23Var.getClass();
        d33 d33Var = Companion;
        d33Var.getClass();
        if (d33.a(cancellationSignal)) {
            return;
        }
        if (!(b13Var instanceof t13)) {
            qyc.c("Create Credential request is unsupported, not password or publickeycredential");
            return;
        }
        boolean isAvailableOnDevice = isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION);
        byte b = 0;
        byte b2 = 1;
        vn vnVar = wn.g;
        if (isAvailableOnDevice) {
            r13 r13Var = new r13(context);
            t13 t13Var = (t13) b13Var;
            r13Var.h = cancellationSignal;
            r13Var.f = h23Var;
            r13Var.g = executor;
            d33Var.getClass();
            if (d33.a(cancellationSignal)) {
                return;
            }
            a13 a13Var = new a13("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", t13Var.a, t13Var.b, null, t13Var.d, null);
            qa4 qa4Var = new qa4(context, qa4.m, vnVar, g05.c);
            wjb b3 = xjb.b();
            b3.c = new a94[]{cjd.b};
            b3.a = new g9d(a13Var, (byte) 4);
            b3.d = (char) 32704;
            Task e = qa4Var.e(1, b3.a());
            e.getClass();
            e.addOnSuccessListener(new ht2(new m13(cancellationSignal, r13Var, executor, h23Var, (byte) 0), (byte) 7)).addOnFailureListener(new pt((Object) cancellationSignal, (Object) r13Var, (Object) executor, (Object) h23Var, (byte) 9));
            return;
        }
        t13 t13Var2 = (t13) b13Var;
        v23 v23Var = new v23(context);
        v23Var.h = cancellationSignal;
        v23Var.f = h23Var;
        v23Var.g = executor;
        try {
            vx8 d = v23Var.d(t13Var2);
            d33Var.getClass();
            if (d33.a(cancellationSignal)) {
                return;
            }
            qa4 qa4Var2 = new qa4(context, qa4.l, vnVar, new uif((byte) 13));
            wjb b4 = xjb.b();
            b4.a = new g9d(qa4Var2, d, b);
            b4.d = (char) 5407;
            qa4Var2.e(0, b4.a()).addOnSuccessListener(new ht2(new m23(cancellationSignal, v23Var, b2), (byte) 9)).addOnFailureListener(new q72((Object) v23Var, (Object) cancellationSignal, (byte) 14));
        } catch (JSONException e2) {
            Companion.getClass();
            if (d33.a(cancellationSignal)) {
                return;
            }
            Executor executor2 = v23Var.g;
            if (executor2 != null) {
                executor2.execute(new r23(v23Var, e2, b2));
            } else {
                ur5.e("executor");
                throw null;
            }
        } catch (Throwable th) {
            Companion.getClass();
            if (d33.a(cancellationSignal)) {
                return;
            }
            Executor executor3 = v23Var.g;
            if (executor3 != null) {
                executor3.execute(new s23(v23Var, th, b2));
            } else {
                ur5.e("executor");
                throw null;
            }
        }
    }

    @Override // k23
    public void onGetCredential(Context context, av4 av4Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var) {
        vn vnVar;
        zn znVar = qa4.m;
        context.getClass();
        av4Var.getClass();
        boolean z = av4Var.b;
        List<j23> list = av4Var.a;
        executor.getClass();
        h23Var.getClass();
        Companion.getClass();
        if (d33.a(cancellationSignal)) {
            return;
        }
        Iterator it = list.iterator();
        do {
            boolean hasNext = it.hasNext();
            vnVar = wn.g;
            if (!hasNext) {
                Companion.getClass();
                for (j23 j23Var : list) {
                }
                if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                    Companion.getClass();
                    for (j23 j23Var2 : list) {
                    }
                    new o23(context).g(av4Var, cancellationSignal, executor, h23Var);
                    return;
                }
                wu4 wu4Var = new wu4(context);
                wu4Var.h = cancellationSignal;
                wu4Var.f = h23Var;
                wu4Var.g = executor;
                Companion.getClass();
                if (d33.a(cancellationSignal)) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
                bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z);
                bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
                List<j23> list2 = list;
                ArrayList arrayList = new ArrayList(ul2.c(list2, 10));
                for (j23 j23Var3 : list2) {
                    arrayList.add(new i23(j23Var3.a, j23Var3.b, j23Var3.c, "", "", ""));
                }
                GetCredentialRequest getCredentialRequest = new GetCredentialRequest(arrayList, bundle, null, new ResultReceiver(null));
                Context context2 = wu4Var.e;
                context2.getClass();
                new qa4(context2, znVar, vnVar, g05.c).g(getCredentialRequest).addOnSuccessListener(new lu3(new m13(cancellationSignal, wu4Var, executor, h23Var, (byte) 1), (byte) 26)).addOnFailureListener(new xg(av4Var, wu4Var, h23Var, executor, cancellationSignal));
                return;
            }
        } while (!(((j23) it.next()) instanceof cv4));
        if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_DIGITAL_CRED)) {
            Companion.getClass();
            if (d33.a(cancellationSignal)) {
                return;
            }
            onGetCredential$lambda$1(executor, h23Var);
            return;
        }
        a33 a33Var = new a33(context);
        a33Var.h = cancellationSignal;
        a33Var.f = h23Var;
        a33Var.g = executor;
        Companion.getClass();
        if (d33.a(cancellationSignal)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (j23 j23Var4 : list) {
            if (j23Var4 instanceof cv4) {
                arrayList2.add(new i23(j23Var4.a, j23Var4.b, j23Var4.c, ((cv4) j23Var4).e, "", ""));
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z);
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest getCredentialRequest2 = new GetCredentialRequest(arrayList2, bundle2, null, new ResultReceiver(null));
        Context context3 = a33Var.e;
        context3.getClass();
        new qa4(context3, znVar, vnVar, g05.c).g(getCredentialRequest2).addOnSuccessListener(new ht2(new m23(cancellationSignal, a33Var, (byte) 2), (byte) 10)).addOnFailureListener(new fu2(a33Var, cancellationSignal, executor, h23Var));
    }

    @Override // k23
    public /* bridge */ /* synthetic */ void onPrepareCredential(av4 av4Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var) {
        super.onPrepareCredential(av4Var, cancellationSignal, executor, h23Var);
    }

    public void onSignalCredentialState(cla claVar, Executor executor, h23 h23Var) {
        throw null;
    }

    public final void setGoogleApiAvailability(i05 i05Var) {
        i05Var.getClass();
        this.googleApiAvailability = i05Var;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    @Override // k23
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    @Override // k23
    public /* bridge */ /* synthetic */ void onGetCredential(Context context, fm8 fm8Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var) {
        super.onGetCredential(context, fm8Var, cancellationSignal, executor, h23Var);
    }
}
