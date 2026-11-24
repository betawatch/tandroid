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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class a60 extends c60 {
    public static final Parcelable.Creator<a60> CREATOR = new sje((byte) 18);
    public final rce a;
    public final rce b;
    public final rce c;
    public final String[] d;

    public a60(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        ite.h(bArr);
        rce o = rce.o(bArr.length, bArr);
        ite.h(bArr2);
        rce o2 = rce.o(bArr2.length, bArr2);
        ite.h(bArr3);
        rce o3 = rce.o(bArr3.length, bArr3);
        this.a = o;
        this.b = o2;
        this.c = o3;
        ite.h(strArr);
        this.d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0216 A[Catch: JSONException -> 0x0296, TRY_LEAVE, TryCatch #9 {JSONException -> 0x0296, blocks: (B:48:0x0202, B:50:0x0216, B:61:0x0157, B:64:0x0173, B:66:0x0188, B:68:0x018d, B:69:0x01aa, B:70:0x01af, B:71:0x01b0, B:72:0x01b7, B:92:0x0230, B:93:0x0237, B:77:0x01c4, B:79:0x01d1, B:81:0x01de, B:82:0x01f4, B:83:0x01f9, B:84:0x01fa, B:85:0x01ff, B:89:0x0225, B:90:0x022a, B:96:0x0238, B:97:0x0240, B:104:0x0244, B:106:0x0247, B:109:0x0252, B:110:0x0259, B:121:0x025c, B:122:0x0263, B:125:0x0269, B:126:0x0270, B:132:0x0273, B:133:0x027a, B:136:0x0280, B:137:0x0287, B:144:0x028e, B:145:0x0295), top: B:13:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject b() {
        the theVar;
        byte[] bArr;
        String[] strArr = this.d;
        rce rceVar = this.c;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", xpd.b(this.b.p()));
            jSONObject.put("attestationObject", xpd.b(rceVar.p()));
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
                        the theVar2 = (the) ((ehe) the.d(rceVar.p()).b(ehe.class)).b.get(new ihe("authData"));
                        if (theVar2 == null) {
                            try {
                                throw new IllegalArgumentException("attestation object missing authData");
                            } catch (jhe e) {
                                e = e;
                                throw new IllegalArgumentException("authData value has wrong type", e);
                            }
                        }
                        rce rceVar2 = ((ege) theVar2.b(ege.class)).a;
                        byte[] bArr2 = rceVar2.b;
                        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(bArr2, 0, rceVar2.k()).asReadOnlyBuffer();
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
                                    int n = rce.n(position, bArr2.length, rceVar2.k());
                                    iie iieVar = new iie((n == 0 ? rce.c : new ace(bArr2, position, n)).m());
                                    try {
                                        the a = m4f.a(iieVar);
                                        try {
                                            iieVar.close();
                                        } catch (IOException unused) {
                                        }
                                        pld pldVar = ((ehe) a.b(ehe.class)).b;
                                        the theVar3 = (the) pldVar.get(new vge(3L));
                                        the theVar4 = (the) pldVar.get(new vge(1L));
                                        if (theVar3 == null || theVar4 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        try {
                                            long j = ((vge) theVar3.b(vge.class)).a;
                                            long j2 = ((vge) theVar4.b(vge.class)).a;
                                            try {
                                                if (j2 != 1) {
                                                    if (j2 != 2) {
                                                        bArr = null;
                                                        jSONObject.put("authenticatorData", xpd.b(rceVar2.p()));
                                                        jSONObject.put("publicKeyAlgorithm", j);
                                                        if (bArr != null) {
                                                            jSONObject.put("publicKey", Base64.encodeToString(bArr, 11));
                                                        }
                                                        return jSONObject;
                                                    }
                                                    j2 = 2;
                                                }
                                                if (theVar == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                long j3 = ((vge) theVar.b(vge.class)).a;
                                                if (j2 == 2 && j3 == 1) {
                                                    the theVar5 = (the) pldVar.get(new vge(-2L));
                                                    the theVar6 = (the) pldVar.get(new vge(-3L));
                                                    if (theVar5 == null || theVar6 == null) {
                                                        throw new IllegalArgumentException("COSE key missing required fields");
                                                    }
                                                    rce rceVar3 = ((ege) theVar5.b(ege.class)).a;
                                                    rce rceVar4 = ((ege) theVar6.b(ege.class)).a;
                                                    if (rceVar3.b.length != 32 || rceVar4.b.length != 32) {
                                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                    }
                                                    bArr = e4f.a(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), rceVar3.p(), rceVar4.p());
                                                } else if (j2 == 1 && j3 == 6) {
                                                    the theVar7 = (the) pldVar.get(new vge(-2L));
                                                    if (theVar7 == null) {
                                                        throw new IllegalArgumentException("COSE key missing required fields");
                                                    }
                                                    rce rceVar5 = ((ege) theVar7.b(ege.class)).a;
                                                    if (rceVar5.b.length != 32) {
                                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                    }
                                                    bArr = e4f.a(Base64.decode("MCowBQYDK2VwAyEA", 0), rceVar5.p());
                                                } else {
                                                    bArr = null;
                                                }
                                                jSONObject.put("authenticatorData", xpd.b(rceVar2.p()));
                                                jSONObject.put("publicKeyAlgorithm", j);
                                                if (bArr != null) {
                                                }
                                                return jSONObject;
                                            } catch (jhe e3) {
                                                e = e3;
                                                throw new IllegalArgumentException("COSE key ill-formed", e);
                                            }
                                            theVar = (the) pldVar.get(new vge(-1L));
                                        } catch (jhe e4) {
                                            e = e4;
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            try {
                                                iieVar.close();
                                            } catch (IOException unused2) {
                                            }
                                            try {
                                                throw th;
                                            } catch (qge e5) {
                                                e = e5;
                                                throw new IllegalArgumentException("failed to parse COSE key", e);
                                            }
                                        } catch (jhe e6) {
                                            e = e6;
                                            throw new IllegalArgumentException("failed to parse COSE key", e);
                                        }
                                    }
                                } catch (qge e7) {
                                    e = e7;
                                    throw new IllegalArgumentException("failed to parse COSE key", e);
                                }
                            } catch (jhe e8) {
                                e = e8;
                                throw new IllegalArgumentException("failed to parse COSE key", e);
                            }
                        } catch (IllegalArgumentException e9) {
                            e = e9;
                        }
                    } catch (jhe e10) {
                        e = e10;
                    }
                } catch (jhe e11) {
                    e = e11;
                    throw new IllegalArgumentException("failed to parse attestation object", e);
                } catch (qge e12) {
                    e = e12;
                    throw new IllegalArgumentException("failed to parse attestation object", e);
                }
            } catch (JSONException e13) {
                e = e13;
                rjb.k("Error encoding AuthenticatorAttestationResponse to JSON object", e);
                return null;
            }
        } catch (JSONException e14) {
            e = e14;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a60)) {
            return false;
        }
        a60 a60Var = (a60) obj;
        return fse.a(this.a, a60Var.a) && fse.a(this.b, a60Var.b) && fse.a(this.c, a60Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c}))});
    }

    public final String toString() {
        wm9 wm9Var = new wm9(getClass().getSimpleName(), (byte) 25);
        w8e w8eVar = n9e.d;
        byte[] p = this.a.p();
        wm9Var.B(w8eVar.c(p.length, p), "keyHandle");
        byte[] p2 = this.b.p();
        wm9Var.B(w8eVar.c(p2.length, p2), "clientDataJSON");
        byte[] p3 = this.c.p();
        wm9Var.B(w8eVar.c(p3.length, p3), "attestationObject");
        wm9Var.B(Arrays.toString(this.d), "transports");
        return wm9Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.c(parcel, 2, this.a.p());
        mve.c(parcel, 3, this.b.p());
        mve.c(parcel, 4, this.c.p());
        mve.m(parcel, 5, this.d);
        mve.s(parcel, r);
    }
}
