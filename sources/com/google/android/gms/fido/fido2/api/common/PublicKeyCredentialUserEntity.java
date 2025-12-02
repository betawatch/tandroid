package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;

/* loaded from: classes.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new zzau();
    private final zzgx zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    public PublicKeyCredentialUserEntity(zzgx zzgxVar, String str, String str2, String str3) {
        this.zza = (zzgx) Preconditions.checkNotNull(zzgxVar);
        this.zzb = (String) Preconditions.checkNotNull(str);
        this.zzc = str2;
        this.zzd = (String) Preconditions.checkNotNull(str3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return Objects.equal(this.zza, publicKeyCredentialUserEntity.zza) && Objects.equal(this.zzb, publicKeyCredentialUserEntity.zzb) && Objects.equal(this.zzc, publicKeyCredentialUserEntity.zzc) && Objects.equal(this.zzd, publicKeyCredentialUserEntity.zzd);
    }

    public String getDisplayName() {
        return this.zzd;
    }

    public String getIcon() {
        return this.zzc;
    }

    public byte[] getId() {
        return this.zza.zzm();
    }

    public String getName() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        return "PublicKeyCredentialUserEntity{\n id=" + Base64Utils.encodeUrlSafeNoPadding(this.zza.zzm()) + ", \n name='" + this.zzb + "', \n icon='" + this.zzc + "', \n displayName='" + this.zzd + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getName(), false);
        SafeParcelWriter.writeString(parcel, 4, getIcon(), false);
        SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PublicKeyCredentialUserEntity(byte[] bArr, String str, String str2, String str3) {
        this(zzgx.zzl(r3, 0, r3.length), str, str2, str3);
        byte[] bArr2 = (byte[]) Preconditions.checkNotNull(bArr);
        zzgx zzgxVar = zzgx.zzb;
    }
}
