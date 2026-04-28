package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzia;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* loaded from: classes.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new zzao();
    private final String zza;
    private final String zzb;
    private final zzgx zzc;
    private final AuthenticatorAttestationResponse zzd;
    private final AuthenticatorAssertionResponse zze;
    private final AuthenticatorErrorResponse zzf;
    private final AuthenticationExtensionsClientOutputs zzg;
    private final String zzh;
    private String zzi;

    private PublicKeyCredential(String str, String str2, zzgx zzgxVar, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3, String str4) {
        boolean z = false;
        Preconditions.checkArgument((authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null), "Must provide a response object.");
        if (authenticatorErrorResponse != null || (str != null && zzgxVar != null)) {
            z = true;
        }
        Preconditions.checkArgument(z, "Must provide id and rawId if not an error response.");
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzgxVar;
        this.zzd = authenticatorAttestationResponse;
        this.zze = authenticatorAssertionResponse;
        this.zzf = authenticatorErrorResponse;
        this.zzg = authenticationExtensionsClientOutputs;
        this.zzh = str3;
        this.zzi = null;
    }

    public static PublicKeyCredential deserializeFromBytes(byte[] bArr) {
        return (PublicKeyCredential) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return Objects.equal(this.zza, publicKeyCredential.zza) && Objects.equal(this.zzb, publicKeyCredential.zzb) && Objects.equal(this.zzc, publicKeyCredential.zzc) && Objects.equal(this.zzd, publicKeyCredential.zzd) && Objects.equal(this.zze, publicKeyCredential.zze) && Objects.equal(this.zzf, publicKeyCredential.zzf) && Objects.equal(this.zzg, publicKeyCredential.zzg) && Objects.equal(this.zzh, publicKeyCredential.zzh);
    }

    public String getAuthenticatorAttachment() {
        return this.zzh;
    }

    public AuthenticationExtensionsClientOutputs getClientExtensionResults() {
        return this.zzg;
    }

    public String getId() {
        return this.zza;
    }

    public byte[] getRawId() {
        zzgx zzgxVar = this.zzc;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    public AuthenticatorResponse getResponse() {
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
        if (authenticatorAttestationResponse != null) {
            return authenticatorAttestationResponse;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
        if (authenticatorAssertionResponse != null) {
            return authenticatorAssertionResponse;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
        if (authenticatorErrorResponse != null) {
            return authenticatorErrorResponse;
        }
        throw new IllegalStateException("No response set.");
    }

    public String getType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zze, this.zzd, this.zzf, this.zzg, this.zzh);
    }

    public String toJson() {
        return zza().toString();
    }

    public final String toString() {
        zzgx zzgxVar = this.zzc;
        byte[] zzm = zzgxVar == null ? null : zzgxVar.zzm();
        String str = this.zzb;
        String str2 = this.zza;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
        AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.zzg;
        String str3 = this.zzh;
        return "PublicKeyCredential{\n id='" + str2 + "', \n type='" + str + "', \n rawId=" + Base64Utils.encodeUrlSafeNoPadding(zzm) + ", \n registerResponse=" + String.valueOf(authenticatorAttestationResponse) + ", \n signResponse=" + String.valueOf(authenticatorAssertionResponse) + ", \n errorResponse=" + String.valueOf(authenticatorErrorResponse) + ", \n extensionsClientOutputs=" + String.valueOf(authenticationExtensionsClientOutputs) + ", \n authenticatorAttachment='" + str3 + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (zzia.zzc()) {
            this.zzi = zza().toString();
        }
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getType(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getRawId(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, getClientExtensionResults(), i, false);
        SafeParcelWriter.writeString(parcel, 8, getAuthenticatorAttachment(), false);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        this.zzi = null;
    }

    public final JSONObject zza() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            zzgx zzgxVar = this.zzc;
            if (zzgxVar != null && zzgxVar.zzm().length > 0) {
                jSONObject2.put("rawId", Base64Utils.encodeUrlSafeNoPadding(this.zzc.zzm()));
            }
            String str = this.zzh;
            if (str != null) {
                jSONObject2.put("authenticatorAttachment", str);
            }
            String str2 = this.zzb;
            if (str2 != null && this.zzf == null) {
                jSONObject2.put(TeXSymbolParser.TYPE_ATTR, str2);
            }
            String str3 = this.zza;
            if (str3 != null) {
                jSONObject2.put("id", str3);
            }
            String str4 = "response";
            AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
            boolean z = true;
            if (authenticatorAssertionResponse != null) {
                jSONObject = authenticatorAssertionResponse.zza();
            } else {
                AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
                if (authenticatorAttestationResponse != null) {
                    jSONObject = authenticatorAttestationResponse.zza();
                } else {
                    AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
                    z = false;
                    if (authenticatorErrorResponse != null) {
                        jSONObject = authenticatorErrorResponse.zza();
                        str4 = "error";
                    } else {
                        jSONObject = null;
                    }
                }
            }
            if (jSONObject != null) {
                jSONObject2.put(str4, jSONObject);
            }
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.zzg;
            if (authenticationExtensionsClientOutputs != null) {
                jSONObject2.put("clientExtensionResults", authenticationExtensionsClientOutputs.zza());
            } else if (z) {
                jSONObject2.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject2;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e);
        }
    }

    PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3, String str4) {
        this(str, str2, bArr == null ? null : zzgx.zzl(bArr, 0, bArr.length), authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, str3, str4);
    }
}
