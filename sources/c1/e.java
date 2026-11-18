package c1;

import a8.e7;
import a8.f7;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import c8.cc;
import c8.je;
import c8.y9;
import c8.yc;
import di.w2;
import f7.k;
import f7.l;
import f7.u;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import org.json.JSONException;
import q4.p;
import w0.g;
import w0.h;
import w0.i;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class e extends ResultReceiver {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(b1.d dVar, Handler handler, int i7) {
        super(handler);
        this.a = i7;
        this.b = dVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i7, Bundle resultData) {
        w0.d dVar;
        String string;
        Bundle bundle;
        v0.c a10;
        w0.d a11;
        int i10 = 18;
        int i11 = 0;
        int i12 = 2;
        q4.d dVar2 = null;
        int i13 = 1;
        switch (this.a) {
            case 0:
                j.e(resultData, "resultData");
                d dVar3 = new d(2, b1.d.a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 0);
                f fVar = (f) this.b;
                if (b1.d.b(resultData, dVar3, fVar.g(), fVar.f(), fVar.h)) {
                    return;
                }
                int i14 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) resultData.getParcelable("RESULT_DATA");
                int i15 = b1.d.c;
                if (i14 != i15) {
                    Log.w("BeginSignIn", "Returned request code " + i15 + " which  does not match what was given " + i14);
                    return;
                }
                if (e7.b(i7, new b1.e(i13), new b(fVar, i11), fVar.h)) {
                    return;
                }
                try {
                    e7.a(fVar.h, new b1.f(i13, fVar, fVar.e(a.a.a(fVar.e).f(intent))));
                    return;
                } catch (com.google.android.gms.common.api.f e10) {
                    r rVar = new r();
                    rVar.a = new h(2, e10.getMessage());
                    if (e10.getStatusCode() == 16) {
                        rVar.a = new g(e10.getMessage());
                    } else if (b1.d.b.contains(Integer.valueOf(e10.getStatusCode()))) {
                        rVar.a = new w0.j(e10.getMessage());
                    }
                    CancellationSignal cancellationSignal = fVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal)) {
                        return;
                    }
                    fVar.g().execute(new a1.e(28, fVar, rVar));
                    return;
                } catch (i e11) {
                    CancellationSignal cancellationSignal2 = fVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal2)) {
                        return;
                    }
                    fVar.g().execute(new a(fVar, e11, i13));
                    return;
                } catch (Throwable th2) {
                    h hVar = new h(2, th2.getMessage());
                    CancellationSignal cancellationSignal3 = fVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal3)) {
                        return;
                    }
                    fVar.g().execute(new a1.e(29, fVar, hVar));
                    return;
                }
            case 1:
                j.e(resultData, "resultData");
                d dVar4 = new d(2, b1.d.a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 1);
                d1.e eVar = (d1.e) this.b;
                Executor executor = eVar.g;
                if (executor == null) {
                    j.h("executor");
                    throw null;
                }
                v0.g gVar = eVar.f;
                if (gVar == null) {
                    j.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, dVar4, executor, gVar, eVar.h)) {
                    return;
                }
                int i16 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent2 = (Intent) resultData.getParcelable("RESULT_DATA");
                int i17 = b1.d.c;
                if (i16 != i17) {
                    Log.w("CreatePublicKey", "Returned request code " + i17 + " does not match what was given " + i16);
                    return;
                }
                if (b1.d.c(i7, new b1.e(i12), new b(eVar, i13), eVar.h)) {
                    return;
                }
                byte[] byteArrayExtra = intent2 != null ? intent2.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
                if (byteArrayExtra == null) {
                    a1.g gVar2 = CredentialProviderPlayServicesImpl.Companion;
                    CancellationSignal cancellationSignal4 = eVar.h;
                    gVar2.getClass();
                    if (a1.g.a(cancellationSignal4)) {
                        return;
                    }
                    Executor executor2 = eVar.g;
                    if (executor2 != null) {
                        executor2.execute(new d1.d(eVar, i13));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
                u uVar = (u) cc.a(byteArrayExtra, u.CREATOR);
                j.d(uVar, "deserializeFromBytes(...)");
                LinkedHashMap linkedHashMap = d1.g.a;
                l lVar = uVar.d;
                if (lVar == null && (lVar = uVar.e) == null && (lVar = uVar.f) == null) {
                    throw new IllegalStateException("No response set.");
                }
                if (lVar instanceof k) {
                    k kVar = (k) lVar;
                    f7.r rVar2 = kVar.a;
                    j.d(rVar2, "getErrorCode(...)");
                    x0.a aVar = (x0.a) d1.g.a.get(rVar2);
                    String str = kVar.b;
                    dVar = aVar == null ? new y0.a(new x0.a(26), p5.c.k("unknown fido gms exception - ", str)) : (rVar2 == f7.r.x && str != null && xd.d.e(str, "Unable to get sync account")) ? new w0.b("Passkey registration was cancelled by the user.") : new y0.a(aVar, str);
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    CancellationSignal cancellationSignal5 = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal5)) {
                        return;
                    }
                    Executor executor3 = eVar.g;
                    if (executor3 != null) {
                        executor3.execute(new d1.a(eVar, dVar, i12));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
                try {
                    v0.f f10 = d1.e.f(uVar);
                    CancellationSignal cancellationSignal6 = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal6)) {
                        return;
                    }
                    Executor executor4 = eVar.g;
                    if (executor4 != null) {
                        executor4.execute(new c(i10, eVar, f10));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                } catch (JSONException e12) {
                    CancellationSignal cancellationSignal7 = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal7)) {
                        return;
                    }
                    Executor executor5 = eVar.g;
                    if (executor5 != null) {
                        executor5.execute(new d1.b(eVar, e12, i11));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                } catch (Throwable th3) {
                    CancellationSignal cancellationSignal8 = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal8)) {
                        return;
                    }
                    Executor executor6 = eVar.g;
                    if (executor6 != null) {
                        executor6.execute(new d1.c(eVar, th3, i11));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
            case 2:
                j.e(resultData, "resultData");
                d dVar5 = new d(2, b1.d.a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 2);
                e1.d dVar6 = (e1.d) this.b;
                Executor executor7 = dVar6.g;
                if (executor7 == null) {
                    j.h("executor");
                    throw null;
                }
                v0.g gVar3 = dVar6.f;
                if (gVar3 == null) {
                    j.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, dVar5, executor7, gVar3, dVar6.h)) {
                    return;
                }
                int i18 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent3 = (Intent) y9.a(resultData);
                int i19 = b1.d.c;
                if (i18 != i19) {
                    Log.w("CreatePublicKey", "Returned request code " + i19 + " does not match what was given " + i18);
                    return;
                }
                if (b1.d.c(i7, new b1.e(4), new b(dVar6, i12), dVar6.h)) {
                    return;
                }
                if (intent3 == null) {
                    CancellationSignal cancellationSignal9 = dVar6.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal9)) {
                        return;
                    }
                    Executor executor8 = dVar6.g;
                    if (executor8 != null) {
                        executor8.execute(new e1.a(dVar6, i13));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
                int i20 = Build.VERSION.SDK_INT;
                if (i20 >= 34) {
                    a10 = h1.a.b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", intent3);
                } else {
                    Bundle bundleExtra = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                    a10 = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) ? null : yc.a(string, bundle);
                }
                if (a10 != null) {
                    CancellationSignal cancellationSignal10 = dVar6.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal10)) {
                        return;
                    }
                    Executor executor9 = dVar6.g;
                    if (executor9 != null) {
                        executor9.execute(new w2(i10, dVar6, a10));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
                if (i20 >= 34) {
                    a11 = h1.a.a(intent3);
                } else {
                    int i21 = w0.d.a;
                    Bundle bundleExtra2 = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                    if (bundleExtra2 == null) {
                        a11 = null;
                    } else {
                        String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string2 == null) {
                            throw new IllegalArgumentException("Bundle was missing exception type.");
                        }
                        a11 = je.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                    }
                }
                CancellationSignal cancellationSignal11 = dVar6.h;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal11)) {
                    return;
                }
                Executor executor10 = dVar6.g;
                if (executor10 != null) {
                    executor10.execute(new e1.c(dVar6, a11, i13));
                    return;
                } else {
                    j.h("executor");
                    throw null;
                }
            case 3:
                j.e(resultData, "resultData");
                d dVar7 = new d(2, b1.d.a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 3);
                f1.a aVar2 = (f1.a) this.b;
                Executor executor11 = aVar2.g;
                if (executor11 == null) {
                    j.h("executor");
                    throw null;
                }
                v0.g gVar4 = aVar2.f;
                if (gVar4 == null) {
                    j.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, dVar7, executor11, gVar4, aVar2.h)) {
                    return;
                }
                int i22 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent4 = (Intent) y9.a(resultData);
                Executor executor12 = aVar2.g;
                if (executor12 == null) {
                    j.h("executor");
                    throw null;
                }
                v0.g gVar5 = aVar2.f;
                if (gVar5 != null) {
                    f7.a(i22, i7, intent4, executor12, gVar5, aVar2.h);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 4:
                j.e(resultData, "resultData");
                d dVar8 = new d(2, b1.d.a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 4);
                g1.a aVar3 = (g1.a) this.b;
                Executor executor13 = aVar3.g;
                if (executor13 == null) {
                    j.h("executor");
                    throw null;
                }
                v0.g gVar6 = aVar3.f;
                if (gVar6 == null) {
                    j.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, dVar8, executor13, gVar6, aVar3.h)) {
                    return;
                }
                int i23 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent5 = (Intent) y9.a(resultData);
                Executor executor14 = aVar3.g;
                if (executor14 == null) {
                    j.h("executor");
                    throw null;
                }
                v0.g gVar7 = aVar3.f;
                if (gVar7 != null) {
                    f7.a(i23, i7, intent5, executor14, gVar7, aVar3.h);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                q4.f fVar2 = (q4.f) ((WeakReference) this.b).get();
                if (fVar2 == null || resultData == null) {
                    return;
                }
                synchronized (fVar2.b) {
                    p pVar = fVar2.e;
                    IBinder binder = resultData.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                    int i24 = q4.k.b;
                    if (binder != null) {
                        IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof q4.d)) {
                            q4.c cVar = new q4.c();
                            cVar.a = binder;
                            dVar2 = cVar;
                        } else {
                            dVar2 = (q4.d) queryLocalInterface;
                        }
                    }
                    pVar.b(dVar2);
                    fVar2.e.c(b5.a.a(resultData));
                    fVar2.a();
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q4.f fVar) {
        super(null);
        this.a = 5;
        this.b = new WeakReference(fVar);
    }
}
