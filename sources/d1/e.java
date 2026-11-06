package d1;

import a8.m9;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.fido.common.Transport;
import f7.b0;
import f7.e0;
import f7.i;
import f7.i0;
import f7.k;
import f7.m;
import f7.o;
import f7.s;
import f7.t;
import f7.u;
import f7.v;
import f7.w;
import f7.x;
import f7.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import q7.s0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class e extends b1.d {
    public final Context e;
    public v0.g f;
    public Executor g;
    public CancellationSignal h;
    public final c1.d i;

    public e(Context context) {
        j.e(context, "context");
        this.e = context;
        this.i = new c1.d(this, new Handler(Looper.getMainLooper()), 1);
    }

    public static v0.f f(u uVar) {
        JSONObject jSONObject;
        try {
            k kVar = uVar.f;
            s0 s0Var = uVar.c;
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (s0Var != null && s0Var.p().length > 0) {
                    jSONObject2.put("rawId", x6.b.c(s0Var.p()));
                }
                String str = uVar.n;
                if (str != null) {
                    jSONObject2.put("authenticatorAttachment", str);
                }
                String str2 = uVar.b;
                if (str2 != null && kVar == null) {
                    jSONObject2.put(TeXSymbolParser.TYPE_ATTR, str2);
                }
                String str3 = uVar.a;
                if (str3 != null) {
                    jSONObject2.put("id", str3);
                }
                String str4 = "response";
                i iVar = uVar.e;
                boolean z9 = true;
                if (iVar != null) {
                    jSONObject = iVar.b();
                } else {
                    f7.j jVar = uVar.d;
                    if (jVar != null) {
                        jSONObject = jVar.b();
                    } else {
                        z9 = false;
                        if (kVar != null) {
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("code", kVar.a.a);
                                String str5 = kVar.b;
                                if (str5 != null) {
                                    jSONObject3.put("message", str5);
                                }
                                str4 = "error";
                                jSONObject = jSONObject3;
                            } catch (JSONException e10) {
                                throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e10);
                            }
                        } else {
                            jSONObject = null;
                        }
                    }
                }
                if (jSONObject != null) {
                    jSONObject2.put(str4, jSONObject);
                }
                f7.g gVar = uVar.h;
                if (gVar != null) {
                    jSONObject2.put("clientExtensionResults", gVar.b());
                } else if (z9) {
                    jSONObject2.put("clientExtensionResults", new JSONObject());
                }
                String jSONObject4 = jSONObject2.toString();
                j.d(jSONObject4, "toJson(...)");
                Bundle bundle = new Bundle();
                bundle.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", jSONObject4);
                return new v0.f(jSONObject4, bundle);
            } catch (JSONException e11) {
                throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e11);
            }
        } catch (Throwable th2) {
            throw new w0.c(2, "The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final v e(v0.e request) {
        f7.f fVar;
        m mVar;
        f7.f fVar2;
        String str;
        JSONArray jSONArray;
        ArrayList arrayList;
        long j3;
        j.e(request, "request");
        LinkedHashMap linkedHashMap = g.a;
        String str2 = request.d;
        Context context = this.e;
        j.e(context, "context");
        if (n6.d.e.d(context, n6.e.a) == 0) {
            PackageManager packageManager = context.getPackageManager();
            j.d(packageManager, "getPackageManager(...)");
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                j.d(packageInfo, "getPackageInfo(...)");
                j3 = f.s(packageInfo);
            } else {
                j3 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            }
            if (j3 > 241217000) {
                return new v(str2);
            }
        }
        JSONObject jSONObject = new JSONObject(str2);
        byte[] a10 = m9.a(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("user");
        String str3 = "id";
        String string = jSONObject2.getString("id");
        j.d(string, "getString(...)");
        byte[] decode = Base64.decode(string, 11);
        j.d(decode, "decode(...)");
        String string2 = jSONObject2.getString("name");
        String string3 = jSONObject2.getString("displayName");
        String optString = jSONObject2.optString("icon", "");
        j.b(string3);
        if (string3.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
        }
        if (decode.length == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
        }
        j.b(string2);
        if (string2.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
        }
        b0 b0Var = new b0(string2, decode, optString, string3);
        JSONObject jSONObject3 = jSONObject.getJSONObject("rp");
        String string4 = jSONObject3.getString("id");
        String optString2 = jSONObject3.optString("name", "");
        String optString3 = jSONObject3.optString("icon", "");
        j.b(optString3);
        if (optString3.length() == 0) {
            optString3 = null;
        }
        j.b(optString2);
        if (optString2.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
        }
        j.b(string4);
        if (string4.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
        }
        y yVar = new y(string4, optString2, optString3);
        JSONArray jSONArray2 = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList2 = new ArrayList();
        int length = jSONArray2.length();
        int i7 = 0;
        while (i7 < length) {
            JSONObject jSONObject4 = jSONArray2.getJSONObject(i7);
            LinkedHashMap linkedHashMap2 = g.a;
            byte[] bArr = a10;
            int i10 = (int) jSONObject4.getLong("alg");
            String optString4 = jSONObject4.optString(TeXSymbolParser.TYPE_ATTR, "");
            j.b(optString4);
            if (optString4.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
            }
            try {
                o.a(i10);
                arrayList2.add(new x(optString4, i10));
            } catch (Throwable unused) {
            }
            i7++;
            a10 = bArr;
        }
        byte[] bArr2 = a10;
        y yVar2 = yVar;
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap3 = g.a;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("excludeCredentials");
            int length2 = jSONArray3.length();
            int i11 = 0;
            while (i11 < length2) {
                JSONObject jSONObject5 = jSONArray3.getJSONObject(i11);
                LinkedHashMap linkedHashMap4 = g.a;
                String string5 = jSONObject5.getString(str3);
                j.d(string5, "getString(...)");
                y yVar3 = yVar2;
                byte[] decode2 = Base64.decode(string5, 11);
                j.d(decode2, "decode(...)");
                String string6 = jSONObject5.getString(TeXSymbolParser.TYPE_ATTR);
                j.b(string6);
                if (string6.length() == 0) {
                    throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                }
                if (decode2.length == 0) {
                    throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                }
                if (jSONObject5.has("transports")) {
                    str = str3;
                    arrayList = new ArrayList();
                    JSONArray jSONArray4 = jSONObject5.getJSONArray("transports");
                    int length3 = jSONArray4.length();
                    jSONArray = jSONArray3;
                    int i12 = 0;
                    while (i12 < length3) {
                        try {
                            JSONArray jSONArray5 = jSONArray4;
                            arrayList.add(Transport.a(jSONArray4.getString(i12)));
                            i12++;
                            jSONArray4 = jSONArray5;
                        } catch (d7.a e10) {
                            throw new y0.a(new x0.a(4), e10.getMessage());
                        }
                    }
                } else {
                    str = str3;
                    jSONArray = jSONArray3;
                    arrayList = null;
                }
                arrayList3.add(new w(string6, decode2, arrayList));
                i11++;
                yVar2 = yVar3;
                str3 = str;
                jSONArray3 = jSONArray;
            }
        }
        y yVar4 = yVar2;
        LinkedHashMap linkedHashMap5 = g.a;
        String optString5 = jSONObject.optString("attestation", "none");
        j.b(optString5);
        f7.e a11 = f7.e.a(optString5.length() != 0 ? optString5 : "none");
        Double valueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getLong("timeout") / 1000) : null;
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
            boolean optBoolean = jSONObject6.optBoolean("requireResidentKey", false);
            String optString6 = jSONObject6.optString("residentKey", "");
            j.b(optString6);
            e0 a12 = optString6.length() > 0 ? e0.a(optString6) : null;
            Boolean valueOf2 = Boolean.valueOf(optBoolean);
            String optString7 = jSONObject6.optString("authenticatorAttachment", "");
            j.b(optString7);
            f7.c a13 = optString7.length() > 0 ? f7.c.a(optString7) : null;
            fVar = null;
            mVar = new m(a13 == null ? null : a13.a, valueOf2, null, a12 == null ? null : a12.a);
        } else {
            fVar = null;
            mVar = null;
        }
        if (jSONObject.has("extensions")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
            String optString8 = jSONObject7.optString("appid", "");
            j.b(optString8);
            fVar2 = new f7.f(optString8.length() > 0 ? new s(optString8) : fVar, null, jSONObject7.optBoolean("uvm", false) ? new i0(true) : fVar, null, null, null, null, null, jSONObject7.optBoolean("thirdPartyPayment", false) ? new t(true) : fVar, null, null, null);
        } else {
            fVar2 = fVar;
        }
        return new v(yVar4, b0Var, bArr2, arrayList2, valueOf, arrayList3, mVar, null, null, a11.a, fVar2, null, null);
    }
}
