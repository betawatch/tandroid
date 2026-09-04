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
import bi.s8;
import c7.k;
import c7.r;
import c7.u;
import com.google.android.gms.common.api.f;
import di.b7;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.p;
import n4.h;
import n4.q;
import n4.x;
import org.json.JSONException;
import org.telegram.ui.Cells.p6;
import v0.o;
import v7.f0;
import w0.g;
import w0.i;
import w0.j;
import w7.b9;
import w7.g8;
import w7.u7;
import w7.v7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        int i11 = 16;
        i iVar = null;
        h hVar = null;
        int i12 = 2;
        final int i13 = 0;
        final int i14 = 1;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                c cVar = new c(2, b1.d.a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 0);
                final e eVar = (e) this.b;
                if (b1.d.b(resultData, cVar, eVar.f(), eVar.e(), eVar.h)) {
                    return;
                }
                int i15 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) resultData.getParcelable("RESULT_DATA");
                int i16 = b1.d.c;
                if (i15 != i16) {
                    Log.w("BeginSignIn", "Returned request code " + i16 + " which  does not match what was given " + i15);
                    return;
                }
                if (f0.b(i10, new b1.e(i14), new b(eVar, i13), eVar.h)) {
                    return;
                }
                try {
                    final o d = eVar.d(g8.a(eVar.e).f(intent));
                    f0.a(eVar.h, new rd.a() { // from class: b1.g
                        @Override // rd.a
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    ((Executor) eVar).execute(new a1.b((v0.i) d, 7));
                                    break;
                                default:
                                    c1.e eVar2 = (c1.e) eVar;
                                    eVar2.f().execute(new s8(15, eVar2, (o) d));
                                    break;
                            }
                            return gd.i.a;
                        }
                    });
                    return;
                } catch (f e7) {
                    p pVar = new p();
                    pVar.a = new w0.h(e7.getMessage(), 2);
                    if (e7.getStatusCode() == 16) {
                        pVar.a = new g(e7.getMessage());
                    } else if (b1.d.b.contains(Integer.valueOf(e7.getStatusCode()))) {
                        pVar.a = new j(e7.getMessage());
                    }
                    CancellationSignal cancellationSignal = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal)) {
                        return;
                    }
                    eVar.f().execute(new s8(13, eVar, pVar));
                    return;
                } catch (i e10) {
                    CancellationSignal cancellationSignal2 = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal2)) {
                        return;
                    }
                    eVar.f().execute(new a(eVar, e10, i14));
                    return;
                } catch (Throwable th2) {
                    w0.h hVar2 = new w0.h(th2.getMessage(), 2);
                    CancellationSignal cancellationSignal3 = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal3)) {
                        return;
                    }
                    eVar.f().execute(new s8(14, eVar, hVar2));
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
                int i17 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent2 = (Intent) resultData.getParcelable("RESULT_DATA");
                int i18 = b1.d.c;
                if (i17 != i18) {
                    Log.w("CreatePublicKey", "Returned request code " + i18 + " does not match what was given " + i17);
                    return;
                }
                if (b1.d.c(i10, new b1.e(i12), new b(eVar2, i14), eVar2.h)) {
                    return;
                }
                byte[] byteArrayExtra = intent2 != null ? intent2.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
                if (byteArrayExtra == null) {
                    a1.g gVar = CredentialProviderPlayServicesImpl.Companion;
                    CancellationSignal cancellationSignal4 = eVar2.h;
                    gVar.getClass();
                    if (a1.g.a(cancellationSignal4)) {
                        return;
                    }
                    Executor executor2 = eVar2.g;
                    if (executor2 != null) {
                        executor2.execute(new d1.d(eVar2, i14));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
                u uVar = (u) w7.f0.a(byteArrayExtra, u.CREATOR);
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
                    dVar = aVar == null ? new y0.a(new x0.a(26), p6.i("unknown fido gms exception - ", str)) : (rVar == r.w && str != null && xd.j.b(str, "Unable to get sync account")) ? new w0.b("Passkey registration was cancelled by the user.") : new y0.a(aVar, str);
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
                        executor3.execute(new d1.a(eVar2, dVar, i12));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
                try {
                    v0.f e11 = d1.e.e(uVar);
                    CancellationSignal cancellationSignal6 = eVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal6)) {
                        return;
                    }
                    Executor executor4 = eVar2.g;
                    if (executor4 != null) {
                        executor4.execute(new s8(21, eVar2, e11));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
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
                        executor5.execute(new d1.b(eVar2, e12, i13));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
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
                        executor6.execute(new d1.c(eVar2, th3, i13));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
            case 2:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                c cVar3 = new c(2, b1.d.a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 2);
                e1.d dVar2 = (e1.d) this.b;
                Executor executor7 = dVar2.g;
                if (executor7 == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                v0.i iVar4 = dVar2.f;
                if (iVar4 == null) {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, cVar3, executor7, iVar4, dVar2.h)) {
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
                if (b1.d.c(i10, new b1.e(3), new b(dVar2, i12), dVar2.h)) {
                    return;
                }
                if (intent3 == null) {
                    CancellationSignal cancellationSignal9 = dVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal9)) {
                        return;
                    }
                    Executor executor8 = dVar2.g;
                    if (executor8 != null) {
                        executor8.execute(new e1.a(dVar2, i14));
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
                    a2 = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) ? null : u7.a(string, bundle);
                }
                if (a2 != null) {
                    CancellationSignal cancellationSignal10 = dVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal10)) {
                        return;
                    }
                    Executor executor9 = dVar2.g;
                    if (executor9 != null) {
                        executor9.execute(new b7(i11, dVar2, a2));
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
                        a10 = b9.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string3);
                    }
                }
                CancellationSignal cancellationSignal11 = dVar2.h;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal11)) {
                    return;
                }
                Executor executor10 = dVar2.g;
                if (executor10 != null) {
                    executor10.execute(new e1.c(dVar2, a10, i14));
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
                int i25 = b1.d.c;
                if (i23 != i25) {
                    Log.w("GetCredentialController", "Returned request code " + i25 + " which  does not match what was given " + i23);
                    return;
                }
                if (f0.b(i10, new b1.e(i13), new b1.f(i13, executor12, iVar6), cancellationSignal12)) {
                    return;
                }
                if (intent4 == null) {
                    f0.a(cancellationSignal12, new rd.a() { // from class: b1.g
                        @Override // rd.a
                        public final Object invoke() {
                            switch (i13) {
                                case 0:
                                    ((Executor) executor12).execute(new a1.b((v0.i) iVar6, 7));
                                    break;
                                default:
                                    c1.e eVar22 = (c1.e) executor12;
                                    eVar22.f().execute(new s8(15, eVar22, (o) iVar6));
                                    break;
                            }
                            return gd.i.a;
                        }
                    });
                    return;
                }
                if (i24 >= 34) {
                    oVar = g1.a.d(intent4);
                } else {
                    Bundle bundleExtra3 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                    oVar = (bundleExtra3 == null || (string2 = bundleExtra3.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle2 = bundleExtra3.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) ? null : new o(v7.a(string2, bundle2));
                }
                if (oVar != null) {
                    f0.a(cancellationSignal12, new b1.b(executor12, iVar6, oVar, i14));
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
                        iVar = b9.b(bundleExtra4.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string4);
                    }
                }
                f0.a(cancellationSignal12, new b1.b(executor12, iVar6, iVar, i12));
                return;
            default:
                n4.j jVar2 = (n4.j) ((WeakReference) this.b).get();
                if (jVar2 == null || resultData == null) {
                    return;
                }
                synchronized (jVar2.b) {
                    x xVar = jVar2.e;
                    IBinder binder = resultData.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                    int i27 = q.b;
                    if (binder != null) {
                        IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof h)) {
                            n4.g gVar2 = new n4.g();
                            gVar2.a = binder;
                            hVar = gVar2;
                        } else {
                            hVar = (h) queryLocalInterface;
                        }
                    }
                    xVar.b(hVar);
                    jVar2.e.c(y4.a.a(resultData));
                    jVar2.a();
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n4.j jVar) {
        super(null);
        this.a = 4;
        this.b = new WeakReference(jVar);
    }
}
