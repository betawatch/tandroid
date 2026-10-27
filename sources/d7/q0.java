package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class q0 extends p6.a {
    public static final Parcelable.Creator<q0> CREATOR = new w.a(24);
    public static final byte[] b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] a;

    public q0(byte[][] bArr) {
        o6.l.b(bArr != null);
        o6.l.b(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            o6.l.b(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            o6.l.b(bArr[i11] != null);
            int length = bArr[i11].length;
            o6.l.b(length == 32 || length == 64);
            i10 += 2;
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
                    arrayList.add(v6.b.b(next));
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
        d5.f fVar;
        o7.e0 e0Var;
        int i10 = o7.h0.a;
        o7.i0 i0Var = o7.g0.a;
        int i11 = i0Var.f;
        MessageDigest messageDigest = i0Var.e;
        try {
            if (i0Var.h) {
                try {
                    fVar = new d5.f((MessageDigest) messageDigest.clone(), i11);
                } catch (CloneNotSupportedException unused) {
                }
                MessageDigest messageDigest2 = (MessageDigest) fVar.c;
                byte[] bArr2 = b;
                bArr2.getClass();
                int length = bArr2.length;
                if (!fVar.b) {
                    throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
                }
                messageDigest2.update(bArr2, 0, length);
                bArr.getClass();
                int length2 = bArr.length;
                if (fVar.b) {
                    throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
                }
                messageDigest2.update(bArr, 0, length2);
                if (fVar.b) {
                    throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
                }
                fVar.b = true;
                int i12 = fVar.a;
                if (i12 == messageDigest2.getDigestLength()) {
                    byte[] digest = messageDigest2.digest();
                    char[] cArr = o7.f0.a;
                    e0Var = new o7.e0(digest);
                } else {
                    byte[] copyOf = Arrays.copyOf(messageDigest2.digest(), i12);
                    char[] cArr2 = o7.f0.a;
                    e0Var = new o7.e0(copyOf);
                }
                return (byte[]) e0Var.b.clone();
            }
            fVar = new d5.f(MessageDigest.getInstance(messageDigest.getAlgorithm()), i11);
            MessageDigest messageDigest22 = (MessageDigest) fVar.c;
            byte[] bArr22 = b;
            bArr22.getClass();
            int length3 = bArr22.length;
            if (!fVar.b) {
            }
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] e(JSONObject jSONObject) {
        byte[] b10 = v6.b.b(jSONObject.getString("first"));
        if (b10.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return b10;
        }
        byte[] b11 = v6.b.b(jSONObject.getString("second"));
        if (b11.length == 32) {
            return o7.a.j(b10, b11);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] f(JSONObject jSONObject) {
        byte[] d = d(v6.b.b(jSONObject.getString("first")));
        return !jSONObject.has("second") ? d : o7.a.j(d, d(v6.b.b(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q0) {
            return Arrays.deepEquals(this.a, ((q0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        for (byte[] bArr : this.a) {
            if (bArr != null) {
                i10 ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return i10;
    }

    public final String toString() {
        byte[][] bArr = this.a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                if (bArr[i10] == null) {
                    jSONObject.put("eval", c(bArr[i10 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(v6.b.c(bArr[i10]), c(bArr[i10 + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e) {
            return a1.g.p("PrfExtension{Exception:", e.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.d(parcel, 1, this.a);
        df.r(parcel, q5);
    }
}
