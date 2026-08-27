package n6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.fido.common.Transport;
import h7.r8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v extends z5.a {
    public static final Parcelable.Creator<v> CREATOR = new o0(5);
    public final y a;
    public final b0 b;
    public final byte[] c;
    public final List d;
    public final Double e;
    public final List f;
    public final m h;
    public final Integer n;
    public final h0 r;
    public final e s;
    public final f v;
    public final String w;
    public final ResultReceiver x;

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.a = b10.a;
            this.b = b10.b;
            this.c = b10.c;
            this.d = b10.d;
            this.e = b10.e;
            this.f = b10.f;
            this.h = b10.h;
            this.n = b10.n;
            this.r = b10.r;
            this.s = b10.s;
            this.v = b10.v;
            this.w = str;
        } catch (JSONException e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static v b(JSONObject jSONObject) {
        ArrayList arrayList;
        m mVar;
        f fVar;
        e eVar;
        int i10;
        r0 r0Var;
        r0 b10;
        y0 y0Var;
        z0 z0Var;
        JSONArray jSONArray;
        String str;
        ArrayList arrayList2;
        JSONArray jSONArray2;
        String str2;
        y6.d dVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        String str3 = "id";
        y yVar = new y(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        b0 b0Var = new b0(jSONObject3.getString("name"), f6.b.b(jSONObject3.getString("id")), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"));
        byte[] b11 = f6.b.b(jSONObject.getString("challenge"));
        y5.l.h(b11);
        JSONArray jSONArray3 = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList3 = new ArrayList();
        for (int i11 = 0; i11 < jSONArray3.length(); i11++) {
            JSONObject jSONObject4 = jSONArray3.getJSONObject(i11);
            try {
                dVar = new y6.e(new x(jSONObject4.getString(TeXSymbolParser.TYPE_ATTR), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                dVar = y6.b.a;
            }
            if (dVar.b()) {
                arrayList3.add(dVar.a());
            }
        }
        Double valueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d) : null;
        int i12 = 11;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList4 = new ArrayList();
            int i13 = 0;
            while (i13 < jSONArray4.length()) {
                JSONObject jSONObject5 = jSONArray4.getJSONObject(i13);
                Parcelable.Creator<w> creator = w.CREATOR;
                String string = jSONObject5.getString(TeXSymbolParser.TYPE_ATTR);
                byte[] decode = Base64.decode(jSONObject5.getString(str3), i12);
                if (!jSONObject5.has("transports") || (jSONArray2 = jSONObject5.getJSONArray("transports")) == null) {
                    jSONArray = jSONArray4;
                    str = str3;
                    arrayList2 = null;
                } else {
                    HashSet hashSet = new HashSet(jSONArray2.length());
                    jSONArray = jSONArray4;
                    int i14 = 0;
                    while (i14 < jSONArray2.length()) {
                        String string2 = jSONArray2.getString(i14);
                        if (string2 == null || string2.isEmpty()) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                hashSet.add(Transport.a(string2));
                            } catch (l6.a unused2) {
                                Log.w("Transport", "Ignoring unrecognized transport ".concat(string2));
                            }
                        }
                        i14++;
                        str3 = str2;
                    }
                    str = str3;
                    arrayList2 = new ArrayList(hashSet);
                }
                arrayList4.add(new w(string, decode, arrayList2));
                i13++;
                jSONArray4 = jSONArray;
                str3 = str;
                i12 = 11;
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
            mVar = new m(jSONObject6.has("authenticatorAttachment") ? jSONObject6.optString("authenticatorAttachment") : null, jSONObject6.has("requireResidentKey") ? Boolean.valueOf(jSONObject6.optBoolean("requireResidentKey")) : null, jSONObject6.has("userVerification") ? jSONObject6.optString("userVerification") : null, jSONObject6.has("residentKey") ? jSONObject6.optString("residentKey") : null);
        } else {
            mVar = null;
        }
        if (jSONObject.has("extensions")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
            s sVar = jSONObject7.has("fidoAppIdExtension") ? new s(jSONObject7.getJSONObject("fidoAppIdExtension").getString("appid")) : null;
            if (jSONObject7.has("appid")) {
                sVar = new s(jSONObject7.getString("appid"));
            }
            s sVar2 = sVar;
            if (!jSONObject7.has("prf")) {
                i10 = 0;
                if (jSONObject7.has("prfAlreadyHashed")) {
                    b10 = r0.b(jSONObject7.getJSONObject("prfAlreadyHashed"), true);
                } else {
                    r0Var = null;
                    if (jSONObject7.has("cableAuthenticationExtension")) {
                        y0Var = null;
                    } else {
                        JSONArray jSONArray5 = jSONObject7.getJSONArray("cableAuthenticationExtension");
                        ArrayList arrayList5 = new ArrayList();
                        while (i10 < jSONArray5.length()) {
                            JSONObject jSONObject8 = jSONArray5.getJSONObject(i10);
                            arrayList5.add(new x0(jSONObject8.getLong("version"), Base64.decode(jSONObject8.getString("clientEid"), 11), Base64.decode(jSONObject8.getString("authenticatorEid"), 11), Base64.decode(jSONObject8.getString("sessionPreKey"), 11)));
                            i10++;
                        }
                        y0Var = new y0(arrayList5);
                    }
                    i0 i0Var = !jSONObject7.has("userVerificationMethodExtension") ? new i0(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")) : null;
                    a1 a1Var = !jSONObject7.has("google_multiAssertionExtension") ? new a1(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")) : null;
                    m0 m0Var = !jSONObject7.has("google_sessionIdExtension") ? new m0(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId")) : null;
                    n0 n0Var = !jSONObject7.has("google_silentVerificationExtension") ? new n0(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")) : null;
                    if (jSONObject7.has("devicePublicKeyExtension")) {
                        z0Var = null;
                    } else {
                        jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                        z0Var = new z0();
                    }
                    fVar = new f(sVar2, y0Var, i0Var, a1Var, m0Var, n0Var, z0Var, !jSONObject7.has("google_tunnelServerIdExtension") ? new p0(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject7.has("google_thirdPartyPaymentExtension") ? new t(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, r0Var, !jSONObject7.has("txAuthSimple") ? new s0(jSONObject7.getString("txAuthSimple")) : null, null);
                }
            } else {
                if (jSONObject7.has("prfAlreadyHashed")) {
                    throw new JSONException("both prf and prfAlreadyHashed extensions found");
                }
                i10 = 0;
                b10 = r0.b(jSONObject7.getJSONObject("prf"), false);
            }
            r0Var = b10;
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
            fVar = new f(sVar2, y0Var, i0Var, a1Var, m0Var, n0Var, z0Var, !jSONObject7.has("google_tunnelServerIdExtension") ? new p0(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject7.has("google_thirdPartyPaymentExtension") ? new t(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, r0Var, !jSONObject7.has("txAuthSimple") ? new s0(jSONObject7.getString("txAuthSimple")) : null, null);
        } else {
            fVar = null;
        }
        if (jSONObject.has("attestation")) {
            try {
                eVar = e.a(jSONObject.getString("attestation"));
            } catch (d e9) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e9);
                eVar = e.b;
            }
        } else {
            eVar = null;
        }
        return new v(yVar, b0Var, b11, arrayList3, valueOf, arrayList, mVar, null, null, eVar == null ? null : eVar.a, fVar, null, null);
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        List list2 = vVar.d;
        List list3 = vVar.f;
        if (y5.l.l(this.a, vVar.a) && y5.l.l(this.b, vVar.b) && Arrays.equals(this.c, vVar.c) && y5.l.l(this.e, vVar.e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && y5.l.l(this.h, vVar.h) && y5.l.l(this.n, vVar.n) && y5.l.l(this.r, vVar.r) && y5.l.l(this.s, vVar.s) && y5.l.l(this.v, vVar.v) && y5.l.l(this.w, vVar.w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.v, this.w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String c10 = f6.b.c(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.r);
        String valueOf7 = String.valueOf(this.s);
        String valueOf8 = String.valueOf(this.v);
        StringBuilder p6 = i0.a.p("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        i0.a.z(p6, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        p6.append(this.e);
        p6.append(", \n excludeList=");
        p6.append(valueOf4);
        p6.append(", \n authenticatorSelection=");
        p6.append(valueOf5);
        p6.append(", \n requestId=");
        p6.append(this.n);
        p6.append(", \n tokenBinding=");
        p6.append(valueOf6);
        p6.append(", \n attestationConveyancePreference=");
        p6.append(valueOf7);
        p6.append(", \n authenticationExtensions=");
        p6.append(valueOf8);
        p6.append("}");
        return p6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.a, i10);
        r8.k(parcel, 3, this.b, i10);
        r8.c(parcel, 4, this.c);
        r8.p(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            r8.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        r8.p(parcel, 7, this.f);
        r8.k(parcel, 8, this.h, i10);
        r8.i(parcel, 9, this.n);
        r8.k(parcel, 10, this.r, i10);
        e eVar = this.s;
        r8.l(parcel, 11, eVar == null ? null : eVar.a);
        r8.k(parcel, 12, this.v, i10);
        r8.l(parcel, 13, this.w);
        r8.k(parcel, 14, this.x, i10);
        r8.r(parcel, q6);
    }

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.x = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.a = b10.a;
                this.b = b10.b;
                this.c = b10.c;
                this.d = b10.d;
                this.e = b10.e;
                this.f = b10.f;
                this.h = b10.h;
                this.n = b10.n;
                this.r = b10.r;
                this.s = b10.s;
                this.v = b10.v;
                this.w = str2;
                return;
            } catch (JSONException e9) {
                throw new IllegalArgumentException(e9);
            }
        }
        y5.l.h(yVar);
        this.a = yVar;
        y5.l.h(b0Var);
        this.b = b0Var;
        y5.l.h(bArr);
        this.c = bArr;
        y5.l.h(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f = arrayList2;
        this.h = mVar;
        this.n = num;
        this.r = h0Var;
        if (str != null) {
            try {
                this.s = e.a(str);
            } catch (d e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.s = null;
        }
        this.v = fVar;
        this.w = null;
    }
}
