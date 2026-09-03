package androidx.credentials.playservices;

import a1.b;
import a1.e;
import a1.g;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.m;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Task;
import dd.l;
import j7.y8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.q;
import org.json.JSONException;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.web.e0;
import sc.i;
import v0.j;
import v0.n;
import v0.p;
import v0.r;
import w0.a;
import w0.c;
import w0.h;
import y5.d;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

    private static final void onClearCredential$lambda$14(CancellationSignal cancellationSignal, Executor executor, v0.i iVar, Exception e6) {
        kotlin.jvm.internal.j.e(e6, "e");
        Log.w(TAG, "Clearing restore credential failed", e6);
        q qVar = new q();
        qVar.a = new a("Clear restore credential failed for unknown reason.");
        if ((e6 instanceof f) && ((f) e6).getStatusCode() == 40201) {
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

    private static final i onClearCredential$lambda$17(CancellationSignal cancellationSignal, Executor executor, v0.i iVar, u6.b bVar) {
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
        w6.b a2 = y8.a(this.context);
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
        v e6 = w.e();
        e6.d = new y5.c[]{w6.d.a};
        e6.c = new e0(a2, 18);
        e6.b = false;
        e6.a = 1554;
        a2.e(1, e6.e()).addOnSuccessListener(new a1.c(new l() { // from class: a1.f
            @Override // dd.l
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
    public static final void runFallbackClearCredFlow$lambda$27(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, v0.i iVar, Exception e6) {
        kotlin.jvm.internal.j.e(e6, "e");
        Companion.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(e6, executor, iVar);
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
            u6.f fVar = new u6.f("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", eVar.a, eVar.b, null, eVar.d, null);
            v6.g gVar2 = new v6.g(context, v6.g.k, aVar, com.google.android.gms.common.api.i.c);
            v e6 = w.e();
            e6.d = new y5.c[]{e7.b.b};
            e6.c = new e0(fVar, 16);
            e6.a = 32704;
            Task e10 = gVar2.e(1, e6.e());
            kotlin.jvm.internal.j.d(e10, "doWrite(...)");
            e10.addOnSuccessListener(new a1.c(new e1.b(cancellationSignal, dVar, executor, callback, 0), 12)).addOnFailureListener(new a1.d(cancellationSignal, dVar, executor, callback));
            return;
        }
        v0.e eVar2 = (v0.e) request;
        d1.e eVar3 = new d1.e(context);
        eVar3.h = cancellationSignal;
        eVar3.f = callback;
        eVar3.g = executor;
        try {
            q6.v d = eVar3.d(eVar2);
            gVar.getClass();
            if (g.a(cancellationSignal)) {
                return;
            }
            p6.a aVar2 = new p6.a(context, p6.a.k, aVar, new com.google.android.gms.common.api.internal.a());
            v e11 = w.e();
            int i11 = 2;
            e11.c = new e0(aVar2, d, i11);
            e11.a = 5407;
            aVar2.e(0, e11.e()).addOnSuccessListener(new a1.c(new b1.f(i11, cancellationSignal, eVar3), 9)).addOnFailureListener(new c1.b(4, eVar3, cancellationSignal));
        } catch (JSONException e12) {
            Companion.getClass();
            if (g.a(cancellationSignal)) {
                return;
            }
            Executor executor2 = eVar3.g;
            if (executor2 != null) {
                executor2.execute(new d1.b(eVar3, e12, i10));
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

    public void onPrepareCredential(n request, CancellationSignal cancellationSignal, Executor executor, v0.i callback) {
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
        boolean z4 = isGooglePlayServicesAvailable == 0;
        if (!z4) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new y5.a(isGooglePlayServicesAvailable));
        }
        return z4;
    }

    @Override // v0.j
    public void onGetCredential(Context context, n request, CancellationSignal cancellationSignal, Executor executor, v0.i callback) {
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
            new c1.f(context).g(request, cancellationSignal, executor, callback);
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
        Bundle i10 = android.support.v4.media.a.i("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        i10.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", request.b);
        i10.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        List<p> list2 = list;
        ArrayList arrayList = new ArrayList(tc.i.d(list2));
        for (p pVar4 : list2) {
            pVar4.getClass();
            arrayList.add(new u6.h("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", pVar4.a, pVar4.b, "", "", ""));
        }
        GetCredentialRequest getCredentialRequest = new GetCredentialRequest(arrayList, i10, null, new ResultReceiver(null));
        Context context2 = bVar.e;
        kotlin.jvm.internal.j.e(context2, "context");
        v6.g gVar = new v6.g(context2, v6.g.k, com.google.android.gms.common.api.b.i, com.google.android.gms.common.api.i.c);
        v e6 = w.e();
        e6.d = new y5.c[]{e7.b.a};
        e6.c = new f1(getCredentialRequest, 23);
        e6.a = 32701;
        Task e10 = gVar.e(0, e6.e());
        kotlin.jvm.internal.j.d(e10, "doRead(...)");
        e10.addOnSuccessListener(new a1.c(new e1.b(cancellationSignal, bVar, executor, callback, 1), 26)).addOnFailureListener(new f1.a(request, bVar, callback, executor, cancellationSignal));
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }
}
