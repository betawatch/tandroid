package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdi extends AbstractSafeParcelable implements DataItem {
    public static final Parcelable.Creator<zzdi> CREATOR = new zzdj();
    private final Uri zza;
    private final Map zzb;
    private byte[] zzc;

    zzdi(Uri uri, Bundle bundle, byte[] bArr) {
        this.zza = uri;
        HashMap hashMap = new HashMap();
        bundle.setClassLoader((ClassLoader) Preconditions.checkNotNull(DataItemAssetParcelable.class.getClassLoader()));
        for (String str : bundle.keySet()) {
            hashMap.put(str, (DataItemAssetParcelable) Preconditions.checkNotNull(bundle.getParcelable(str)));
        }
        this.zzb = hashMap;
        this.zzc = bArr;
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.zzc;
        sb.append(",dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        sb.append(", numAssets=" + this.zzb.size());
        sb.append(", uri=".concat(String.valueOf(this.zza)));
        if (!isLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : this.zzb.keySet()) {
            sb.append("\n    " + str + ": " + String.valueOf(this.zzb.get(str)));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        Bundle bundle = new Bundle();
        bundle.setClassLoader((ClassLoader) Preconditions.checkNotNull(DataItemAssetParcelable.class.getClassLoader()));
        for (Map.Entry entry : this.zzb.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((DataItemAsset) entry.getValue()));
        }
        SafeParcelWriter.writeBundle(parcel, 4, bundle, false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
