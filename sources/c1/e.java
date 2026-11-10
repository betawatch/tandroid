package c1;

import a8.m9;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import f7.i;
import f7.k;
import f7.r;
import f7.u;
import h9.f1;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import q7.s0;
import v0.g;
import v0.m;
import v0.n;
import v0.o;
import v0.q;
import w0.h;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class e extends b1.d {
    public final Context e;
    public g f;
    public Executor g;
    public CancellationSignal h;
    public final d i;

    public e(Context context) {
        j.e(context, "context");
        this.e = context;
        this.i = new d(this, new Handler(Looper.getMainLooper()), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0182 A[Catch: JSONException -> 0x012a, all -> 0x01a5, TryCatch #2 {JSONException -> 0x012a, blocks: (B:61:0x010e, B:63:0x0115, B:65:0x011c, B:66:0x012d, B:68:0x0131, B:69:0x0136, B:72:0x013c, B:73:0x0141, B:75:0x0145, B:78:0x014c, B:81:0x0182, B:82:0x0185, B:84:0x0189, B:87:0x0193, B:89:0x0154, B:98:0x0178, B:99:0x017f), top: B:60:0x010e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0189 A[Catch: JSONException -> 0x012a, all -> 0x01a5, TryCatch #2 {JSONException -> 0x012a, blocks: (B:61:0x010e, B:63:0x0115, B:65:0x011c, B:66:0x012d, B:68:0x0131, B:69:0x0136, B:72:0x013c, B:73:0x0141, B:75:0x0145, B:78:0x014c, B:81:0x0182, B:82:0x0185, B:84:0x0189, B:87:0x0193, B:89:0x0154, B:98:0x0178, B:99:0x017f), top: B:60:0x010e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o e(a6.g gVar) {
        m mVar;
        k kVar;
        f7.g gVar2;
        String jSONObject;
        u uVar = gVar.r;
        String idToken = gVar.h;
        String id2 = gVar.a;
        String str = gVar.f;
        if (str != null) {
            j.d(id2, "getId(...)");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", id2);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str);
            mVar = new m(str, 2, bundle);
        } else {
            boolean z9 = false;
            JSONObject jSONObject2 = null;
            if (idToken != null) {
                j.d(id2, "getId(...)");
                String str2 = gVar.b;
                if (str2 == null) {
                    str2 = null;
                }
                String str3 = gVar.c;
                if (str3 == null) {
                    str3 = null;
                }
                String str4 = gVar.d;
                if (str4 == null) {
                    str4 = null;
                }
                String str5 = gVar.n;
                if (str5 == null) {
                    str5 = null;
                }
                Uri uri = gVar.e;
                Uri uri2 = uri != null ? uri : null;
                j.e(id2, "id");
                j.e(idToken, "idToken");
                Bundle bundle2 = new Bundle();
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", id2);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", idToken);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str2);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str3);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str5);
                bundle2.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri2);
                mVar = new c9.a("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", 0, bundle2);
                if (id2.length() <= 0) {
                    throw new IllegalArgumentException("id should not be empty");
                }
                if (idToken.length() <= 0) {
                    throw new IllegalArgumentException("idToken should not be empty");
                }
            } else if (uVar != null) {
                k kVar2 = uVar.f;
                i iVar = uVar.e;
                f7.j jVar = uVar.d;
                LinkedHashMap linkedHashMap = d1.g.a;
                JSONObject jSONObject3 = new JSONObject();
                if (jVar != 0) {
                    kVar = jVar;
                } else if (iVar != 0) {
                    kVar = iVar;
                } else {
                    if (kVar2 == null) {
                        throw new IllegalStateException("No response set.");
                    }
                    kVar = kVar2;
                }
                if (kVar instanceof k) {
                    k kVar3 = kVar;
                    r rVar = kVar3.a;
                    j.d(rVar, "getErrorCode(...)");
                    String str6 = kVar3.b;
                    x0.a aVar = (x0.a) d1.g.a.get(rVar);
                    if (aVar == null) {
                        throw new y0.b(new x0.a(26), rf.b.i("unknown fido gms exception - ", str6));
                    }
                    if (rVar == r.x && str6 != null && xd.d.e(str6, "Unable to get sync account")) {
                        throw new w0.g("Passkey retrieval was cancelled by the user.");
                    }
                    throw new y0.b(aVar, str6);
                }
                if (kVar instanceof i) {
                    try {
                        s0 s0Var = uVar.c;
                        try {
                            JSONObject jSONObject4 = new JSONObject();
                            if (s0Var != null && s0Var.p().length > 0) {
                                jSONObject4.put("rawId", x6.b.c(s0Var.p()));
                            }
                            String str7 = uVar.n;
                            if (str7 != null) {
                                jSONObject4.put("authenticatorAttachment", str7);
                            }
                            String str8 = uVar.b;
                            if (str8 != null && kVar2 == null) {
                                jSONObject4.put(TeXSymbolParser.TYPE_ATTR, str8);
                            }
                            String str9 = uVar.a;
                            if (str9 != null) {
                                jSONObject4.put("id", str9);
                            }
                            String str10 = "response";
                            if (iVar != 0) {
                                jSONObject2 = iVar.b();
                            } else if (jVar != 0) {
                                jSONObject2 = jVar.b();
                            } else {
                                if (kVar2 != null) {
                                    try {
                                        jSONObject2 = new JSONObject();
                                        jSONObject2.put("code", kVar2.a.a);
                                        String str11 = kVar2.b;
                                        if (str11 != null) {
                                            jSONObject2.put("message", str11);
                                        }
                                        str10 = "error";
                                    } catch (JSONException e10) {
                                        throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e10);
                                    }
                                }
                                if (jSONObject2 != null) {
                                    jSONObject4.put(str10, jSONObject2);
                                }
                                gVar2 = uVar.h;
                                if (gVar2 == null) {
                                    jSONObject4.put("clientExtensionResults", gVar2.b());
                                } else if (z9) {
                                    jSONObject4.put("clientExtensionResults", new JSONObject());
                                }
                                jSONObject = jSONObject4.toString();
                                j.d(jSONObject, "toJson(...)");
                            }
                            z9 = true;
                            if (jSONObject2 != null) {
                            }
                            gVar2 = uVar.h;
                            if (gVar2 == null) {
                            }
                            jSONObject = jSONObject4.toString();
                            j.d(jSONObject, "toJson(...)");
                        } catch (JSONException e11) {
                            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e11);
                        }
                    } catch (Throwable th2) {
                        throw new h(2, "The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage());
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(kVar.getClass().getName()));
                    jSONObject = jSONObject3.toString();
                    j.d(jSONObject, "toString(...)");
                }
                Bundle bundle3 = new Bundle();
                bundle3.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", jSONObject);
                mVar = new m(jSONObject, 3, bundle3);
            } else {
                Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
                mVar = null;
            }
        }
        if (mVar != null) {
            return new o(mVar);
        }
        throw new h(2, "When attempting to convert get response, null credential found");
    }

    public final g f() {
        g gVar = this.f;
        if (gVar != null) {
            return gVar;
        }
        j.h("callback");
        throw null;
    }

    public final Executor g() {
        Executor executor = this.g;
        if (executor != null) {
            return executor;
        }
        j.h("executor");
        throw null;
    }

    public final void h(n request, CancellationSignal cancellationSignal, Executor executor, g callback) {
        j.e(request, "request");
        j.e(callback, "callback");
        j.e(executor, "executor");
        this.h = cancellationSignal;
        this.f = callback;
        this.g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (a1.g.a(cancellationSignal)) {
            return;
        }
        Context context = this.e;
        j.e(context, "context");
        a6.d dVar = new a6.d(false);
        a6.a aVar = new a6.a(false, null, null, true, null, null, false);
        a6.c cVar = new a6.c(false, null, null);
        a6.b bVar = new a6.b(null, false);
        PackageManager packageManager = context.getPackageManager();
        j.d(packageManager, "getPackageManager(...)");
        long j3 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        a6.b bVar2 = bVar;
        boolean z9 = false;
        for (v0.h hVar : request.a) {
            if ((hVar instanceof q) && !z9) {
                if (j3 >= 231815000) {
                    LinkedHashMap linkedHashMap = d1.g.a;
                    bVar2 = new a6.b(((q) hVar).e, true);
                } else {
                    LinkedHashMap linkedHashMap2 = d1.g.a;
                    JSONObject jSONObject = new JSONObject(((q) hVar).e);
                    String optString = jSONObject.optString("rpId", "");
                    j.b(optString);
                    if (optString.length() == 0) {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                    cVar = new a6.c(true, m9.a(jSONObject), optString);
                }
                z9 = true;
            }
        }
        boolean z10 = j3 > 241217000 ? request.b : false;
        l7.b a10 = a.a.a(context);
        new a6.a(false, null, null, true, null, null, false);
        a6.e eVar = new a6.e(dVar, aVar, a10.l, false, 0, cVar, bVar2, z10);
        s b10 = t.b();
        b10.d = new n6.c[]{new n6.c("auth_api_credentials_begin_sign_in", 8L)};
        b10.c = new f1(a10, eVar, 8);
        b10.b = false;
        b10.a = 1553;
        a10.e(0, b10.a()).addOnSuccessListener(new a1.c(new ae.d(2, cancellationSignal, this), 20)).addOnFailureListener(new ab.g(6, this, cancellationSignal));
    }
}
