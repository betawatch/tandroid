package com.google.android.gms.wearable;

import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
final class zzq implements Runnable {
    final /* synthetic */ DataHolder zza;
    final /* synthetic */ zzaa zzb;

    zzq(zzaa zzaaVar, DataHolder dataHolder) {
        this.zzb = zzaaVar;
        this.zza = dataHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DataEventBuffer dataEventBuffer = new DataEventBuffer(this.zza);
        try {
            this.zzb.zza.onDataChanged(dataEventBuffer);
        } finally {
            dataEventBuffer.release();
        }
    }
}
