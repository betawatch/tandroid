package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();
    private final boolean zza;
    private final zzgx zzb;

    public zzh(boolean z, zzgx zzgxVar) {
        this.zza = z;
        this.zzb = zzgxVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.zza == zzhVar.zza && Objects.equal(this.zzb, zzhVar.zzb);
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        return "AuthenticationExtensionsPrfOutputs{" + zza().toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, z);
        SafeParcelWriter.writeByteArray(parcel, 2, zzb(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.zza) {
                jSONObject.put("enabled", true);
            }
            byte[] zzb = zzb();
            if (zzb != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(zzb, 32), 11));
                if (zzb.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(zzb, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
        }
    }

    public final byte[] zzb() {
        zzgx zzgxVar = this.zzb;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }
}
