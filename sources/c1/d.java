package c1;

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
import b8.f1;
import ci.e0;
import e7.k;
import e7.u;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import org.json.JSONException;
import p4.p;
import v0.n;
import w0.g;
import w0.h;
import w0.i;
import x7.g5;
import x7.h5;
import x7.q6;
import x7.r6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends ResultReceiver {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(b1.d dVar, Handler handler, int i3) {
        super(handler);
        this.a = i3;
        this.b = dVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i3, Bundle resultData) {
        w0.d dVar;
        Object obj;
        String string;
        Bundle bundle;
        v0.c a10;
        w0.d a11;
        Object obj2;
        String string2;
        Bundle bundle2;
        n nVar;
        int i10 = 2;
        i iVar = null;
        p4.d dVar2 = null;
        int i11 = 0;
        int i12 = 1;
        switch (this.a) {
            case 0:
                j.e(resultData, "resultData");
                c cVar = new c(2, b1.d.a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 0);
                e eVar = (e) this.b;
                if (b1.d.b(resultData, cVar, eVar.f(), eVar.e(), eVar.h)) {
                    return;
                }
                int i13 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) resultData.getParcelable("RESULT_DATA");
                int i14 = b1.d.c;
                if (i13 != i14) {
                    Log.w("BeginSignIn", "Returned request code " + i14 + " which  does not match what was given " + i13);
                    return;
                }
                if (f1.b(i3, new ae.j(5), new b(eVar, i11), eVar.h)) {
                    return;
                }
                try {
                    f1.a(eVar.h, new f(i12, eVar, eVar.d(r6.a(eVar.e).f(intent))));
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
                    if (a1.h.a(cancellationSignal)) {
                        return;
                    }
                    eVar.f().execute(new a1.f(22, eVar, rVar));
                    return;
                } catch (i e11) {
                    CancellationSignal cancellationSignal2 = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal2)) {
                        return;
                    }
                    eVar.f().execute(new a(eVar, e11, i12));
                    return;
                } catch (Throwable th2) {
                    h hVar = new h(2, th2.getMessage());
                    CancellationSignal cancellationSignal3 = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal3)) {
                        return;
                    }
                    eVar.f().execute(new a1.f(23, eVar, hVar));
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
                v0.h hVar2 = eVar2.f;
                if (hVar2 == null) {
                    j.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, cVar2, executor, hVar2, eVar2.h)) {
                    return;
                }
                int i15 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent2 = (Intent) resultData.getParcelable("RESULT_DATA");
                int i16 = b1.d.c;
                if (i15 != i16) {
                    Log.w("CreatePublicKey", "Returned request code " + i16 + " does not match what was given " + i15);
                    return;
                }
                if (b1.d.c(i3, new ae.j(6), new b(eVar2, i12), eVar2.h)) {
                    return;
                }
                byte[] byteArrayExtra = intent2 != null ? intent2.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
                if (byteArrayExtra == null) {
                    a1.h hVar3 = CredentialProviderPlayServicesImpl.Companion;
                    CancellationSignal cancellationSignal4 = eVar2.h;
                    hVar3.getClass();
                    if (a1.h.a(cancellationSignal4)) {
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
                u uVar = (u) k8.c.a(byteArrayExtra, u.CREATOR);
                j.d(uVar, "deserializeFromBytes(...)");
                LinkedHashMap linkedHashMap = d1.g.a;
                e7.j jVar = uVar.d;
                Object obj3 = jVar;
                if (jVar == null) {
                    e7.i iVar2 = uVar.e;
                    obj3 = iVar2;
                    if (iVar2 == null) {
                        k kVar = uVar.f;
                        obj3 = kVar;
                        if (kVar == null) {
                            throw new IllegalStateException("No response set.");
                        }
                    }
                }
                if (obj3 instanceof k) {
                    k kVar2 = (k) obj3;
                    e7.r rVar2 = kVar2.a;
                    j.d(rVar2, "getErrorCode(...)");
                    x0.a aVar = (x0.a) d1.g.a.get(rVar2);
                    String str = kVar2.b;
                    dVar = aVar == null ? new y0.a(new x0.a(26), t4.c.f("unknown fido gms exception - ", str)) : (rVar2 == e7.r.x && str != null && ud.d.e(str, "Unable to get sync account")) ? new w0.b("Passkey registration was cancelled by the user.") : new y0.a(aVar, str);
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    CancellationSignal cancellationSignal5 = eVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal5)) {
                        return;
                    }
                    Executor executor3 = eVar2.g;
                    if (executor3 != null) {
                        executor3.execute(new d1.a(eVar2, dVar, i10));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
                try {
                    v0.f e12 = d1.e.e(uVar);
                    CancellationSignal cancellationSignal6 = eVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal6)) {
                        return;
                    }
                    Executor executor4 = eVar2.g;
                    if (executor4 != null) {
                        executor4.execute(new e0(19, eVar2, e12));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                } catch (JSONException e13) {
                    CancellationSignal cancellationSignal7 = eVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal7)) {
                        return;
                    }
                    Executor executor5 = eVar2.g;
                    if (executor5 != null) {
                        executor5.execute(new d1.b(eVar2, e13, i11));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                } catch (Throwable th3) {
                    CancellationSignal cancellationSignal8 = eVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal8)) {
                        return;
                    }
                    Executor executor6 = eVar2.g;
                    if (executor6 != null) {
                        executor6.execute(new d1.c(eVar2, th3, i11));
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
                v0.h hVar4 = dVar3.f;
                if (hVar4 == null) {
                    j.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, cVar3, executor7, hVar4, dVar3.h)) {
                    return;
                }
                int i17 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                int i18 = Build.VERSION.SDK_INT;
                if (i18 >= 34) {
                    obj = g0.a.e(resultData);
                } else {
                    Object parcelable = resultData.getParcelable("RESULT_DATA");
                    boolean isInstance = Intent.class.isInstance(parcelable);
                    obj = parcelable;
                    if (!isInstance) {
                        obj = null;
                    }
                }
                Intent intent3 = (Intent) obj;
                int i19 = b1.d.c;
                if (i17 != i19) {
                    Log.w("CreatePublicKey", "Returned request code " + i19 + " does not match what was given " + i17);
                    return;
                }
                if (b1.d.c(i3, new ae.j(7), new b(dVar3, 3), dVar3.h)) {
                    return;
                }
                if (intent3 == null) {
                    CancellationSignal cancellationSignal9 = dVar3.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal9)) {
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
                if (i18 >= 34) {
                    a10 = g1.a.b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", intent3);
                } else {
                    Bundle bundleExtra = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                    a10 = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) ? null : g5.a(string, bundle);
                }
                if (a10 != null) {
                    CancellationSignal cancellationSignal10 = dVar3.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal10)) {
                        return;
                    }
                    Executor executor9 = dVar3.g;
                    if (executor9 != null) {
                        executor9.execute(new e0(28, dVar3, a10));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
                if (i18 >= 34) {
                    a11 = g1.a.a(intent3);
                } else {
                    int i20 = w0.d.a;
                    Bundle bundleExtra2 = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                    if (bundleExtra2 == null) {
                        a11 = null;
                    } else {
                        String string3 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string3 == null) {
                            throw new IllegalArgumentException("Bundle was missing exception type.");
                        }
                        a11 = q6.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string3);
                    }
                }
                CancellationSignal cancellationSignal11 = dVar3.h;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.h.a(cancellationSignal11)) {
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
                v0.h hVar5 = aVar2.f;
                if (hVar5 == null) {
                    j.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, cVar4, executor11, hVar5, aVar2.h)) {
                    return;
                }
                int i21 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                int i22 = Build.VERSION.SDK_INT;
                if (i22 >= 34) {
                    obj2 = g0.a.e(resultData);
                } else {
                    Object parcelable2 = resultData.getParcelable("RESULT_DATA");
                    boolean isInstance2 = Intent.class.isInstance(parcelable2);
                    obj2 = parcelable2;
                    if (!isInstance2) {
                        obj2 = null;
                    }
                }
                Intent intent4 = (Intent) obj2;
                Executor executor12 = aVar2.g;
                if (executor12 == null) {
                    j.h("executor");
                    throw null;
                }
                v0.h hVar6 = aVar2.f;
                if (hVar6 == null) {
                    j.h("callback");
                    throw null;
                }
                CancellationSignal cancellationSignal12 = aVar2.h;
                int i23 = b1.d.c;
                if (i21 != i23) {
                    Log.w("GetCredentialController", "Returned request code " + i23 + " which  does not match what was given " + i21);
                    return;
                }
                if (f1.b(i3, new ae.j(i12), new b1.e(i11, executor12, hVar6), cancellationSignal12)) {
                    return;
                }
                if (intent4 == null) {
                    f1.a(cancellationSignal12, new f(i11, executor12, hVar6));
                    return;
                }
                if (i22 >= 34) {
                    nVar = g1.a.d(intent4);
                } else {
                    Bundle bundleExtra3 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                    nVar = (bundleExtra3 == null || (string2 = bundleExtra3.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle2 = bundleExtra3.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) ? null : new n(h5.a(string2, bundle2));
                }
                if (nVar != null) {
                    f1.a(cancellationSignal12, new b1.b(executor12, hVar6, nVar, i12));
                    return;
                }
                if (i22 >= 34) {
                    iVar = g1.a.c(intent4);
                } else {
                    int i24 = i.a;
                    Bundle bundleExtra4 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                    if (bundleExtra4 != null) {
                        String string4 = bundleExtra4.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string4 == null) {
                            throw new IllegalArgumentException("Bundle was missing exception type.");
                        }
                        iVar = q6.b(bundleExtra4.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string4);
                    }
                }
                f1.a(cancellationSignal12, new b1.b(executor12, hVar6, iVar, i10));
                return;
            default:
                p4.f fVar = (p4.f) ((WeakReference) this.b).get();
                if (fVar == null || resultData == null) {
                    return;
                }
                synchronized (fVar.b) {
                    p pVar = fVar.e;
                    IBinder binder = resultData.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                    int i25 = p4.k.b;
                    if (binder != null) {
                        IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof p4.d)) {
                            p4.c cVar5 = new p4.c();
                            cVar5.a = binder;
                            dVar2 = cVar5;
                        } else {
                            dVar2 = (p4.d) queryLocalInterface;
                        }
                    }
                    pVar.b(dVar2);
                    fVar.e.c(a5.a.a(resultData));
                    fVar.a();
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p4.f fVar) {
        super(null);
        this.a = 4;
        this.b = new WeakReference(fVar);
    }
}
