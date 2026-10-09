package c7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import n7.a1;
import n7.b1;
import n7.c1;
import n7.e1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new r0(16);
    public final n7.s0 a;
    public final n7.s0 b;
    public final n7.s0 c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        n6.l.h(bArr);
        n7.s0 t10 = n7.s0.t(bArr.length, bArr);
        n6.l.h(bArr2);
        n7.s0 t11 = n7.s0.t(bArr2.length, bArr2);
        n6.l.h(bArr3);
        n7.s0 t12 = n7.s0.t(bArr3.length, bArr3);
        this.a = t10;
        this.b = t11;
        this.c = t12;
        n6.l.h(strArr);
        this.d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0225 A[Catch: JSONException -> 0x0021, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0021, blocks: (B:3:0x000a, B:5:0x0013, B:8:0x0028, B:9:0x0035, B:10:0x003c, B:12:0x003f, B:14:0x0049, B:16:0x0054, B:17:0x004f, B:20:0x0057, B:22:0x0061, B:24:0x006b, B:26:0x007c, B:27:0x0084, B:29:0x0092, B:31:0x00a4, B:33:0x00c2, B:35:0x00d1, B:36:0x00da, B:40:0x00e7, B:41:0x00ea, B:42:0x00f0, B:47:0x0112, B:53:0x0210, B:55:0x0225, B:58:0x0135, B:60:0x0146, B:65:0x0160, B:68:0x017c, B:70:0x0191, B:72:0x0196, B:73:0x01b7, B:74:0x01bc, B:75:0x01bd, B:76:0x01c4, B:81:0x01d1, B:83:0x01de, B:85:0x01eb, B:86:0x0204, B:87:0x0209, B:88:0x020a, B:89:0x020f, B:91:0x0233, B:92:0x0238, B:95:0x0239, B:96:0x0240, B:97:0x0241, B:98:0x0247, B:104:0x0249, B:105:0x024c, B:108:0x00d4, B:110:0x0250, B:111:0x0257, B:113:0x025a, B:114:0x0261, B:116:0x0262, B:117:0x0269, B:118:0x026c, B:119:0x0273, B:121:0x0274, B:122:0x027b, B:125:0x027f, B:126:0x0286), top: B:2:0x000a, inners: #0, #6, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject b() {
        byte[] bArr;
        String[] strArr = this.d;
        try {
            JSONObject jSONObject = new JSONObject();
            n7.s0 s0Var = this.b;
            if (s0Var != null) {
                jSONObject.put("clientDataJSON", u6.b.c(s0Var.u()));
            }
            n7.s0 s0Var2 = this.c;
            if (s0Var2 != null) {
                jSONObject.put("attestationObject", u6.b.c(s0Var2.u()));
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
                    c1 c1Var = (c1) ((n7.z0) c1.d(s0Var2.u()).b(n7.z0.class)).b.get(new a1("authData"));
                    if (c1Var == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    n7.s0 s0Var3 = ((n7.w0) c1Var.b(n7.w0.class)).a;
                    byte[] bArr2 = s0Var3.b;
                    ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(bArr2, 0, s0Var3.p()).asReadOnlyBuffer();
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
                                int s10 = n7.s0.s(position, bArr2.length, s0Var3.p());
                                e1 e1Var = new e1((s10 == 0 ? n7.s0.c : new n7.r0(bArr2, position, s10)).r());
                                try {
                                    n7.r rVar = ((n7.z0) n7.a.k(e1Var).b(n7.z0.class)).b;
                                    c1 c1Var2 = (c1) rVar.get(new n7.y0(3L));
                                    c1 c1Var3 = (c1) rVar.get(new n7.y0(1L));
                                    if (c1Var2 == null || c1Var3 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    try {
                                        long j3 = ((n7.y0) c1Var2.b(n7.y0.class)).a;
                                        long j10 = ((n7.y0) c1Var3.b(n7.y0.class)).a;
                                        byte[] bArr3 = null;
                                        if (j10 != 1) {
                                            if (j10 == 2) {
                                                j10 = 2;
                                            }
                                            bArr = bArr3;
                                            jSONObject.put("authenticatorData", u6.b.c(s0Var3.u()));
                                            jSONObject.put("publicKeyAlgorithm", j3);
                                            if (bArr != null) {
                                                jSONObject.put("publicKey", Base64.encodeToString(bArr, 11));
                                            }
                                            return jSONObject;
                                        }
                                        c1 c1Var4 = (c1) rVar.get(new n7.y0(-1L));
                                        if (c1Var4 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        long j11 = ((n7.y0) c1Var4.b(n7.y0.class)).a;
                                        if (j10 == 2 && j11 == 1) {
                                            c1 c1Var5 = (c1) rVar.get(new n7.y0(-2L));
                                            c1 c1Var6 = (c1) rVar.get(new n7.y0(-3L));
                                            if (c1Var5 == null || c1Var6 == null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            n7.s0 s0Var4 = ((n7.w0) c1Var5.b(n7.w0.class)).a;
                                            n7.s0 s0Var5 = ((n7.w0) c1Var6.b(n7.w0.class)).a;
                                            if (s0Var4.b.length != 32 || s0Var5.b.length != 32) {
                                                throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                            }
                                            bArr3 = n7.a.j(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), s0Var4.u(), s0Var5.u());
                                        } else if (j10 == 1 && j11 == 6) {
                                            c1 c1Var7 = (c1) rVar.get(new n7.y0(-2L));
                                            if (c1Var7 == null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            n7.s0 s0Var6 = ((n7.w0) c1Var7.b(n7.w0.class)).a;
                                            if (s0Var6.b.length != 32) {
                                                throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                            }
                                            bArr3 = n7.a.j(Base64.decode("MCowBQYDK2VwAyEA", 0), s0Var6.u());
                                        }
                                        bArr = bArr3;
                                        jSONObject.put("authenticatorData", u6.b.c(s0Var3.u()));
                                        jSONObject.put("publicKeyAlgorithm", j3);
                                        if (bArr != null) {
                                        }
                                        return jSONObject;
                                    } catch (b1 e7) {
                                        throw new IllegalArgumentException("COSE key ill-formed", e7);
                                    }
                                } finally {
                                    try {
                                        e1Var.close();
                                    } catch (IOException unused) {
                                    }
                                }
                            } catch (n7.x0 e10) {
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
            } catch (n7.x0 e15) {
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
        return n6.l.l(this.a, jVar.a) && n6.l.l(this.b, jVar.b) && n6.l.l(this.c, jVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c}))});
    }

    public final String toString() {
        la.h hVar = new la.h(getClass().getSimpleName());
        n7.k0 k0Var = n7.m0.d;
        byte[] u10 = this.a.u();
        hVar.a0(k0Var.c(u10.length, u10), "keyHandle");
        byte[] u11 = this.b.u();
        hVar.a0(k0Var.c(u11.length, u11), "clientDataJSON");
        byte[] u12 = this.c.u();
        hVar.a0(k0Var.c(u12.length, u12), "attestationObject");
        hVar.a0(Arrays.toString(this.d), "transports");
        return hVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.c(parcel, 2, this.a.u());
        w7.d0.c(parcel, 3, this.b.u());
        w7.d0.c(parcel, 4, this.c.u());
        w7.d0.m(parcel, 5, this.d);
        w7.d0.r(parcel, q6);
    }
}
