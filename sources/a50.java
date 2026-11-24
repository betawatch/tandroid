// default package

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class a50 extends c50 {
    public static final Parcelable.Creator<a50> CREATOR = new rhe((byte) 18);
    public final qae a;
    public final qae b;
    public final qae c;
    public final String[] d;

    public a50(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        fre.h(bArr);
        qae o = qae.o(bArr.length, bArr);
        fre.h(bArr2);
        qae o2 = qae.o(bArr2.length, bArr2);
        fre.h(bArr3);
        qae o3 = qae.o(bArr3.length, bArr3);
        this.a = o;
        this.b = o2;
        this.c = o3;
        fre.h(strArr);
        this.d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0216 A[Catch: JSONException -> 0x0296, TRY_LEAVE, TryCatch #10 {JSONException -> 0x0296, blocks: (B:48:0x0202, B:50:0x0216, B:61:0x0157, B:64:0x0173, B:66:0x0188, B:68:0x018d, B:69:0x01aa, B:70:0x01af, B:71:0x01b0, B:72:0x01b7, B:92:0x0230, B:93:0x0237, B:77:0x01c4, B:79:0x01d1, B:81:0x01de, B:82:0x01f4, B:83:0x01f9, B:84:0x01fa, B:85:0x01ff, B:89:0x0225, B:90:0x022a, B:96:0x0238, B:97:0x0240, B:104:0x0244, B:106:0x0247, B:109:0x0252, B:110:0x0259, B:121:0x025c, B:122:0x0263, B:125:0x0269, B:126:0x0270, B:132:0x0273, B:133:0x027a, B:136:0x0280, B:137:0x0287, B:144:0x028e, B:145:0x0295), top: B:13:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject b() {
        sfe sfeVar;
        byte[] bArr;
        String[] strArr = this.d;
        qae qaeVar = this.c;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", und.b(this.b.p()));
            jSONObject.put("attestationObject", und.b(qaeVar.p()));
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i].equals("cable")) {
                    jSONArray.put(i, "hybrid");
                } else {
                    jSONArray.put(i, strArr[i]);
                }
            }
            try {
                jSONObject.put("transports", jSONArray);
                try {
                    try {
                        sfe sfeVar2 = (sfe) ((dfe) sfe.d(qaeVar.p()).b(dfe.class)).b.get(new hfe("authData"));
                        if (sfeVar2 == null) {
                            try {
                                throw new IllegalArgumentException("attestation object missing authData");
                            } catch (ife e) {
                                e = e;
                                throw new IllegalArgumentException("authData value has wrong type", e);
                            }
                        }
                        qae qaeVar2 = ((dee) sfeVar2.b(dee.class)).a;
                        byte[] bArr2 = qaeVar2.b;
                        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(bArr2, 0, qaeVar2.k()).asReadOnlyBuffer();
                        try {
                            asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 32);
                            if ((asReadOnlyBuffer.get() & 64) == 0) {
                                try {
                                    throw new IllegalArgumentException("authData does not include credential data");
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                    throw new IllegalArgumentException("ill-formed authenticator data", e);
                                }
                            }
                            asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 4);
                            asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 16);
                            asReadOnlyBuffer.position(asReadOnlyBuffer.position() + asReadOnlyBuffer.getShort());
                            try {
                                try {
                                    int position = asReadOnlyBuffer.position();
                                    int n = qae.n(position, bArr2.length, qaeVar2.k());
                                    hge hgeVar = new hge((n == 0 ? qae.c : new z9e(bArr2, position, n)).m());
                                    try {
                                        sfe a = k2f.a(hgeVar);
                                        try {
                                            hgeVar.close();
                                        } catch (IOException unused) {
                                        }
                                        njd njdVar = ((dfe) a.b(dfe.class)).b;
                                        sfe sfeVar3 = (sfe) njdVar.get(new uee(3L));
                                        sfe sfeVar4 = (sfe) njdVar.get(new uee(1L));
                                        if (sfeVar3 == null || sfeVar4 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        try {
                                            long j = ((uee) sfeVar3.b(uee.class)).a;
                                            long j2 = ((uee) sfeVar4.b(uee.class)).a;
                                            try {
                                                if (j2 != 1) {
                                                    if (j2 != 2) {
                                                        bArr = null;
                                                        jSONObject.put("authenticatorData", und.b(qaeVar2.p()));
                                                        jSONObject.put("publicKeyAlgorithm", j);
                                                        if (bArr != null) {
                                                            jSONObject.put("publicKey", Base64.encodeToString(bArr, 11));
                                                        }
                                                        return jSONObject;
                                                    }
                                                    j2 = 2;
                                                }
                                                if (sfeVar == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                long j3 = ((uee) sfeVar.b(uee.class)).a;
                                                if (j2 == 2 && j3 == 1) {
                                                    sfe sfeVar5 = (sfe) njdVar.get(new uee(-2L));
                                                    sfe sfeVar6 = (sfe) njdVar.get(new uee(-3L));
                                                    if (sfeVar5 == null || sfeVar6 == null) {
                                                        throw new IllegalArgumentException("COSE key missing required fields");
                                                    }
                                                    qae qaeVar3 = ((dee) sfeVar5.b(dee.class)).a;
                                                    qae qaeVar4 = ((dee) sfeVar6.b(dee.class)).a;
                                                    if (qaeVar3.b.length != 32 || qaeVar4.b.length != 32) {
                                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                    }
                                                    bArr = c2f.a(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), qaeVar3.p(), qaeVar4.p());
                                                } else if (j2 == 1 && j3 == 6) {
                                                    sfe sfeVar7 = (sfe) njdVar.get(new uee(-2L));
                                                    if (sfeVar7 == null) {
                                                        throw new IllegalArgumentException("COSE key missing required fields");
                                                    }
                                                    qae qaeVar5 = ((dee) sfeVar7.b(dee.class)).a;
                                                    if (qaeVar5.b.length != 32) {
                                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                    }
                                                    bArr = c2f.a(Base64.decode("MCowBQYDK2VwAyEA", 0), qaeVar5.p());
                                                } else {
                                                    bArr = null;
                                                }
                                                jSONObject.put("authenticatorData", und.b(qaeVar2.p()));
                                                jSONObject.put("publicKeyAlgorithm", j);
                                                if (bArr != null) {
                                                }
                                                return jSONObject;
                                            } catch (ife e3) {
                                                e = e3;
                                                throw new IllegalArgumentException("COSE key ill-formed", e);
                                            }
                                            sfeVar = (sfe) njdVar.get(new uee(-1L));
                                        } catch (ife e4) {
                                            e = e4;
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            try {
                                                hgeVar.close();
                                            } catch (IOException unused2) {
                                            }
                                            try {
                                                throw th;
                                            } catch (pee e5) {
                                                e = e5;
                                                throw new IllegalArgumentException("failed to parse COSE key", e);
                                            }
                                        } catch (ife e6) {
                                            e = e6;
                                            throw new IllegalArgumentException("failed to parse COSE key", e);
                                        }
                                    }
                                } catch (pee e7) {
                                    e = e7;
                                    throw new IllegalArgumentException("failed to parse COSE key", e);
                                }
                            } catch (ife e8) {
                                e = e8;
                                throw new IllegalArgumentException("failed to parse COSE key", e);
                            }
                        } catch (IllegalArgumentException e9) {
                            e = e9;
                        }
                    } catch (ife e10) {
                        e = e10;
                    }
                } catch (ife e11) {
                    e = e11;
                    throw new IllegalArgumentException("failed to parse attestation object", e);
                } catch (pee e12) {
                    e = e12;
                    throw new IllegalArgumentException("failed to parse attestation object", e);
                }
            } catch (JSONException e13) {
                e = e13;
                fyb.j("Error encoding AuthenticatorAttestationResponse to JSON object", e);
                return null;
            }
        } catch (JSONException e14) {
            e = e14;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a50)) {
            return false;
        }
        a50 a50Var = (a50) obj;
        return cqe.a(this.a, a50Var.a) && cqe.a(this.b, a50Var.b) && cqe.a(this.c, a50Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c}))});
    }

    public final String toString() {
        vk9 vk9Var = new vk9(getClass().getSimpleName(), (byte) 25);
        v6e v6eVar = m7e.d;
        byte[] p = this.a.p();
        vk9Var.B(v6eVar.c(p.length, p), "keyHandle");
        byte[] p2 = this.b.p();
        vk9Var.B(v6eVar.c(p2.length, p2), "clientDataJSON");
        byte[] p3 = this.c.p();
        vk9Var.B(v6eVar.c(p3.length, p3), "attestationObject");
        vk9Var.B(Arrays.toString(this.d), "transports");
        return vk9Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.c(parcel, 2, this.a.p());
        jte.c(parcel, 3, this.b.p());
        jte.c(parcel, 4, this.c.p());
        jte.m(parcel, 5, this.d);
        jte.s(parcel, r);
    }
}
