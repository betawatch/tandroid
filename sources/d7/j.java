package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import o7.a1;
import o7.b1;
import o7.c1;
import o7.e1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new r0(17);
    public final o7.s0 a;
    public final o7.s0 b;
    public final o7.s0 c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        o6.l.h(bArr);
        o7.s0 s10 = o7.s0.s(bArr.length, bArr);
        o6.l.h(bArr2);
        o7.s0 s11 = o7.s0.s(bArr2.length, bArr2);
        o6.l.h(bArr3);
        o7.s0 s12 = o7.s0.s(bArr3.length, bArr3);
        this.a = s10;
        this.b = s11;
        this.c = s12;
        o6.l.h(strArr);
        this.d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0225 A[Catch: JSONException -> 0x0021, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0021, blocks: (B:3:0x000a, B:5:0x0013, B:8:0x0028, B:9:0x0035, B:10:0x003c, B:12:0x003f, B:14:0x0049, B:16:0x0054, B:17:0x004f, B:20:0x0057, B:22:0x0061, B:24:0x006b, B:26:0x007c, B:27:0x0084, B:29:0x0092, B:31:0x00a4, B:33:0x00c2, B:35:0x00d1, B:36:0x00da, B:40:0x00e7, B:41:0x00ea, B:42:0x00f0, B:47:0x0112, B:53:0x0210, B:55:0x0225, B:58:0x0135, B:60:0x0146, B:65:0x0160, B:68:0x017c, B:70:0x0191, B:72:0x0196, B:73:0x01b7, B:74:0x01bc, B:75:0x01bd, B:76:0x01c4, B:81:0x01d1, B:83:0x01de, B:85:0x01eb, B:86:0x0204, B:87:0x0209, B:88:0x020a, B:89:0x020f, B:91:0x0233, B:92:0x0238, B:95:0x0239, B:96:0x0240, B:97:0x0241, B:98:0x0247, B:104:0x0249, B:105:0x024c, B:108:0x00d4, B:110:0x0250, B:111:0x0257, B:113:0x025a, B:114:0x0261, B:116:0x0262, B:117:0x0269, B:118:0x026c, B:119:0x0273, B:121:0x0274, B:122:0x027b, B:125:0x027f, B:126:0x0286), top: B:2:0x000a, inners: #0, #3, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject b() {
        byte[] bArr;
        String[] strArr = this.d;
        try {
            JSONObject jSONObject = new JSONObject();
            o7.s0 s0Var = this.b;
            if (s0Var != null) {
                jSONObject.put("clientDataJSON", v6.b.c(s0Var.t()));
            }
            o7.s0 s0Var2 = this.c;
            if (s0Var2 != null) {
                jSONObject.put("attestationObject", v6.b.c(s0Var2.t()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (strArr[i10].equals("cable")) {
                    jSONArray.put(i10, "hybrid");
                } else {
                    jSONArray.put(i10, strArr[i10]);
                }
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    c1 c1Var = (c1) ((o7.z0) c1.d(s0Var2.t()).b(o7.z0.class)).b.get(new a1("authData"));
                    if (c1Var == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    o7.s0 s0Var3 = ((o7.w0) c1Var.b(o7.w0.class)).a;
                    byte[] bArr2 = s0Var3.b;
                    ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(bArr2, 0, s0Var3.o()).asReadOnlyBuffer();
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
                                int r6 = o7.s0.r(position, bArr2.length, s0Var3.o());
                                e1 e1Var = new e1((r6 == 0 ? o7.s0.c : new o7.r0(bArr2, position, r6)).q());
                                try {
                                    o7.r rVar = ((o7.z0) o7.a.k(e1Var).b(o7.z0.class)).b;
                                    c1 c1Var2 = (c1) rVar.get(new o7.y0(3L));
                                    c1 c1Var3 = (c1) rVar.get(new o7.y0(1L));
                                    if (c1Var2 == null || c1Var3 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    try {
                                        long j10 = ((o7.y0) c1Var2.b(o7.y0.class)).a;
                                        long j11 = ((o7.y0) c1Var3.b(o7.y0.class)).a;
                                        byte[] bArr3 = null;
                                        if (j11 != 1) {
                                            if (j11 == 2) {
                                                j11 = 2;
                                            }
                                            bArr = bArr3;
                                            jSONObject.put("authenticatorData", v6.b.c(s0Var3.t()));
                                            jSONObject.put("publicKeyAlgorithm", j10);
                                            if (bArr != null) {
                                                jSONObject.put("publicKey", Base64.encodeToString(bArr, 11));
                                            }
                                            return jSONObject;
                                        }
                                        c1 c1Var4 = (c1) rVar.get(new o7.y0(-1L));
                                        if (c1Var4 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        long j12 = ((o7.y0) c1Var4.b(o7.y0.class)).a;
                                        if (j11 == 2 && j12 == 1) {
                                            c1 c1Var5 = (c1) rVar.get(new o7.y0(-2L));
                                            c1 c1Var6 = (c1) rVar.get(new o7.y0(-3L));
                                            if (c1Var5 == null || c1Var6 == null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            o7.s0 s0Var4 = ((o7.w0) c1Var5.b(o7.w0.class)).a;
                                            o7.s0 s0Var5 = ((o7.w0) c1Var6.b(o7.w0.class)).a;
                                            if (s0Var4.b.length != 32 || s0Var5.b.length != 32) {
                                                throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                            }
                                            bArr3 = o7.a.j(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), s0Var4.t(), s0Var5.t());
                                        } else if (j11 == 1 && j12 == 6) {
                                            c1 c1Var7 = (c1) rVar.get(new o7.y0(-2L));
                                            if (c1Var7 == null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            o7.s0 s0Var6 = ((o7.w0) c1Var7.b(o7.w0.class)).a;
                                            if (s0Var6.b.length != 32) {
                                                throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                            }
                                            bArr3 = o7.a.j(Base64.decode("MCowBQYDK2VwAyEA", 0), s0Var6.t());
                                        }
                                        bArr = bArr3;
                                        jSONObject.put("authenticatorData", v6.b.c(s0Var3.t()));
                                        jSONObject.put("publicKeyAlgorithm", j10);
                                        if (bArr != null) {
                                        }
                                        return jSONObject;
                                    } catch (b1 e) {
                                        throw new IllegalArgumentException("COSE key ill-formed", e);
                                    }
                                } finally {
                                    try {
                                        e1Var.close();
                                    } catch (IOException unused) {
                                    }
                                }
                            } catch (o7.x0 e10) {
                                e = e10;
                                throw new IllegalArgumentException("failed to parse COSE key", e);
                            }
                        } catch (b1 e11) {
                            e = e11;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e12) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e12);
                    }
                } catch (b1 e13) {
                    throw new IllegalArgumentException("authData value has wrong type", e13);
                }
            } catch (b1 e14) {
                e = e14;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (o7.x0 e15) {
                e = e15;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e16) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e16);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return o6.l.l(this.a, jVar.a) && o6.l.l(this.b, jVar.b) && o6.l.l(this.c, jVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c}))});
    }

    public final String toString() {
        k6.c cVar = new k6.c(getClass().getSimpleName());
        o7.k0 k0Var = o7.m0.d;
        byte[] t10 = this.a.t();
        cVar.K(k0Var.c(t10.length, t10), "keyHandle");
        byte[] t11 = this.b.t();
        cVar.K(k0Var.c(t11.length, t11), "clientDataJSON");
        byte[] t12 = this.c.t();
        cVar.K(k0Var.c(t12.length, t12), "attestationObject");
        cVar.K(Arrays.toString(this.d), "transports");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.c(parcel, 2, this.a.t());
        df.c(parcel, 3, this.b.t());
        df.c(parcel, 4, this.c.t());
        df.m(parcel, 5, this.d);
        df.r(parcel, q5);
    }
}
