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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nw8 extends b4 {
    public static final Parcelable.Creator<nw8> CREATOR = new v6d((byte) 23);
    public final qw8 a;
    public final tw8 b;
    public final byte[] c;
    public final ArrayList d;
    public final Double e;
    public final ArrayList f;
    public final d60 h;
    public final Integer n;
    public final asb r;
    public final dz s;
    public final w50 w;
    public final String x;
    public final ResultReceiver y;

    public nw8(qw8 qw8Var, tw8 tw8Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, d60 d60Var, Integer num, asb asbVar, String str, w50 w50Var, String str2, ResultReceiver resultReceiver) {
        this.y = resultReceiver;
        if (str2 != null) {
            try {
                nw8 b = b(new JSONObject(str2));
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
        ite.h(qw8Var);
        this.a = qw8Var;
        ite.h(tw8Var);
        this.b = tw8Var;
        ite.h(bArr);
        this.c = bArr;
        ite.h(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f = arrayList2;
        this.h = d60Var;
        this.n = num;
        this.r = asbVar;
        if (str != null) {
            try {
                this.s = dz.a(str);
            } catch (cz e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            this.s = null;
        }
        this.w = w50Var;
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
    public static nw8 b(JSONObject jSONObject) {
        ArrayList arrayList;
        d60 d60Var;
        w50 w50Var;
        dz dzVar;
        int i;
        y9d y9dVar;
        y9d b;
        zef zefVar;
        ihf ihfVar;
        JSONArray jSONArray;
        String str;
        ArrayList arrayList2;
        JSONArray jSONArray2;
        String str2;
        sfd sfdVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        String str3 = "id";
        qw8 qw8Var = new qw8(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        tw8 tw8Var = new tw8(jSONObject3.getString("name"), xpd.a(jSONObject3.getString("id")), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"));
        byte[] a = xpd.a(jSONObject.getString("challenge"));
        ite.h(a);
        JSONArray jSONArray3 = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
            JSONObject jSONObject4 = jSONArray3.getJSONObject(i2);
            try {
                sfdVar = new agd(new pw8(jSONObject4.getString(TeXSymbolParser.TYPE_ATTR), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                sfdVar = zcd.a;
            }
            if (sfdVar.b()) {
                arrayList3.add(sfdVar.a());
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
                Parcelable.Creator<ow8> creator = ow8.CREATOR;
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
                            } catch (c3c unused2) {
                                Log.w("Transport", "Ignoring unrecognized transport ".concat(string2));
                            }
                        }
                        i5++;
                        str3 = str2;
                    }
                    str = str3;
                    arrayList2 = new ArrayList(hashSet);
                }
                arrayList4.add(new ow8(string, decode, arrayList2));
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
            d60Var = new d60(jSONObject6.has("authenticatorAttachment") ? jSONObject6.optString("authenticatorAttachment") : null, jSONObject6.has("requireResidentKey") ? Boolean.valueOf(jSONObject6.optBoolean("requireResidentKey")) : null, jSONObject6.has("userVerification") ? jSONObject6.optString("userVerification") : null, jSONObject6.has("residentKey") ? jSONObject6.optString("residentKey") : null);
        } else {
            d60Var = null;
        }
        if (jSONObject.has("extensions")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
            va4 va4Var = jSONObject7.has("fidoAppIdExtension") ? new va4(jSONObject7.getJSONObject("fidoAppIdExtension").getString("appid")) : null;
            if (jSONObject7.has("appid")) {
                va4Var = new va4(jSONObject7.getString("appid"));
            }
            va4 va4Var2 = va4Var;
            if (!jSONObject7.has("prf")) {
                i = 0;
                if (jSONObject7.has("prfAlreadyHashed")) {
                    b = y9d.b(jSONObject7.getJSONObject("prfAlreadyHashed"), true);
                } else {
                    y9dVar = null;
                    if (jSONObject7.has("cableAuthenticationExtension")) {
                        zefVar = null;
                    } else {
                        JSONArray jSONArray5 = jSONObject7.getJSONArray("cableAuthenticationExtension");
                        ArrayList arrayList5 = new ArrayList();
                        while (i < jSONArray5.length()) {
                            JSONObject jSONObject8 = jSONArray5.getJSONObject(i);
                            arrayList5.add(new nbf(jSONObject8.getLong("version"), Base64.decode(jSONObject8.getString("clientEid"), 11), Base64.decode(jSONObject8.getString("authenticatorEid"), 11), Base64.decode(jSONObject8.getString("sessionPreKey"), 11)));
                            i++;
                        }
                        zefVar = new zef(arrayList5);
                    }
                    u9c u9cVar = !jSONObject7.has("userVerificationMethodExtension") ? new u9c(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")) : null;
                    xjf xjfVar = !jSONObject7.has("google_multiAssertionExtension") ? new xjf(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")) : null;
                    p7d p7dVar = !jSONObject7.has("google_sessionIdExtension") ? new p7d(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId")) : null;
                    b8d b8dVar = !jSONObject7.has("google_silentVerificationExtension") ? new b8d(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")) : null;
                    if (jSONObject7.has("devicePublicKeyExtension")) {
                        ihfVar = null;
                    } else {
                        jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                        ihfVar = new ihf();
                    }
                    w50Var = new w50(va4Var2, zefVar, u9cVar, xjfVar, p7dVar, b8dVar, ihfVar, !jSONObject7.has("google_tunnelServerIdExtension") ? new u8d(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject7.has("google_thirdPartyPaymentExtension") ? new c15(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, y9dVar, !jSONObject7.has("txAuthSimple") ? new jcd(jSONObject7.getString("txAuthSimple")) : null, null);
                }
            } else {
                if (jSONObject7.has("prfAlreadyHashed")) {
                    throw new JSONException("both prf and prfAlreadyHashed extensions found");
                }
                i = 0;
                b = y9d.b(jSONObject7.getJSONObject("prf"), false);
            }
            y9dVar = b;
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
            w50Var = new w50(va4Var2, zefVar, u9cVar, xjfVar, p7dVar, b8dVar, ihfVar, !jSONObject7.has("google_tunnelServerIdExtension") ? new u8d(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject7.has("google_thirdPartyPaymentExtension") ? new c15(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, y9dVar, !jSONObject7.has("txAuthSimple") ? new jcd(jSONObject7.getString("txAuthSimple")) : null, null);
        } else {
            w50Var = null;
        }
        if (jSONObject.has("attestation")) {
            try {
                dzVar = dz.a(jSONObject.getString("attestation"));
            } catch (cz e) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e);
                dzVar = dz.b;
            }
        } else {
            dzVar = null;
        }
        return new nw8(qw8Var, tw8Var, a, arrayList3, valueOf, arrayList, d60Var, null, null, dzVar == null ? null : dzVar.a, w50Var, null, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nw8)) {
            return false;
        }
        nw8 nw8Var = (nw8) obj;
        ArrayList arrayList = nw8Var.f;
        ArrayList arrayList2 = nw8Var.d;
        if (!fse.a(this.a, nw8Var.a) || !fse.a(this.b, nw8Var.b) || !Arrays.equals(this.c, nw8Var.c) || !fse.a(this.e, nw8Var.e)) {
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
        return fse.a(this.h, nw8Var.h) && fse.a(this.n, nw8Var.n) && fse.a(this.r, nw8Var.r) && fse.a(this.s, nw8Var.s) && fse.a(this.w, nw8Var.w) && fse.a(this.x, nw8Var.x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, this.x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String b = xpd.b(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.r);
        String valueOf7 = String.valueOf(this.s);
        String valueOf8 = String.valueOf(this.w);
        StringBuilder m = mlb.m("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        kt6.v(m, b, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        m.append(this.e);
        m.append(", \n excludeList=");
        m.append(valueOf4);
        m.append(", \n authenticatorSelection=");
        m.append(valueOf5);
        m.append(", \n requestId=");
        m.append(this.n);
        m.append(", \n tokenBinding=");
        m.append(valueOf6);
        m.append(", \n attestationConveyancePreference=");
        m.append(valueOf7);
        m.append(", \n authenticationExtensions=");
        m.append(valueOf8);
        m.append("}");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 2, this.a, i);
        mve.k(parcel, 3, this.b, i);
        mve.c(parcel, 4, this.c);
        mve.p(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            mve.q(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        mve.p(parcel, 7, this.f);
        mve.k(parcel, 8, this.h, i);
        mve.i(parcel, 9, this.n);
        mve.k(parcel, 10, this.r, i);
        dz dzVar = this.s;
        mve.l(parcel, 11, dzVar == null ? null : dzVar.a);
        mve.k(parcel, 12, this.w, i);
        mve.l(parcel, 13, this.x);
        mve.k(parcel, 14, this.y, i);
        mve.s(parcel, r);
    }

    public nw8(String str) {
        try {
            nw8 b = b(new JSONObject(str));
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
