package androidx.credentials.playservices;

import a1.b;
import a1.e;
import a1.g;
import ah.i0;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.q5;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.m;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import k6.d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.json.JSONException;
import rd.l;
import v0.j;
import v0.n;
import v0.q;
import v0.r;
import w0.a;
import w0.c;
import w0.h;
import w7.g8;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements j {
    public static final g Companion = new g();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private d googleApiAvailability;

    public CredentialProviderPlayServicesImpl(Context context) {
        i.e(context, "context");
        this.context = context;
        this.googleApiAvailability = d.d;
    }

    private final int isGooglePlayServicesAvailable(Context context, int i10) {
        return this.googleApiAvailability.d(context, i10);
    }

    private static final gd.i onClearCredential$lambda$10(CancellationSignal cancellationSignal, Executor executor, v0.i iVar, Boolean bool) {
        Companion.getClass();
        if (!g.a(cancellationSignal)) {
            onClearCredential$lambda$10$lambda$9(executor, iVar);
        }
        return gd.i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gd.i onClearCredential$lambda$10$lambda$9(Executor executor, v0.i iVar) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new b(iVar, 0));
        return gd.i.a;
    }

    private static final void onClearCredential$lambda$14(CancellationSignal cancellationSignal, Executor executor, v0.i iVar, Exception e7) {
        i.e(e7, "e");
        Log.w(TAG, "Clearing restore credential failed", e7);
        p pVar = new p();
        pVar.a = new a("Clear restore credential failed for unknown reason.");
        if ((e7 instanceof f) && ((f) e7).getStatusCode() == 40201) {
            pVar.a = new a("The restore credential internal service had a failure.");
        }
        Companion.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        onClearCredential$lambda$14$lambda$13(executor, iVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gd.i onClearCredential$lambda$14$lambda$13(Executor executor, v0.i iVar, p pVar) {
        executor.execute(new e(1, iVar, pVar));
        return gd.i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$14$lambda$13$lambda$12(v0.i iVar, p pVar) {
        iVar.onError(pVar.a);
    }

    private static final gd.i onClearCredential$lambda$17(CancellationSignal cancellationSignal, Executor executor, v0.i iVar, g7.b bVar) {
        Companion.getClass();
        if (!g.a(cancellationSignal)) {
            onClearCredential$lambda$17$lambda$16(executor, iVar);
        }
        return gd.i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gd.i onClearCredential$lambda$17$lambda$16(Executor executor, v0.i iVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new b(iVar, 4));
        return gd.i.a;
    }

    private static final void onClearCredential$lambda$19(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, v0.a aVar, CancellationSignal cancellationSignal, Executor executor, v0.i iVar, Exception it) {
        i.e(it, "it");
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(aVar, cancellationSignal, executor, iVar);
    }

    private static final gd.i onClearCredential$lambda$7(Executor executor, v0.i iVar) {
        executor.execute(new b(iVar, 5));
        return gd.i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$7$lambda$6(v0.i iVar) {
        iVar.onError(new a("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"));
    }

    private static final gd.i onCreateCredential$lambda$5(Executor executor, v0.i iVar) {
        executor.execute(new b(iVar, 1));
        return gd.i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$5$lambda$4(v0.i iVar) {
        iVar.onError(new c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
    }

    private static final gd.i onGetCredential$lambda$1(Executor executor, v0.i iVar) {
        executor.execute(new b(iVar, 3));
        return gd.i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$lambda$0(v0.i iVar) {
        iVar.onError(new h("this device requires a Google Play Services update for the given feature to be supported", 1));
    }

    private static final gd.i onGetCredential$lambda$3(Executor executor, v0.i iVar) {
        executor.execute(new b(iVar, 2));
        return gd.i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$3$lambda$2(v0.i iVar) {
        iVar.onError(new h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
    }

    private final void runFallbackClearCredFlow(v0.a aVar, final CancellationSignal cancellationSignal, final Executor executor, final v0.i iVar) {
        i7.b a2 = g8.a(this.context);
        int i10 = 0;
        a2.a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = m.a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((m) it.next()).e();
        }
        com.google.android.gms.common.api.internal.h.a();
        v e7 = w.e();
        e7.d = new k6.c[]{i7.d.a};
        e7.c = new a6.m(a2, 23);
        e7.b = false;
        e7.a = 1554;
        a2.e(1, e7.a()).addOnSuccessListener(new a1.c(new l() { // from class: a1.f
            @Override // rd.l
            public final Object invoke(Object obj) {
                gd.i runFallbackClearCredFlow$lambda$22;
                runFallbackClearCredFlow$lambda$22 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$22(cancellationSignal, executor, iVar, (Void) obj);
                return runFallbackClearCredFlow$lambda$22;
            }
        }, i10)).addOnFailureListener(new a1.d(this, cancellationSignal, executor, iVar, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gd.i runFallbackClearCredFlow$lambda$22(CancellationSignal cancellationSignal, Executor executor, v0.i iVar, Void r32) {
        Companion.getClass();
        if (!g.a(cancellationSignal)) {
            runFallbackClearCredFlow$lambda$22$lambda$21(executor, iVar);
        }
        return gd.i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gd.i runFallbackClearCredFlow$lambda$22$lambda$21(Executor executor, v0.i iVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new b(iVar, 6));
        return gd.i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, v0.i iVar, Exception e7) {
        i.e(e7, "e");
        Companion.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(e7, executor, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gd.i runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(Exception exc, Executor executor, v0.i iVar) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new e(0, iVar, exc));
        return gd.i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24(v0.i iVar, Exception exc) {
        iVar.onError(new a(exc.getMessage()));
    }

    public final d getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // v0.j
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public void onClearCredential(v0.a request, CancellationSignal cancellationSignal, Executor executor, v0.i iVar) {
        i.e(request, "request");
        throw null;
    }

    @Override // v0.j
    public void onCreateCredential(Context context, v0.b request, CancellationSignal cancellationSignal, Executor executor, v0.i callback) {
        i.e(context, "context");
        i.e(request, "request");
        i.e(executor, "executor");
        i.e(callback, "callback");
        g gVar = Companion;
        gVar.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        if (!(request instanceof v0.e)) {
            throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
        }
        boolean isAvailableOnDevice = isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION);
        int i10 = 1;
        com.google.android.gms.common.api.a aVar = com.google.android.gms.common.api.b.t;
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
            g7.f fVar = new g7.f("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", eVar.a, eVar.b, null, eVar.d, null);
            h7.g gVar2 = new h7.g(context, h7.g.k, aVar, com.google.android.gms.common.api.i.c);
            v e7 = w.e();
            e7.d = new k6.c[]{q7.b.b};
            e7.c = new a6.i(fVar, 23);
            e7.a = 32704;
            Task e10 = gVar2.e(1, e7.a());
            i.d(e10, "doWrite(...)");
            e10.addOnSuccessListener(new a1.c(new e1.b(cancellationSignal, dVar, executor, callback, 0), 27)).addOnFailureListener(new a1.d(cancellationSignal, dVar, executor, callback));
            return;
        }
        v0.e eVar2 = (v0.e) request;
        d1.e eVar3 = new d1.e(context);
        eVar3.h = cancellationSignal;
        eVar3.f = callback;
        eVar3.g = executor;
        try {
            c7.v d = eVar3.d(eVar2);
            gVar.getClass();
            if (g.a(cancellationSignal)) {
                return;
            }
            b7.a aVar2 = new b7.a(context, b7.a.k, aVar, new com.google.android.gms.common.api.internal.a());
            v e11 = w.e();
            e11.c = new a6.i(aVar2, d, 7);
            e11.a = 5407;
            aVar2.e(0, e11.a()).addOnSuccessListener(new a1.c(new b1.f(2, cancellationSignal, eVar3), 19)).addOnFailureListener(new i0(9, eVar3, cancellationSignal));
        } catch (JSONException e12) {
            Companion.getClass();
            if (g.a(cancellationSignal)) {
                return;
            }
            Executor executor2 = eVar3.g;
            if (executor2 != null) {
                executor2.execute(new d1.b(eVar3, e12, i10));
            } else {
                i.h("executor");
                throw null;
            }
        } catch (Throwable th2) {
            Companion.getClass();
            if (g.a(cancellationSignal)) {
                return;
            }
            Executor executor3 = eVar3.g;
            if (executor3 != null) {
                executor3.execute(new d1.c(eVar3, th2, i10));
            } else {
                i.h("executor");
                throw null;
            }
        }
    }

    public void onGetCredential(Context context, q pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, v0.i callback) {
        i.e(context, "context");
        i.e(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        i.e(executor, "executor");
        i.e(callback, "callback");
    }

    public void onPrepareCredential(n request, CancellationSignal cancellationSignal, Executor executor, v0.i callback) {
        i.e(request, "request");
        i.e(executor, "executor");
        i.e(callback, "callback");
    }

    public void onSignalCredentialState(r request, Executor executor, v0.i iVar) {
        i.e(request, "request");
        throw null;
    }

    public final void setGoogleApiAvailability(d dVar) {
        i.e(dVar, "<set-?>");
        this.googleApiAvailability = dVar;
    }

    public final boolean isAvailableOnDevice(int i10) {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, i10);
        boolean z10 = isGooglePlayServicesAvailable == 0;
        if (!z10) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new k6.a(isGooglePlayServicesAvailable));
        }
        return z10;
    }

    @Override // v0.j
    public void onGetCredential(Context context, n request, CancellationSignal cancellationSignal, Executor executor, v0.i callback) {
        i.e(context, "context");
        i.e(request, "request");
        List<v0.p> list = request.a;
        i.e(executor, "executor");
        i.e(callback, "callback");
        Companion.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        for (v0.p pVar : list) {
        }
        Companion.getClass();
        for (v0.p pVar2 : list) {
        }
        if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            Companion.getClass();
            for (v0.p pVar3 : list) {
            }
            new c1.e(context).g(request, cancellationSignal, executor, callback);
            return;
        }
        f1.a aVar = new f1.a(context);
        aVar.h = cancellationSignal;
        aVar.f = callback;
        aVar.g = executor;
        Companion.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        Bundle i10 = a4.a.i("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        i10.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", request.b);
        i10.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        List<v0.p> list2 = list;
        ArrayList arrayList = new ArrayList(hd.i.d(list2));
        for (v0.p pVar4 : list2) {
            pVar4.getClass();
            arrayList.add(new g7.h("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", pVar4.a, pVar4.b, "", "", ""));
        }
        GetCredentialRequest getCredentialRequest = new GetCredentialRequest(arrayList, i10, null, new ResultReceiver(null));
        Context context2 = aVar.e;
        i.e(context2, "context");
        h7.g gVar = new h7.g(context2, h7.g.k, com.google.android.gms.common.api.b.t, com.google.android.gms.common.api.i.c);
        v e7 = w.e();
        e7.d = new k6.c[]{q7.b.a};
        e7.c = new a4.m(getCredentialRequest, 23);
        e7.a = 32701;
        Task e10 = gVar.e(0, e7.a());
        i.d(e10, "doRead(...)");
        e10.addOnSuccessListener(new a1.c(new e1.b(cancellationSignal, aVar, executor, callback, 1), 28)).addOnFailureListener(new q5(request, aVar, callback, executor, cancellationSignal));
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }
}
