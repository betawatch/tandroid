package c1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b7.w0;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import j7.y6;
import j7.y8;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import l5.g;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.yh;
import q6.k;
import q6.r;
import q6.u;
import v0.i;
import v0.m;
import v0.n;
import v0.o;
import v0.p;
import w0.h;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f extends b1.d {
    public final Context e;
    public i f;
    public Executor g;
    public CancellationSignal h;
    public final e i;

    public f(Context context) {
        j.e(context, "context");
        this.e = context;
        this.i = new e(this, new Handler(Looper.getMainLooper()), 0);
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
        q6.g gVar2;
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
            boolean z4 = false;
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
                mVar = new n8.a("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", 0, bundle2);
                if (id2.length() <= 0) {
                    throw new IllegalArgumentException("id should not be empty");
                }
                if (idToken.length() <= 0) {
                    throw new IllegalArgumentException("idToken should not be empty");
                }
            } else if (uVar != null) {
                k kVar2 = uVar.f;
                q6.i iVar = uVar.e;
                q6.j jVar = uVar.d;
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
                        throw new y0.b(new x0.a(26), yh.k("unknown fido gms exception - ", str6));
                    }
                    if (rVar == r.w && str6 != null && jd.j.b(str6, "Unable to get sync account")) {
                        throw new w0.g("Passkey retrieval was cancelled by the user.");
                    }
                    throw new y0.b(aVar, str6);
                }
                if (kVar instanceof q6.i) {
                    try {
                        w0 w0Var = uVar.c;
                        try {
                            JSONObject jSONObject4 = new JSONObject();
                            if (w0Var != null && w0Var.u().length > 0) {
                                jSONObject4.put("rawId", i6.b.c(w0Var.u()));
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
                                jSONObject2 = iVar.e();
                            } else if (jVar != 0) {
                                jSONObject2 = jVar.e();
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
                                    } catch (JSONException e6) {
                                        throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e6);
                                    }
                                }
                                if (jSONObject2 != null) {
                                    jSONObject4.put(str10, jSONObject2);
                                }
                                gVar2 = uVar.h;
                                if (gVar2 == null) {
                                    jSONObject4.put("clientExtensionResults", gVar2.e());
                                } else if (z4) {
                                    jSONObject4.put("clientExtensionResults", new JSONObject());
                                }
                                jSONObject = jSONObject4.toString();
                                j.d(jSONObject, "toJson(...)");
                            }
                            z4 = true;
                            if (jSONObject2 != null) {
                            }
                            gVar2 = uVar.h;
                            if (gVar2 == null) {
                            }
                            jSONObject = jSONObject4.toString();
                            j.d(jSONObject, "toJson(...)");
                        } catch (JSONException e10) {
                            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e10);
                        }
                    } catch (Throwable th2) {
                        throw new h("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage(), 2);
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
        throw new h("When attempting to convert get response, null credential found", 2);
    }

    public final i e() {
        i iVar = this.f;
        if (iVar != null) {
            return iVar;
        }
        j.h("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.g;
        if (executor != null) {
            return executor;
        }
        j.h("executor");
        throw null;
    }

    public final void g(n request, CancellationSignal cancellationSignal, Executor executor, i callback) {
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
        int i10 = 0;
        l5.d dVar = new l5.d(false);
        l5.a aVar = new l5.a(false, null, null, true, null, null, false);
        l5.c cVar = new l5.c(false, null, null);
        l5.b bVar = new l5.b(null, false);
        PackageManager packageManager = context.getPackageManager();
        j.d(packageManager, "getPackageManager(...)");
        long j10 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        Iterator it = request.a.iterator();
        l5.b bVar2 = bVar;
        boolean z4 = false;
        while (true) {
            int i11 = 1;
            if (!it.hasNext()) {
                boolean z10 = j10 > 241217000 ? request.b : false;
                w6.b a2 = y8.a(context);
                new l5.a(false, null, null, true, null, null, false);
                l5.e eVar = new l5.e(dVar, aVar, a2.k, false, 0, cVar, bVar2, z10);
                v e6 = w.e();
                e6.d = new y5.c[]{new y5.c("auth_api_credentials_begin_sign_in", 8L)};
                e6.c = new f1(a2, eVar);
                e6.b = false;
                e6.a = 1553;
                a2.e(0, e6.e()).addOnSuccessListener(new a1.c(new b1.f(i11, cancellationSignal, this), i11)).addOnFailureListener(new b(i10, this, cancellationSignal));
                return;
            }
            p pVar = (p) it.next();
            if ((pVar instanceof p) && !z4) {
                if (j10 >= 231815000) {
                    LinkedHashMap linkedHashMap = d1.g.a;
                    bVar2 = new l5.b(pVar.d, true);
                } else {
                    LinkedHashMap linkedHashMap2 = d1.g.a;
                    JSONObject jSONObject = new JSONObject(pVar.d);
                    String optString = jSONObject.optString("rpId", "");
                    j.b(optString);
                    if (optString.length() == 0) {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                    cVar = new l5.c(true, y6.a(jSONObject), optString);
                }
                z4 = true;
            }
        }
    }
}
