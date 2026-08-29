package androidx.credentials.playservices;

import a1.b;
import a1.e;
import a1.g;
import a9.s;
import ag.o1;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bd.l;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.m;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Task;
import h7.o8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.q;
import nh.d6;
import org.json.JSONException;
import org.telegram.ui.Components.n;
import qc.i;
import v0.j;
import v0.p;
import v0.r;
import w0.a;
import w0.c;
import w0.h;
import w5.d;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        kotlin.jvm.internal.j.e(context, "context");
        this.context = context;
        this.googleApiAvailability = d.d;
    }

    private final int isGooglePlayServicesAvailable(Context context, int i10) {
        return this.googleApiAvailability.d(context, i10);
    }

    private static final i onClearCredential$lambda$10(CancellationSignal cancellationSignal, Executor executor, v0.i iVar, Boolean bool) {
        Companion.getClass();
        if (!g.a(cancellationSignal)) {
            onClearCredential$lambda$10$lambda$9(executor, iVar);
        }
        return i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i onClearCredential$lambda$10$lambda$9(Executor executor, v0.i iVar) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new b(iVar, 0));
        return i.a;
    }

    private static final void onClearCredential$lambda$14(CancellationSignal cancellationSignal, Executor executor, v0.i iVar, Exception e10) {
        kotlin.jvm.internal.j.e(e10, "e");
        Log.w(TAG, "Clearing restore credential failed", e10);
        q qVar = new q();
        qVar.a = new a("Clear restore credential failed for unknown reason.");
        if ((e10 instanceof f) && ((f) e10).getStatusCode() == 40201) {
            qVar.a = new a("The restore credential internal service had a failure.");
        }
        Companion.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        onClearCredential$lambda$14$lambda$13(executor, iVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i onClearCredential$lambda$14$lambda$13(Executor executor, v0.i iVar, q qVar) {
        executor.execute(new e(1, iVar, qVar));
        return i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$14$lambda$13$lambda$12(v0.i iVar, q qVar) {
        iVar.onError(qVar.a);
    }

    private static final i onClearCredential$lambda$17(CancellationSignal cancellationSignal, Executor executor, v0.i iVar, s6.b bVar) {
        Companion.getClass();
        if (!g.a(cancellationSignal)) {
            onClearCredential$lambda$17$lambda$16(executor, iVar);
        }
        return i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i onClearCredential$lambda$17$lambda$16(Executor executor, v0.i iVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new b(iVar, 4));
        return i.a;
    }

    private static final void onClearCredential$lambda$19(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, v0.a aVar, CancellationSignal cancellationSignal, Executor executor, v0.i iVar, Exception it) {
        kotlin.jvm.internal.j.e(it, "it");
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(aVar, cancellationSignal, executor, iVar);
    }

    private static final i onClearCredential$lambda$7(Executor executor, v0.i iVar) {
        executor.execute(new b(iVar, 5));
        return i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$7$lambda$6(v0.i iVar) {
        iVar.onError(new a("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"));
    }

    private static final i onCreateCredential$lambda$5(Executor executor, v0.i iVar) {
        executor.execute(new b(iVar, 1));
        return i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$5$lambda$4(v0.i iVar) {
        iVar.onError(new c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
    }

    private static final i onGetCredential$lambda$1(Executor executor, v0.i iVar) {
        executor.execute(new b(iVar, 3));
        return i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$lambda$0(v0.i iVar) {
        iVar.onError(new h("this device requires a Google Play Services update for the given feature to be supported", 1));
    }

    private static final i onGetCredential$lambda$3(Executor executor, v0.i iVar) {
        executor.execute(new b(iVar, 2));
        return i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$3$lambda$2(v0.i iVar) {
        iVar.onError(new h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
    }

    private final void runFallbackClearCredFlow(v0.a aVar, final CancellationSignal cancellationSignal, final Executor executor, final v0.i iVar) {
        u6.b a2 = o8.a(this.context);
        int i10 = 0;
        a2.a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = m.a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f();
        }
        com.google.android.gms.common.api.internal.h.a();
        v b10 = w.b();
        b10.d = new w5.c[]{u6.d.a};
        b10.c = new n(a2, 21);
        b10.b = false;
        b10.a = 1554;
        a2.e(1, b10.b()).addOnSuccessListener(new a1.c(new l() { // from class: a1.f
            @Override // bd.l
            public final Object invoke(Object obj) {
                i runFallbackClearCredFlow$lambda$22;
                runFallbackClearCredFlow$lambda$22 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$22(cancellationSignal, executor, iVar, (Void) obj);
                return runFallbackClearCredFlow$lambda$22;
            }
        }, i10)).addOnFailureListener(new a1.d(this, cancellationSignal, executor, iVar, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i runFallbackClearCredFlow$lambda$22(CancellationSignal cancellationSignal, Executor executor, v0.i iVar, Void r32) {
        Companion.getClass();
        if (!g.a(cancellationSignal)) {
            runFallbackClearCredFlow$lambda$22$lambda$21(executor, iVar);
        }
        return i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i runFallbackClearCredFlow$lambda$22$lambda$21(Executor executor, v0.i iVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new b(iVar, 6));
        return i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, v0.i iVar, Exception e10) {
        kotlin.jvm.internal.j.e(e10, "e");
        Companion.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(e10, executor, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(Exception exc, Executor executor, v0.i iVar) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new e(0, iVar, exc));
        return i.a;
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
        kotlin.jvm.internal.j.e(request, "request");
        throw null;
    }

    @Override // v0.j
    public void onCreateCredential(Context context, v0.b request, CancellationSignal cancellationSignal, Executor executor, v0.i callback) {
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(request, "request");
        kotlin.jvm.internal.j.e(executor, "executor");
        kotlin.jvm.internal.j.e(callback, "callback");
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
        com.google.android.gms.common.api.a aVar = com.google.android.gms.common.api.b.i;
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
            s6.f fVar = new s6.f("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", eVar.a, eVar.b, null, eVar.d, null);
            t6.g gVar2 = new t6.g(context, t6.g.k, aVar, com.google.android.gms.common.api.i.c);
            v b10 = w.b();
            b10.d = new w5.c[]{c7.c.b};
            b10.c = new n(fVar, 17);
            b10.a = 32704;
            Task e10 = gVar2.e(1, b10.b());
            kotlin.jvm.internal.j.d(e10, "doWrite(...)");
            e10.addOnSuccessListener(new a1.c(new e1.b(cancellationSignal, dVar, executor, callback, 0), 22)).addOnFailureListener(new a1.d(cancellationSignal, dVar, executor, callback));
            return;
        }
        v0.e eVar2 = (v0.e) request;
        d1.e eVar3 = new d1.e(context);
        eVar3.h = cancellationSignal;
        eVar3.f = callback;
        eVar3.g = executor;
        try {
            o6.v d = eVar3.d(eVar2);
            gVar.getClass();
            if (g.a(cancellationSignal)) {
                return;
            }
            n6.a aVar2 = new n6.a(context, n6.a.k, aVar, new com.google.android.gms.common.api.internal.a());
            v b11 = w.b();
            b11.c = new o1(aVar2, d, 25);
            b11.a = 5407;
            aVar2.e(0, b11.b()).addOnSuccessListener(new a1.c(new b1.f(2, cancellationSignal, eVar3), 20)).addOnFailureListener(new s(6, eVar3, cancellationSignal));
        } catch (JSONException e11) {
            Companion.getClass();
            if (g.a(cancellationSignal)) {
                return;
            }
            Executor executor2 = eVar3.g;
            if (executor2 != null) {
                executor2.execute(new d1.b(eVar3, e11, i10));
            } else {
                kotlin.jvm.internal.j.h("executor");
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
                kotlin.jvm.internal.j.h("executor");
                throw null;
            }
        }
    }

    public void onGetCredential(Context context, v0.q pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, v0.i callback) {
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        kotlin.jvm.internal.j.e(executor, "executor");
        kotlin.jvm.internal.j.e(callback, "callback");
    }

    public void onPrepareCredential(v0.n request, CancellationSignal cancellationSignal, Executor executor, v0.i callback) {
        kotlin.jvm.internal.j.e(request, "request");
        kotlin.jvm.internal.j.e(executor, "executor");
        kotlin.jvm.internal.j.e(callback, "callback");
    }

    public void onSignalCredentialState(r request, Executor executor, v0.i iVar) {
        kotlin.jvm.internal.j.e(request, "request");
        throw null;
    }

    public final void setGoogleApiAvailability(d dVar) {
        kotlin.jvm.internal.j.e(dVar, "<set-?>");
        this.googleApiAvailability = dVar;
    }

    public final boolean isAvailableOnDevice(int i10) {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, i10);
        boolean z10 = isGooglePlayServicesAvailable == 0;
        if (!z10) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new w5.a(isGooglePlayServicesAvailable));
        }
        return z10;
    }

    @Override // v0.j
    public void onGetCredential(Context context, v0.n request, CancellationSignal cancellationSignal, Executor executor, v0.i callback) {
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(request, "request");
        List<p> list = request.a;
        kotlin.jvm.internal.j.e(executor, "executor");
        kotlin.jvm.internal.j.e(callback, "callback");
        Companion.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        for (p pVar : list) {
        }
        Companion.getClass();
        for (p pVar2 : list) {
        }
        if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            Companion.getClass();
            for (p pVar3 : list) {
            }
            new c1.e(context).g(request, cancellationSignal, executor, callback);
            return;
        }
        f1.b bVar = new f1.b(context);
        bVar.h = cancellationSignal;
        bVar.f = callback;
        bVar.g = executor;
        Companion.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        Bundle i10 = a4.w.i("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        i10.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", request.b);
        i10.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        List<p> list2 = list;
        ArrayList arrayList = new ArrayList(rc.i.d(list2));
        for (p pVar4 : list2) {
            pVar4.getClass();
            arrayList.add(new s6.h("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", pVar4.a, pVar4.b, "", "", ""));
        }
        GetCredentialRequest getCredentialRequest = new GetCredentialRequest(arrayList, i10, null, new ResultReceiver(null));
        Context context2 = bVar.e;
        kotlin.jvm.internal.j.e(context2, "context");
        t6.g gVar = new t6.g(context2, t6.g.k, com.google.android.gms.common.api.b.i, com.google.android.gms.common.api.i.c);
        v b10 = w.b();
        b10.d = new w5.c[]{c7.c.a};
        b10.c = new d6(getCredentialRequest, 24);
        b10.a = 32701;
        Task e10 = gVar.e(0, b10.b());
        kotlin.jvm.internal.j.d(e10, "doRead(...)");
        e10.addOnSuccessListener(new eg.n(new e1.b(cancellationSignal, bVar, executor, callback, 1), 2)).addOnFailureListener(new f1.a(request, bVar, callback, executor, cancellationSignal));
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }
}
