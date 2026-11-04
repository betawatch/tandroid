package e7;

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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q0 extends q6.a {
    public static final Parcelable.Creator<q0> CREATOR = new w.a(27);
    public static final byte[] b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] a;

    public q0(byte[][] bArr) {
        p6.m.b(bArr != null);
        p6.m.b(1 == ((bArr.length & 1) ^ 1));
        int i3 = 0;
        while (i3 < bArr.length) {
            p6.m.b(i3 == 0 || bArr[i3] != null);
            int i10 = i3 + 1;
            p6.m.b(bArr[i10] != null);
            int length = bArr[i10].length;
            p6.m.b(length == 32 || length == 64);
            i3 += 2;
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
                    arrayList.add(w6.b.b(next));
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
        cg.v0 v0Var;
        p7.f0 f0Var;
        int i3 = p7.i0.a;
        p7.j0 j0Var = p7.h0.a;
        int i10 = j0Var.f;
        MessageDigest messageDigest = j0Var.e;
        try {
            if (j0Var.h) {
                try {
                    v0Var = new cg.v0((MessageDigest) messageDigest.clone(), i10);
                } catch (CloneNotSupportedException unused) {
                }
                MessageDigest messageDigest2 = (MessageDigest) v0Var.c;
                byte[] bArr2 = b;
                bArr2.getClass();
                int length = bArr2.length;
                if (!v0Var.a) {
                    throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
                }
                messageDigest2.update(bArr2, 0, length);
                bArr.getClass();
                int length2 = bArr.length;
                if (v0Var.a) {
                    throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
                }
                messageDigest2.update(bArr, 0, length2);
                if (v0Var.a) {
                    throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
                }
                v0Var.a = true;
                int i11 = v0Var.b;
                if (i11 == messageDigest2.getDigestLength()) {
                    byte[] digest = messageDigest2.digest();
                    char[] cArr = p7.g0.a;
                    f0Var = new p7.f0(digest);
                } else {
                    byte[] copyOf = Arrays.copyOf(messageDigest2.digest(), i11);
                    char[] cArr2 = p7.g0.a;
                    f0Var = new p7.f0(copyOf);
                }
                return (byte[]) f0Var.b.clone();
            }
            v0Var = new cg.v0(MessageDigest.getInstance(messageDigest.getAlgorithm()), i10);
            MessageDigest messageDigest22 = (MessageDigest) v0Var.c;
            byte[] bArr22 = b;
            bArr22.getClass();
            int length3 = bArr22.length;
            if (!v0Var.a) {
            }
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public static byte[] e(JSONObject jSONObject) {
        byte[] b10 = w6.b.b(jSONObject.getString("first"));
        if (b10.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return b10;
        }
        byte[] b11 = w6.b.b(jSONObject.getString("second"));
        if (b11.length == 32) {
            return p7.a.j(b10, b11);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] f(JSONObject jSONObject) {
        byte[] d = d(w6.b.b(jSONObject.getString("first")));
        return !jSONObject.has("second") ? d : p7.a.j(d, d(w6.b.b(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q0) {
            return Arrays.deepEquals(this.a, ((q0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i3 = 0;
        for (byte[] bArr : this.a) {
            if (bArr != null) {
                i3 ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return i3;
    }

    public final String toString() {
        byte[][] bArr = this.a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i3 = 0; i3 < bArr.length; i3 += 2) {
                if (bArr[i3] == null) {
                    jSONObject.put("eval", c(bArr[i3 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(w6.b.c(bArr[i3]), c(bArr[i3 + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e10) {
            return a1.g.q("PrfExtension{Exception:", e10.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.e(parcel, 1, this.a);
        j8.a.t(parcel, s6);
    }
}
