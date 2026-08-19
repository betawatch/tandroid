package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgx;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new zzj();
    private final zzgx zza;
    private final zzgx zzb;
    private final zzgx zzc;
    private final zzgx zzd;
    private final zzgx zze;

    AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = (byte[]) Preconditions.checkNotNull(bArr);
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzl = zzgx.zzl(bArr6, 0, bArr6.length);
        byte[] bArr7 = (byte[]) Preconditions.checkNotNull(bArr2);
        zzgx zzl2 = zzgx.zzl(bArr7, 0, bArr7.length);
        byte[] bArr8 = (byte[]) Preconditions.checkNotNull(bArr3);
        zzgx zzl3 = zzgx.zzl(bArr8, 0, bArr8.length);
        byte[] bArr9 = (byte[]) Preconditions.checkNotNull(bArr4);
        zzgx zzl4 = zzgx.zzl(bArr9, 0, bArr9.length);
        zzgx zzl5 = bArr5 == null ? null : zzgx.zzl(bArr5, 0, bArr5.length);
        this.zza = (zzgx) Preconditions.checkNotNull(zzl);
        this.zzb = (zzgx) Preconditions.checkNotNull(zzl2);
        this.zzc = (zzgx) Preconditions.checkNotNull(zzl3);
        this.zzd = (zzgx) Preconditions.checkNotNull(zzl4);
        this.zze = zzl5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return Objects.equal(this.zza, authenticatorAssertionResponse.zza) && Objects.equal(this.zzb, authenticatorAssertionResponse.zzb) && Objects.equal(this.zzc, authenticatorAssertionResponse.zzc) && Objects.equal(this.zzd, authenticatorAssertionResponse.zzd) && Objects.equal(this.zze, authenticatorAssertionResponse.zze);
    }

    public byte[] getAuthenticatorData() {
        return this.zzc.zzm();
    }

    public byte[] getClientDataJSON() {
        return this.zzb.zzm();
    }

    public byte[] getKeyHandle() {
        return this.zza.zzm();
    }

    public byte[] getSignature() {
        return this.zzd.zzm();
    }

    public byte[] getUserHandle() {
        zzgx zzgxVar = this.zze;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Objects.hashCode(this.zza)), Integer.valueOf(Objects.hashCode(this.zzb)), Integer.valueOf(Objects.hashCode(this.zzc)), Integer.valueOf(Objects.hashCode(this.zzd)), Integer.valueOf(Objects.hashCode(this.zze)));
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
        byte[] authenticatorData = getAuthenticatorData();
        zza.zzb("authenticatorData", zzf3.zzg(authenticatorData, 0, authenticatorData.length));
        zzgf zzf4 = zzgf.zzf();
        byte[] signature = getSignature();
        zza.zzb("signature", zzf4.zzg(signature, 0, signature.length));
        byte[] userHandle = getUserHandle();
        if (userHandle != null) {
            zza.zzb("userHandle", zzgf.zzf().zzg(userHandle, 0, userHandle.length));
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getClientDataJSON(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getAuthenticatorData(), false);
        SafeParcelWriter.writeByteArray(parcel, 5, getSignature(), false);
        SafeParcelWriter.writeByteArray(parcel, 6, getUserHandle(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", Base64Utils.encodeUrlSafeNoPadding(getClientDataJSON()));
            jSONObject.put("authenticatorData", Base64Utils.encodeUrlSafeNoPadding(getAuthenticatorData()));
            jSONObject.put("signature", Base64Utils.encodeUrlSafeNoPadding(getSignature()));
            if (this.zze == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", Base64Utils.encodeUrlSafeNoPadding(getUserHandle()));
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e);
        }
    }
}
