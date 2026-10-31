package c1;

import ad.j;
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
import b1.e;
import c7.k;
import c7.r;
import c7.u;
import com.google.android.gms.common.api.f;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.p;
import org.json.JSONException;
import v0.n;
import v7.c0;
import w0.g;
import w0.h;
import w0.i;
import w7.f8;
import w7.g8;
import w7.i0;
import w7.l9;
import w7.p8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends ResultReceiver {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(b1.d dVar, Handler handler, int i10) {
        super(handler);
        this.a = i10;
        this.b = dVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle resultData) {
        w0.d dVar;
        Object obj;
        String string;
        Bundle bundle;
        v0.c a2;
        w0.d a10;
        Object obj2;
        String string2;
        Bundle bundle2;
        n nVar;
        int i11 = 26;
        i iVar = null;
        n4.d dVar2 = null;
        int i12 = 2;
        final int i13 = 0;
        final int i14 = 1;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                b bVar = new b(2, b1.d.a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 0);
                final d dVar3 = (d) this.b;
                if (b1.d.b(resultData, bVar, dVar3.f(), dVar3.e(), dVar3.h)) {
                    return;
                }
                int i15 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) resultData.getParcelable("RESULT_DATA");
                int i16 = b1.d.c;
                if (i15 != i16) {
                    Log.w("BeginSignIn", "Returned request code " + i16 + " which  does not match what was given " + i15);
                    return;
                }
                if (c0.b(i10, new e(i14), new bd.a(dVar3, i14), dVar3.h)) {
                    return;
                }
                try {
                    final n d = dVar3.d(p8.a(dVar3.e).f(intent));
                    c0.a(dVar3.h, new ld.a() { // from class: b1.g
                        @Override // ld.a
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    ((Executor) dVar3).execute(new a1.e((v0.h) d, 7));
                                    break;
                                default:
                                    c1.d dVar4 = (c1.d) dVar3;
                                    dVar4.f().execute(new a1.f(28, dVar4, (n) d));
                                    break;
                            }
                            return j.a;
                        }
                    });
                    return;
                } catch (f e) {
                    p pVar = new p();
                    pVar.a = new h(2, e.getMessage());
                    if (e.getStatusCode() == 16) {
                        pVar.a = new g(e.getMessage());
                    } else if (b1.d.b.contains(Integer.valueOf(e.getStatusCode()))) {
                        pVar.a = new w0.j(e.getMessage());
                    }
                    CancellationSignal cancellationSignal = dVar3.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal)) {
                        return;
                    }
                    dVar3.f().execute(new a1.f(i11, dVar3, pVar));
                    return;
                } catch (i e7) {
                    CancellationSignal cancellationSignal2 = dVar3.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal2)) {
                        return;
                    }
                    dVar3.f().execute(new a(dVar3, e7, i14));
                    return;
                } catch (Throwable th2) {
                    h hVar = new h(2, th2.getMessage());
                    CancellationSignal cancellationSignal3 = dVar3.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal3)) {
                        return;
                    }
                    dVar3.f().execute(new a1.f(27, dVar3, hVar));
                    return;
                }
            case 1:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                b bVar2 = new b(2, b1.d.a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 1);
                d1.f fVar = (d1.f) this.b;
                Executor executor = fVar.g;
                if (executor == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                v0.h hVar2 = fVar.f;
                if (hVar2 == null) {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, bVar2, executor, hVar2, fVar.h)) {
                    return;
                }
                int i17 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent2 = (Intent) resultData.getParcelable("RESULT_DATA");
                int i18 = b1.d.c;
                if (i17 != i18) {
                    Log.w("CreatePublicKey", "Returned request code " + i18 + " does not match what was given " + i17);
                    return;
                }
                if (b1.d.c(i10, new e(4), new bd.a(fVar, i12), fVar.h)) {
                    return;
                }
                byte[] byteArrayExtra = intent2 != null ? intent2.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
                if (byteArrayExtra == null) {
                    a1.h hVar3 = CredentialProviderPlayServicesImpl.Companion;
                    CancellationSignal cancellationSignal4 = fVar.h;
                    hVar3.getClass();
                    if (a1.h.a(cancellationSignal4)) {
                        return;
                    }
                    Executor executor2 = fVar.g;
                    if (executor2 != null) {
                        executor2.execute(new d1.d(fVar, i14));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
                u uVar = (u) i0.a(byteArrayExtra, u.CREATOR);
                kotlin.jvm.internal.i.d(uVar, "deserializeFromBytes(...)");
                LinkedHashMap linkedHashMap = d1.g.a;
                c7.j jVar = uVar.d;
                Object obj3 = jVar;
                if (jVar == null) {
                    c7.i iVar2 = uVar.e;
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
                    r rVar = kVar2.a;
                    kotlin.jvm.internal.i.d(rVar, "getErrorCode(...)");
                    x0.a aVar = (x0.a) d1.g.a.get(rVar);
                    String str = kVar2.b;
                    dVar = aVar == null ? new y0.a(new x0.a(26), sc.e.h("unknown fido gms exception - ", str)) : (rVar == r.x && str != null && rd.j.b(str, "Unable to get sync account")) ? new w0.b("Passkey registration was cancelled by the user.") : new y0.a(aVar, str);
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    CancellationSignal cancellationSignal5 = fVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal5)) {
                        return;
                    }
                    Executor executor3 = fVar.g;
                    if (executor3 != null) {
                        executor3.execute(new d1.a(fVar, dVar, i12));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
                try {
                    v0.f e10 = d1.f.e(uVar);
                    CancellationSignal cancellationSignal6 = fVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal6)) {
                        return;
                    }
                    Executor executor4 = fVar.g;
                    if (executor4 != null) {
                        executor4.execute(new d1.e(i13, fVar, e10));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                } catch (JSONException e11) {
                    CancellationSignal cancellationSignal7 = fVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal7)) {
                        return;
                    }
                    Executor executor5 = fVar.g;
                    if (executor5 != null) {
                        executor5.execute(new d1.b(fVar, e11, i13));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                } catch (Throwable th3) {
                    CancellationSignal cancellationSignal8 = fVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal8)) {
                        return;
                    }
                    Executor executor6 = fVar.g;
                    if (executor6 != null) {
                        executor6.execute(new d1.c(fVar, th3, i13));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
            case 2:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                b bVar3 = new b(2, b1.d.a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 2);
                e1.d dVar4 = (e1.d) this.b;
                Executor executor7 = dVar4.g;
                if (executor7 == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                v0.h hVar4 = dVar4.f;
                if (hVar4 == null) {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, bVar3, executor7, hVar4, dVar4.h)) {
                    return;
                }
                int i19 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                int i20 = Build.VERSION.SDK_INT;
                if (i20 >= 34) {
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
                int i21 = b1.d.c;
                if (i19 != i21) {
                    Log.w("CreatePublicKey", "Returned request code " + i21 + " does not match what was given " + i19);
                    return;
                }
                if (b1.d.c(i10, new e(5), new bd.a(dVar4, 3), dVar4.h)) {
                    return;
                }
                if (intent3 == null) {
                    CancellationSignal cancellationSignal9 = dVar4.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal9)) {
                        return;
                    }
                    Executor executor8 = dVar4.g;
                    if (executor8 != null) {
                        executor8.execute(new e1.a(dVar4, i14));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
                if (i20 >= 34) {
                    a2 = g1.a.b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", intent3);
                } else {
                    Bundle bundleExtra = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                    a2 = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) ? null : f8.a(string, bundle);
                }
                if (a2 != null) {
                    CancellationSignal cancellationSignal10 = dVar4.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal10)) {
                        return;
                    }
                    Executor executor9 = dVar4.g;
                    if (executor9 != null) {
                        executor9.execute(new d1.e(6, dVar4, a2));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
                if (i20 >= 34) {
                    a10 = g1.a.a(intent3);
                } else {
                    int i22 = w0.d.a;
                    Bundle bundleExtra2 = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                    if (bundleExtra2 == null) {
                        a10 = null;
                    } else {
                        String string3 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string3 == null) {
                            throw new IllegalArgumentException("Bundle was missing exception type.");
                        }
                        a10 = l9.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string3);
                    }
                }
                CancellationSignal cancellationSignal11 = dVar4.h;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.h.a(cancellationSignal11)) {
                    return;
                }
                Executor executor10 = dVar4.g;
                if (executor10 != null) {
                    executor10.execute(new e1.c(dVar4, a10, i14));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
            case 3:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                b bVar4 = new b(2, b1.d.a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 3);
                f1.b bVar5 = (f1.b) this.b;
                Executor executor11 = bVar5.g;
                if (executor11 == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                v0.h hVar5 = bVar5.f;
                if (hVar5 == null) {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, bVar4, executor11, hVar5, bVar5.h)) {
                    return;
                }
                int i23 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                int i24 = Build.VERSION.SDK_INT;
                if (i24 >= 34) {
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
                final Executor executor12 = bVar5.g;
                if (executor12 == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                final v0.h hVar6 = bVar5.f;
                if (hVar6 == null) {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
                CancellationSignal cancellationSignal12 = bVar5.h;
                int i25 = b1.d.c;
                if (i23 != i25) {
                    Log.w("GetCredentialController", "Returned request code " + i25 + " which  does not match what was given " + i23);
                    return;
                }
                if (c0.b(i10, new e(i13), new b1.f(i13, executor12, hVar6), cancellationSignal12)) {
                    return;
                }
                if (intent4 == null) {
                    c0.a(cancellationSignal12, new ld.a() { // from class: b1.g
                        @Override // ld.a
                        public final Object invoke() {
                            switch (i13) {
                                case 0:
                                    ((Executor) executor12).execute(new a1.e((v0.h) hVar6, 7));
                                    break;
                                default:
                                    c1.d dVar42 = (c1.d) executor12;
                                    dVar42.f().execute(new a1.f(28, dVar42, (n) hVar6));
                                    break;
                            }
                            return j.a;
                        }
                    });
                    return;
                }
                if (i24 >= 34) {
                    nVar = g1.a.d(intent4);
                } else {
                    Bundle bundleExtra3 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                    nVar = (bundleExtra3 == null || (string2 = bundleExtra3.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle2 = bundleExtra3.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) ? null : new n(g8.a(string2, bundle2));
                }
                if (nVar != null) {
                    c0.a(cancellationSignal12, new b1.b(executor12, hVar6, nVar, i14));
                    return;
                }
                if (i24 >= 34) {
                    iVar = g1.a.c(intent4);
                } else {
                    int i26 = i.a;
                    Bundle bundleExtra4 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                    if (bundleExtra4 != null) {
                        String string4 = bundleExtra4.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string4 == null) {
                            throw new IllegalArgumentException("Bundle was missing exception type.");
                        }
                        iVar = l9.b(bundleExtra4.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string4);
                    }
                }
                c0.a(cancellationSignal12, new b1.b(executor12, hVar6, iVar, i12));
                return;
            default:
                n4.f fVar2 = (n4.f) ((WeakReference) this.b).get();
                if (fVar2 == null || resultData == null) {
                    return;
                }
                synchronized (fVar2.b) {
                    n4.p pVar2 = fVar2.e;
                    IBinder binder = resultData.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                    int i27 = n4.k.b;
                    if (binder != null) {
                        IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof n4.d)) {
                            n4.c cVar = new n4.c();
                            cVar.a = binder;
                            dVar2 = cVar;
                        } else {
                            dVar2 = (n4.d) queryLocalInterface;
                        }
                    }
                    pVar2.b(dVar2);
                    fVar2.e.c(y4.a.a(resultData));
                    fVar2.a();
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n4.f fVar) {
        super(null);
        this.a = 4;
        this.b = new WeakReference(fVar);
    }
}
