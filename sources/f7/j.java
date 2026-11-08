package f7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import c8.xb;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.hy0;
import q7.a1;
import q7.b1;
import q7.c1;
import q7.e1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new t0(5);
    public final q7.s0 a;
    public final q7.s0 b;
    public final q7.s0 c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        q6.m.g(bArr);
        q7.s0 o4 = q7.s0.o(bArr.length, bArr);
        q6.m.g(bArr2);
        q7.s0 o10 = q7.s0.o(bArr2.length, bArr2);
        q6.m.g(bArr3);
        q7.s0 o11 = q7.s0.o(bArr3.length, bArr3);
        this.a = o4;
        this.b = o10;
        this.c = o11;
        q6.m.g(strArr);
        this.d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0223 A[Catch: JSONException -> 0x0021, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0021, blocks: (B:3:0x000a, B:5:0x0013, B:8:0x0028, B:9:0x0035, B:10:0x003c, B:12:0x003f, B:14:0x0049, B:16:0x0054, B:17:0x004f, B:20:0x0057, B:22:0x0060, B:24:0x006a, B:26:0x007b, B:27:0x0083, B:29:0x0091, B:31:0x00a3, B:33:0x00c1, B:35:0x00d0, B:36:0x00d9, B:40:0x00e6, B:41:0x00e9, B:42:0x00ef, B:47:0x0111, B:53:0x020f, B:55:0x0223, B:58:0x0134, B:60:0x0145, B:65:0x015f, B:68:0x017b, B:70:0x0190, B:72:0x0195, B:73:0x01b6, B:74:0x01bb, B:75:0x01bc, B:76:0x01c3, B:81:0x01d0, B:83:0x01dd, B:85:0x01ea, B:86:0x0203, B:87:0x0208, B:88:0x0209, B:89:0x020e, B:91:0x0230, B:92:0x0235, B:95:0x0236, B:96:0x023d, B:97:0x023e, B:98:0x0244, B:104:0x0246, B:105:0x0249, B:108:0x00d3, B:110:0x024d, B:111:0x0254, B:113:0x0257, B:114:0x025e, B:116:0x025f, B:117:0x0266, B:118:0x0269, B:119:0x0270, B:121:0x0271, B:122:0x0278, B:125:0x027c, B:126:0x0283), top: B:2:0x000a, inners: #3, #4, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject b() {
        byte[] bArr;
        String[] strArr = this.d;
        try {
            JSONObject jSONObject = new JSONObject();
            q7.s0 s0Var = this.b;
            if (s0Var != null) {
                jSONObject.put("clientDataJSON", x6.b.c(s0Var.p()));
            }
            q7.s0 s0Var2 = this.c;
            if (s0Var2 != null) {
                jSONObject.put("attestationObject", x6.b.c(s0Var2.p()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i7 = 0; i7 < strArr.length; i7++) {
                if (strArr[i7].equals("cable")) {
                    jSONArray.put(i7, "hybrid");
                } else {
                    jSONArray.put(i7, strArr[i7]);
                }
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    c1 c1Var = (c1) ((q7.z0) c1.d(s0Var2.p()).b(q7.z0.class)).b.get(new a1("authData"));
                    if (c1Var == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    q7.s0 s0Var3 = ((q7.w0) c1Var.b(q7.w0.class)).a;
                    byte[] bArr2 = s0Var3.b;
                    ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(bArr2, 0, s0Var3.k()).asReadOnlyBuffer();
                    try {
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 32);
                        if ((asReadOnlyBuffer.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 4);
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 16);
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + asReadOnlyBuffer.getShort());
                        try {
                            try {
                                int position = asReadOnlyBuffer.position();
                                int n10 = q7.s0.n(position, bArr2.length, s0Var3.k());
                                e1 e1Var = new e1((n10 == 0 ? q7.s0.c : new q7.r0(bArr2, position, n10)).m());
                                try {
                                    q7.r rVar = ((q7.z0) q7.a.k(e1Var).b(q7.z0.class)).b;
                                    c1 c1Var2 = (c1) rVar.get(new q7.y0(3L));
                                    c1 c1Var3 = (c1) rVar.get(new q7.y0(1L));
                                    if (c1Var2 == null || c1Var3 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    try {
                                        long j3 = ((q7.y0) c1Var2.b(q7.y0.class)).a;
                                        long j10 = ((q7.y0) c1Var3.b(q7.y0.class)).a;
                                        byte[] bArr3 = null;
                                        if (j10 != 1) {
                                            if (j10 == 2) {
                                                j10 = 2;
                                            }
                                            bArr = bArr3;
                                            jSONObject.put("authenticatorData", x6.b.c(s0Var3.p()));
                                            jSONObject.put("publicKeyAlgorithm", j3);
                                            if (bArr != null) {
                                                jSONObject.put("publicKey", Base64.encodeToString(bArr, 11));
                                            }
                                            return jSONObject;
                                        }
                                        c1 c1Var4 = (c1) rVar.get(new q7.y0(-1L));
                                        if (c1Var4 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        long j11 = ((q7.y0) c1Var4.b(q7.y0.class)).a;
                                        if (j10 == 2 && j11 == 1) {
                                            c1 c1Var5 = (c1) rVar.get(new q7.y0(-2L));
                                            c1 c1Var6 = (c1) rVar.get(new q7.y0(-3L));
                                            if (c1Var5 == null || c1Var6 == null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            q7.s0 s0Var4 = ((q7.w0) c1Var5.b(q7.w0.class)).a;
                                            q7.s0 s0Var5 = ((q7.w0) c1Var6.b(q7.w0.class)).a;
                                            if (s0Var4.b.length != 32 || s0Var5.b.length != 32) {
                                                throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                            }
                                            bArr3 = q7.a.j(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), s0Var4.p(), s0Var5.p());
                                        } else if (j10 == 1 && j11 == 6) {
                                            c1 c1Var7 = (c1) rVar.get(new q7.y0(-2L));
                                            if (c1Var7 == null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            q7.s0 s0Var6 = ((q7.w0) c1Var7.b(q7.w0.class)).a;
                                            if (s0Var6.b.length != 32) {
                                                throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                            }
                                            bArr3 = q7.a.j(Base64.decode("MCowBQYDK2VwAyEA", 0), s0Var6.p());
                                        }
                                        bArr = bArr3;
                                        jSONObject.put("authenticatorData", x6.b.c(s0Var3.p()));
                                        jSONObject.put("publicKeyAlgorithm", j3);
                                        if (bArr != null) {
                                        }
                                        return jSONObject;
                                    } catch (b1 e10) {
                                        throw new IllegalArgumentException("COSE key ill-formed", e10);
                                    }
                                } finally {
                                    try {
                                        e1Var.close();
                                    } catch (IOException unused) {
                                    }
                                }
                            } catch (b1 e11) {
                                e = e11;
                                throw new IllegalArgumentException("failed to parse COSE key", e);
                            }
                        } catch (q7.x0 e12) {
                            e = e12;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e13) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e13);
                    }
                } catch (b1 e14) {
                    throw new IllegalArgumentException("authData value has wrong type", e14);
                }
            } catch (b1 e15) {
                e = e15;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (q7.x0 e16) {
                e = e16;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e17) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e17);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return q6.m.k(this.a, jVar.a) && q6.m.k(this.b, jVar.b) && q6.m.k(this.c, jVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c}))});
    }

    public final String toString() {
        hy0 hy0Var = new hy0(getClass().getSimpleName(), 9);
        q7.k0 k0Var = q7.m0.d;
        byte[] p10 = this.a.p();
        hy0Var.N(k0Var.c(p10.length, p10), "keyHandle");
        byte[] p11 = this.b.p();
        hy0Var.N(k0Var.c(p11.length, p11), "clientDataJSON");
        byte[] p12 = this.c.p();
        hy0Var.N(k0Var.c(p12.length, p12), "attestationObject");
        hy0Var.N(Arrays.toString(this.d), "transports");
        return hy0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.c(parcel, 2, this.a.p());
        xb.c(parcel, 3, this.b.p());
        xb.c(parcel, 4, this.c.p());
        xb.m(parcel, 5, this.d);
        xb.s(parcel, r10);
    }
}
