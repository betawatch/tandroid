package o6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z6.b1;
import z6.c1;
import z6.e1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new n0(28);
    public final z6.s0 a;
    public final z6.s0 b;
    public final z6.s0 c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        z5.l.h(bArr);
        z6.s0 t10 = z6.s0.t(bArr.length, bArr);
        z5.l.h(bArr2);
        z6.s0 t11 = z6.s0.t(bArr2.length, bArr2);
        z5.l.h(bArr3);
        z6.s0 t12 = z6.s0.t(bArr3.length, bArr3);
        this.a = t10;
        this.b = t11;
        this.c = t12;
        z5.l.h(strArr);
        this.d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0223 A[Catch: JSONException -> 0x0021, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0021, blocks: (B:3:0x000a, B:5:0x0013, B:8:0x0028, B:9:0x0035, B:10:0x003c, B:12:0x003f, B:14:0x0049, B:16:0x0054, B:17:0x004f, B:20:0x0057, B:22:0x0061, B:24:0x006b, B:26:0x007c, B:27:0x0084, B:29:0x0092, B:31:0x00a4, B:33:0x00c2, B:35:0x00d1, B:36:0x00da, B:40:0x00e7, B:41:0x00ea, B:42:0x00f0, B:47:0x0112, B:53:0x020c, B:55:0x0223, B:59:0x0136, B:61:0x0147, B:66:0x0160, B:69:0x017c, B:71:0x0191, B:73:0x0196, B:74:0x01b6, B:75:0x01bb, B:76:0x01bc, B:77:0x01c3, B:82:0x01d0, B:84:0x01dd, B:86:0x01ea, B:87:0x0200, B:88:0x0205, B:89:0x0206, B:90:0x020b, B:92:0x0232, B:93:0x0237, B:96:0x0238, B:97:0x023f, B:98:0x0240, B:99:0x0246, B:105:0x0248, B:106:0x024b, B:109:0x00d4, B:111:0x024f, B:112:0x0256, B:114:0x0259, B:115:0x0260, B:117:0x0261, B:118:0x0268, B:119:0x026b, B:120:0x0272, B:122:0x0273, B:123:0x027a, B:126:0x027e, B:127:0x0285), top: B:2:0x000a, inners: #4, #6, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject b() {
        long j10;
        String[] strArr = this.d;
        try {
            JSONObject jSONObject = new JSONObject();
            z6.s0 s0Var = this.b;
            if (s0Var != null) {
                jSONObject.put("clientDataJSON", g6.b.c(s0Var.u()));
            }
            z6.s0 s0Var2 = this.c;
            if (s0Var2 != null) {
                jSONObject.put("attestationObject", g6.b.c(s0Var2.u()));
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
                    c1 c1Var = (c1) ((z6.z0) c1.d(s0Var2.u()).b(z6.z0.class)).b.get(new z6.a1("authData"));
                    if (c1Var == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    z6.s0 s0Var3 = ((z6.w0) c1Var.b(z6.w0.class)).a;
                    byte[] bArr = s0Var3.b;
                    ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(bArr, 0, s0Var3.p()).asReadOnlyBuffer();
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
                                int s10 = z6.s0.s(position, bArr.length, s0Var3.p());
                                e1 e1Var = new e1((s10 == 0 ? z6.s0.c : new z6.r0(bArr, position, s10)).r());
                                try {
                                    z6.r rVar = ((z6.z0) z6.a.k(e1Var).b(z6.z0.class)).b;
                                    c1 c1Var2 = (c1) rVar.get(new z6.y0(3L));
                                    c1 c1Var3 = (c1) rVar.get(new z6.y0(1L));
                                    if (c1Var2 == null || c1Var3 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    try {
                                        long j11 = ((z6.y0) c1Var2.b(z6.y0.class)).a;
                                        long j12 = ((z6.y0) c1Var3.b(z6.y0.class)).a;
                                        byte[] bArr2 = null;
                                        if (j12 != 1) {
                                            if (j12 != 2) {
                                                j10 = j11;
                                                jSONObject.put("authenticatorData", g6.b.c(s0Var3.u()));
                                                jSONObject.put("publicKeyAlgorithm", j10);
                                                if (bArr2 != null) {
                                                    jSONObject.put("publicKey", Base64.encodeToString(bArr2, 11));
                                                }
                                                return jSONObject;
                                            }
                                            j12 = 2;
                                        }
                                        c1 c1Var4 = (c1) rVar.get(new z6.y0(-1L));
                                        if (c1Var4 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        long j13 = ((z6.y0) c1Var4.b(z6.y0.class)).a;
                                        j10 = j11;
                                        if (j12 == 2 && j13 == 1) {
                                            c1 c1Var5 = (c1) rVar.get(new z6.y0(-2L));
                                            c1 c1Var6 = (c1) rVar.get(new z6.y0(-3L));
                                            if (c1Var5 == null || c1Var6 == null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            z6.s0 s0Var4 = ((z6.w0) c1Var5.b(z6.w0.class)).a;
                                            z6.s0 s0Var5 = ((z6.w0) c1Var6.b(z6.w0.class)).a;
                                            if (s0Var4.b.length != 32 || s0Var5.b.length != 32) {
                                                throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                            }
                                            bArr2 = z6.a.j(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), s0Var4.u(), s0Var5.u());
                                        } else if (j12 == 1 && j13 == 6) {
                                            c1 c1Var7 = (c1) rVar.get(new z6.y0(-2L));
                                            if (c1Var7 == null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            z6.s0 s0Var6 = ((z6.w0) c1Var7.b(z6.w0.class)).a;
                                            if (s0Var6.b.length != 32) {
                                                throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                            }
                                            bArr2 = z6.a.j(Base64.decode("MCowBQYDK2VwAyEA", 0), s0Var6.u());
                                        }
                                        jSONObject.put("authenticatorData", g6.b.c(s0Var3.u()));
                                        jSONObject.put("publicKeyAlgorithm", j10);
                                        if (bArr2 != null) {
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
                        } catch (z6.x0 e12) {
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
            } catch (z6.x0 e16) {
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
        return z5.l.l(this.a, jVar.a) && z5.l.l(this.b, jVar.b) && z5.l.l(this.c, jVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c}))});
    }

    public final String toString() {
        v5.c cVar = new v5.c(getClass().getSimpleName(), 11);
        z6.k0 k0Var = z6.m0.d;
        byte[] u10 = this.a.u();
        cVar.j(k0Var.c(u10.length, u10), "keyHandle");
        byte[] u11 = this.b.u();
        cVar.j(k0Var.c(u11.length, u11), "clientDataJSON");
        byte[] u12 = this.c.u();
        cVar.j(k0Var.c(u12.length, u12), "attestationObject");
        cVar.j(Arrays.toString(this.d), "transports");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.c(parcel, 2, this.a.u());
        com.google.android.gms.internal.cast.o.c(parcel, 3, this.b.u());
        com.google.android.gms.internal.cast.o.c(parcel, 4, this.c.u());
        com.google.android.gms.internal.cast.o.m(parcel, 5, this.d);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
