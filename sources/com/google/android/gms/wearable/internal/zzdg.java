package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItemAsset;

/* loaded from: classes.dex */
public final class zzdg extends DataBufferRef implements DataItemAsset {
    public zzdg(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.wearable.DataItemAsset
    public final String getDataItemKey() {
        return getString("asset_key");
    }

    @Override // com.google.android.gms.wearable.DataItemAsset
    public final String getId() {
        return getString("asset_id");
    }
}
