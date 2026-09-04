package c1;

import ah.i0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import c7.j;
import c7.k;
import c7.r;
import c7.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import d1.f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import n7.s0;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.Cells.p6;
import v0.i;
import v0.m;
import v0.n;
import v0.o;
import v0.p;
import v7.o6;
import w0.h;
import w7.g8;
import x5.g;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class e extends b1.d {
    public final Context e;
    public i f;
    public Executor g;
    public CancellationSignal h;
    public final d i;

    public e(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.e = context;
        this.i = new d(this, new Handler(Looper.getMainLooper()), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0186 A[Catch: JSONException -> 0x012c, all -> 0x01aa, TryCatch #2 {JSONException -> 0x012c, blocks: (B:61:0x010f, B:63:0x0116, B:65:0x011d, B:66:0x012f, B:68:0x0133, B:69:0x0138, B:72:0x013e, B:73:0x0144, B:75:0x0148, B:78:0x0150, B:81:0x0186, B:82:0x0189, B:84:0x018d, B:87:0x0197, B:89:0x0158, B:98:0x017c, B:99:0x0183), top: B:60:0x010f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018d A[Catch: JSONException -> 0x012c, all -> 0x01aa, TryCatch #2 {JSONException -> 0x012c, blocks: (B:61:0x010f, B:63:0x0116, B:65:0x011d, B:66:0x012f, B:68:0x0133, B:69:0x0138, B:72:0x013e, B:73:0x0144, B:75:0x0148, B:78:0x0150, B:81:0x0186, B:82:0x0189, B:84:0x018d, B:87:0x0197, B:89:0x0158, B:98:0x017c, B:99:0x0183), top: B:60:0x010f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o d(g gVar) {
        m mVar;
        k kVar;
        c7.g gVar2;
        String jSONObject;
        u uVar = gVar.r;
        String idToken = gVar.h;
        String id2 = gVar.a;
        String str = gVar.f;
        if (str != null) {
            kotlin.jvm.internal.i.d(id2, "getId(...)");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", id2);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str);
            mVar = new m(str, 2, bundle);
        } else {
            boolean z10 = false;
            JSONObject jSONObject2 = null;
            if (idToken != null) {
                kotlin.jvm.internal.i.d(id2, "getId(...)");
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
                kotlin.jvm.internal.i.e(id2, "id");
                kotlin.jvm.internal.i.e(idToken, "idToken");
                Bundle bundle2 = new Bundle();
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", id2);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", idToken);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str2);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str3);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str5);
                bundle2.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri2);
                mVar = new z8.a("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", 0, bundle2);
                if (id2.length() <= 0) {
                    throw new IllegalArgumentException("id should not be empty");
                }
                if (idToken.length() <= 0) {
                    throw new IllegalArgumentException("idToken should not be empty");
                }
            } else if (uVar != null) {
                k kVar2 = uVar.f;
                c7.i iVar = uVar.e;
                j jVar = uVar.d;
                LinkedHashMap linkedHashMap = f.a;
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
                    kotlin.jvm.internal.i.d(rVar, "getErrorCode(...)");
                    String str6 = kVar3.b;
                    x0.a aVar = (x0.a) f.a.get(rVar);
                    if (aVar == null) {
                        throw new y0.b(new x0.a(26), p6.i("unknown fido gms exception - ", str6));
                    }
                    if (rVar == r.w && str6 != null && xd.j.b(str6, "Unable to get sync account")) {
                        throw new w0.g("Passkey retrieval was cancelled by the user.");
                    }
                    throw new y0.b(aVar, str6);
                }
                if (kVar instanceof c7.i) {
                    try {
                        s0 s0Var = uVar.c;
                        try {
                            JSONObject jSONObject4 = new JSONObject();
                            if (s0Var != null && s0Var.u().length > 0) {
                                jSONObject4.put("rawId", u6.b.c(s0Var.u()));
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
                                    } catch (JSONException e7) {
                                        throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e7);
                                    }
                                }
                                if (jSONObject2 != null) {
                                    jSONObject4.put(str10, jSONObject2);
                                }
                                gVar2 = uVar.h;
                                if (gVar2 == null) {
                                    jSONObject4.put("clientExtensionResults", gVar2.b());
                                } else if (z10) {
                                    jSONObject4.put("clientExtensionResults", new JSONObject());
                                }
                                jSONObject = jSONObject4.toString();
                                kotlin.jvm.internal.i.d(jSONObject, "toJson(...)");
                            }
                            z10 = true;
                            if (jSONObject2 != null) {
                            }
                            gVar2 = uVar.h;
                            if (gVar2 == null) {
                            }
                            jSONObject = jSONObject4.toString();
                            kotlin.jvm.internal.i.d(jSONObject, "toJson(...)");
                        } catch (JSONException e10) {
                            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e10);
                        }
                    } catch (Throwable th2) {
                        throw new h("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage(), 2);
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(kVar.getClass().getName()));
                    jSONObject = jSONObject3.toString();
                    kotlin.jvm.internal.i.d(jSONObject, "toString(...)");
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
        throw new h("When attempting to convert get response, null credential found", 2);
    }

    public final i e() {
        i iVar = this.f;
        if (iVar != null) {
            return iVar;
        }
        kotlin.jvm.internal.i.h("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.g;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.i.h("executor");
        throw null;
    }

    public final void g(n request, CancellationSignal cancellationSignal, Executor executor, i callback) {
        kotlin.jvm.internal.i.e(request, "request");
        kotlin.jvm.internal.i.e(callback, "callback");
        kotlin.jvm.internal.i.e(executor, "executor");
        this.h = cancellationSignal;
        this.f = callback;
        this.g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (a1.g.a(cancellationSignal)) {
            return;
        }
        Context context = this.e;
        kotlin.jvm.internal.i.e(context, "context");
        x5.d dVar = new x5.d(false);
        x5.a aVar = new x5.a(false, null, null, true, null, null, false);
        x5.c cVar = new x5.c(false, null, null);
        x5.b bVar = new x5.b(null, false);
        PackageManager packageManager = context.getPackageManager();
        kotlin.jvm.internal.i.d(packageManager, "getPackageManager(...)");
        long j3 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        Iterator it = request.a.iterator();
        x5.b bVar2 = bVar;
        boolean z10 = false;
        while (true) {
            int i10 = 1;
            if (!it.hasNext()) {
                boolean z11 = j3 > 241217000 ? request.b : false;
                i7.b a2 = g8.a(context);
                new x5.a(false, null, null, true, null, null, false);
                x5.e eVar = new x5.e(dVar, aVar, a2.k, false, 0, cVar, bVar2, z11);
                v e7 = w.e();
                e7.d = new k6.c[]{new k6.c("auth_api_credentials_begin_sign_in", 8L)};
                e7.c = new xa.c(a2, eVar);
                e7.b = false;
                e7.a = 1553;
                a2.e(0, e7.a()).addOnSuccessListener(new a1.c(new b1.f(i10, cancellationSignal, this), 11)).addOnFailureListener(new i0(5, this, cancellationSignal));
                return;
            }
            p pVar = (p) it.next();
            if ((pVar instanceof p) && !z10) {
                if (j3 >= 231815000) {
                    LinkedHashMap linkedHashMap = f.a;
                    bVar2 = new x5.b(pVar.d, true);
                } else {
                    LinkedHashMap linkedHashMap2 = f.a;
                    JSONObject jSONObject = new JSONObject(pVar.d);
                    String optString = jSONObject.optString("rpId", "");
                    kotlin.jvm.internal.i.b(optString);
                    if (optString.length() == 0) {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                    cVar = new x5.c(true, o6.a(jSONObject), optString);
                }
                z10 = true;
            }
        }
    }
}
