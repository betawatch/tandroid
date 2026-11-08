package androidx.credentials.playservices;

import a1.b;
import a1.e;
import a1.g;
import aa.n;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.q7;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.m;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Task;
import di.q4;
import f7.v;
import gd.k;
import h9.f1;
import j7.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import n6.d;
import org.json.JSONException;
import rd.l;
import v0.i;
import v0.p;
import w0.a;
import w0.h;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements i {
    public static final g Companion = new g();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private d googleApiAvailability;

    public CredentialProviderPlayServicesImpl(Context context) {
        j.e(context, "context");
        this.context = context;
        this.googleApiAvailability = d.e;
    }

    private final int isGooglePlayServicesAvailable(Context context, int i7) {
        return this.googleApiAvailability.d(context, i7);
    }

    private static final k onClearCredential$lambda$10(CancellationSignal cancellationSignal, Executor executor, v0.g gVar, Boolean bool) {
        Companion.getClass();
        if (!g.a(cancellationSignal)) {
            onClearCredential$lambda$10$lambda$9(executor, gVar);
        }
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k onClearCredential$lambda$10$lambda$9(Executor executor, v0.g gVar) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new b(gVar, 0));
        return k.a;
    }

    private static final void onClearCredential$lambda$14(CancellationSignal cancellationSignal, Executor executor, v0.g gVar, Exception e10) {
        j.e(e10, "e");
        Log.w(TAG, "Clearing restore credential failed", e10);
        r rVar = new r();
        rVar.a = new a("Clear restore credential failed for unknown reason.");
        if ((e10 instanceof f) && ((f) e10).getStatusCode() == 40201) {
            rVar.a = new a("The restore credential internal service had a failure.");
        }
        Companion.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        onClearCredential$lambda$14$lambda$13(executor, gVar, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k onClearCredential$lambda$14$lambda$13(Executor executor, v0.g gVar, r rVar) {
        executor.execute(new e(1, gVar, rVar));
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$14$lambda$13$lambda$12(v0.g gVar, r rVar) {
        gVar.a(rVar.a);
    }

    private static final k onClearCredential$lambda$17(CancellationSignal cancellationSignal, Executor executor, v0.g gVar, c cVar) {
        Companion.getClass();
        if (!g.a(cancellationSignal)) {
            onClearCredential$lambda$17$lambda$16(executor, gVar);
        }
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k onClearCredential$lambda$17$lambda$16(Executor executor, v0.g gVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new b(gVar, 4));
        return k.a;
    }

    private static final void onClearCredential$lambda$19(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, v0.a aVar, CancellationSignal cancellationSignal, Executor executor, v0.g gVar, Exception it) {
        j.e(it, "it");
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(aVar, cancellationSignal, executor, gVar);
    }

    private static final k onClearCredential$lambda$7(Executor executor, v0.g gVar) {
        executor.execute(new b(gVar, 5));
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$7$lambda$6(v0.g gVar) {
        gVar.a(new a("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"));
    }

    private static final k onCreateCredential$lambda$5(Executor executor, v0.g gVar) {
        executor.execute(new b(gVar, 1));
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$5$lambda$4(v0.g gVar) {
        gVar.a(new w0.c(1, "createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k onGetCredential$lambda$1(Executor executor, v0.g gVar) {
        executor.execute(new b(gVar, 3));
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$lambda$0(v0.g gVar) {
        gVar.a(new h(1, "this device requires a Google Play Services update for the given feature to be supported"));
    }

    private static final k onGetCredential$lambda$3(Executor executor, v0.g gVar) {
        executor.execute(new b(gVar, 2));
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$3$lambda$2(v0.g gVar) {
        gVar.a(new h(1, "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    private final void runFallbackClearCredFlow(v0.a aVar, final CancellationSignal cancellationSignal, final Executor executor, final v0.g gVar) {
        l7.b a10 = a.a.a(this.context);
        int i7 = 0;
        a10.a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = m.a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((m) it.next()).c();
        }
        com.google.android.gms.common.api.internal.g.a();
        s b10 = t.b();
        b10.d = new n6.c[]{l7.d.a};
        b10.c = new gf.g(a10, 10);
        b10.b = false;
        b10.a = 1554;
        a10.e(1, b10.a()).addOnSuccessListener(new a1.c(new l() { // from class: a1.f
            @Override // rd.l
            public final Object invoke(Object obj) {
                k runFallbackClearCredFlow$lambda$22;
                runFallbackClearCredFlow$lambda$22 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$22(cancellationSignal, executor, gVar, (Void) obj);
                return runFallbackClearCredFlow$lambda$22;
            }
        }, i7)).addOnFailureListener(new a1.d(this, cancellationSignal, executor, gVar, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k runFallbackClearCredFlow$lambda$22(CancellationSignal cancellationSignal, Executor executor, v0.g gVar, Void r32) {
        Companion.getClass();
        if (!g.a(cancellationSignal)) {
            runFallbackClearCredFlow$lambda$22$lambda$21(executor, gVar);
        }
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k runFallbackClearCredFlow$lambda$22$lambda$21(Executor executor, v0.g gVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new b(gVar, 6));
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, v0.g gVar, Exception e10) {
        j.e(e10, "e");
        Companion.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(e10, executor, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(Exception exc, Executor executor, v0.g gVar) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new e(0, gVar, exc));
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24(v0.g gVar, Exception exc) {
        gVar.a(new a(exc.getMessage()));
    }

    public final d getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // v0.i
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public void onClearCredential(v0.a request, CancellationSignal cancellationSignal, Executor executor, v0.g gVar) {
        j.e(request, "request");
        throw null;
    }

    @Override // v0.i
    public void onCreateCredential(Context context, v0.b request, CancellationSignal cancellationSignal, Executor executor, v0.g callback) {
        j.e(context, "context");
        j.e(request, "request");
        j.e(executor, "executor");
        j.e(callback, "callback");
        g gVar = Companion;
        gVar.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        if (!(request instanceof v0.e)) {
            throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
        }
        boolean isAvailableOnDevice = isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION);
        int i7 = 1;
        com.google.android.gms.common.api.a aVar = com.google.android.gms.common.api.b.j;
        if (isAvailableOnDevice) {
            e1.d dVar = new e1.d(context);
            v0.e eVar = (v0.e) request;
            dVar.h = cancellationSignal;
            dVar.f = callback;
            dVar.g = executor;
            gVar.getClass();
            if (g.a(cancellationSignal)) {
                return;
            }
            j7.g gVar2 = new j7.g("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", eVar.a, eVar.b, null, eVar.d, null);
            k7.g gVar3 = new k7.g(context, k7.g.l, aVar, com.google.android.gms.common.api.i.c);
            s b10 = t.b();
            b10.d = new n6.c[]{t7.b.b};
            b10.c = new f1(gVar2, 4);
            b10.a = 32704;
            Task e10 = gVar3.e(1, b10.a());
            j.d(e10, "doWrite(...)");
            e10.addOnSuccessListener(new q4(new e1.b(cancellationSignal, dVar, executor, callback, 0), 5)).addOnFailureListener(new a1.d(cancellationSignal, dVar, executor, callback));
            return;
        }
        v0.e eVar2 = (v0.e) request;
        d1.e eVar3 = new d1.e(context);
        eVar3.h = cancellationSignal;
        eVar3.f = callback;
        eVar3.g = executor;
        try {
            v e11 = eVar3.e(eVar2);
            gVar.getClass();
            if (g.a(cancellationSignal)) {
                return;
            }
            e7.a aVar2 = new e7.a(context, e7.a.l, aVar, new sa.d(6));
            s b11 = t.b();
            b11.c = new n(aVar2, e11);
            b11.a = 5407;
            aVar2.e(0, b11.a()).addOnSuccessListener(new a1.c(new ae.d(3, cancellationSignal, eVar3), 23)).addOnFailureListener(new ab.g(9, eVar3, cancellationSignal));
        } catch (JSONException e12) {
            Companion.getClass();
            if (g.a(cancellationSignal)) {
                return;
            }
            Executor executor2 = eVar3.g;
            if (executor2 != null) {
                executor2.execute(new d1.b(eVar3, e12, i7));
            } else {
                j.h("executor");
                throw null;
            }
        } catch (Throwable th2) {
            Companion.getClass();
            if (g.a(cancellationSignal)) {
                return;
            }
            Executor executor3 = eVar3.g;
            if (executor3 != null) {
                executor3.execute(new d1.c(eVar3, th2, i7));
            } else {
                j.h("executor");
                throw null;
            }
        }
    }

    public void onGetCredential(Context context, v0.r pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, v0.g callback) {
        j.e(context, "context");
        j.e(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        j.e(executor, "executor");
        j.e(callback, "callback");
    }

    public void onPrepareCredential(v0.n request, CancellationSignal cancellationSignal, Executor executor, v0.g callback) {
        j.e(request, "request");
        j.e(executor, "executor");
        j.e(callback, "callback");
    }

    public void onSignalCredentialState(v0.s request, Executor executor, v0.g gVar) {
        j.e(request, "request");
        throw null;
    }

    public final void setGoogleApiAvailability(d dVar) {
        j.e(dVar, "<set-?>");
        this.googleApiAvailability = dVar;
    }

    public final boolean isAvailableOnDevice(int i7) {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, i7);
        boolean z9 = isGooglePlayServicesAvailable == 0;
        if (!z9) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new n6.a(isGooglePlayServicesAvailable, null, null));
        }
        return z9;
    }

    @Override // v0.i
    public void onGetCredential(Context context, v0.n request, CancellationSignal cancellationSignal, Executor executor, v0.g callback) {
        com.google.android.gms.common.api.a aVar;
        com.google.android.gms.common.api.e eVar;
        j.e(context, "context");
        j.e(request, "request");
        boolean z9 = request.b;
        List<v0.h> list = request.a;
        j.e(executor, "executor");
        j.e(callback, "callback");
        Companion.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        Iterator it = list.iterator();
        do {
            boolean hasNext = it.hasNext();
            aVar = com.google.android.gms.common.api.b.j;
            eVar = k7.g.l;
            if (!hasNext) {
                Companion.getClass();
                for (v0.h hVar : list) {
                }
                if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                    Companion.getClass();
                    for (v0.h hVar2 : list) {
                    }
                    new c1.e(context).h(request, cancellationSignal, executor, callback);
                    return;
                }
                f1.a aVar2 = new f1.a(context);
                aVar2.h = cancellationSignal;
                aVar2.f = callback;
                aVar2.g = executor;
                Companion.getClass();
                if (g.a(cancellationSignal)) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
                bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z9);
                bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
                List<v0.h> list2 = list;
                ArrayList arrayList = new ArrayList(hd.h.d(list2, 10));
                for (v0.h hVar3 : list2) {
                    arrayList.add(new j7.i(hVar3.a, hVar3.b, hVar3.c, "", "", ""));
                }
                GetCredentialRequest getCredentialRequest = new GetCredentialRequest(arrayList, bundle, null, new ResultReceiver(null));
                Context context2 = aVar2.e;
                j.e(context2, "context");
                new k7.g(context2, eVar, aVar, com.google.android.gms.common.api.i.c).f(getCredentialRequest).addOnSuccessListener(new q4(new e1.b(cancellationSignal, aVar2, executor, callback, 1), 8)).addOnFailureListener(new q7(request, aVar2, callback, executor, cancellationSignal));
                return;
            }
        } while (!(((v0.h) it.next()) instanceof p));
        if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_DIGITAL_CRED)) {
            Companion.getClass();
            if (g.a(cancellationSignal)) {
                return;
            }
            onGetCredential$lambda$1(executor, callback);
            return;
        }
        g1.a aVar3 = new g1.a(context);
        aVar3.h = cancellationSignal;
        aVar3.f = callback;
        aVar3.g = executor;
        Companion.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (v0.h hVar4 : list) {
            if (hVar4 instanceof p) {
                arrayList2.add(new j7.i(hVar4.a, hVar4.b, hVar4.c, ((p) hVar4).e, "", ""));
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z9);
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest getCredentialRequest2 = new GetCredentialRequest(arrayList2, bundle2, null, new ResultReceiver(null));
        Context context3 = aVar3.e;
        j.e(context3, "context");
        new k7.g(context3, eVar, aVar, com.google.android.gms.common.api.i.c).f(getCredentialRequest2).addOnSuccessListener(new q4(new ae.d(4, cancellationSignal, aVar3), 16)).addOnFailureListener(new a3.h(aVar3, cancellationSignal, executor, callback));
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }
}
