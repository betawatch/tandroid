package com.google.android.gms.internal.play_billing;

import org.telegram.tgnet.ConnectionsManager;

/* loaded from: classes.dex */
final class zzgl extends zzgn {
    private int zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzgl(byte[] bArr, int i, int i2, boolean z, zzgm zzgmVar) {
        super(null);
        this.zzd = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.zzb = 0;
    }

    public final int zza(int i) {
        int i2 = this.zzd;
        this.zzd = 0;
        int i3 = this.zzb + this.zzc;
        this.zzb = i3;
        if (i3 > 0) {
            this.zzc = i3;
            this.zzb = 0;
        } else {
            this.zzc = 0;
        }
        return i2;
    }
}
