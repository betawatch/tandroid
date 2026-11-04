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
import b8.db;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import e7.i;
import e7.k;
import e7.r;
import e7.u;
import gi.w5;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import p7.t0;
import v0.h;
import v0.l;
import v0.m;
import v0.n;
import v0.o;
import x7.r6;
import z5.g;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends b1.d {
    public final Context e;
    public h f;
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
    public final n d(g gVar) {
        l lVar;
        k kVar;
        e7.g gVar2;
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
            lVar = new l(str, 2, bundle);
        } else {
            boolean z10 = false;
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
                lVar = new b9.a("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", 0, bundle2);
                if (id2.length() <= 0) {
                    throw new IllegalArgumentException("id should not be empty");
                }
                if (idToken.length() <= 0) {
                    throw new IllegalArgumentException("idToken should not be empty");
                }
            } else if (uVar != null) {
                k kVar2 = uVar.f;
                i iVar = uVar.e;
                e7.j jVar = uVar.d;
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
                        throw new y0.b(new x0.a(26), t4.c.f("unknown fido gms exception - ", str6));
                    }
                    if (rVar == r.x && str6 != null && ud.d.e(str6, "Unable to get sync account")) {
                        throw new w0.g("Passkey retrieval was cancelled by the user.");
                    }
                    throw new y0.b(aVar, str6);
                }
                if (kVar instanceof i) {
                    try {
                        t0 t0Var = uVar.c;
                        try {
                            JSONObject jSONObject4 = new JSONObject();
                            if (t0Var != null && t0Var.p().length > 0) {
                                jSONObject4.put("rawId", w6.b.c(t0Var.p()));
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
                                } else if (z10) {
                                    jSONObject4.put("clientExtensionResults", new JSONObject());
                                }
                                jSONObject = jSONObject4.toString();
                                j.d(jSONObject, "toJson(...)");
                            }
                            z10 = true;
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
                        throw new w0.h(2, "The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage());
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(kVar.getClass().getName()));
                    jSONObject = jSONObject3.toString();
                    j.d(jSONObject, "toString(...)");
                }
                Bundle bundle3 = new Bundle();
                bundle3.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", jSONObject);
                lVar = new l(jSONObject, 3, bundle3);
            } else {
                Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
                lVar = null;
            }
        }
        if (lVar != null) {
            return new n(lVar);
        }
        throw new w0.h(2, "When attempting to convert get response, null credential found");
    }

    public final h e() {
        h hVar = this.f;
        if (hVar != null) {
            return hVar;
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

    public final void g(m request, CancellationSignal cancellationSignal, Executor executor, h callback) {
        j.e(request, "request");
        j.e(callback, "callback");
        j.e(executor, "executor");
        this.h = cancellationSignal;
        this.f = callback;
        this.g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (a1.h.a(cancellationSignal)) {
            return;
        }
        Context context = this.e;
        j.e(context, "context");
        z5.d dVar = new z5.d(false);
        z5.a aVar = new z5.a(false, null, null, true, null, null, false);
        z5.c cVar = new z5.c(false, null, null);
        z5.b bVar = new z5.b(null, false);
        PackageManager packageManager = context.getPackageManager();
        j.d(packageManager, "getPackageManager(...)");
        long j10 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        Iterator it = request.a.iterator();
        z5.b bVar2 = bVar;
        boolean z10 = false;
        while (true) {
            int i3 = 1;
            if (!it.hasNext()) {
                boolean z11 = j10 > 241217000 ? request.b : false;
                k7.b a10 = r6.a(context);
                new z5.a(false, null, null, true, null, null, false);
                z5.e eVar = new z5.e(dVar, aVar, a10.l, false, 0, cVar, bVar2, z11);
                s b10 = t.b();
                b10.d = new m6.c[]{new m6.c("auth_api_credentials_begin_sign_in", 8L)};
                b10.c = new w5(a10, eVar, 7);
                b10.b = false;
                b10.a = 1553;
                int i10 = 8;
                a10.e(0, b10.a()).addOnSuccessListener(new a1.c(new b1.e(i3, cancellationSignal, this), i10)).addOnFailureListener(new ai.n(i10, this, cancellationSignal));
                return;
            }
            o oVar = (o) it.next();
            if ((oVar instanceof o) && !z10) {
                if (j10 >= 231815000) {
                    LinkedHashMap linkedHashMap = d1.g.a;
                    bVar2 = new z5.b(oVar.d, true);
                } else {
                    LinkedHashMap linkedHashMap2 = d1.g.a;
                    JSONObject jSONObject = new JSONObject(oVar.d);
                    String optString = jSONObject.optString("rpId", "");
                    j.b(optString);
                    if (optString.length() == 0) {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                    cVar = new z5.c(true, db.a(jSONObject), optString);
                }
                z10 = true;
            }
        }
    }
}
