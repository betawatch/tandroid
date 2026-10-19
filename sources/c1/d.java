package c1;

import ai.pa;
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
import c7.k;
import c7.r;
import c7.u;
import ci.v7;
import com.google.android.gms.common.api.f;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.p;
import n4.m;
import org.json.JSONException;
import v0.o;
import v7.c0;
import w0.g;
import w0.h;
import w0.i;
import w0.j;
import w7.a8;
import w7.g0;
import w7.h8;
import w7.z7;
import w7.z8;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class d extends ResultReceiver {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(b1.d dVar, Handler handler, int i10) {
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
        o oVar;
        i iVar = null;
        n4.d dVar2 = null;
        int i11 = 2;
        final int i12 = 0;
        final int i13 = 1;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                c cVar = new c(2, b1.d.a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 0);
                final e eVar = (e) this.b;
                if (b1.d.b(resultData, cVar, eVar.f(), eVar.e(), eVar.h)) {
                    return;
                }
                int i14 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) resultData.getParcelable("RESULT_DATA");
                int i15 = b1.d.c;
                if (i14 != i15) {
                    Log.w("BeginSignIn", "Returned request code " + i15 + " which  does not match what was given " + i14);
                    return;
                }
                if (c0.b(i10, new b1.e(i13), new b(eVar, i12), eVar.h)) {
                    return;
                }
                try {
                    final o d = eVar.d(h8.a(eVar.e).f(intent));
                    c0.a(eVar.h, new td.a() { // from class: b1.g
                        @Override // td.a
                        public final Object invoke() {
                            switch (i13) {
                                case 0:
                                    ((Executor) eVar).execute(new a1.e((v0.i) d, 7));
                                    break;
                                default:
                                    c1.e eVar2 = (c1.e) eVar;
                                    eVar2.f().execute(new pa(7, eVar2, (o) d));
                                    break;
                            }
                            return id.i.a;
                        }
                    });
                    return;
                } catch (f e) {
                    p pVar = new p();
                    pVar.a = new h(e.getMessage(), 2);
                    if (e.getStatusCode() == 16) {
                        pVar.a = new g(e.getMessage());
                    } else if (b1.d.b.contains(Integer.valueOf(e.getStatusCode()))) {
                        pVar.a = new j(e.getMessage());
                    }
                    CancellationSignal cancellationSignal = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal)) {
                        return;
                    }
                    eVar.f().execute(new pa(5, eVar, pVar));
                    return;
                } catch (i e7) {
                    CancellationSignal cancellationSignal2 = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal2)) {
                        return;
                    }
                    eVar.f().execute(new a(eVar, e7, i13));
                    return;
                } catch (Throwable th2) {
                    h hVar = new h(th2.getMessage(), 2);
                    CancellationSignal cancellationSignal3 = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal3)) {
                        return;
                    }
                    eVar.f().execute(new pa(6, eVar, hVar));
                    return;
                }
            case 1:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                c cVar2 = new c(2, b1.d.a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 1);
                d1.e eVar2 = (d1.e) this.b;
                Executor executor = eVar2.g;
                if (executor == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                v0.i iVar2 = eVar2.f;
                if (iVar2 == null) {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, cVar2, executor, iVar2, eVar2.h)) {
                    return;
                }
                int i16 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent2 = (Intent) resultData.getParcelable("RESULT_DATA");
                int i17 = b1.d.c;
                if (i16 != i17) {
                    Log.w("CreatePublicKey", "Returned request code " + i17 + " does not match what was given " + i16);
                    return;
                }
                if (b1.d.c(i10, new b1.e(i11), new b(eVar2, i13), eVar2.h)) {
                    return;
                }
                byte[] byteArrayExtra = intent2 != null ? intent2.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
                if (byteArrayExtra == null) {
                    a1.h hVar2 = CredentialProviderPlayServicesImpl.Companion;
                    CancellationSignal cancellationSignal4 = eVar2.h;
                    hVar2.getClass();
                    if (a1.h.a(cancellationSignal4)) {
                        return;
                    }
                    Executor executor2 = eVar2.g;
                    if (executor2 != null) {
                        executor2.execute(new d1.d(eVar2, i13));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
                u uVar = (u) g0.a(byteArrayExtra, u.CREATOR);
                kotlin.jvm.internal.i.d(uVar, "deserializeFromBytes(...)");
                LinkedHashMap linkedHashMap = d1.f.a;
                c7.j jVar = uVar.d;
                Object obj3 = jVar;
                if (jVar == null) {
                    c7.i iVar3 = uVar.e;
                    obj3 = iVar3;
                    if (iVar3 == null) {
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
                    x0.a aVar = (x0.a) d1.f.a.get(rVar);
                    String str = kVar2.b;
                    dVar = aVar == null ? new y0.a(new x0.a(26), r4.c.h("unknown fido gms exception - ", str)) : (rVar == r.w && str != null && zd.j.b(str, "Unable to get sync account")) ? new w0.b("Passkey registration was cancelled by the user.") : new y0.a(aVar, str);
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
                        executor3.execute(new d1.a(eVar2, dVar, i11));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
                try {
                    v0.f e10 = d1.e.e(uVar);
                    CancellationSignal cancellationSignal6 = eVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal6)) {
                        return;
                    }
                    Executor executor4 = eVar2.g;
                    if (executor4 != null) {
                        executor4.execute(new v7(10, eVar2, e10));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                } catch (JSONException e11) {
                    CancellationSignal cancellationSignal7 = eVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal7)) {
                        return;
                    }
                    Executor executor5 = eVar2.g;
                    if (executor5 != null) {
                        executor5.execute(new d1.b(eVar2, e11, i12));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
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
                        executor6.execute(new d1.c(eVar2, th3, i12));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
            case 2:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                c cVar3 = new c(2, b1.d.a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 2);
                e1.e eVar3 = (e1.e) this.b;
                Executor executor7 = eVar3.g;
                if (executor7 == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                v0.i iVar4 = eVar3.f;
                if (iVar4 == null) {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, cVar3, executor7, iVar4, eVar3.h)) {
                    return;
                }
                int i18 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                int i19 = Build.VERSION.SDK_INT;
                if (i19 >= 34) {
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
                int i20 = b1.d.c;
                if (i18 != i20) {
                    Log.w("CreatePublicKey", "Returned request code " + i20 + " does not match what was given " + i18);
                    return;
                }
                if (b1.d.c(i10, new b1.e(3), new b(eVar3, i11), eVar3.h)) {
                    return;
                }
                if (intent3 == null) {
                    CancellationSignal cancellationSignal9 = eVar3.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal9)) {
                        return;
                    }
                    Executor executor8 = eVar3.g;
                    if (executor8 != null) {
                        executor8.execute(new e1.a(eVar3, i13));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
                if (i19 >= 34) {
                    a2 = g1.a.b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", intent3);
                } else {
                    Bundle bundleExtra = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                    a2 = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) ? null : z7.a(string, bundle);
                }
                if (a2 != null) {
                    CancellationSignal cancellationSignal10 = eVar3.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.h.a(cancellationSignal10)) {
                        return;
                    }
                    Executor executor9 = eVar3.g;
                    if (executor9 != null) {
                        executor9.execute(new v7(15, eVar3, a2));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
                if (i19 >= 34) {
                    a10 = g1.a.a(intent3);
                } else {
                    int i21 = w0.d.a;
                    Bundle bundleExtra2 = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                    if (bundleExtra2 == null) {
                        a10 = null;
                    } else {
                        String string3 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string3 == null) {
                            throw new IllegalArgumentException("Bundle was missing exception type.");
                        }
                        a10 = z8.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string3);
                    }
                }
                CancellationSignal cancellationSignal11 = eVar3.h;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.h.a(cancellationSignal11)) {
                    return;
                }
                Executor executor10 = eVar3.g;
                if (executor10 != null) {
                    executor10.execute(new e1.d(eVar3, a10, i13));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
            case 3:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                c cVar4 = new c(2, b1.d.a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 3);
                f1.a aVar2 = (f1.a) this.b;
                Executor executor11 = aVar2.g;
                if (executor11 == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                v0.i iVar5 = aVar2.f;
                if (iVar5 == null) {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, cVar4, executor11, iVar5, aVar2.h)) {
                    return;
                }
                int i22 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                int i23 = Build.VERSION.SDK_INT;
                if (i23 >= 34) {
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
                final Executor executor12 = aVar2.g;
                if (executor12 == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                final v0.i iVar6 = aVar2.f;
                if (iVar6 == null) {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
                CancellationSignal cancellationSignal12 = aVar2.h;
                int i24 = b1.d.c;
                if (i22 != i24) {
                    Log.w("GetCredentialController", "Returned request code " + i24 + " which  does not match what was given " + i22);
                    return;
                }
                if (c0.b(i10, new b1.e(i12), new b1.f(i12, executor12, iVar6), cancellationSignal12)) {
                    return;
                }
                if (intent4 == null) {
                    c0.a(cancellationSignal12, new td.a() { // from class: b1.g
                        @Override // td.a
                        public final Object invoke() {
                            switch (i12) {
                                case 0:
                                    ((Executor) executor12).execute(new a1.e((v0.i) iVar6, 7));
                                    break;
                                default:
                                    c1.e eVar22 = (c1.e) executor12;
                                    eVar22.f().execute(new pa(7, eVar22, (o) iVar6));
                                    break;
                            }
                            return id.i.a;
                        }
                    });
                    return;
                }
                if (i23 >= 34) {
                    oVar = g1.a.d(intent4);
                } else {
                    Bundle bundleExtra3 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                    oVar = (bundleExtra3 == null || (string2 = bundleExtra3.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle2 = bundleExtra3.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) ? null : new o(a8.a(string2, bundle2));
                }
                if (oVar != null) {
                    c0.a(cancellationSignal12, new b1.b(executor12, iVar6, oVar, i13));
                    return;
                }
                if (i23 >= 34) {
                    iVar = g1.a.c(intent4);
                } else {
                    int i25 = i.a;
                    Bundle bundleExtra4 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                    if (bundleExtra4 != null) {
                        String string4 = bundleExtra4.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string4 == null) {
                            throw new IllegalArgumentException("Bundle was missing exception type.");
                        }
                        iVar = z8.b(bundleExtra4.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string4);
                    }
                }
                c0.a(cancellationSignal12, new b1.b(executor12, iVar6, iVar, i11));
                return;
            default:
                n4.f fVar = (n4.f) ((WeakReference) this.b).get();
                if (fVar == null || resultData == null) {
                    return;
                }
                synchronized (fVar.b) {
                    n4.r rVar2 = fVar.e;
                    IBinder binder = resultData.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                    int i26 = m.b;
                    if (binder != null) {
                        IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof n4.d)) {
                            n4.c cVar5 = new n4.c();
                            cVar5.a = binder;
                            dVar2 = cVar5;
                        } else {
                            dVar2 = (n4.d) queryLocalInterface;
                        }
                    }
                    rVar2.b(dVar2);
                    fVar.e.c(y4.a.a(resultData));
                    fVar.a();
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n4.f fVar) {
        super(null);
        this.a = 4;
        this.b = new WeakReference(fVar);
    }
}
