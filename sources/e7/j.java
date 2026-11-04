package e7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p7.a1;
import p7.b1;
import p7.c1;
import p7.d1;
import p7.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new r0(20);
    public final p7.t0 a;
    public final p7.t0 b;
    public final p7.t0 c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        p6.m.g(bArr);
        p7.t0 o10 = p7.t0.o(bArr.length, bArr);
        p6.m.g(bArr2);
        p7.t0 o11 = p7.t0.o(bArr2.length, bArr2);
        p6.m.g(bArr3);
        p7.t0 o12 = p7.t0.o(bArr3.length, bArr3);
        this.a = o10;
        this.b = o11;
        this.c = o12;
        p6.m.g(strArr);
        this.d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0223 A[Catch: JSONException -> 0x0021, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0021, blocks: (B:3:0x000a, B:5:0x0013, B:8:0x0028, B:9:0x0035, B:10:0x003c, B:12:0x003f, B:14:0x0049, B:16:0x0054, B:17:0x004f, B:20:0x0057, B:22:0x0060, B:24:0x006a, B:26:0x007b, B:27:0x0083, B:29:0x0091, B:31:0x00a3, B:33:0x00c1, B:35:0x00d0, B:36:0x00d9, B:40:0x00e6, B:41:0x00e9, B:42:0x00ef, B:47:0x0111, B:53:0x020f, B:55:0x0223, B:58:0x0134, B:60:0x0145, B:65:0x015f, B:68:0x017b, B:70:0x0190, B:72:0x0195, B:73:0x01b6, B:74:0x01bb, B:75:0x01bc, B:76:0x01c3, B:81:0x01d0, B:83:0x01dd, B:85:0x01ea, B:86:0x0203, B:87:0x0208, B:88:0x0209, B:89:0x020e, B:91:0x0230, B:92:0x0235, B:95:0x0236, B:96:0x023d, B:97:0x023e, B:98:0x0244, B:104:0x0246, B:105:0x0249, B:108:0x00d3, B:110:0x024d, B:111:0x0254, B:113:0x0257, B:114:0x025e, B:116:0x025f, B:117:0x0266, B:118:0x0269, B:119:0x0270, B:121:0x0271, B:122:0x0278, B:125:0x027c, B:126:0x0283), top: B:2:0x000a, inners: #5, #9, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject b() {
        byte[] bArr;
        String[] strArr = this.d;
        try {
            JSONObject jSONObject = new JSONObject();
            p7.t0 t0Var = this.b;
            if (t0Var != null) {
                jSONObject.put("clientDataJSON", w6.b.c(t0Var.p()));
            }
            p7.t0 t0Var2 = this.c;
            if (t0Var2 != null) {
                jSONObject.put("attestationObject", w6.b.c(t0Var2.p()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (strArr[i3].equals("cable")) {
                    jSONArray.put(i3, "hybrid");
                } else {
                    jSONArray.put(i3, strArr[i3]);
                }
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    d1 d1Var = (d1) ((a1) d1.d(t0Var2.p()).b(a1.class)).b.get(new b1("authData"));
                    if (d1Var == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    p7.t0 t0Var3 = ((p7.x0) d1Var.b(p7.x0.class)).a;
                    byte[] bArr2 = t0Var3.b;
                    ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(bArr2, 0, t0Var3.k()).asReadOnlyBuffer();
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
                                int n4 = p7.t0.n(position, bArr2.length, t0Var3.k());
                                f1 f1Var = new f1((n4 == 0 ? p7.t0.c : new p7.s0(bArr2, position, n4)).m());
                                try {
                                    p7.s sVar = ((a1) p7.a.k(f1Var).b(a1.class)).b;
                                    d1 d1Var2 = (d1) sVar.get(new p7.z0(3L));
                                    d1 d1Var3 = (d1) sVar.get(new p7.z0(1L));
                                    if (d1Var2 == null || d1Var3 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    try {
                                        long j10 = ((p7.z0) d1Var2.b(p7.z0.class)).a;
                                        long j11 = ((p7.z0) d1Var3.b(p7.z0.class)).a;
                                        byte[] bArr3 = null;
                                        if (j11 != 1) {
                                            if (j11 == 2) {
                                                j11 = 2;
                                            }
                                            bArr = bArr3;
                                            jSONObject.put("authenticatorData", w6.b.c(t0Var3.p()));
                                            jSONObject.put("publicKeyAlgorithm", j10);
                                            if (bArr != null) {
                                                jSONObject.put("publicKey", Base64.encodeToString(bArr, 11));
                                            }
                                            return jSONObject;
                                        }
                                        d1 d1Var4 = (d1) sVar.get(new p7.z0(-1L));
                                        if (d1Var4 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        long j12 = ((p7.z0) d1Var4.b(p7.z0.class)).a;
                                        if (j11 == 2 && j12 == 1) {
                                            d1 d1Var5 = (d1) sVar.get(new p7.z0(-2L));
                                            d1 d1Var6 = (d1) sVar.get(new p7.z0(-3L));
                                            if (d1Var5 == null || d1Var6 == null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            p7.t0 t0Var4 = ((p7.x0) d1Var5.b(p7.x0.class)).a;
                                            p7.t0 t0Var5 = ((p7.x0) d1Var6.b(p7.x0.class)).a;
                                            if (t0Var4.b.length != 32 || t0Var5.b.length != 32) {
                                                throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                            }
                                            bArr3 = p7.a.j(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), t0Var4.p(), t0Var5.p());
                                        } else if (j11 == 1 && j12 == 6) {
                                            d1 d1Var7 = (d1) sVar.get(new p7.z0(-2L));
                                            if (d1Var7 == null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            p7.t0 t0Var6 = ((p7.x0) d1Var7.b(p7.x0.class)).a;
                                            if (t0Var6.b.length != 32) {
                                                throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                            }
                                            bArr3 = p7.a.j(Base64.decode("MCowBQYDK2VwAyEA", 0), t0Var6.p());
                                        }
                                        bArr = bArr3;
                                        jSONObject.put("authenticatorData", w6.b.c(t0Var3.p()));
                                        jSONObject.put("publicKeyAlgorithm", j10);
                                        if (bArr != null) {
                                        }
                                        return jSONObject;
                                    } catch (c1 e10) {
                                        throw new IllegalArgumentException("COSE key ill-formed", e10);
                                    }
                                } finally {
                                    try {
                                        f1Var.close();
                                    } catch (IOException unused) {
                                    }
                                }
                            } catch (p7.y0 e11) {
                                e = e11;
                                throw new IllegalArgumentException("failed to parse COSE key", e);
                            }
                        } catch (c1 e12) {
                            e = e12;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e13) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e13);
                    }
                } catch (c1 e14) {
                    throw new IllegalArgumentException("authData value has wrong type", e14);
                }
            } catch (c1 e15) {
                e = e15;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (p7.y0 e16) {
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
        return p6.m.k(this.a, jVar.a) && p6.m.k(this.b, jVar.b) && p6.m.k(this.c, jVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c}))});
    }

    public final String toString() {
        p7.d dVar = new p7.d(getClass().getSimpleName(), 1);
        p7.l0 l0Var = p7.n0.d;
        byte[] p10 = this.a.p();
        dVar.I(l0Var.c(p10.length, p10), "keyHandle");
        byte[] p11 = this.b.p();
        dVar.I(l0Var.c(p11.length, p11), "clientDataJSON");
        byte[] p12 = this.c.p();
        dVar.I(l0Var.c(p12.length, p12), "attestationObject");
        dVar.I(Arrays.toString(this.d), "transports");
        return dVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.d(parcel, 2, this.a.p());
        j8.a.d(parcel, 3, this.b.p());
        j8.a.d(parcel, 4, this.c.p());
        j8.a.n(parcel, 5, this.d);
        j8.a.t(parcel, s6);
    }
}
