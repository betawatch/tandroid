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
import j7.c0;
import j7.h5;
import j7.y8;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import k7.d8;
import k7.e8;
import k7.v8;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import org.json.JSONException;
import org.telegram.ui.yh;
import q6.k;
import q6.r;
import q6.u;
import v0.o;
import w0.g;
import w0.h;
import w0.i;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e extends ResultReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1.d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(b1.d dVar, Handler handler, int i10) {
        super(handler);
        this.a = i10;
        this.b = dVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle resultData) {
        w0.d dVar;
        Object parcelable;
        String string;
        Bundle bundle;
        v0.c a2;
        w0.d a10;
        Object parcelable2;
        String string2;
        Bundle bundle2;
        o oVar;
        i b10;
        int i11 = this.a;
        b1.d dVar2 = this.b;
        switch (i11) {
            case 0:
                j.e(resultData, "resultData");
                final f fVar = (f) dVar2;
                if (b1.d.b(resultData, new d(2, b1.d.a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 0), fVar.f(), fVar.e(), fVar.h)) {
                    return;
                }
                int i12 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) resultData.getParcelable("RESULT_DATA");
                int i13 = b1.d.c;
                if (i12 != i13) {
                    Log.w("BeginSignIn", "Returned request code " + i13 + " which  does not match what was given " + i12);
                    return;
                }
                if (c0.b(i10, new b1.e(1), new c(fVar, 0), fVar.h)) {
                    return;
                }
                try {
                    final o d = fVar.d(y8.a(fVar.e).f(intent));
                    final int i14 = 1;
                    c0.a(fVar.h, new dd.a() { // from class: b1.g
                        @Override // dd.a
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    ((Executor) fVar).execute(new a1.b((v0.i) d, 7));
                                    break;
                                default:
                                    c1.f fVar2 = (c1.f) fVar;
                                    fVar2.f().execute(new a1.e(7, fVar2, (o) d));
                                    break;
                            }
                            return sc.i.a;
                        }
                    });
                    return;
                } catch (com.google.android.gms.common.api.f e6) {
                    q qVar = new q();
                    qVar.a = new h(e6.getMessage(), 2);
                    if (e6.getStatusCode() == 16) {
                        qVar.a = new g(e6.getMessage());
                    } else if (b1.d.b.contains(Integer.valueOf(e6.getStatusCode()))) {
                        qVar.a = new w0.j(e6.getMessage());
                    }
                    CancellationSignal cancellationSignal = fVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal)) {
                        return;
                    }
                    fVar.f().execute(new a1.e(5, fVar, qVar));
                    return;
                } catch (i e10) {
                    CancellationSignal cancellationSignal2 = fVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal2)) {
                        return;
                    }
                    fVar.f().execute(new a(fVar, e10, 1));
                    return;
                } catch (Throwable th2) {
                    h hVar = new h(th2.getMessage(), 2);
                    CancellationSignal cancellationSignal3 = fVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal3)) {
                        return;
                    }
                    fVar.f().execute(new a1.e(6, fVar, hVar));
                    return;
                }
            case 1:
                j.e(resultData, "resultData");
                d dVar3 = new d(2, b1.d.a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 1);
                d1.e eVar = (d1.e) dVar2;
                Executor executor = eVar.g;
                if (executor == null) {
                    j.h("executor");
                    throw null;
                }
                v0.i iVar = eVar.f;
                if (iVar == null) {
                    j.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, dVar3, executor, iVar, eVar.h)) {
                    return;
                }
                int i15 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent2 = (Intent) resultData.getParcelable("RESULT_DATA");
                int i16 = b1.d.c;
                if (i15 != i16) {
                    Log.w("CreatePublicKey", "Returned request code " + i16 + " does not match what was given " + i15);
                    return;
                }
                if (b1.d.c(i10, new b1.e(2), new c(eVar, 1), eVar.h)) {
                    return;
                }
                byte[] byteArrayExtra = intent2 != null ? intent2.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
                if (byteArrayExtra == null) {
                    a1.g gVar = CredentialProviderPlayServicesImpl.Companion;
                    CancellationSignal cancellationSignal4 = eVar.h;
                    gVar.getClass();
                    if (a1.g.a(cancellationSignal4)) {
                        return;
                    }
                    Executor executor2 = eVar.g;
                    if (executor2 != null) {
                        executor2.execute(new d1.d(eVar, 1));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
                u uVar = (u) h5.a(byteArrayExtra, u.CREATOR);
                j.d(uVar, "deserializeFromBytes(...)");
                LinkedHashMap linkedHashMap = d1.g.a;
                Parcelable parcelable3 = uVar.d;
                if (parcelable3 == null && (parcelable3 = uVar.e) == null && (parcelable3 = uVar.f) == null) {
                    throw new IllegalStateException("No response set.");
                }
                if (parcelable3 instanceof k) {
                    k kVar = (k) parcelable3;
                    r rVar = kVar.a;
                    j.d(rVar, "getErrorCode(...)");
                    x0.a aVar = (x0.a) d1.g.a.get(rVar);
                    String str = kVar.b;
                    dVar = aVar == null ? new y0.a(new x0.a(26), yh.k("unknown fido gms exception - ", str)) : (rVar == r.w && str != null && jd.j.b(str, "Unable to get sync account")) ? new w0.b("Passkey registration was cancelled by the user.") : new y0.a(aVar, str);
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
                        executor3.execute(new d1.a(eVar, dVar, 2));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
                try {
                    v0.f e11 = d1.e.e(uVar);
                    CancellationSignal cancellationSignal6 = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal6)) {
                        return;
                    }
                    Executor executor4 = eVar.g;
                    if (executor4 != null) {
                        executor4.execute(new a1.e(12, eVar, e11));
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
                        executor5.execute(new d1.b(eVar, e12, 0));
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
                        executor6.execute(new d1.c(eVar, th3, 0));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
            case 2:
                j.e(resultData, "resultData");
                d dVar4 = new d(2, b1.d.a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 2);
                e1.d dVar5 = (e1.d) dVar2;
                Executor executor7 = dVar5.g;
                if (executor7 == null) {
                    j.h("executor");
                    throw null;
                }
                v0.i iVar2 = dVar5.f;
                if (iVar2 == null) {
                    j.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, dVar4, executor7, iVar2, dVar5.h)) {
                    return;
                }
                int i17 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                int i18 = Build.VERSION.SDK_INT;
                if (i18 >= 34) {
                    parcelable = g0.a.c(resultData);
                } else {
                    parcelable = resultData.getParcelable("RESULT_DATA");
                    if (!Intent.class.isInstance(parcelable)) {
                        parcelable = null;
                    }
                }
                Intent intent3 = (Intent) parcelable;
                int i19 = b1.d.c;
                if (i17 != i19) {
                    Log.w("CreatePublicKey", "Returned request code " + i19 + " does not match what was given " + i17);
                    return;
                }
                if (b1.d.c(i10, new b1.e(3), new c(dVar5, 2), dVar5.h)) {
                    return;
                }
                if (intent3 == null) {
                    CancellationSignal cancellationSignal9 = dVar5.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal9)) {
                        return;
                    }
                    Executor executor8 = dVar5.g;
                    if (executor8 != null) {
                        executor8.execute(new e1.a(dVar5, 1));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
                if (i18 >= 34) {
                    a2 = g1.a.b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", intent3);
                } else {
                    Bundle bundleExtra = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                    a2 = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) ? null : d8.a(string, bundle);
                }
                if (a2 != null) {
                    CancellationSignal cancellationSignal10 = dVar5.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal10)) {
                        return;
                    }
                    Executor executor9 = dVar5.g;
                    if (executor9 != null) {
                        executor9.execute(new a1.e(19, dVar5, a2));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
                if (i18 >= 34) {
                    a10 = g1.a.a(intent3);
                } else {
                    int i20 = w0.d.a;
                    Bundle bundleExtra2 = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                    if (bundleExtra2 == null) {
                        a10 = null;
                    } else {
                        String string3 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string3 == null) {
                            throw new IllegalArgumentException("Bundle was missing exception type.");
                        }
                        a10 = v8.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string3);
                    }
                }
                CancellationSignal cancellationSignal11 = dVar5.h;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal11)) {
                    return;
                }
                Executor executor10 = dVar5.g;
                if (executor10 != null) {
                    executor10.execute(new e1.c(dVar5, a10, 1));
                    return;
                } else {
                    j.h("executor");
                    throw null;
                }
            default:
                j.e(resultData, "resultData");
                d dVar6 = new d(2, b1.d.a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 3);
                f1.b bVar = (f1.b) dVar2;
                Executor executor11 = bVar.g;
                if (executor11 == null) {
                    j.h("executor");
                    throw null;
                }
                v0.i iVar3 = bVar.f;
                if (iVar3 == null) {
                    j.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, dVar6, executor11, iVar3, bVar.h)) {
                    return;
                }
                int i21 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                int i22 = Build.VERSION.SDK_INT;
                if (i22 >= 34) {
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
                    j.h("executor");
                    throw null;
                }
                final v0.i iVar4 = bVar.f;
                if (iVar4 == null) {
                    j.h("callback");
                    throw null;
                }
                CancellationSignal cancellationSignal12 = bVar.h;
                int i23 = b1.d.c;
                if (i21 != i23) {
                    Log.w("GetCredentialController", "Returned request code " + i23 + " which  does not match what was given " + i21);
                    return;
                }
                final int i24 = 0;
                if (c0.b(i10, new b1.e(i24), new b1.f(i24, executor12, iVar4), cancellationSignal12)) {
                    return;
                }
                if (intent4 == null) {
                    c0.a(cancellationSignal12, new dd.a() { // from class: b1.g
                        @Override // dd.a
                        public final Object invoke() {
                            switch (i24) {
                                case 0:
                                    ((Executor) executor12).execute(new a1.b((v0.i) iVar4, 7));
                                    break;
                                default:
                                    c1.f fVar2 = (c1.f) executor12;
                                    fVar2.f().execute(new a1.e(7, fVar2, (o) iVar4));
                                    break;
                            }
                            return sc.i.a;
                        }
                    });
                    return;
                }
                if (i22 >= 34) {
                    oVar = g1.a.d(intent4);
                } else {
                    Bundle bundleExtra3 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                    oVar = (bundleExtra3 == null || (string2 = bundleExtra3.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle2 = bundleExtra3.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) ? null : new o(e8.a(string2, bundle2));
                }
                if (oVar != null) {
                    c0.a(cancellationSignal12, new b1.b(executor12, iVar4, oVar, 1));
                    return;
                }
                if (i22 >= 34) {
                    b10 = g1.a.c(intent4);
                } else {
                    int i25 = i.a;
                    Bundle bundleExtra4 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                    if (bundleExtra4 == null) {
                        b10 = null;
                    } else {
                        String string4 = bundleExtra4.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string4 == null) {
                            throw new IllegalArgumentException("Bundle was missing exception type.");
                        }
                        b10 = v8.b(bundleExtra4.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string4);
                    }
                }
                c0.a(cancellationSignal12, new b1.b(executor12, iVar4, b10, 2));
                return;
        }
    }
}
