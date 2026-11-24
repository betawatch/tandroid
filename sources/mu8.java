// default package

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class mu8 extends b4 {
    public static final Parcelable.Creator<mu8> CREATOR = new t4d((byte) 23);
    public final pu8 a;
    public final su8 b;
    public final byte[] c;
    public final ArrayList d;
    public final Double e;
    public final ArrayList f;
    public final d50 h;
    public final Integer n;
    public final zpb r;
    public final dy s;
    public final w40 w;
    public final String x;
    public final ResultReceiver y;

    public mu8(pu8 pu8Var, su8 su8Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, d50 d50Var, Integer num, zpb zpbVar, String str, w40 w40Var, String str2, ResultReceiver resultReceiver) {
        this.y = resultReceiver;
        if (str2 != null) {
            try {
                mu8 b = b(new JSONObject(str2));
                this.a = b.a;
                this.b = b.b;
                this.c = b.c;
                this.d = b.d;
                this.e = b.e;
                this.f = b.f;
                this.h = b.h;
                this.n = b.n;
                this.r = b.r;
                this.s = b.s;
                this.w = b.w;
                this.x = str2;
                return;
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
        fre.h(pu8Var);
        this.a = pu8Var;
        fre.h(su8Var);
        this.b = su8Var;
        fre.h(bArr);
        this.c = bArr;
        fre.h(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f = arrayList2;
        this.h = d50Var;
        this.n = num;
        this.r = zpbVar;
        if (str != null) {
            try {
                this.s = dy.a(str);
            } catch (cy e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            this.s = null;
        }
        this.w = w40Var;
        this.x = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static mu8 b(JSONObject jSONObject) {
        ArrayList arrayList;
        d50 d50Var;
        w40 w40Var;
        dy dyVar;
        int i;
        w7d w7dVar;
        w7d b;
        ycf ycfVar;
        hff hffVar;
        JSONArray jSONArray;
        String str;
        ArrayList arrayList2;
        JSONArray jSONArray2;
        String str2;
        qdd qddVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        String str3 = "id";
        pu8 pu8Var = new pu8(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        su8 su8Var = new su8(jSONObject3.getString("name"), und.a(jSONObject3.getString("id")), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"));
        byte[] a = und.a(jSONObject.getString("challenge"));
        fre.h(a);
        JSONArray jSONArray3 = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
            JSONObject jSONObject4 = jSONArray3.getJSONObject(i2);
            try {
                qddVar = new zdd(new ou8(jSONObject4.getString(TeXSymbolParser.TYPE_ATTR), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                qddVar = xad.a;
            }
            if (qddVar.b()) {
                arrayList3.add(qddVar.a());
            }
        }
        Double valueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d) : null;
        int i3 = 11;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList4 = new ArrayList();
            int i4 = 0;
            while (i4 < jSONArray4.length()) {
                JSONObject jSONObject5 = jSONArray4.getJSONObject(i4);
                Parcelable.Creator<nu8> creator = nu8.CREATOR;
                String string = jSONObject5.getString(TeXSymbolParser.TYPE_ATTR);
                byte[] decode = Base64.decode(jSONObject5.getString(str3), i3);
                if (!jSONObject5.has("transports") || (jSONArray2 = jSONObject5.getJSONArray("transports")) == null) {
                    jSONArray = jSONArray4;
                    str = str3;
                    arrayList2 = null;
                } else {
                    HashSet hashSet = new HashSet(jSONArray2.length());
                    jSONArray = jSONArray4;
                    int i5 = 0;
                    while (i5 < jSONArray2.length()) {
                        String string2 = jSONArray2.getString(i5);
                        if (string2 == null || string2.isEmpty()) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                hashSet.add(Transport.a(string2));
                            } catch (c1c unused2) {
                                Log.w("Transport", "Ignoring unrecognized transport ".concat(string2));
                            }
                        }
                        i5++;
                        str3 = str2;
                    }
                    str = str3;
                    arrayList2 = new ArrayList(hashSet);
                }
                arrayList4.add(new nu8(string, decode, arrayList2));
                i4++;
                jSONArray4 = jSONArray;
                str3 = str;
                i3 = 11;
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
            d50Var = new d50(jSONObject6.has("authenticatorAttachment") ? jSONObject6.optString("authenticatorAttachment") : null, jSONObject6.has("requireResidentKey") ? Boolean.valueOf(jSONObject6.optBoolean("requireResidentKey")) : null, jSONObject6.has("userVerification") ? jSONObject6.optString("userVerification") : null, jSONObject6.has("residentKey") ? jSONObject6.optString("residentKey") : null);
        } else {
            d50Var = null;
        }
        if (jSONObject.has("extensions")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
            v84 v84Var = jSONObject7.has("fidoAppIdExtension") ? new v84(jSONObject7.getJSONObject("fidoAppIdExtension").getString("appid")) : null;
            if (jSONObject7.has("appid")) {
                v84Var = new v84(jSONObject7.getString("appid"));
            }
            v84 v84Var2 = v84Var;
            if (!jSONObject7.has("prf")) {
                i = 0;
                if (jSONObject7.has("prfAlreadyHashed")) {
                    b = w7d.b(jSONObject7.getJSONObject("prfAlreadyHashed"), true);
                } else {
                    w7dVar = null;
                    if (jSONObject7.has("cableAuthenticationExtension")) {
                        ycfVar = null;
                    } else {
                        JSONArray jSONArray5 = jSONObject7.getJSONArray("cableAuthenticationExtension");
                        ArrayList arrayList5 = new ArrayList();
                        while (i < jSONArray5.length()) {
                            JSONObject jSONObject8 = jSONArray5.getJSONObject(i);
                            arrayList5.add(new l9f(jSONObject8.getLong("version"), Base64.decode(jSONObject8.getString("clientEid"), 11), Base64.decode(jSONObject8.getString("authenticatorEid"), 11), Base64.decode(jSONObject8.getString("sessionPreKey"), 11)));
                            i++;
                        }
                        ycfVar = new ycf(arrayList5);
                    }
                    t7c t7cVar = !jSONObject7.has("userVerificationMethodExtension") ? new t7c(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")) : null;
                    whf whfVar = !jSONObject7.has("google_multiAssertionExtension") ? new whf(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")) : null;
                    n5d n5dVar = !jSONObject7.has("google_sessionIdExtension") ? new n5d(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId")) : null;
                    z5d z5dVar = !jSONObject7.has("google_silentVerificationExtension") ? new z5d(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")) : null;
                    if (jSONObject7.has("devicePublicKeyExtension")) {
                        hffVar = null;
                    } else {
                        jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                        hffVar = new hff();
                    }
                    w40Var = new w40(v84Var2, ycfVar, t7cVar, whfVar, n5dVar, z5dVar, hffVar, !jSONObject7.has("google_tunnelServerIdExtension") ? new s6d(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject7.has("google_thirdPartyPaymentExtension") ? new dz4(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, w7dVar, !jSONObject7.has("txAuthSimple") ? new had(jSONObject7.getString("txAuthSimple")) : null, null);
                }
            } else {
                if (jSONObject7.has("prfAlreadyHashed")) {
                    throw new JSONException("both prf and prfAlreadyHashed extensions found");
                }
                i = 0;
                b = w7d.b(jSONObject7.getJSONObject("prf"), false);
            }
            w7dVar = b;
            if (jSONObject7.has("cableAuthenticationExtension")) {
            }
            if (!jSONObject7.has("userVerificationMethodExtension")) {
            }
            if (!jSONObject7.has("google_multiAssertionExtension")) {
            }
            if (!jSONObject7.has("google_sessionIdExtension")) {
            }
            if (!jSONObject7.has("google_silentVerificationExtension")) {
            }
            if (jSONObject7.has("devicePublicKeyExtension")) {
            }
            w40Var = new w40(v84Var2, ycfVar, t7cVar, whfVar, n5dVar, z5dVar, hffVar, !jSONObject7.has("google_tunnelServerIdExtension") ? new s6d(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject7.has("google_thirdPartyPaymentExtension") ? new dz4(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, w7dVar, !jSONObject7.has("txAuthSimple") ? new had(jSONObject7.getString("txAuthSimple")) : null, null);
        } else {
            w40Var = null;
        }
        if (jSONObject.has("attestation")) {
            try {
                dyVar = dy.a(jSONObject.getString("attestation"));
            } catch (cy e) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e);
                dyVar = dy.b;
            }
        } else {
            dyVar = null;
        }
        return new mu8(pu8Var, su8Var, a, arrayList3, valueOf, arrayList, d50Var, null, null, dyVar == null ? null : dyVar.a, w40Var, null, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mu8)) {
            return false;
        }
        mu8 mu8Var = (mu8) obj;
        ArrayList arrayList = mu8Var.f;
        ArrayList arrayList2 = mu8Var.d;
        if (!cqe.a(this.a, mu8Var.a) || !cqe.a(this.b, mu8Var.b) || !Arrays.equals(this.c, mu8Var.c) || !cqe.a(this.e, mu8Var.e)) {
            return false;
        }
        ArrayList arrayList3 = this.d;
        if (!arrayList3.containsAll(arrayList2) || !arrayList2.containsAll(arrayList3)) {
            return false;
        }
        ArrayList arrayList4 = this.f;
        if (arrayList4 == null) {
            if (arrayList != null) {
                return false;
            }
        } else if (arrayList == null || !arrayList4.containsAll(arrayList) || !arrayList.containsAll(arrayList4)) {
            return false;
        }
        return cqe.a(this.h, mu8Var.h) && cqe.a(this.n, mu8Var.n) && cqe.a(this.r, mu8Var.r) && cqe.a(this.s, mu8Var.s) && cqe.a(this.w, mu8Var.w) && cqe.a(this.x, mu8Var.x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, this.x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String b = und.b(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.r);
        String valueOf7 = String.valueOf(this.s);
        String valueOf8 = String.valueOf(this.w);
        StringBuilder l = yjb.l("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        ls6.u(l, b, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        l.append(this.e);
        l.append(", \n excludeList=");
        l.append(valueOf4);
        l.append(", \n authenticatorSelection=");
        l.append(valueOf5);
        l.append(", \n requestId=");
        l.append(this.n);
        l.append(", \n tokenBinding=");
        l.append(valueOf6);
        l.append(", \n attestationConveyancePreference=");
        l.append(valueOf7);
        l.append(", \n authenticationExtensions=");
        l.append(valueOf8);
        l.append("}");
        return l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 2, this.a, i);
        jte.k(parcel, 3, this.b, i);
        jte.c(parcel, 4, this.c);
        jte.p(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            jte.q(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        jte.p(parcel, 7, this.f);
        jte.k(parcel, 8, this.h, i);
        jte.i(parcel, 9, this.n);
        jte.k(parcel, 10, this.r, i);
        dy dyVar = this.s;
        jte.l(parcel, 11, dyVar == null ? null : dyVar.a);
        jte.k(parcel, 12, this.w, i);
        jte.l(parcel, 13, this.x);
        jte.k(parcel, 14, this.y, i);
        jte.s(parcel, r);
    }

    public mu8(String str) {
        try {
            mu8 b = b(new JSONObject(str));
            this.a = b.a;
            this.b = b.b;
            this.c = b.c;
            this.d = b.d;
            this.e = b.e;
            this.f = b.f;
            this.h = b.h;
            this.n = b.n;
            this.r = b.r;
            this.s = b.s;
            this.w = b.w;
            this.x = str;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
