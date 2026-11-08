package f7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import c8.xb;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class q0 extends r6.a {
    public static final Parcelable.Creator<q0> CREATOR = new db.k(12);
    public static final byte[] b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] a;

    public q0(byte[][] bArr) {
        q6.m.b(bArr != null);
        q6.m.b(1 == ((bArr.length & 1) ^ 1));
        int i7 = 0;
        while (i7 < bArr.length) {
            q6.m.b(i7 == 0 || bArr[i7] != null);
            int i10 = i7 + 1;
            q6.m.b(bArr[i10] != null);
            int length = bArr[i10].length;
            q6.m.b(length == 32 || length == 64);
            i7 += 2;
        }
        this.a = bArr;
    }

    public static q0 b(JSONObject jSONObject, boolean z9) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z9) {
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
                    arrayList.add(x6.b.b(next));
                    if (z9) {
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
        bg.w0 w0Var;
        q7.e0 e0Var;
        int i7 = q7.h0.a;
        q7.i0 i0Var = q7.g0.a;
        int i10 = i0Var.f;
        MessageDigest messageDigest = i0Var.e;
        try {
            if (i0Var.h) {
                try {
                    w0Var = new bg.w0((MessageDigest) messageDigest.clone(), i10);
                } catch (CloneNotSupportedException unused) {
                }
                MessageDigest messageDigest2 = (MessageDigest) w0Var.c;
                byte[] bArr2 = b;
                bArr2.getClass();
                int length = bArr2.length;
                if (!w0Var.a) {
                    throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
                }
                messageDigest2.update(bArr2, 0, length);
                bArr.getClass();
                int length2 = bArr.length;
                if (w0Var.a) {
                    throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
                }
                messageDigest2.update(bArr, 0, length2);
                if (w0Var.a) {
                    throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
                }
                w0Var.a = true;
                int i11 = w0Var.b;
                if (i11 == messageDigest2.getDigestLength()) {
                    byte[] digest = messageDigest2.digest();
                    char[] cArr = q7.f0.a;
                    e0Var = new q7.e0(digest);
                } else {
                    byte[] copyOf = Arrays.copyOf(messageDigest2.digest(), i11);
                    char[] cArr2 = q7.f0.a;
                    e0Var = new q7.e0(copyOf);
                }
                return (byte[]) e0Var.b.clone();
            }
            w0Var = new bg.w0(MessageDigest.getInstance(messageDigest.getAlgorithm()), i10);
            MessageDigest messageDigest22 = (MessageDigest) w0Var.c;
            byte[] bArr22 = b;
            bArr22.getClass();
            int length3 = bArr22.length;
            if (!w0Var.a) {
            }
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public static byte[] e(JSONObject jSONObject) {
        byte[] b10 = x6.b.b(jSONObject.getString("first"));
        if (b10.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return b10;
        }
        byte[] b11 = x6.b.b(jSONObject.getString("second"));
        if (b11.length == 32) {
            return q7.a.j(b10, b11);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] f(JSONObject jSONObject) {
        byte[] d = d(x6.b.b(jSONObject.getString("first")));
        return !jSONObject.has("second") ? d : q7.a.j(d, d(x6.b.b(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q0) {
            return Arrays.deepEquals(this.a, ((q0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i7 = 0;
        for (byte[] bArr : this.a) {
            if (bArr != null) {
                i7 ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return i7;
    }

    public final String toString() {
        byte[][] bArr = this.a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i7 = 0; i7 < bArr.length; i7 += 2) {
                if (bArr[i7] == null) {
                    jSONObject.put("eval", c(bArr[i7 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(x6.b.c(bArr[i7]), c(bArr[i7 + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e10) {
            return a8.p0.p("PrfExtension{Exception:", e10.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.d(parcel, 1, this.a);
        xb.s(parcel, r10);
    }
}
