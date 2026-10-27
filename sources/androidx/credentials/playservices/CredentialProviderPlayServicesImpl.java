package androidx.credentials.playservices;

import a1.e;
import a1.h;
import ai.f0;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.p7;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.m;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Task;
import h7.b;
import i7.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import l6.d;
import org.json.JSONException;
import ud.l;
import v0.j;
import v0.n;
import v0.q;
import v0.r;
import w0.a;
import w0.c;
import w7.j0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements j {
    public static final h Companion = new h();
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

    private static final jd.i onClearCredential$lambda$10(CancellationSignal cancellationSignal, Executor executor, v0.i iVar, Boolean bool) {
        Companion.getClass();
        if (!h.a(cancellationSignal)) {
            onClearCredential$lambda$10$lambda$9(executor, iVar);
        }
        return jd.i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd.i onClearCredential$lambda$10$lambda$9(Executor executor, v0.i iVar) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new e(iVar, 0));
        return jd.i.a;
    }

    private static final void onClearCredential$lambda$14(CancellationSignal cancellationSignal, Executor executor, v0.i iVar, Exception e) {
        i.e(e, "e");
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
        onClearCredential$lambda$14$lambda$13(executor, iVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd.i onClearCredential$lambda$14$lambda$13(Executor executor, v0.i iVar, p pVar) {
        executor.execute(new a1.f(1, iVar, pVar));
        return jd.i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$14$lambda$13$lambda$12(v0.i iVar, p pVar) {
        iVar.onError(pVar.a);
    }

    private static final jd.i onClearCredential$lambda$17(CancellationSignal cancellationSignal, Executor executor, v0.i iVar, b bVar) {
        Companion.getClass();
        if (!h.a(cancellationSignal)) {
            onClearCredential$lambda$17$lambda$16(executor, iVar);
        }
        return jd.i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd.i onClearCredential$lambda$17$lambda$16(Executor executor, v0.i iVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new e(iVar, 4));
        return jd.i.a;
    }

    private static final void onClearCredential$lambda$19(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, v0.a aVar, CancellationSignal cancellationSignal, Executor executor, v0.i iVar, Exception it) {
        i.e(it, "it");
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(aVar, cancellationSignal, executor, iVar);
    }

    private static final jd.i onClearCredential$lambda$7(Executor executor, v0.i iVar) {
        executor.execute(new e(iVar, 5));
        return jd.i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$7$lambda$6(v0.i iVar) {
        iVar.onError(new a("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"));
    }

    private static final jd.i onCreateCredential$lambda$5(Executor executor, v0.i iVar) {
        executor.execute(new e(iVar, 1));
        return jd.i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$5$lambda$4(v0.i iVar) {
        iVar.onError(new c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
    }

    private static final jd.i onGetCredential$lambda$1(Executor executor, v0.i iVar) {
        executor.execute(new e(iVar, 3));
        return jd.i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$lambda$0(v0.i iVar) {
        iVar.onError(new w0.h("this device requires a Google Play Services update for the given feature to be supported", 1));
    }

    private static final jd.i onGetCredential$lambda$3(Executor executor, v0.i iVar) {
        executor.execute(new e(iVar, 2));
        return jd.i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$3$lambda$2(v0.i iVar) {
        iVar.onError(new w0.h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
    }

    private final void runFallbackClearCredFlow(v0.a aVar, final CancellationSignal cancellationSignal, final Executor executor, final v0.i iVar) {
        j7.b a2 = j0.a(this.context);
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
        u b10 = v.b();
        b10.d = new l6.c[]{j7.d.a};
        b10.c = new za.c(a2, 29);
        b10.b = false;
        b10.a = 1554;
        a2.e(1, b10.a()).addOnSuccessListener(new a1.c(new l() { // from class: a1.b
            @Override // ud.l
            public final Object invoke(Object obj) {
                jd.i runFallbackClearCredFlow$lambda$22;
                runFallbackClearCredFlow$lambda$22 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$22(cancellationSignal, executor, iVar, (Void) obj);
                return runFallbackClearCredFlow$lambda$22;
            }
        }, i10)).addOnFailureListener(new a1.d(this, cancellationSignal, executor, iVar, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd.i runFallbackClearCredFlow$lambda$22(CancellationSignal cancellationSignal, Executor executor, v0.i iVar, Void r32) {
        Companion.getClass();
        if (!h.a(cancellationSignal)) {
            runFallbackClearCredFlow$lambda$22$lambda$21(executor, iVar);
        }
        return jd.i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd.i runFallbackClearCredFlow$lambda$22$lambda$21(Executor executor, v0.i iVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new e(iVar, 6));
        return jd.i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, v0.i iVar, Exception e) {
        i.e(e, "e");
        Companion.getClass();
        if (h.a(cancellationSignal)) {
            return;
        }
        runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(e, executor, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd.i runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(Exception exc, Executor executor, v0.i iVar) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new a1.f(0, iVar, exc));
        return jd.i.a;
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
        h hVar = Companion;
        hVar.getClass();
        if (h.a(cancellationSignal)) {
            return;
        }
        if (!(request instanceof v0.e)) {
            throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
        }
        boolean isAvailableOnDevice = isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION);
        int i10 = 0;
        int i11 = 1;
        com.google.android.gms.common.api.a aVar = com.google.android.gms.common.api.b.j;
        if (isAvailableOnDevice) {
            e1.e eVar = new e1.e(context);
            v0.e eVar2 = (v0.e) request;
            eVar.h = cancellationSignal;
            eVar.f = callback;
            eVar.g = executor;
            hVar.getClass();
            if (h.a(cancellationSignal)) {
                return;
            }
            h7.f fVar = new h7.f("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", eVar2.a, eVar2.b, null, eVar2.d, null);
            g gVar = new g(context, g.k, aVar, com.google.android.gms.common.api.i.c);
            u b10 = v.b();
            b10.d = new l6.c[]{r7.b.b};
            b10.c = new b6.i(fVar, 25);
            b10.a = 32704;
            Task e = gVar.e(1, b10.a());
            i.d(e, "doWrite(...)");
            e.addOnSuccessListener(new e1.c(new e1.b(cancellationSignal, eVar, executor, callback, 0), i10)).addOnFailureListener(new a1.d(cancellationSignal, eVar, executor, callback));
            return;
        }
        v0.e eVar3 = (v0.e) request;
        d1.e eVar4 = new d1.e(context);
        eVar4.h = cancellationSignal;
        eVar4.f = callback;
        eVar4.g = executor;
        try {
            d7.v d = eVar4.d(eVar3);
            hVar.getClass();
            if (h.a(cancellationSignal)) {
                return;
            }
            c7.a aVar2 = new c7.a(context, c7.a.k, aVar, new com.google.android.gms.common.api.internal.a());
            u b11 = v.b();
            b11.c = new rb.c(aVar2, d, 12);
            b11.a = 5407;
            aVar2.e(0, b11.a()).addOnSuccessListener(new a1.c(new b1.f(2, cancellationSignal, eVar4), 20)).addOnFailureListener(new f0(9, eVar4, cancellationSignal));
        } catch (JSONException e10) {
            Companion.getClass();
            if (h.a(cancellationSignal)) {
                return;
            }
            Executor executor2 = eVar4.g;
            if (executor2 != null) {
                executor2.execute(new d1.b(eVar4, e10, i11));
            } else {
                i.h("executor");
                throw null;
            }
        } catch (Throwable th2) {
            Companion.getClass();
            if (h.a(cancellationSignal)) {
                return;
            }
            Executor executor3 = eVar4.g;
            if (executor3 != null) {
                executor3.execute(new d1.c(eVar4, th2, i11));
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
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new l6.a(isGooglePlayServicesAvailable));
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
        if (h.a(cancellationSignal)) {
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
        if (h.a(cancellationSignal)) {
            return;
        }
        Bundle i10 = a1.g.i("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        i10.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", request.b);
        i10.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        List<v0.p> list2 = list;
        ArrayList arrayList = new ArrayList(kd.i.d(list2));
        for (v0.p pVar4 : list2) {
            pVar4.getClass();
            arrayList.add(new h7.h("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", pVar4.a, pVar4.b, "", "", ""));
        }
        GetCredentialRequest getCredentialRequest = new GetCredentialRequest(arrayList, i10, null, new ResultReceiver(null));
        Context context2 = aVar.e;
        i.e(context2, "context");
        g gVar = new g(context2, g.k, com.google.android.gms.common.api.b.j, com.google.android.gms.common.api.i.c);
        u b10 = v.b();
        b10.d = new l6.c[]{r7.b.a};
        b10.c = new a4.l(getCredentialRequest, 23);
        b10.a = 32701;
        Task e = gVar.e(0, b10.a());
        i.d(e, "doRead(...)");
        e.addOnSuccessListener(new e1.c(new e1.b(cancellationSignal, aVar, executor, callback, 1), 3)).addOnFailureListener(new p7(request, aVar, callback, executor, cancellationSignal));
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }
}
