package m6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import g7.p8;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q0 extends y5.a {
    public static final Parcelable.Creator<q0> CREATOR = new h5.h(23);
    public static final byte[] b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] a;

    public q0(byte[][] bArr) {
        x5.l.b(bArr != null);
        x5.l.b(1 == ((bArr.length & 1) ^ 1));
        int i9 = 0;
        while (i9 < bArr.length) {
            x5.l.b(i9 == 0 || bArr[i9] != null);
            int i10 = i9 + 1;
            x5.l.b(bArr[i10] != null);
            int length = bArr[i10].length;
            x5.l.b(length == 32 || length == 64);
            i9 += 2;
        }
        this.a = bArr;
    }

    public static q0 b(JSONObject jSONObject, boolean z10) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z10) {
                    arrayList.add(e(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(f(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(e6.b.b(next));
                    if (z10) {
                        arrayList.add(e(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(f(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new q0((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject c(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] d(byte[] bArr) {
        m.a aVar;
        x6.e0 e0Var;
        int i9 = x6.h0.a;
        x6.i0 i0Var = x6.g0.a;
        int i10 = i0Var.f;
        MessageDigest messageDigest = i0Var.e;
        try {
            if (i0Var.h) {
                try {
                    aVar = new m.a((MessageDigest) messageDigest.clone(), i10);
                } catch (CloneNotSupportedException unused) {
                }
                MessageDigest messageDigest2 = (MessageDigest) aVar.c;
                byte[] bArr2 = b;
                bArr2.getClass();
                int length = bArr2.length;
                if (!aVar.a) {
                    throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
                }
                messageDigest2.update(bArr2, 0, length);
                bArr.getClass();
                int length2 = bArr.length;
                if (aVar.a) {
                    throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
                }
                messageDigest2.update(bArr, 0, length2);
                if (aVar.a) {
                    throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
                }
                aVar.a = true;
                int i11 = aVar.b;
                if (i11 == messageDigest2.getDigestLength()) {
                    byte[] digest = messageDigest2.digest();
                    char[] cArr = x6.f0.a;
                    e0Var = new x6.e0(digest);
                } else {
                    byte[] copyOf = Arrays.copyOf(messageDigest2.digest(), i11);
                    char[] cArr2 = x6.f0.a;
                    e0Var = new x6.e0(copyOf);
                }
                return (byte[]) e0Var.b.clone();
            }
            aVar = new m.a(MessageDigest.getInstance(messageDigest.getAlgorithm()), i10);
            MessageDigest messageDigest22 = (MessageDigest) aVar.c;
            byte[] bArr22 = b;
            bArr22.getClass();
            int length3 = bArr22.length;
            if (!aVar.a) {
            }
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public static byte[] e(JSONObject jSONObject) {
        byte[] b10 = e6.b.b(jSONObject.getString("first"));
        if (b10.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return b10;
        }
        byte[] b11 = e6.b.b(jSONObject.getString("second"));
        if (b11.length == 32) {
            return x6.a.j(b10, b11);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] f(JSONObject jSONObject) {
        byte[] d = d(e6.b.b(jSONObject.getString("first")));
        return !jSONObject.has("second") ? d : x6.a.j(d, d(e6.b.b(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q0) {
            return Arrays.deepEquals(this.a, ((q0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i9 = 0;
        for (byte[] bArr : this.a) {
            if (bArr != null) {
                i9 ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return i9;
    }

    public final String toString() {
        byte[][] bArr = this.a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i9 = 0; i9 < bArr.length; i9 += 2) {
                if (bArr[i9] == null) {
                    jSONObject.put("eval", c(bArr[i9 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(e6.b.c(bArr[i9]), c(bArr[i9 + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e10) {
            return aa.d.o("PrfExtension{Exception:", e10.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.d(parcel, 1, this.a);
        p8.r(parcel, q10);
    }
}
