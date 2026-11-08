package c1;

import a8.d7;
import a8.e7;
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
import b1.f;
import bi.a4;
import c8.ge;
import c8.vc;
import c8.x9;
import c8.yb;
import di.z0;
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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class d extends ResultReceiver {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(b1.d dVar, Handler handler, int i7) {
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
        int i10 = 0;
        int i11 = 2;
        q4.d dVar2 = null;
        int i12 = 1;
        switch (this.a) {
            case 0:
                j.e(resultData, "resultData");
                c cVar = new c(2, b1.d.a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 0);
                e eVar = (e) this.b;
                if (b1.d.b(resultData, cVar, eVar.g(), eVar.f(), eVar.h)) {
                    return;
                }
                int i13 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) resultData.getParcelable("RESULT_DATA");
                int i14 = b1.d.c;
                if (i13 != i14) {
                    Log.w("BeginSignIn", "Returned request code " + i14 + " which  does not match what was given " + i13);
                    return;
                }
                if (d7.b(i7, new b1.e(i12), new b(eVar, i10), eVar.h)) {
                    return;
                }
                try {
                    d7.a(eVar.h, new f(i12, eVar, eVar.e(a.a.a(eVar.e).f(intent))));
                    return;
                } catch (com.google.android.gms.common.api.f e10) {
                    r rVar = new r();
                    rVar.a = new h(2, e10.getMessage());
                    if (e10.getStatusCode() == 16) {
                        rVar.a = new g(e10.getMessage());
                    } else if (b1.d.b.contains(Integer.valueOf(e10.getStatusCode()))) {
                        rVar.a = new w0.j(e10.getMessage());
                    }
                    CancellationSignal cancellationSignal = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal)) {
                        return;
                    }
                    eVar.g().execute(new a4(12, eVar, rVar));
                    return;
                } catch (i e11) {
                    CancellationSignal cancellationSignal2 = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal2)) {
                        return;
                    }
                    eVar.g().execute(new a(eVar, e11, i12));
                    return;
                } catch (Throwable th2) {
                    h hVar = new h(2, th2.getMessage());
                    CancellationSignal cancellationSignal3 = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal3)) {
                        return;
                    }
                    eVar.g().execute(new a4(13, eVar, hVar));
                    return;
                }
            case 1:
                j.e(resultData, "resultData");
                c cVar2 = new c(2, b1.d.a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 1);
                d1.e eVar2 = (d1.e) this.b;
                Executor executor = eVar2.g;
                if (executor == null) {
                    j.h("executor");
                    throw null;
                }
                v0.g gVar = eVar2.f;
                if (gVar == null) {
                    j.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, cVar2, executor, gVar, eVar2.h)) {
                    return;
                }
                int i15 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent2 = (Intent) resultData.getParcelable("RESULT_DATA");
                int i16 = b1.d.c;
                if (i15 != i16) {
                    Log.w("CreatePublicKey", "Returned request code " + i16 + " does not match what was given " + i15);
                    return;
                }
                if (b1.d.c(i7, new b1.e(i11), new b(eVar2, i12), eVar2.h)) {
                    return;
                }
                byte[] byteArrayExtra = intent2 != null ? intent2.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
                if (byteArrayExtra == null) {
                    a1.g gVar2 = CredentialProviderPlayServicesImpl.Companion;
                    CancellationSignal cancellationSignal4 = eVar2.h;
                    gVar2.getClass();
                    if (a1.g.a(cancellationSignal4)) {
                        return;
                    }
                    Executor executor2 = eVar2.g;
                    if (executor2 != null) {
                        executor2.execute(new d1.d(eVar2, i12));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
                u uVar = (u) yb.a(byteArrayExtra, u.CREATOR);
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
                    dVar = aVar == null ? new y0.a(new x0.a(26), rf.b.i("unknown fido gms exception - ", str)) : (rVar2 == f7.r.x && str != null && xd.d.e(str, "Unable to get sync account")) ? new w0.b("Passkey registration was cancelled by the user.") : new y0.a(aVar, str);
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    CancellationSignal cancellationSignal5 = eVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal5)) {
                        return;
                    }
                    Executor executor3 = eVar2.g;
                    if (executor3 != null) {
                        executor3.execute(new d1.a(eVar2, dVar, i11));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
                try {
                    v0.f f10 = d1.e.f(uVar);
                    CancellationSignal cancellationSignal6 = eVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal6)) {
                        return;
                    }
                    Executor executor4 = eVar2.g;
                    if (executor4 != null) {
                        executor4.execute(new a4(21, eVar2, f10));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                } catch (JSONException e12) {
                    CancellationSignal cancellationSignal7 = eVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal7)) {
                        return;
                    }
                    Executor executor5 = eVar2.g;
                    if (executor5 != null) {
                        executor5.execute(new d1.b(eVar2, e12, i10));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                } catch (Throwable th3) {
                    CancellationSignal cancellationSignal8 = eVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal8)) {
                        return;
                    }
                    Executor executor6 = eVar2.g;
                    if (executor6 != null) {
                        executor6.execute(new d1.c(eVar2, th3, i10));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
            case 2:
                j.e(resultData, "resultData");
                c cVar3 = new c(2, b1.d.a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 2);
                e1.d dVar3 = (e1.d) this.b;
                Executor executor7 = dVar3.g;
                if (executor7 == null) {
                    j.h("executor");
                    throw null;
                }
                v0.g gVar3 = dVar3.f;
                if (gVar3 == null) {
                    j.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, cVar3, executor7, gVar3, dVar3.h)) {
                    return;
                }
                int i17 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent3 = (Intent) x9.a(resultData);
                int i18 = b1.d.c;
                if (i17 != i18) {
                    Log.w("CreatePublicKey", "Returned request code " + i18 + " does not match what was given " + i17);
                    return;
                }
                if (b1.d.c(i7, new b1.e(4), new b(dVar3, i11), dVar3.h)) {
                    return;
                }
                if (intent3 == null) {
                    CancellationSignal cancellationSignal9 = dVar3.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal9)) {
                        return;
                    }
                    Executor executor8 = dVar3.g;
                    if (executor8 != null) {
                        executor8.execute(new e1.a(dVar3, i12));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
                int i19 = Build.VERSION.SDK_INT;
                if (i19 >= 34) {
                    a10 = h1.a.b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", intent3);
                } else {
                    Bundle bundleExtra = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                    a10 = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) ? null : vc.a(string, bundle);
                }
                if (a10 != null) {
                    CancellationSignal cancellationSignal10 = dVar3.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal10)) {
                        return;
                    }
                    Executor executor9 = dVar3.g;
                    if (executor9 != null) {
                        executor9.execute(new z0(28, dVar3, a10));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
                if (i19 >= 34) {
                    a11 = h1.a.a(intent3);
                } else {
                    int i20 = w0.d.a;
                    Bundle bundleExtra2 = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                    if (bundleExtra2 == null) {
                        a11 = null;
                    } else {
                        String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string2 == null) {
                            throw new IllegalArgumentException("Bundle was missing exception type.");
                        }
                        a11 = ge.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                    }
                }
                CancellationSignal cancellationSignal11 = dVar3.h;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal11)) {
                    return;
                }
                Executor executor10 = dVar3.g;
                if (executor10 != null) {
                    executor10.execute(new e1.c(dVar3, a11, i12));
                    return;
                } else {
                    j.h("executor");
                    throw null;
                }
            case 3:
                j.e(resultData, "resultData");
                c cVar4 = new c(2, b1.d.a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 3);
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
                if (b1.d.b(resultData, cVar4, executor11, gVar4, aVar2.h)) {
                    return;
                }
                int i21 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent4 = (Intent) x9.a(resultData);
                Executor executor12 = aVar2.g;
                if (executor12 == null) {
                    j.h("executor");
                    throw null;
                }
                v0.g gVar5 = aVar2.f;
                if (gVar5 != null) {
                    e7.a(i21, i7, intent4, executor12, gVar5, aVar2.h);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 4:
                j.e(resultData, "resultData");
                c cVar5 = new c(2, b1.d.a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 4);
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
                if (b1.d.b(resultData, cVar5, executor13, gVar6, aVar3.h)) {
                    return;
                }
                int i22 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent5 = (Intent) x9.a(resultData);
                Executor executor14 = aVar3.g;
                if (executor14 == null) {
                    j.h("executor");
                    throw null;
                }
                v0.g gVar7 = aVar3.f;
                if (gVar7 != null) {
                    e7.a(i22, i7, intent5, executor14, gVar7, aVar3.h);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                q4.f fVar = (q4.f) ((WeakReference) this.b).get();
                if (fVar == null || resultData == null) {
                    return;
                }
                synchronized (fVar.b) {
                    p pVar = fVar.e;
                    IBinder binder = resultData.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                    int i23 = q4.k.b;
                    if (binder != null) {
                        IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof q4.d)) {
                            q4.c cVar6 = new q4.c();
                            cVar6.a = binder;
                            dVar2 = cVar6;
                        } else {
                            dVar2 = (q4.d) queryLocalInterface;
                        }
                    }
                    pVar.b(dVar2);
                    fVar.e.c(b5.a.c(resultData));
                    fVar.a();
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q4.f fVar) {
        super(null);
        this.a = 5;
        this.b = new WeakReference(fVar);
    }
}
