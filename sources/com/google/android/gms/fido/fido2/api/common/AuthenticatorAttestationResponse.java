package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgj;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.fido.zzhm;
import com.google.android.gms.internal.fido.zzho;
import com.google.android.gms.internal.fido.zzhp;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new zzk();
    private final zzgx zza;
    private final zzgx zzb;
    private final zzgx zzc;
    private final String[] zzd;

    AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        byte[] bArr4 = (byte[]) Preconditions.checkNotNull(bArr);
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzl = zzgx.zzl(bArr4, 0, bArr4.length);
        byte[] bArr5 = (byte[]) Preconditions.checkNotNull(bArr2);
        zzgx zzl2 = zzgx.zzl(bArr5, 0, bArr5.length);
        byte[] bArr6 = (byte[]) Preconditions.checkNotNull(bArr3);
        zzgx zzl3 = zzgx.zzl(bArr6, 0, bArr6.length);
        this.zza = (zzgx) Preconditions.checkNotNull(zzl);
        this.zzb = (zzgx) Preconditions.checkNotNull(zzl2);
        this.zzc = (zzgx) Preconditions.checkNotNull(zzl3);
        this.zzd = (String[]) Preconditions.checkNotNull(strArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return Objects.equal(this.zza, authenticatorAttestationResponse.zza) && Objects.equal(this.zzb, authenticatorAttestationResponse.zzb) && Objects.equal(this.zzc, authenticatorAttestationResponse.zzc);
    }

    public byte[] getAttestationObject() {
        return this.zzc.zzm();
    }

    public byte[] getClientDataJSON() {
        return this.zzb.zzm();
    }

    public byte[] getKeyHandle() {
        return this.zza.zzm();
    }

    public String[] getTransports() {
        return this.zzd;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Objects.hashCode(this.zza)), Integer.valueOf(Objects.hashCode(this.zzb)), Integer.valueOf(Objects.hashCode(this.zzc)));
    }

    public String toString() {
        zzbi zza = zzbj.zza(this);
        zzgf zzf = zzgf.zzf();
        byte[] keyHandle = getKeyHandle();
        zza.zzb("keyHandle", zzf.zzg(keyHandle, 0, keyHandle.length));
        zzgf zzf2 = zzgf.zzf();
        byte[] clientDataJSON = getClientDataJSON();
        zza.zzb("clientDataJSON", zzf2.zzg(clientDataJSON, 0, clientDataJSON.length));
        zzgf zzf3 = zzgf.zzf();
        byte[] attestationObject = getAttestationObject();
        zza.zzb("attestationObject", zzf3.zzg(attestationObject, 0, attestationObject.length));
        zza.zzb("transports", Arrays.toString(this.zzd));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getClientDataJSON(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getAttestationObject(), false);
        SafeParcelWriter.writeStringArray(parcel, 5, getTransports(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0200 A[Catch: JSONException -> 0x001c, TRY_LEAVE, TryCatch #5 {JSONException -> 0x001c, blocks: (B:3:0x0005, B:5:0x000e, B:6:0x001f, B:8:0x0023, B:9:0x0030, B:10:0x0036, B:12:0x003b, B:14:0x0049, B:16:0x0056, B:17:0x004f, B:20:0x0058, B:22:0x0061, B:24:0x0069, B:26:0x007b, B:27:0x0083, B:29:0x0087, B:31:0x0099, B:33:0x00b7, B:34:0x00cf, B:39:0x00f5, B:44:0x01ec, B:46:0x0200, B:49:0x0112, B:51:0x0126, B:56:0x013a, B:59:0x015c, B:61:0x0172, B:63:0x0178, B:64:0x0197, B:65:0x019c, B:66:0x019d, B:67:0x01a2, B:72:0x01ad, B:74:0x01bd, B:76:0x01cb, B:77:0x01e0, B:78:0x01e5, B:79:0x01e6, B:80:0x01eb, B:81:0x020a, B:82:0x020f, B:85:0x0210, B:86:0x0217, B:87:0x0218, B:88:0x021d, B:92:0x0221, B:93:0x0228, B:95:0x022b, B:96:0x0232, B:98:0x0233, B:99:0x023a, B:100:0x023d, B:101:0x0244, B:103:0x0245, B:104:0x024c, B:108:0x0250, B:109:0x0257), top: B:2:0x0005, inners: #4, #6, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.zzb != null) {
                jSONObject.put("clientDataJSON", Base64Utils.encodeUrlSafeNoPadding(getClientDataJSON()));
            }
            if (this.zzc != null) {
                jSONObject.put("attestationObject", Base64Utils.encodeUrlSafeNoPadding(getAttestationObject()));
            }
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            while (true) {
                String[] strArr = this.zzd;
                if (i >= strArr.length) {
                    break;
                }
                if (strArr[i].equals(Transport.HYBRID.toString())) {
                    jSONArray.put(i, "hybrid");
                } else {
                    jSONArray.put(i, this.zzd[i]);
                }
                i++;
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    zzhp zzhpVar = (zzhp) zzhp.zzj(getAttestationObject()).zzh().zzc().get(zzhp.zzi("authData"));
                    if (zzhpVar == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    zzgx zzc = zzhpVar.zze().zzc();
                    ByteBuffer zzi = zzc.zzi();
                    try {
                        zzi.position(zzi.position() + 32);
                        if ((zzi.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        zzi.position(zzi.position() + 4);
                        zzi.position(zzi.position() + 16);
                        zzi.position(zzi.position() + zzi.getShort());
                        try {
                            zzhm zzh = zzhp.zzk(zzc.zzg(zzi.position(), zzc.zzd()).zzh()).zzh();
                            zzhp zzhpVar2 = (zzhp) zzh.zzc().get(zzhp.zzg(3L));
                            zzhp zzhpVar3 = (zzhp) zzh.zzc().get(zzhp.zzg(1L));
                            if (zzhpVar2 == null || zzhpVar3 == null) {
                                throw new IllegalArgumentException("COSE key missing required fields");
                            }
                            try {
                                long zzc2 = zzhpVar2.zzf().zzc();
                                long zzc3 = zzhpVar3.zzf().zzc();
                                byte[] bArr = null;
                                if (zzc3 != 1) {
                                    if (zzc3 == 2) {
                                        zzc3 = 2;
                                    }
                                    jSONObject.put("authenticatorData", Base64Utils.encodeUrlSafeNoPadding(zzc.zzm()));
                                    jSONObject.put("publicKeyAlgorithm", zzc2);
                                    if (bArr != null) {
                                        jSONObject.put("publicKey", Base64Utils.encodeUrlSafeNoPadding(bArr));
                                    }
                                    return jSONObject;
                                }
                                zzhp zzhpVar4 = (zzhp) zzh.zzc().get(zzhp.zzg(-1L));
                                if (zzhpVar4 == null) {
                                    throw new IllegalArgumentException("COSE key missing required fields");
                                }
                                long zzc4 = zzhpVar4.zzf().zzc();
                                if (zzc3 == 2 && zzc4 == 1) {
                                    zzhp zzhpVar5 = (zzhp) zzh.zzc().get(zzhp.zzg(-2L));
                                    zzhp zzhpVar6 = (zzhp) zzh.zzc().get(zzhp.zzg(-3L));
                                    if (zzhpVar5 == null || zzhpVar6 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    zzgx zzc5 = zzhpVar5.zze().zzc();
                                    zzgx zzc6 = zzhpVar6.zze().zzc();
                                    if (zzc5.zzd() != 32 || zzc6.zzd() != 32) {
                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                    }
                                    bArr = zzgj.zza(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), zzc5.zzm(), zzc6.zzm());
                                } else if (zzc3 == 1 && zzc4 == 6) {
                                    zzhp zzhpVar7 = (zzhp) zzh.zzc().get(zzhp.zzg(-2L));
                                    if (zzhpVar7 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    zzgx zzc7 = zzhpVar7.zze().zzc();
                                    if (zzc7.zzd() != 32) {
                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                    }
                                    bArr = zzgj.zza(Base64.decode("MCowBQYDK2VwAyEA", 0), zzc7.zzm());
                                }
                                jSONObject.put("authenticatorData", Base64Utils.encodeUrlSafeNoPadding(zzc.zzm()));
                                jSONObject.put("publicKeyAlgorithm", zzc2);
                                if (bArr != null) {
                                }
                                return jSONObject;
                            } catch (zzho e) {
                                throw new IllegalArgumentException("COSE key ill-formed", e);
                            }
                        } catch (zzhj e2) {
                            e = e2;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        } catch (zzho e3) {
                            e = e3;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e4) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e4);
                    }
                } catch (zzho e5) {
                    throw new IllegalArgumentException("authData value has wrong type", e5);
                }
            } catch (zzhj e6) {
                e = e6;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (zzho e7) {
                e = e7;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e8) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e8);
        }
    }
}
