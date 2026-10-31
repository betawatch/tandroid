package androidx.credentials.playservices;

import a1.e;
import a1.h;
import ad.j;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bd.k;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.m;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Task;
import g7.b;
import h7.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import k6.d;
import kotlin.jvm.internal.p;
import ld.l;
import org.json.JSONException;
import v0.i;
import v0.o;
import v0.q;
import w0.a;
import w0.c;
import w7.p8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements i {
    public static final h Companion = new h();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private d googleApiAvailability;

    public CredentialProviderPlayServicesImpl(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.context = context;
        this.googleApiAvailability = d.d;
    }

    private final int isGooglePlayServicesAvailable(Context context, int i10) {
        return this.googleApiAvailability.d(context, i10);
    }

    private static final j onClearCredential$lambda$10(CancellationSignal cancellationSignal, Executor executor, v0.h hVar, Boolean bool) {
        Companion.getClass();
        if (!h.a(cancellationSignal)) {
            onClearCredential$lambda$10$lambda$9(executor, hVar);
        }
        return j.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j onClearCredential$lambda$10$lambda$9(Executor executor, v0.h hVar) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new e(hVar, 0));
        return j.a;
    }

    private static final void onClearCredential$lambda$14(CancellationSignal cancellationSignal, Executor executor, v0.h hVar, Exception e) {
        kotlin.jvm.internal.i.e(e, "e");
        Log.w(TAG, "Clearing restore credential failed", e);
        p pVar = new p();
        pVar.a = new a("Clear restore credential failed for unknown reason.");
        if ((e instanceof f) && ((f) e).getStatusCode() == 40201) {
            pVar.a = new a("The restore credential internal service had a failure.");
        }
        Companion.getClass();
        if (h.a(cancellationSignal)) {
            return;
        }
        onClearCredential$lambda$14$lambda$13(executor, hVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j onClearCredential$lambda$14$lambda$13(Executor executor, v0.h hVar, p pVar) {
        executor.execute(new a1.f(1, hVar, pVar));
        return j.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$14$lambda$13$lambda$12(v0.h hVar, p pVar) {
        hVar.g(pVar.a);
    }

    private static final j onClearCredential$lambda$17(CancellationSignal cancellationSignal, Executor executor, v0.h hVar, b bVar) {
        Companion.getClass();
        if (!h.a(cancellationSignal)) {
            onClearCredential$lambda$17$lambda$16(executor, hVar);
        }
        return j.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j onClearCredential$lambda$17$lambda$16(Executor executor, v0.h hVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new e(hVar, 4));
        return j.a;
    }

    private static final void onClearCredential$lambda$19(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, v0.a aVar, CancellationSignal cancellationSignal, Executor executor, v0.h hVar, Exception it) {
        kotlin.jvm.internal.i.e(it, "it");
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(aVar, cancellationSignal, executor, hVar);
    }

    private static final j onClearCredential$lambda$7(Executor executor, v0.h hVar) {
        executor.execute(new e(hVar, 5));
        return j.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$7$lambda$6(v0.h hVar) {
        hVar.g(new a("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"));
    }

    private static final j onCreateCredential$lambda$5(Executor executor, v0.h hVar) {
        executor.execute(new e(hVar, 1));
        return j.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$5$lambda$4(v0.h hVar) {
        hVar.g(new c(1, "createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    private static final j onGetCredential$lambda$1(Executor executor, v0.h hVar) {
        executor.execute(new e(hVar, 3));
        return j.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$lambda$0(v0.h hVar) {
        hVar.g(new w0.h(1, "this device requires a Google Play Services update for the given feature to be supported"));
    }

    private static final j onGetCredential$lambda$3(Executor executor, v0.h hVar) {
        executor.execute(new e(hVar, 2));
        return j.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$3$lambda$2(v0.h hVar) {
        hVar.g(new w0.h(1, "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    private final void runFallbackClearCredFlow(v0.a aVar, final CancellationSignal cancellationSignal, final Executor executor, final v0.h hVar) {
        i7.b a2 = p8.a(this.context);
        int i10 = 0;
        a2.a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = m.a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((m) it.next()).c();
        }
        com.google.android.gms.common.api.internal.h.a();
        v b10 = w.b();
        b10.d = new k6.c[]{i7.d.a};
        b10.c = new za.c(a2, 24);
        b10.b = false;
        b10.a = 1554;
        a2.e(1, b10.a()).addOnSuccessListener(new a1.c(new l() { // from class: a1.b
            @Override // ld.l
            public final Object invoke(Object obj) {
                j runFallbackClearCredFlow$lambda$22;
                runFallbackClearCredFlow$lambda$22 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$22(cancellationSignal, executor, hVar, (Void) obj);
                return runFallbackClearCredFlow$lambda$22;
            }
        }, i10)).addOnFailureListener(new a1.d(this, cancellationSignal, executor, hVar, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j runFallbackClearCredFlow$lambda$22(CancellationSignal cancellationSignal, Executor executor, v0.h hVar, Void r32) {
        Companion.getClass();
        if (!h.a(cancellationSignal)) {
            runFallbackClearCredFlow$lambda$22$lambda$21(executor, hVar);
        }
        return j.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j runFallbackClearCredFlow$lambda$22$lambda$21(Executor executor, v0.h hVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new e(hVar, 6));
        return j.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, v0.h hVar, Exception e) {
        kotlin.jvm.internal.i.e(e, "e");
        Companion.getClass();
        if (h.a(cancellationSignal)) {
            return;
        }
        runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(e, executor, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(Exception exc, Executor executor, v0.h hVar) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new a1.f(0, hVar, exc));
        return j.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24(v0.h hVar, Exception exc) {
        hVar.g(new a(exc.getMessage()));
    }

    public final d getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // v0.i
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public void onClearCredential(v0.a request, CancellationSignal cancellationSignal, Executor executor, v0.h hVar) {
        kotlin.jvm.internal.i.e(request, "request");
        throw null;
    }

    @Override // v0.i
    public void onCreateCredential(Context context, v0.b request, CancellationSignal cancellationSignal, Executor executor, v0.h callback) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(request, "request");
        kotlin.jvm.internal.i.e(executor, "executor");
        kotlin.jvm.internal.i.e(callback, "callback");
        h hVar = Companion;
        hVar.getClass();
        if (h.a(cancellationSignal)) {
            return;
        }
        if (!(request instanceof v0.e)) {
            throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
        }
        boolean isAvailableOnDevice = isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION);
        int i10 = 1;
        com.google.android.gms.common.api.a aVar = com.google.android.gms.common.api.b.k;
        if (isAvailableOnDevice) {
            e1.d dVar = new e1.d(context);
            v0.e eVar = (v0.e) request;
            dVar.h = cancellationSignal;
            dVar.f = callback;
            dVar.g = executor;
            hVar.getClass();
            if (h.a(cancellationSignal)) {
                return;
            }
            g7.f fVar = new g7.f("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", eVar.a, eVar.b, null, eVar.d, null);
            g gVar = new g(context, g.k, aVar, com.google.android.gms.common.api.i.c);
            v b10 = w.b();
            b10.d = new k6.c[]{q7.b.b};
            int i11 = 18;
            b10.c = new a4.l(fVar, i11);
            b10.a = 32704;
            Task e = gVar.e(1, b10.a());
            kotlin.jvm.internal.i.d(e, "doWrite(...)");
            e.addOnSuccessListener(new a1.c(new e1.b(cancellationSignal, dVar, executor, callback, 0), i11)).addOnFailureListener(new a1.d(cancellationSignal, dVar, executor, callback));
            return;
        }
        v0.e eVar2 = (v0.e) request;
        d1.f fVar2 = new d1.f(context);
        fVar2.h = cancellationSignal;
        fVar2.f = callback;
        fVar2.g = executor;
        try {
            c7.v d = fVar2.d(eVar2);
            hVar.getClass();
            if (h.a(cancellationSignal)) {
                return;
            }
            b7.a aVar2 = new b7.a(context, b7.a.k, aVar, new com.google.android.gms.common.api.internal.a());
            v b11 = w.b();
            b11.c = new a4.l(aVar2, d);
            b11.a = 5407;
            aVar2.e(0, b11.a()).addOnSuccessListener(new a1.c(new b1.f(2, cancellationSignal, fVar2), 17)).addOnFailureListener(new ag.m(8, fVar2, cancellationSignal));
        } catch (JSONException e7) {
            Companion.getClass();
            if (h.a(cancellationSignal)) {
                return;
            }
            Executor executor2 = fVar2.g;
            if (executor2 != null) {
                executor2.execute(new d1.b(fVar2, e7, i10));
            } else {
                kotlin.jvm.internal.i.h("executor");
                throw null;
            }
        } catch (Throwable th2) {
            Companion.getClass();
            if (h.a(cancellationSignal)) {
                return;
            }
            Executor executor3 = fVar2.g;
            if (executor3 != null) {
                executor3.execute(new d1.c(fVar2, th2, i10));
            } else {
                kotlin.jvm.internal.i.h("executor");
                throw null;
            }
        }
    }

    public void onGetCredential(Context context, v0.p pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, v0.h callback) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        kotlin.jvm.internal.i.e(executor, "executor");
        kotlin.jvm.internal.i.e(callback, "callback");
    }

    public void onPrepareCredential(v0.m request, CancellationSignal cancellationSignal, Executor executor, v0.h callback) {
        kotlin.jvm.internal.i.e(request, "request");
        kotlin.jvm.internal.i.e(executor, "executor");
        kotlin.jvm.internal.i.e(callback, "callback");
    }

    public void onSignalCredentialState(q request, Executor executor, v0.h hVar) {
        kotlin.jvm.internal.i.e(request, "request");
        throw null;
    }

    public final void setGoogleApiAvailability(d dVar) {
        kotlin.jvm.internal.i.e(dVar, "<set-?>");
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

    @Override // v0.i
    public void onGetCredential(Context context, v0.m request, CancellationSignal cancellationSignal, Executor executor, v0.h callback) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(request, "request");
        List<o> list = request.a;
        kotlin.jvm.internal.i.e(executor, "executor");
        kotlin.jvm.internal.i.e(callback, "callback");
        Companion.getClass();
        if (h.a(cancellationSignal)) {
            return;
        }
        for (o oVar : list) {
        }
        Companion.getClass();
        for (o oVar2 : list) {
        }
        if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            Companion.getClass();
            for (o oVar3 : list) {
            }
            new c1.d(context).g(request, cancellationSignal, executor, callback);
            return;
        }
        f1.b bVar = new f1.b(context);
        bVar.h = cancellationSignal;
        bVar.f = callback;
        bVar.g = executor;
        Companion.getClass();
        if (h.a(cancellationSignal)) {
            return;
        }
        Bundle g10 = a1.g.g("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        g10.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", request.b);
        g10.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        List<o> list2 = list;
        ArrayList arrayList = new ArrayList(k.d(list2));
        for (o oVar4 : list2) {
            oVar4.getClass();
            arrayList.add(new g7.h("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", oVar4.a, oVar4.b, "", "", ""));
        }
        GetCredentialRequest getCredentialRequest = new GetCredentialRequest(arrayList, g10, null, new ResultReceiver(null));
        Context context2 = bVar.e;
        kotlin.jvm.internal.i.e(context2, "context");
        g gVar = new g(context2, g.k, com.google.android.gms.common.api.b.k, com.google.android.gms.common.api.i.c);
        v b10 = w.b();
        b10.d = new k6.c[]{q7.b.a};
        b10.c = new k6.h(getCredentialRequest, 26);
        b10.a = 32701;
        Task e = gVar.e(0, b10.a());
        kotlin.jvm.internal.i.d(e, "doRead(...)");
        e.addOnSuccessListener(new a1.c(new e1.b(cancellationSignal, bVar, executor, callback, 1), 21)).addOnFailureListener(new f1.a(request, bVar, callback, executor, cancellationSignal));
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }
}
