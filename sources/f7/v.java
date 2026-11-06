package f7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import c8.xb;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class v extends r6.a {
    public static final Parcelable.Creator<v> CREATOR = new db.k(13);
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
    public final f w;
    public final String x;
    public final ResultReceiver y;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.y = resultReceiver;
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
                this.w = b10.w;
                this.x = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        q6.m.g(yVar);
        this.a = yVar;
        q6.m.g(b0Var);
        this.b = b0Var;
        q6.m.g(bArr);
        this.c = bArr;
        q6.m.g(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f = arrayList2;
        this.h = mVar;
        this.n = num;
        this.r = h0Var;
        if (str != null) {
            try {
                this.s = e.a(str);
            } catch (d e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.s = null;
        }
        this.w = fVar;
        this.x = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static v b(JSONObject jSONObject) {
        ArrayList arrayList;
        m mVar;
        f fVar;
        e eVar;
        int i7;
        q0 q0Var;
        q0 b10;
        x0 x0Var;
        y0 y0Var;
        JSONArray jSONArray;
        String str;
        ArrayList arrayList2;
        JSONArray jSONArray2;
        String str2;
        q7.d dVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        String str3 = "id";
        y yVar = new y(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        b0 b0Var = new b0(jSONObject3.getString("name"), x6.b.b(jSONObject3.getString("id")), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"));
        byte[] b11 = x6.b.b(jSONObject.getString("challenge"));
        q6.m.g(b11);
        JSONArray jSONArray3 = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < jSONArray3.length(); i10++) {
            JSONObject jSONObject4 = jSONArray3.getJSONObject(i10);
            try {
                dVar = new q7.e(new x(jSONObject4.getString(TeXSymbolParser.TYPE_ATTR), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                dVar = q7.b.a;
            }
            if (dVar.b()) {
                arrayList3.add(dVar.a());
            }
        }
        Double valueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d) : null;
        int i11 = 11;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList4 = new ArrayList();
            int i12 = 0;
            while (i12 < jSONArray4.length()) {
                JSONObject jSONObject5 = jSONArray4.getJSONObject(i12);
                Parcelable.Creator<w> creator = w.CREATOR;
                String string = jSONObject5.getString(TeXSymbolParser.TYPE_ATTR);
                byte[] decode = Base64.decode(jSONObject5.getString(str3), i11);
                if (!jSONObject5.has("transports") || (jSONArray2 = jSONObject5.getJSONArray("transports")) == null) {
                    jSONArray = jSONArray4;
                    str = str3;
                    arrayList2 = null;
                } else {
                    HashSet hashSet = new HashSet(jSONArray2.length());
                    jSONArray = jSONArray4;
                    int i13 = 0;
                    while (i13 < jSONArray2.length()) {
                        String string2 = jSONArray2.getString(i13);
                        if (string2 == null || string2.isEmpty()) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                hashSet.add(Transport.a(string2));
                            } catch (d7.a unused2) {
                                Log.w("Transport", "Ignoring unrecognized transport ".concat(string2));
                            }
                        }
                        i13++;
                        str3 = str2;
                    }
                    str = str3;
                    arrayList2 = new ArrayList(hashSet);
                }
                arrayList4.add(new w(string, decode, arrayList2));
                i12++;
                jSONArray4 = jSONArray;
                str3 = str;
                i11 = 11;
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
                i7 = 0;
                if (jSONObject7.has("prfAlreadyHashed")) {
                    b10 = q0.b(jSONObject7.getJSONObject("prfAlreadyHashed"), true);
                } else {
                    q0Var = null;
                    if (jSONObject7.has("cableAuthenticationExtension")) {
                        x0Var = null;
                    } else {
                        JSONArray jSONArray5 = jSONObject7.getJSONArray("cableAuthenticationExtension");
                        ArrayList arrayList5 = new ArrayList();
                        while (i7 < jSONArray5.length()) {
                            JSONObject jSONObject8 = jSONArray5.getJSONObject(i7);
                            arrayList5.add(new w0(jSONObject8.getLong("version"), Base64.decode(jSONObject8.getString("clientEid"), 11), Base64.decode(jSONObject8.getString("authenticatorEid"), 11), Base64.decode(jSONObject8.getString("sessionPreKey"), 11)));
                            i7++;
                        }
                        x0Var = new x0(arrayList5);
                    }
                    i0 i0Var = !jSONObject7.has("userVerificationMethodExtension") ? new i0(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")) : null;
                    z0 z0Var = !jSONObject7.has("google_multiAssertionExtension") ? new z0(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")) : null;
                    m0 m0Var = !jSONObject7.has("google_sessionIdExtension") ? new m0(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId")) : null;
                    n0 n0Var = !jSONObject7.has("google_silentVerificationExtension") ? new n0(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")) : null;
                    if (jSONObject7.has("devicePublicKeyExtension")) {
                        y0Var = null;
                    } else {
                        jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                        y0Var = new y0();
                    }
                    fVar = new f(sVar2, x0Var, i0Var, z0Var, m0Var, n0Var, y0Var, !jSONObject7.has("google_tunnelServerIdExtension") ? new o0(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject7.has("google_thirdPartyPaymentExtension") ? new t(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, q0Var, !jSONObject7.has("txAuthSimple") ? new r0(jSONObject7.getString("txAuthSimple")) : null, null);
                }
            } else {
                if (jSONObject7.has("prfAlreadyHashed")) {
                    throw new JSONException("both prf and prfAlreadyHashed extensions found");
                }
                i7 = 0;
                b10 = q0.b(jSONObject7.getJSONObject("prf"), false);
            }
            q0Var = b10;
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
            fVar = new f(sVar2, x0Var, i0Var, z0Var, m0Var, n0Var, y0Var, !jSONObject7.has("google_tunnelServerIdExtension") ? new o0(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject7.has("google_thirdPartyPaymentExtension") ? new t(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, q0Var, !jSONObject7.has("txAuthSimple") ? new r0(jSONObject7.getString("txAuthSimple")) : null, null);
        } else {
            fVar = null;
        }
        if (jSONObject.has("attestation")) {
            try {
                eVar = e.a(jSONObject.getString("attestation"));
            } catch (d e10) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e10);
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
        if (q6.m.k(this.a, vVar.a) && q6.m.k(this.b, vVar.b) && Arrays.equals(this.c, vVar.c) && q6.m.k(this.e, vVar.e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && q6.m.k(this.h, vVar.h) && q6.m.k(this.n, vVar.n) && q6.m.k(this.r, vVar.r) && q6.m.k(this.s, vVar.s) && q6.m.k(this.w, vVar.w) && q6.m.k(this.x, vVar.x))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, this.x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String c10 = x6.b.c(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.r);
        String valueOf7 = String.valueOf(this.s);
        String valueOf8 = String.valueOf(this.w);
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        com.google.android.recaptcha.internal.a.s(n10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        n10.append(this.e);
        n10.append(", \n excludeList=");
        n10.append(valueOf4);
        n10.append(", \n authenticatorSelection=");
        n10.append(valueOf5);
        n10.append(", \n requestId=");
        n10.append(this.n);
        n10.append(", \n tokenBinding=");
        n10.append(valueOf6);
        n10.append(", \n attestationConveyancePreference=");
        n10.append(valueOf7);
        n10.append(", \n authenticationExtensions=");
        n10.append(valueOf8);
        n10.append("}");
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.a, i7);
        xb.k(parcel, 3, this.b, i7);
        xb.c(parcel, 4, this.c);
        xb.p(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            xb.q(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        xb.p(parcel, 7, this.f);
        xb.k(parcel, 8, this.h, i7);
        xb.i(parcel, 9, this.n);
        xb.k(parcel, 10, this.r, i7);
        e eVar = this.s;
        xb.l(parcel, 11, eVar == null ? null : eVar.a);
        xb.k(parcel, 12, this.w, i7);
        xb.l(parcel, 13, this.x);
        xb.k(parcel, 14, this.y, i7);
        xb.s(parcel, r10);
    }

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
            this.w = b10.w;
            this.x = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
