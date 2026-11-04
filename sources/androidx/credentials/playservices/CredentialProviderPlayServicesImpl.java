package androidx.credentials.playservices;

import a1.e;
import a1.h;
import ai.n;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.m;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Task;
import dd.k;
import e7.v;
import ei.y8;
import gi.v5;
import i7.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import m6.d;
import od.l;
import org.json.JSONException;
import v0.i;
import v0.o;
import v0.p;
import v0.q;
import w0.a;
import w0.c;
import x7.r6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        j.e(context, "context");
        this.context = context;
        this.googleApiAvailability = d.e;
    }

    private final int isGooglePlayServicesAvailable(Context context, int i3) {
        return this.googleApiAvailability.d(context, i3);
    }

    private static final k onClearCredential$lambda$10(CancellationSignal cancellationSignal, Executor executor, v0.h hVar, Boolean bool) {
        Companion.getClass();
        if (!h.a(cancellationSignal)) {
            onClearCredential$lambda$10$lambda$9(executor, hVar);
        }
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k onClearCredential$lambda$10$lambda$9(Executor executor, v0.h hVar) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new e(hVar, 0));
        return k.a;
    }

    private static final void onClearCredential$lambda$14(CancellationSignal cancellationSignal, Executor executor, v0.h hVar, Exception e10) {
        j.e(e10, "e");
        Log.w(TAG, "Clearing restore credential failed", e10);
        r rVar = new r();
        rVar.a = new a("Clear restore credential failed for unknown reason.");
        if ((e10 instanceof f) && ((f) e10).getStatusCode() == 40201) {
            rVar.a = new a("The restore credential internal service had a failure.");
        }
        Companion.getClass();
        if (h.a(cancellationSignal)) {
            return;
        }
        onClearCredential$lambda$14$lambda$13(executor, hVar, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k onClearCredential$lambda$14$lambda$13(Executor executor, v0.h hVar, r rVar) {
        executor.execute(new a1.f(1, hVar, rVar));
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$14$lambda$13$lambda$12(v0.h hVar, r rVar) {
        hVar.a(rVar.a);
    }

    private static final k onClearCredential$lambda$17(CancellationSignal cancellationSignal, Executor executor, v0.h hVar, b bVar) {
        Companion.getClass();
        if (!h.a(cancellationSignal)) {
            onClearCredential$lambda$17$lambda$16(executor, hVar);
        }
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k onClearCredential$lambda$17$lambda$16(Executor executor, v0.h hVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new e(hVar, 4));
        return k.a;
    }

    private static final void onClearCredential$lambda$19(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, v0.a aVar, CancellationSignal cancellationSignal, Executor executor, v0.h hVar, Exception it) {
        j.e(it, "it");
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(aVar, cancellationSignal, executor, hVar);
    }

    private static final k onClearCredential$lambda$7(Executor executor, v0.h hVar) {
        executor.execute(new e(hVar, 5));
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$7$lambda$6(v0.h hVar) {
        hVar.a(new a("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"));
    }

    private static final k onCreateCredential$lambda$5(Executor executor, v0.h hVar) {
        executor.execute(new e(hVar, 1));
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$5$lambda$4(v0.h hVar) {
        hVar.a(new c(1, "createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    private static final k onGetCredential$lambda$1(Executor executor, v0.h hVar) {
        executor.execute(new e(hVar, 3));
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$lambda$0(v0.h hVar) {
        hVar.a(new w0.h(1, "this device requires a Google Play Services update for the given feature to be supported"));
    }

    private static final k onGetCredential$lambda$3(Executor executor, v0.h hVar) {
        executor.execute(new e(hVar, 2));
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$3$lambda$2(v0.h hVar) {
        hVar.a(new w0.h(1, "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    private final void runFallbackClearCredFlow(v0.a aVar, final CancellationSignal cancellationSignal, final Executor executor, final v0.h hVar) {
        k7.b a10 = r6.a(this.context);
        int i3 = 0;
        a10.a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = m.a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((m) it.next()).e();
        }
        g.a();
        s b10 = t.b();
        b10.d = new m6.c[]{k7.d.a};
        b10.c = new hi.d(a10, 4);
        b10.b = false;
        b10.a = 1554;
        a10.e(1, b10.a()).addOnSuccessListener(new a1.c(new l() { // from class: a1.b
            @Override // od.l
            public final Object invoke(Object obj) {
                k runFallbackClearCredFlow$lambda$22;
                runFallbackClearCredFlow$lambda$22 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$22(cancellationSignal, executor, hVar, (Void) obj);
                return runFallbackClearCredFlow$lambda$22;
            }
        }, i3)).addOnFailureListener(new a1.d(this, cancellationSignal, executor, hVar, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k runFallbackClearCredFlow$lambda$22(CancellationSignal cancellationSignal, Executor executor, v0.h hVar, Void r32) {
        Companion.getClass();
        if (!h.a(cancellationSignal)) {
            runFallbackClearCredFlow$lambda$22$lambda$21(executor, hVar);
        }
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k runFallbackClearCredFlow$lambda$22$lambda$21(Executor executor, v0.h hVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new e(hVar, 6));
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, v0.h hVar, Exception e10) {
        j.e(e10, "e");
        Companion.getClass();
        if (h.a(cancellationSignal)) {
            return;
        }
        runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(e10, executor, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(Exception exc, Executor executor, v0.h hVar) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new a1.f(0, hVar, exc));
        return k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24(v0.h hVar, Exception exc) {
        hVar.a(new a(exc.getMessage()));
    }

    public final d getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // v0.i
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public void onClearCredential(v0.a request, CancellationSignal cancellationSignal, Executor executor, v0.h hVar) {
        j.e(request, "request");
        throw null;
    }

    @Override // v0.i
    public void onCreateCredential(Context context, v0.b request, CancellationSignal cancellationSignal, Executor executor, v0.h callback) {
        j.e(context, "context");
        j.e(request, "request");
        j.e(executor, "executor");
        j.e(callback, "callback");
        h hVar = Companion;
        hVar.getClass();
        if (h.a(cancellationSignal)) {
            return;
        }
        if (!(request instanceof v0.e)) {
            throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
        }
        boolean isAvailableOnDevice = isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION);
        int i3 = 1;
        com.google.android.gms.common.api.a aVar = com.google.android.gms.common.api.b.j;
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
            i7.f fVar = new i7.f("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", eVar.a, eVar.b, null, eVar.d, null);
            j7.g gVar = new j7.g(context, j7.g.l, aVar, com.google.android.gms.common.api.i.c);
            s b10 = t.b();
            b10.d = new m6.c[]{s7.b.b};
            b10.c = new v5(fVar, 4);
            b10.a = 32704;
            Task e10 = gVar.e(1, b10.a());
            j.d(e10, "doWrite(...)");
            e10.addOnSuccessListener(new a1.c(new e1.b(cancellationSignal, dVar, executor, callback, 0), 22)).addOnFailureListener(new a1.d(cancellationSignal, dVar, executor, callback));
            return;
        }
        v0.e eVar2 = (v0.e) request;
        d1.e eVar3 = new d1.e(context);
        eVar3.h = cancellationSignal;
        eVar3.f = callback;
        eVar3.g = executor;
        try {
            v d = eVar3.d(eVar2);
            hVar.getClass();
            if (h.a(cancellationSignal)) {
                return;
            }
            d7.a aVar2 = new d7.a(context, d7.a.l, aVar, new mb.b(5));
            s b11 = t.b();
            b11.c = new android.support.v4.media.c(aVar2, d);
            b11.a = 5407;
            aVar2.e(0, b11.a()).addOnSuccessListener(new a1.c(new b1.e(2, cancellationSignal, eVar3), 21)).addOnFailureListener(new n(11, eVar3, cancellationSignal));
        } catch (JSONException e11) {
            Companion.getClass();
            if (h.a(cancellationSignal)) {
                return;
            }
            Executor executor2 = eVar3.g;
            if (executor2 != null) {
                executor2.execute(new d1.b(eVar3, e11, i3));
            } else {
                j.h("executor");
                throw null;
            }
        } catch (Throwable th2) {
            Companion.getClass();
            if (h.a(cancellationSignal)) {
                return;
            }
            Executor executor3 = eVar3.g;
            if (executor3 != null) {
                executor3.execute(new d1.c(eVar3, th2, i3));
            } else {
                j.h("executor");
                throw null;
            }
        }
    }

    public void onGetCredential(Context context, p pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, v0.h callback) {
        j.e(context, "context");
        j.e(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        j.e(executor, "executor");
        j.e(callback, "callback");
    }

    public void onPrepareCredential(v0.m request, CancellationSignal cancellationSignal, Executor executor, v0.h callback) {
        j.e(request, "request");
        j.e(executor, "executor");
        j.e(callback, "callback");
    }

    public void onSignalCredentialState(q request, Executor executor, v0.h hVar) {
        j.e(request, "request");
        throw null;
    }

    public final void setGoogleApiAvailability(d dVar) {
        j.e(dVar, "<set-?>");
        this.googleApiAvailability = dVar;
    }

    public final boolean isAvailableOnDevice(int i3) {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, i3);
        boolean z10 = isGooglePlayServicesAvailable == 0;
        if (!z10) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new m6.a(isGooglePlayServicesAvailable, null, null));
        }
        return z10;
    }

    @Override // v0.i
    public void onGetCredential(Context context, v0.m request, CancellationSignal cancellationSignal, Executor executor, v0.h callback) {
        j.e(context, "context");
        j.e(request, "request");
        List<o> list = request.a;
        j.e(executor, "executor");
        j.e(callback, "callback");
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
        Bundle k10 = a1.g.k("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        k10.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", request.b);
        k10.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        List<o> list2 = list;
        ArrayList arrayList = new ArrayList(ed.i.d(list2, 10));
        for (o oVar4 : list2) {
            oVar4.getClass();
            arrayList.add(new i7.h("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", oVar4.a, oVar4.b, "", "", ""));
        }
        GetCredentialRequest getCredentialRequest = new GetCredentialRequest(arrayList, k10, null, new ResultReceiver(null));
        Context context2 = aVar.e;
        j.e(context2, "context");
        j7.g gVar = new j7.g(context2, j7.g.l, com.google.android.gms.common.api.b.j, com.google.android.gms.common.api.i.c);
        s b10 = t.b();
        b10.d = new m6.c[]{s7.b.a};
        b10.c = new hi.d(getCredentialRequest, 2);
        b10.a = 32701;
        Task e10 = gVar.e(0, b10.a());
        j.d(e10, "doRead(...)");
        e10.addOnSuccessListener(new y8(new e1.b(cancellationSignal, aVar, executor, callback, 1), 1)).addOnFailureListener(new ci.r6(request, aVar, callback, executor, cancellationSignal));
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }
}
