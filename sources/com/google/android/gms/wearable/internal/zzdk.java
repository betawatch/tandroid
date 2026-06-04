package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdk extends DataBufferRef implements DataItem {
    private final int zza;

    public zzdk(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.zza = i2;
    }

    public final Map getAssets() {
        HashMap hashMap = new HashMap(this.zza);
        for (int i = 0; i < this.zza; i++) {
            zzdg zzdgVar = new zzdg(this.mDataHolder, this.mDataRow + i);
            if (zzdgVar.getString("asset_key") != null) {
                hashMap.put(zzdgVar.getString("asset_key"), zzdgVar);
            }
        }
        return hashMap;
    }

    public final Uri getUri() {
        return Uri.parse(getString("path"));
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        byte[] byteArray = getByteArray("data");
        Map assets = getAssets();
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        sb.append("uri=".concat(String.valueOf(getUri())));
        sb.append(", dataSz=".concat((byteArray == null ? "null" : Integer.valueOf(byteArray.length)).toString()));
        sb.append(", numAssets=" + assets.size());
        if (isLoggable && !assets.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry entry : assets.entrySet()) {
                sb.append(str + ((String) entry.getKey()) + ": " + ((DataItemAsset) entry.getValue()).getId());
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }
}
