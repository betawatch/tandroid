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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class c50 extends e50 {
    public static final Parcelable.Creator<c50> CREATOR = new ime((byte) 18);
    public final gfe a;
    public final gfe b;
    public final gfe c;
    public final String[] d;

    public c50(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        xve.h(bArr);
        gfe o = gfe.o(bArr.length, bArr);
        xve.h(bArr2);
        gfe o2 = gfe.o(bArr2.length, bArr2);
        xve.h(bArr3);
        gfe o3 = gfe.o(bArr3.length, bArr3);
        this.a = o;
        this.b = o2;
        this.c = o3;
        xve.h(strArr);
        this.d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0216 A[Catch: JSONException -> 0x0296, TRY_LEAVE, TryCatch #10 {JSONException -> 0x0296, blocks: (B:48:0x0202, B:50:0x0216, B:61:0x0157, B:64:0x0173, B:66:0x0188, B:68:0x018d, B:69:0x01aa, B:70:0x01af, B:71:0x01b0, B:72:0x01b7, B:92:0x0230, B:93:0x0237, B:77:0x01c4, B:79:0x01d1, B:81:0x01de, B:82:0x01f4, B:83:0x01f9, B:84:0x01fa, B:85:0x01ff, B:89:0x0225, B:90:0x022a, B:96:0x0238, B:97:0x0240, B:104:0x0244, B:107:0x0247, B:110:0x0252, B:111:0x0259, B:121:0x025c, B:122:0x0263, B:125:0x0269, B:126:0x0270, B:132:0x0273, B:133:0x027a, B:136:0x0280, B:137:0x0287, B:143:0x028e, B:144:0x0295), top: B:13:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject b() {
        jke jkeVar;
        byte[] bArr;
        String[] strArr = this.d;
        gfe gfeVar = this.c;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", lsd.b(this.b.p()));
            jSONObject.put("attestationObject", lsd.b(gfeVar.p()));
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
                        jke jkeVar2 = (jke) ((uje) jke.d(gfeVar.p()).b(uje.class)).b.get(new yje("authData"));
                        if (jkeVar2 == null) {
                            try {
                                throw new IllegalArgumentException("attestation object missing authData");
                            } catch (zje e) {
                                e = e;
                                throw new IllegalArgumentException("authData value has wrong type", e);
                            }
                        }
                        gfe gfeVar2 = ((uie) jkeVar2.b(uie.class)).a;
                        byte[] bArr2 = gfeVar2.b;
                        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(bArr2, 0, gfeVar2.k()).asReadOnlyBuffer();
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
                                    int n = gfe.n(position, bArr2.length, gfeVar2.k());
                                    yke ykeVar = new yke((n == 0 ? gfe.c : new pee(bArr2, position, n)).m());
                                    try {
                                        jke a = c7f.a(ykeVar);
                                        try {
                                            ykeVar.close();
                                        } catch (IOException unused) {
                                        }
                                        eod eodVar = ((uje) a.b(uje.class)).b;
                                        jke jkeVar3 = (jke) eodVar.get(new lje(3L));
                                        jke jkeVar4 = (jke) eodVar.get(new lje(1L));
                                        if (jkeVar3 == null || jkeVar4 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        try {
                                            long j = ((lje) jkeVar3.b(lje.class)).a;
                                            long j2 = ((lje) jkeVar4.b(lje.class)).a;
                                            try {
                                                if (j2 != 1) {
                                                    if (j2 != 2) {
                                                        bArr = null;
                                                        jSONObject.put("authenticatorData", lsd.b(gfeVar2.p()));
                                                        jSONObject.put("publicKeyAlgorithm", j);
                                                        if (bArr != null) {
                                                            jSONObject.put("publicKey", Base64.encodeToString(bArr, 11));
                                                        }
                                                        return jSONObject;
                                                    }
                                                    j2 = 2;
                                                }
                                                if (jkeVar == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                long j3 = ((lje) jkeVar.b(lje.class)).a;
                                                if (j2 == 2 && j3 == 1) {
                                                    jke jkeVar5 = (jke) eodVar.get(new lje(-2L));
                                                    jke jkeVar6 = (jke) eodVar.get(new lje(-3L));
                                                    if (jkeVar5 == null || jkeVar6 == null) {
                                                        throw new IllegalArgumentException("COSE key missing required fields");
                                                    }
                                                    gfe gfeVar3 = ((uie) jkeVar5.b(uie.class)).a;
                                                    gfe gfeVar4 = ((uie) jkeVar6.b(uie.class)).a;
                                                    if (gfeVar3.b.length != 32 || gfeVar4.b.length != 32) {
                                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                    }
                                                    bArr = u6f.a(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), gfeVar3.p(), gfeVar4.p());
                                                } else if (j2 == 1 && j3 == 6) {
                                                    jke jkeVar7 = (jke) eodVar.get(new lje(-2L));
                                                    if (jkeVar7 == null) {
                                                        throw new IllegalArgumentException("COSE key missing required fields");
                                                    }
                                                    gfe gfeVar5 = ((uie) jkeVar7.b(uie.class)).a;
                                                    if (gfeVar5.b.length != 32) {
                                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                    }
                                                    bArr = u6f.a(Base64.decode("MCowBQYDK2VwAyEA", 0), gfeVar5.p());
                                                } else {
                                                    bArr = null;
                                                }
                                                jSONObject.put("authenticatorData", lsd.b(gfeVar2.p()));
                                                jSONObject.put("publicKeyAlgorithm", j);
                                                if (bArr != null) {
                                                }
                                                return jSONObject;
                                            } catch (zje e3) {
                                                e = e3;
                                                throw new IllegalArgumentException("COSE key ill-formed", e);
                                            }
                                            jkeVar = (jke) eodVar.get(new lje(-1L));
                                        } catch (zje e4) {
                                            e = e4;
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            try {
                                                ykeVar.close();
                                            } catch (zje e5) {
                                                e = e5;
                                                throw new IllegalArgumentException("failed to parse COSE key", e);
                                            }
                                        } catch (IOException unused2) {
                                        }
                                        try {
                                            throw th;
                                        } catch (gje e6) {
                                            e = e6;
                                            throw new IllegalArgumentException("failed to parse COSE key", e);
                                        }
                                    }
                                } catch (zje e7) {
                                    e = e7;
                                    throw new IllegalArgumentException("failed to parse COSE key", e);
                                }
                            } catch (gje e8) {
                                e = e8;
                                throw new IllegalArgumentException("failed to parse COSE key", e);
                            }
                        } catch (IllegalArgumentException e9) {
                            e = e9;
                        }
                    } catch (zje e10) {
                        e = e10;
                    }
                } catch (gje e11) {
                    e = e11;
                    throw new IllegalArgumentException("failed to parse attestation object", e);
                } catch (zje e12) {
                    e = e12;
                    throw new IllegalArgumentException("failed to parse attestation object", e);
                }
            } catch (JSONException e13) {
                e = e13;
                grb.j("Error encoding AuthenticatorAttestationResponse to JSON object", e);
                return null;
            }
        } catch (JSONException e14) {
            e = e14;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c50)) {
            return false;
        }
        c50 c50Var = (c50) obj;
        return vue.a(this.a, c50Var.a) && vue.a(this.b, c50Var.b) && vue.a(this.c, c50Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c}))});
    }

    public final String toString() {
        ko9 ko9Var = new ko9(getClass().getSimpleName(), (byte) 25);
        lbe lbeVar = cce.d;
        byte[] p = this.a.p();
        ko9Var.B(lbeVar.c(p.length, p), "keyHandle");
        byte[] p2 = this.b.p();
        ko9Var.B(lbeVar.c(p2.length, p2), "clientDataJSON");
        byte[] p3 = this.c.p();
        ko9Var.B(lbeVar.c(p3.length, p3), "attestationObject");
        ko9Var.B(Arrays.toString(this.d), "transports");
        return ko9Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.c(parcel, 2, this.a.p());
        bye.c(parcel, 3, this.b.p());
        bye.c(parcel, 4, this.c.p());
        bye.m(parcel, 5, this.d);
        bye.s(parcel, r);
    }
}
