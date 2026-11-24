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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class h33 extends j33 {
    public final Context e;
    public a33 f;
    public Executor g;
    public CancellationSignal h;
    public final j23 i;

    public h33(Context context) {
        context.getClass();
        this.e = context;
        this.i = new j23(this, new Handler(Looper.getMainLooper()), (byte) 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016f A[Catch: JSONException -> 0x0190, all -> 0x0199, TryCatch #2 {JSONException -> 0x0190, blocks: (B:62:0x00fe, B:64:0x0105, B:66:0x010c, B:67:0x0119, B:69:0x011d, B:70:0x0122, B:73:0x0128, B:74:0x012d, B:76:0x0131, B:79:0x013b, B:82:0x016f, B:83:0x0172, B:85:0x0176, B:88:0x0180, B:90:0x0142, B:99:0x0165, B:100:0x016c), top: B:61:0x00fe, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0176 A[Catch: JSONException -> 0x0190, all -> 0x0199, TryCatch #2 {JSONException -> 0x0190, blocks: (B:62:0x00fe, B:64:0x0105, B:66:0x010c, B:67:0x0119, B:69:0x011d, B:70:0x0122, B:73:0x0128, B:74:0x012d, B:76:0x0131, B:79:0x013b, B:82:0x016f, B:83:0x0172, B:85:0x0176, B:88:0x0180, B:90:0x0142, B:99:0x0165, B:100:0x016c), top: B:61:0x00fe, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yu4 d(hja hjaVar) {
        q53 q53Var;
        b60 b60Var;
        x50 x50Var;
        String jSONObject;
        lw8 lw8Var = hjaVar.r;
        String str = hjaVar.h;
        String str2 = hjaVar.a;
        String str3 = hjaVar.f;
        if (str3 != null) {
            str2.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str2);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str3);
            q53Var = new q53(str3, bundle, (byte) 2);
        } else {
            boolean z = false;
            JSONObject jSONObject2 = null;
            if (str != null) {
                str2.getClass();
                String str4 = hjaVar.b;
                if (str4 == null) {
                    str4 = null;
                }
                String str5 = hjaVar.c;
                if (str5 == null) {
                    str5 = null;
                }
                String str6 = hjaVar.d;
                if (str6 == null) {
                    str6 = null;
                }
                String str7 = hjaVar.n;
                if (str7 == null) {
                    str7 = null;
                }
                Uri uri = hjaVar.e;
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
                j05 j05Var = new j05("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle2, (byte) 0);
                if (str2.length() <= 0) {
                    u36.j("id should not be empty");
                    throw null;
                }
                if (str.length() <= 0) {
                    u36.j("idToken should not be empty");
                    throw null;
                }
                q53Var = j05Var;
            } else if (lw8Var != null) {
                b60 b60Var2 = lw8Var.f;
                z50 z50Var = lw8Var.e;
                a60 a60Var = lw8Var.d;
                LinkedHashMap linkedHashMap = mw8.a;
                JSONObject jSONObject3 = new JSONObject();
                if (a60Var != 0) {
                    b60Var = a60Var;
                } else if (z50Var != 0) {
                    b60Var = z50Var;
                } else {
                    if (b60Var2 == null) {
                        dq9.m("No response set.");
                        return null;
                    }
                    b60Var = b60Var2;
                }
                if (b60Var instanceof b60) {
                    b60 b60Var3 = b60Var;
                    f54 f54Var = b60Var3.a;
                    f54Var.getClass();
                    String str8 = b60Var3.b;
                    h1 h1Var = (h1) mw8.a.get(f54Var);
                    if (h1Var == null) {
                        throw new bv4(new h1((byte) 26), b10.h("unknown fido gms exception - ", str8));
                    }
                    if (f54Var != f54.x || str8 == null || hbb.f(0, 2, str8, "Unable to get sync account") < 0) {
                        throw new bv4(h1Var, str8);
                    }
                    throw new su4("Passkey retrieval was cancelled by the user.");
                }
                if (b60Var instanceof z50) {
                    try {
                        rce rceVar = lw8Var.c;
                        try {
                            JSONObject jSONObject4 = new JSONObject();
                            if (rceVar != null && rceVar.p().length > 0) {
                                jSONObject4.put("rawId", xpd.b(rceVar.p()));
                            }
                            String str9 = lw8Var.n;
                            if (str9 != null) {
                                jSONObject4.put("authenticatorAttachment", str9);
                            }
                            String str10 = lw8Var.b;
                            if (str10 != null && b60Var2 == null) {
                                jSONObject4.put(TeXSymbolParser.TYPE_ATTR, str10);
                            }
                            String str11 = lw8Var.a;
                            if (str11 != null) {
                                jSONObject4.put("id", str11);
                            }
                            String str12 = "response";
                            if (z50Var != 0) {
                                jSONObject2 = z50Var.b();
                            } else if (a60Var != 0) {
                                jSONObject2 = a60Var.b();
                            } else {
                                if (b60Var2 != null) {
                                    try {
                                        jSONObject2 = new JSONObject();
                                        jSONObject2.put("code", (int) b60Var2.a.a);
                                        String str13 = b60Var2.b;
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
                                x50Var = lw8Var.h;
                                if (x50Var == null) {
                                    jSONObject4.put("clientExtensionResults", x50Var.b());
                                } else if (z) {
                                    jSONObject4.put("clientExtensionResults", new JSONObject());
                                }
                                jSONObject = jSONObject4.toString();
                                jSONObject.getClass();
                            }
                            z = true;
                            if (jSONObject2 != null) {
                            }
                            x50Var = lw8Var.h;
                            if (x50Var == null) {
                            }
                            jSONObject = jSONObject4.toString();
                            jSONObject.getClass();
                        } catch (JSONException e2) {
                            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
                        }
                    } catch (Throwable th) {
                        throw new uu4("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage(), (byte) 2);
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(b60Var.getClass().getName()));
                    jSONObject = jSONObject3.toString();
                    jSONObject.getClass();
                }
                Bundle bundle3 = new Bundle();
                bundle3.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", jSONObject);
                q53Var = new q53(jSONObject, bundle3, (byte) 3);
            } else {
                Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
                q53Var = null;
            }
        }
        if (q53Var != null) {
            return new yu4(q53Var);
        }
        throw new uu4("When attempting to convert get response, null credential found", (byte) 2);
    }

    public final a33 e() {
        a33 a33Var = this.f;
        if (a33Var != null) {
            return a33Var;
        }
        rr5.e("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.g;
        if (executor != null) {
            return executor;
        }
        rr5.e("executor");
        throw null;
    }

    public final void g(xu4 xu4Var, CancellationSignal cancellationSignal, Executor executor, a33 a33Var) {
        xu4Var.getClass();
        a33Var.getClass();
        executor.getClass();
        this.h = cancellationSignal;
        this.f = a33Var;
        this.g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (w33.a(cancellationSignal)) {
            return;
        }
        Context context = this.e;
        context.getClass();
        byte b = 0;
        gi0 gi0Var = new gi0(false);
        di0 di0Var = new di0(false, null, null, true, null, null, false);
        fi0 fi0Var = new fi0(false, null, null);
        ei0 ei0Var = new ei0(null, false);
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        long j = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        fi0 fi0Var2 = fi0Var;
        ei0 ei0Var2 = ei0Var;
        boolean z = false;
        for (c33 c33Var : xu4Var.a) {
            if ((c33Var instanceof cv4) && !z) {
                if (j >= 231815000) {
                    LinkedHashMap linkedHashMap = mw8.a;
                    ei0Var2 = new ei0(((cv4) c33Var).e, true);
                } else {
                    LinkedHashMap linkedHashMap2 = mw8.a;
                    JSONObject jSONObject = new JSONObject(((cv4) c33Var).e);
                    String optString = jSONObject.optString("rpId", "");
                    optString.getClass();
                    if (optString.length() == 0) {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                    fi0Var2 = new fi0(true, xte.a(jSONObject), optString);
                }
                z = true;
            }
        }
        boolean z2 = j > 241217000 ? xu4Var.b : false;
        s5d a = ume.a(context);
        new di0(false, null, null, true, null, null, false);
        hi0 hi0Var = new hi0(gi0Var, di0Var, a.l, false, 0, fi0Var2, ei0Var2, z2);
        bib b2 = cib.b();
        b2.c = new o94[]{new o94("auth_api_credentials_begin_sign_in", 8L)};
        b2.a = new cf9(a, hi0Var);
        b2.b = false;
        b2.d = (char) 1553;
        a.e(0, b2.a()).addOnSuccessListener(new wm2(new f33(cancellationSignal, this, b), (byte) 9)).addOnFailureListener(new x92((Object) this, (Object) cancellationSignal, (byte) 12));
    }
}
