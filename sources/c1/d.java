package c1;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.common.api.f;
import f7.f0;
import f7.v7;
import g7.q8;
import g7.w7;
import g7.x7;
import g7.x8;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import m6.k;
import m6.r;
import m6.u;
import org.json.JSONException;
import v0.p;
import w0.g;
import w0.h;
import w0.i;
import w0.j;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends ResultReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1.d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(b1.d dVar, Handler handler, int i9) {
        super(handler);
        this.a = i9;
        this.b = dVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i9, Bundle resultData) {
        w0.d dVar;
        Object parcelable;
        String string;
        Bundle bundle;
        v0.c a2;
        w0.d a3;
        Object parcelable2;
        String string2;
        Bundle bundle2;
        p pVar;
        i b10;
        int i10 = this.a;
        b1.d dVar2 = this.b;
        switch (i10) {
            case 0:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                final e eVar = (e) dVar2;
                if (b1.d.b(resultData, new c(2, b1.d.a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 0), eVar.f(), eVar.e(), eVar.h)) {
                    return;
                }
                int i11 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) resultData.getParcelable("RESULT_DATA");
                int i12 = b1.d.c;
                if (i11 != i12) {
                    Log.w("BeginSignIn", "Returned request code " + i12 + " which  does not match what was given " + i11);
                    return;
                }
                if (f0.b(i9, new b1.e(1), new b(eVar, 0), eVar.h)) {
                    return;
                }
                try {
                    final p d = eVar.d(v7.a(eVar.e).f(intent));
                    final int i13 = 1;
                    f0.a(eVar.h, new zc.a() { // from class: b1.g
                        @Override // zc.a
                        public final Object invoke() {
                            switch (i13) {
                                case 0:
                                    ((Executor) eVar).execute(new a1.b((v0.i) d, 7));
                                    break;
                                default:
                                    c1.e eVar2 = (c1.e) eVar;
                                    eVar2.f().execute(new a1.e(19, eVar2, (p) d));
                                    break;
                            }
                            return oc.i.a;
                        }
                    });
                    return;
                } catch (f e10) {
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    pVar2.a = new h(e10.getMessage(), 2);
                    if (e10.getStatusCode() == 16) {
                        pVar2.a = new g(e10.getMessage());
                    } else if (b1.d.b.contains(Integer.valueOf(e10.getStatusCode()))) {
                        pVar2.a = new j(e10.getMessage());
                    }
                    CancellationSignal cancellationSignal = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal)) {
                        return;
                    }
                    eVar.f().execute(new a1.e(17, eVar, pVar2));
                    return;
                } catch (i e11) {
                    CancellationSignal cancellationSignal2 = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal2)) {
                        return;
                    }
                    eVar.f().execute(new a(eVar, e11, 1));
                    return;
                } catch (Throwable th) {
                    h hVar = new h(th.getMessage(), 2);
                    CancellationSignal cancellationSignal3 = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal3)) {
                        return;
                    }
                    eVar.f().execute(new a1.e(18, eVar, hVar));
                    return;
                }
            case 1:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                c cVar = new c(2, b1.d.a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 1);
                d1.e eVar2 = (d1.e) dVar2;
                Executor executor = eVar2.g;
                if (executor == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                v0.i iVar = eVar2.f;
                if (iVar == null) {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, cVar, executor, iVar, eVar2.h)) {
                    return;
                }
                int i14 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent2 = (Intent) resultData.getParcelable("RESULT_DATA");
                int i15 = b1.d.c;
                if (i14 != i15) {
                    Log.w("CreatePublicKey", "Returned request code " + i15 + " does not match what was given " + i14);
                    return;
                }
                if (b1.d.c(i9, new b1.e(2), new b(eVar2, 1), eVar2.h)) {
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
                        executor2.execute(new d1.d(eVar2, 1));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
                u uVar = (u) q8.a(byteArrayExtra, u.CREATOR);
                kotlin.jvm.internal.i.d(uVar, "deserializeFromBytes(...)");
                LinkedHashMap linkedHashMap = d1.g.a;
                Parcelable parcelable3 = uVar.d;
                if (parcelable3 == null && (parcelable3 = uVar.e) == null && (parcelable3 = uVar.f) == null) {
                    throw new IllegalStateException("No response set.");
                }
                if (parcelable3 instanceof k) {
                    k kVar = (k) parcelable3;
                    r rVar = kVar.a;
                    kotlin.jvm.internal.i.d(rVar, "getErrorCode(...)");
                    x0.a aVar = (x0.a) d1.g.a.get(rVar);
                    String str = kVar.b;
                    dVar = aVar == null ? new y0.a(new x0.a(26), ta.b.d("unknown fido gms exception - ", str)) : (rVar == r.w && str != null && fd.j.b(str, "Unable to get sync account")) ? new w0.b("Passkey registration was cancelled by the user.") : new y0.a(aVar, str);
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
                        executor3.execute(new d1.a(eVar2, dVar, 2));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
                try {
                    v0.f e12 = d1.e.e(uVar);
                    CancellationSignal cancellationSignal6 = eVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal6)) {
                        return;
                    }
                    Executor executor4 = eVar2.g;
                    if (executor4 != null) {
                        executor4.execute(new a1.e(24, eVar2, e12));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                } catch (JSONException e13) {
                    CancellationSignal cancellationSignal7 = eVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal7)) {
                        return;
                    }
                    Executor executor5 = eVar2.g;
                    if (executor5 != null) {
                        executor5.execute(new d1.b(eVar2, e13, 0));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                } catch (Throwable th2) {
                    CancellationSignal cancellationSignal8 = eVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal8)) {
                        return;
                    }
                    Executor executor6 = eVar2.g;
                    if (executor6 != null) {
                        executor6.execute(new d1.c(eVar2, th2, 0));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
            case 2:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                c cVar2 = new c(2, b1.d.a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 2);
                e1.d dVar3 = (e1.d) dVar2;
                Executor executor7 = dVar3.g;
                if (executor7 == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                v0.i iVar2 = dVar3.f;
                if (iVar2 == null) {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, cVar2, executor7, iVar2, dVar3.h)) {
                    return;
                }
                int i16 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                int i17 = Build.VERSION.SDK_INT;
                if (i17 >= 34) {
                    parcelable = g0.a.c(resultData);
                } else {
                    parcelable = resultData.getParcelable("RESULT_DATA");
                    if (!Intent.class.isInstance(parcelable)) {
                        parcelable = null;
                    }
                }
                Intent intent3 = (Intent) parcelable;
                int i18 = b1.d.c;
                if (i16 != i18) {
                    Log.w("CreatePublicKey", "Returned request code " + i18 + " does not match what was given " + i16);
                    return;
                }
                if (b1.d.c(i9, new b1.e(3), new b(dVar3, 2), dVar3.h)) {
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
                        executor8.execute(new e1.a(dVar3, 1));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
                if (i17 >= 34) {
                    a2 = g1.a.b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", intent3);
                } else {
                    Bundle bundleExtra = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                    a2 = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) ? null : w7.a(string, bundle);
                }
                if (a2 != null) {
                    CancellationSignal cancellationSignal10 = dVar3.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal10)) {
                        return;
                    }
                    Executor executor9 = dVar3.g;
                    if (executor9 != null) {
                        executor9.execute(new a1.e(29, dVar3, a2));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
                if (i17 >= 34) {
                    a3 = g1.a.a(intent3);
                } else {
                    int i19 = w0.d.a;
                    Bundle bundleExtra2 = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                    if (bundleExtra2 == null) {
                        a3 = null;
                    } else {
                        String string3 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string3 == null) {
                            throw new IllegalArgumentException("Bundle was missing exception type.");
                        }
                        a3 = x8.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string3);
                    }
                }
                CancellationSignal cancellationSignal11 = dVar3.h;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal11)) {
                    return;
                }
                Executor executor10 = dVar3.g;
                if (executor10 != null) {
                    executor10.execute(new e1.c(dVar3, a3, 1));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
            default:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                c cVar3 = new c(2, b1.d.a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 3);
                f1.b bVar = (f1.b) dVar2;
                Executor executor11 = bVar.g;
                if (executor11 == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                v0.i iVar3 = bVar.f;
                if (iVar3 == null) {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, cVar3, executor11, iVar3, bVar.h)) {
                    return;
                }
                int i20 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                int i21 = Build.VERSION.SDK_INT;
                if (i21 >= 34) {
                    parcelable2 = g0.a.c(resultData);
                } else {
                    parcelable2 = resultData.getParcelable("RESULT_DATA");
                    if (!Intent.class.isInstance(parcelable2)) {
                        parcelable2 = null;
                    }
                }
                Intent intent4 = (Intent) parcelable2;
                final Executor executor12 = bVar.g;
                if (executor12 == null) {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
                final v0.i iVar4 = bVar.f;
                if (iVar4 == null) {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
                CancellationSignal cancellationSignal12 = bVar.h;
                int i22 = b1.d.c;
                if (i20 != i22) {
                    Log.w("GetCredentialController", "Returned request code " + i22 + " which  does not match what was given " + i20);
                    return;
                }
                final int i23 = 0;
                if (f0.b(i9, new b1.e(i23), new b1.f(i23, executor12, iVar4), cancellationSignal12)) {
                    return;
                }
                if (intent4 == null) {
                    f0.a(cancellationSignal12, new zc.a() { // from class: b1.g
                        @Override // zc.a
                        public final Object invoke() {
                            switch (i23) {
                                case 0:
                                    ((Executor) executor12).execute(new a1.b((v0.i) iVar4, 7));
                                    break;
                                default:
                                    c1.e eVar22 = (c1.e) executor12;
                                    eVar22.f().execute(new a1.e(19, eVar22, (p) iVar4));
                                    break;
                            }
                            return oc.i.a;
                        }
                    });
                    return;
                }
                if (i21 >= 34) {
                    pVar = g1.a.d(intent4);
                } else {
                    Bundle bundleExtra3 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                    pVar = (bundleExtra3 == null || (string2 = bundleExtra3.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle2 = bundleExtra3.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) ? null : new p(x7.a(string2, bundle2));
                }
                if (pVar != null) {
                    f0.a(cancellationSignal12, new b1.b(executor12, iVar4, pVar, 1));
                    return;
                }
                if (i21 >= 34) {
                    b10 = g1.a.c(intent4);
                } else {
                    int i24 = i.a;
                    Bundle bundleExtra4 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                    if (bundleExtra4 == null) {
                        b10 = null;
                    } else {
                        String string4 = bundleExtra4.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string4 == null) {
                            throw new IllegalArgumentException("Bundle was missing exception type.");
                        }
                        b10 = x8.b(bundleExtra4.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string4);
                    }
                }
                f0.a(cancellationSignal12, new b1.b(executor12, iVar4, b10, 2));
                return;
        }
    }
}
