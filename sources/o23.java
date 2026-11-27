// default package

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class o23 extends q23 {
    public final Context e;
    public h23 f;
    public Executor g;
    public CancellationSignal h;
    public final q13 i;

    public o23(Context context) {
        context.getClass();
        this.e = context;
        this.i = new q13(this, new Handler(Looper.getMainLooper()), (byte) 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016f A[Catch: JSONException -> 0x0190, all -> 0x0199, TryCatch #2 {JSONException -> 0x0190, blocks: (B:62:0x00fe, B:64:0x0105, B:66:0x010c, B:67:0x0119, B:69:0x011d, B:70:0x0122, B:73:0x0128, B:74:0x012d, B:76:0x0131, B:79:0x013b, B:82:0x016f, B:83:0x0172, B:85:0x0176, B:88:0x0180, B:90:0x0142, B:99:0x0165, B:100:0x016c), top: B:61:0x00fe, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0176 A[Catch: JSONException -> 0x0190, all -> 0x0199, TryCatch #2 {JSONException -> 0x0190, blocks: (B:62:0x00fe, B:64:0x0105, B:66:0x010c, B:67:0x0119, B:69:0x011d, B:70:0x0122, B:73:0x0128, B:74:0x012d, B:76:0x0131, B:79:0x013b, B:82:0x016f, B:83:0x0172, B:85:0x0176, B:88:0x0180, B:90:0x0142, B:99:0x0165, B:100:0x016c), top: B:61:0x00fe, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bv4 d(yka ykaVar) {
        x43 x43Var;
        d50 d50Var;
        z40 z40Var;
        String jSONObject;
        tx8 tx8Var = ykaVar.r;
        String str = ykaVar.h;
        String str2 = ykaVar.a;
        String str3 = ykaVar.f;
        if (str3 != null) {
            str2.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str2);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str3);
            x43Var = new x43(str3, bundle, (byte) 2);
        } else {
            boolean z = false;
            JSONObject jSONObject2 = null;
            if (str != null) {
                str2.getClass();
                String str4 = ykaVar.b;
                if (str4 == null) {
                    str4 = null;
                }
                String str5 = ykaVar.c;
                if (str5 == null) {
                    str5 = null;
                }
                String str6 = ykaVar.d;
                if (str6 == null) {
                    str6 = null;
                }
                String str7 = ykaVar.n;
                if (str7 == null) {
                    str7 = null;
                }
                Uri uri = ykaVar.e;
                if (uri == null) {
                    uri = null;
                }
                str2.getClass();
                str.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str2);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str4);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str6);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str7);
                bundle2.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
                o05 o05Var = new o05("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle2, (byte) 0);
                if (str2.length() <= 0) {
                    lq5.j("id should not be empty");
                    throw null;
                }
                if (str.length() <= 0) {
                    lq5.j("idToken should not be empty");
                    throw null;
                }
                x43Var = o05Var;
            } else if (tx8Var != null) {
                d50 d50Var2 = tx8Var.f;
                b50 b50Var = tx8Var.e;
                c50 c50Var = tx8Var.d;
                LinkedHashMap linkedHashMap = ux8.a;
                JSONObject jSONObject3 = new JSONObject();
                if (c50Var != 0) {
                    d50Var = c50Var;
                } else if (b50Var != 0) {
                    d50Var = b50Var;
                } else {
                    if (d50Var2 == null) {
                        grb.i("No response set.");
                        return null;
                    }
                    d50Var = d50Var2;
                }
                if (d50Var instanceof d50) {
                    d50 d50Var3 = d50Var;
                    q44 q44Var = d50Var3.a;
                    q44Var.getClass();
                    String str8 = d50Var3.b;
                    i1 i1Var = (i1) ux8.a.get(q44Var);
                    if (i1Var == null) {
                        throw new ev4(new i1((byte) 26), c00.i("unknown fido gms exception - ", str8));
                    }
                    if (q44Var != q44.x || str8 == null || ddb.f(0, 2, str8, "Unable to get sync account") < 0) {
                        throw new ev4(i1Var, str8);
                    }
                    throw new vu4("Passkey retrieval was cancelled by the user.");
                }
                if (d50Var instanceof b50) {
                    try {
                        gfe gfeVar = tx8Var.c;
                        try {
                            JSONObject jSONObject4 = new JSONObject();
                            if (gfeVar != null && gfeVar.p().length > 0) {
                                jSONObject4.put("rawId", lsd.b(gfeVar.p()));
                            }
                            String str9 = tx8Var.n;
                            if (str9 != null) {
                                jSONObject4.put("authenticatorAttachment", str9);
                            }
                            String str10 = tx8Var.b;
                            if (str10 != null && d50Var2 == null) {
                                jSONObject4.put(TeXSymbolParser.TYPE_ATTR, str10);
                            }
                            String str11 = tx8Var.a;
                            if (str11 != null) {
                                jSONObject4.put("id", str11);
                            }
                            String str12 = "response";
                            if (b50Var != 0) {
                                jSONObject2 = b50Var.b();
                            } else if (c50Var != 0) {
                                jSONObject2 = c50Var.b();
                            } else {
                                if (d50Var2 != null) {
                                    try {
                                        jSONObject2 = new JSONObject();
                                        jSONObject2.put("code", (int) d50Var2.a.a);
                                        String str13 = d50Var2.b;
                                        if (str13 != null) {
                                            jSONObject2.put("message", str13);
                                        }
                                        str12 = "error";
                                    } catch (JSONException e) {
                                        throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                                    }
                                }
                                if (jSONObject2 != null) {
                                    jSONObject4.put(str12, jSONObject2);
                                }
                                z40Var = tx8Var.h;
                                if (z40Var == null) {
                                    jSONObject4.put("clientExtensionResults", z40Var.b());
                                } else if (z) {
                                    jSONObject4.put("clientExtensionResults", new JSONObject());
                                }
                                jSONObject = jSONObject4.toString();
                                jSONObject.getClass();
                            }
                            z = true;
                            if (jSONObject2 != null) {
                            }
                            z40Var = tx8Var.h;
                            if (z40Var == null) {
                            }
                            jSONObject = jSONObject4.toString();
                            jSONObject.getClass();
                        } catch (JSONException e2) {
                            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
                        }
                    } catch (Throwable th) {
                        throw new xu4("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage(), (byte) 2);
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(d50Var.getClass().getName()));
                    jSONObject = jSONObject3.toString();
                    jSONObject.getClass();
                }
                Bundle bundle3 = new Bundle();
                bundle3.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", jSONObject);
                x43Var = new x43(jSONObject, bundle3, (byte) 3);
            } else {
                Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
                x43Var = null;
            }
        }
        if (x43Var != null) {
            return new bv4(x43Var);
        }
        throw new xu4("When attempting to convert get response, null credential found", (byte) 2);
    }

    public final h23 e() {
        h23 h23Var = this.f;
        if (h23Var != null) {
            return h23Var;
        }
        ur5.e("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.g;
        if (executor != null) {
            return executor;
        }
        ur5.e("executor");
        throw null;
    }

    public final void g(av4 av4Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var) {
        av4Var.getClass();
        h23Var.getClass();
        executor.getClass();
        this.h = cancellationSignal;
        this.f = h23Var;
        this.g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (d33.a(cancellationSignal)) {
            return;
        }
        Context context = this.e;
        context.getClass();
        byte b = 0;
        hh0 hh0Var = new hh0(false);
        eh0 eh0Var = new eh0(false, null, null, true, null, null, false);
        gh0 gh0Var = new gh0(false, null, null);
        fh0 fh0Var = new fh0(null, false);
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        long j = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        gh0 gh0Var2 = gh0Var;
        fh0 fh0Var2 = fh0Var;
        boolean z = false;
        for (j23 j23Var : av4Var.a) {
            if ((j23Var instanceof fv4) && !z) {
                if (j >= 231815000) {
                    LinkedHashMap linkedHashMap = ux8.a;
                    fh0Var2 = new fh0(((fv4) j23Var).e, true);
                } else {
                    LinkedHashMap linkedHashMap2 = ux8.a;
                    JSONObject jSONObject = new JSONObject(((fv4) j23Var).e);
                    String optString = jSONObject.optString("rpId", "");
                    optString.getClass();
                    if (optString.length() == 0) {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                    gh0Var2 = new gh0(true, mwe.a(jSONObject), optString);
                }
                z = true;
            }
        }
        boolean z2 = j > 241217000 ? av4Var.b : false;
        h8d a = kpe.a(context);
        new eh0(false, null, null, true, null, null, false);
        ih0 ih0Var = new ih0(hh0Var, eh0Var, a.l, false, 0, gh0Var2, fh0Var2, z2);
        wjb b2 = xjb.b();
        b2.c = new a94[]{new a94("auth_api_credentials_begin_sign_in", 8L)};
        b2.a = new j09(a, ih0Var);
        b2.b = false;
        b2.d = (char) 1553;
        a.e(0, b2.a()).addOnSuccessListener(new ht2(new m23(cancellationSignal, this, b), (byte) 8)).addOnFailureListener(new q72((Object) this, (Object) cancellationSignal, (byte) 13));
    }
}
