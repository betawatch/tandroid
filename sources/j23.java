// default package

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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j23 extends ResultReceiver {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j23(to6 to6Var) {
        super(null);
        this.a = (byte) 5;
        this.b = new WeakReference(to6Var);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        w13 a;
        String string;
        Bundle bundle2;
        o13 a2;
        boolean z;
        o13 o13Var;
        kk5 kk5Var;
        byte b = 0;
        byte b2 = 2;
        byte b3 = 1;
        switch (this.a) {
            case 0:
                bundle.getClass();
                i23 i23Var = new i23(2, j33.a, e33.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, (byte) 0);
                k23 k23Var = (k23) this.b;
                Executor executor = k23Var.g;
                if (executor == null) {
                    rr5.e("executor");
                    throw null;
                }
                a33 a33Var = k23Var.f;
                if (a33Var == null) {
                    rr5.e("callback");
                    throw null;
                }
                if (j33.b(bundle, i23Var, executor, a33Var, k23Var.h)) {
                    return;
                }
                int i2 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) zrd.a(bundle);
                boolean z2 = j33.c;
                if (i2 != z2) {
                    Log.w("CreatePublicKey", "Returned request code " + (z2 ? 1 : 0) + " does not match what was given " + i2);
                    return;
                }
                z1 z1Var = new z1(k23Var, b3);
                CancellationSignal cancellationSignal = k23Var.h;
                if (i != -1) {
                    e79 e79Var = new e79();
                    e79Var.a = new n13(mce.a(i), (byte) 2);
                    if (i == 0) {
                        e79Var.a = new m13("activity is cancelled by the user.");
                    }
                    i33 i33Var = new i33(z1Var, e79Var, b);
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!w33.a(cancellationSignal)) {
                        i33Var.invoke();
                    }
                    b = 1;
                }
                if (b == 0) {
                    if (intent == null) {
                        CancellationSignal cancellationSignal2 = k23Var.h;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (w33.a(cancellationSignal2)) {
                            return;
                        }
                        Executor executor2 = k23Var.g;
                        if (executor2 != null) {
                            executor2.execute(new e23(k23Var, b3));
                            return;
                        } else {
                            rr5.e("executor");
                            throw null;
                        }
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 34) {
                        a = t4.b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", intent);
                    } else {
                        Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                        a = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle2 = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) ? null : tbe.a(string, bundle2);
                    }
                    if (a != null) {
                        CancellationSignal cancellationSignal3 = k23Var.h;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (w33.a(cancellationSignal3)) {
                            return;
                        }
                        Executor executor3 = k23Var.g;
                        if (executor3 != null) {
                            executor3.execute(new mv2((Object) k23Var, (Object) a, (byte) 14));
                            return;
                        } else {
                            rr5.e("executor");
                            throw null;
                        }
                    }
                    if (i3 >= 34) {
                        a2 = t4.a(intent);
                    } else {
                        int i4 = o13.a;
                        Bundle bundleExtra2 = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                        if (bundleExtra2 == null) {
                            a2 = null;
                        } else {
                            String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                            if (string2 == null) {
                                u36.j("Bundle was missing exception type.");
                                return;
                            }
                            a2 = gwd.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                        }
                    }
                    CancellationSignal cancellationSignal4 = k23Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (w33.a(cancellationSignal4)) {
                        return;
                    }
                    Executor executor4 = k23Var.g;
                    if (executor4 != null) {
                        executor4.execute(new g23(k23Var, a2, b3));
                        return;
                    } else {
                        rr5.e("executor");
                        throw null;
                    }
                }
                return;
            case 1:
                bundle.getClass();
                i23 i23Var2 = new i23(2, j33.a, e33.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 1);
                h33 h33Var = (h33) this.b;
                if (j33.b(bundle, i23Var2, h33Var.f(), h33Var.e(), h33Var.h)) {
                    return;
                }
                int i5 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent2 = (Intent) bundle.getParcelable("RESULT_DATA");
                boolean z3 = j33.c;
                if (i5 != z3) {
                    Log.w("BeginSignIn", "Returned request code " + (z3 ? 1 : 0) + " which  does not match what was given " + i5);
                    return;
                }
                z1 z1Var2 = new z1(h33Var, b2);
                CancellationSignal cancellationSignal5 = h33Var.h;
                if (i != -1) {
                    e79 e79Var2 = new e79();
                    e79Var2.a = new uu4(mce.a(i), (byte) 2);
                    if (i == 0) {
                        e79Var2.a = new su4("activity is cancelled by the user.");
                    }
                    i33 i33Var2 = new i33(z1Var2, e79Var2, b3);
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (w33.a(cancellationSignal5)) {
                        return;
                    }
                    i33Var2.invoke();
                    return;
                }
                try {
                    ume.a(h33Var.e);
                    yu4 d = h33Var.d(s5d.f(intent2));
                    CancellationSignal cancellationSignal6 = h33Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (w33.a(cancellationSignal6)) {
                        return;
                    }
                    h33Var.f().execute(new mv2((Object) h33Var, (Object) d, (byte) 18));
                    return;
                } catch (ap e) {
                    e79 e79Var3 = new e79();
                    e79Var3.a = new uu4(e.getMessage(), (byte) 2);
                    if (e.getStatusCode() == 16) {
                        e79Var3.a = new su4(e.getMessage());
                    } else if (j33.b.contains(Integer.valueOf(e.getStatusCode()))) {
                        e79Var3.a = new wu4(e.getMessage());
                    }
                    CancellationSignal cancellationSignal7 = h33Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (w33.a(cancellationSignal7)) {
                        return;
                    }
                    h33Var.f().execute(new mv2((Object) h33Var, (Object) e79Var3, (byte) 19));
                    return;
                } catch (vu4 e2) {
                    CancellationSignal cancellationSignal8 = h33Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (w33.a(cancellationSignal8)) {
                        return;
                    }
                    h33Var.f().execute(new g33(h33Var, e2, b3));
                    return;
                } catch (Throwable th) {
                    uu4 uu4Var = new uu4(th.getMessage(), (byte) 2);
                    CancellationSignal cancellationSignal9 = h33Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (w33.a(cancellationSignal9)) {
                        return;
                    }
                    h33Var.f().execute(new mv2((Object) h33Var, (Object) uu4Var, (byte) 17));
                    return;
                }
            case 2:
                bundle.getClass();
                i23 i23Var3 = new i23(2, j33.a, e33.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, (byte) 2);
                o33 o33Var = (o33) this.b;
                Executor executor5 = o33Var.g;
                if (executor5 == null) {
                    rr5.e("executor");
                    throw null;
                }
                a33 a33Var2 = o33Var.f;
                if (a33Var2 == null) {
                    rr5.e("callback");
                    throw null;
                }
                if (j33.b(bundle, i23Var3, executor5, a33Var2, o33Var.h)) {
                    return;
                }
                int i6 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent3 = (Intent) bundle.getParcelable("RESULT_DATA");
                boolean z4 = j33.c;
                if (i6 != z4) {
                    Log.w("CreatePublicKey", "Returned request code " + (z4 ? 1 : 0) + " does not match what was given " + i6);
                    return;
                }
                z1 z1Var3 = new z1((Object) o33Var, (byte) 3);
                CancellationSignal cancellationSignal10 = o33Var.h;
                if (i != -1) {
                    e79 e79Var4 = new e79();
                    e79Var4.a = new n13(mce.a(i), (byte) 2);
                    if (i == 0) {
                        e79Var4.a = new m13("activity is cancelled by the user.");
                    }
                    i33 i33Var3 = new i33(z1Var3, e79Var4, b);
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!w33.a(cancellationSignal10)) {
                        i33Var3.invoke();
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
                byte[] byteArrayExtra = intent3 != null ? intent3.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
                if (byteArrayExtra == null) {
                    w33 w33Var = CredentialProviderPlayServicesImpl.Companion;
                    CancellationSignal cancellationSignal11 = o33Var.h;
                    w33Var.getClass();
                    if (w33.a(cancellationSignal11)) {
                        return;
                    }
                    Executor executor6 = o33Var.g;
                    if (executor6 != null) {
                        executor6.execute(new m33(o33Var, b3));
                        return;
                    } else {
                        rr5.e("executor");
                        throw null;
                    }
                }
                lw8 lw8Var = (lw8) nve.a(byteArrayExtra, lw8.CREATOR);
                lw8Var.getClass();
                LinkedHashMap linkedHashMap = mw8.a;
                a60 a60Var = lw8Var.d;
                Object obj = a60Var;
                if (a60Var == null) {
                    z50 z50Var = lw8Var.e;
                    obj = z50Var;
                    if (z50Var == null) {
                        b60 b60Var = lw8Var.f;
                        obj = b60Var;
                        if (b60Var == null) {
                            dq9.m("No response set.");
                            return;
                        }
                    }
                }
                if (obj instanceof b60) {
                    b60 b60Var2 = (b60) obj;
                    f54 f54Var = b60Var2.a;
                    f54Var.getClass();
                    h1 h1Var = (h1) mw8.a.get(f54Var);
                    String str = b60Var2.b;
                    o13Var = h1Var == null ? new l23(new h1((byte) 26), b10.h("unknown fido gms exception - ", str)) : (f54Var != f54.x || str == null || hbb.f(0, 2, str, "Unable to get sync account") < 0) ? new l23(h1Var, str) : new m13("Passkey registration was cancelled by the user.");
                } else {
                    o13Var = null;
                }
                if (o13Var != null) {
                    CancellationSignal cancellationSignal12 = o33Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (w33.a(cancellationSignal12)) {
                        return;
                    }
                    Executor executor7 = o33Var.g;
                    if (executor7 != null) {
                        executor7.execute(new n33(o33Var, o13Var, b3));
                        return;
                    } else {
                        rr5.e("executor");
                        throw null;
                    }
                }
                try {
                    n23 e3 = o33.e(lw8Var);
                    CancellationSignal cancellationSignal13 = o33Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (w33.a(cancellationSignal13)) {
                        return;
                    }
                    Executor executor8 = o33Var.g;
                    if (executor8 != null) {
                        executor8.execute(new mv2((Object) o33Var, (Object) e3, (byte) 21));
                        return;
                    } else {
                        rr5.e("executor");
                        throw null;
                    }
                } catch (JSONException e4) {
                    CancellationSignal cancellationSignal14 = o33Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (w33.a(cancellationSignal14)) {
                        return;
                    }
                    Executor executor9 = o33Var.g;
                    if (executor9 != null) {
                        executor9.execute(new k33(o33Var, e4, b));
                        return;
                    } else {
                        rr5.e("executor");
                        throw null;
                    }
                } catch (Throwable th2) {
                    CancellationSignal cancellationSignal15 = o33Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (w33.a(cancellationSignal15)) {
                        return;
                    }
                    Executor executor10 = o33Var.g;
                    if (executor10 != null) {
                        executor10.execute(new l33(o33Var, th2, b));
                        return;
                    } else {
                        rr5.e("executor");
                        throw null;
                    }
                }
            case 3:
                bundle.getClass();
                i23 i23Var4 = new i23(2, j33.a, e33.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 3);
                t33 t33Var = (t33) this.b;
                Executor executor11 = t33Var.g;
                if (executor11 == null) {
                    rr5.e("executor");
                    throw null;
                }
                a33 a33Var3 = t33Var.f;
                if (a33Var3 == null) {
                    rr5.e("callback");
                    throw null;
                }
                if (j33.b(bundle, i23Var4, executor11, a33Var3, t33Var.h)) {
                    return;
                }
                int i7 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent4 = (Intent) zrd.a(bundle);
                Executor executor12 = t33Var.g;
                if (executor12 == null) {
                    rr5.e("executor");
                    throw null;
                }
                a33 a33Var4 = t33Var.f;
                if (a33Var4 != null) {
                    rue.a(i7, i, intent4, executor12, a33Var4, t33Var.h);
                    return;
                } else {
                    rr5.e("callback");
                    throw null;
                }
            case 4:
                bundle.getClass();
                i23 i23Var5 = new i23(2, j33.a, e33.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 4);
                tu4 tu4Var = (tu4) this.b;
                Executor executor13 = tu4Var.g;
                if (executor13 == null) {
                    rr5.e("executor");
                    throw null;
                }
                a33 a33Var5 = tu4Var.f;
                if (a33Var5 == null) {
                    rr5.e("callback");
                    throw null;
                }
                if (j33.b(bundle, i23Var5, executor13, a33Var5, tu4Var.h)) {
                    return;
                }
                int i8 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent5 = (Intent) zrd.a(bundle);
                Executor executor14 = tu4Var.g;
                if (executor14 == null) {
                    rr5.e("executor");
                    throw null;
                }
                a33 a33Var6 = tu4Var.f;
                if (a33Var6 != null) {
                    rue.a(i8, i, intent5, executor14, a33Var6, tu4Var.h);
                    return;
                } else {
                    rr5.e("callback");
                    throw null;
                }
            default:
                to6 to6Var = (to6) ((WeakReference) this.b).get();
                if (to6Var == null || bundle == null) {
                    return;
                }
                synchronized (to6Var.b) {
                    kx6 kx6Var = to6Var.e;
                    IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                    int i9 = ax6.b;
                    if (binder == null) {
                        kk5Var = null;
                    } else {
                        IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof kk5)) {
                            ik5 ik5Var = new ik5();
                            ik5Var.a = binder;
                            kk5Var = ik5Var;
                        } else {
                            kk5Var = (kk5) queryLocalInterface;
                        }
                    }
                    kx6Var.b(kk5Var);
                    to6Var.e.c(ww7.b(bundle));
                    ArrayList arrayList = to6Var.c;
                    if (to6Var.e.a() != null) {
                        Iterator it = arrayList.iterator();
                        if (!it.hasNext()) {
                            arrayList.clear();
                        } else {
                            if (it.next() == null) {
                                to6Var.d.put(null, new qo6());
                                throw null;
                            }
                            rjb.p();
                        }
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j23(j33 j33Var, Handler handler, byte b) {
        super(handler);
        this.a = b;
        this.b = j33Var;
    }
}
