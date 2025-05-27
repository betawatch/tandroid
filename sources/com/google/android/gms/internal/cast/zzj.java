package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.SessionState;
import com.google.android.gms.cast.framework.SessionTransferCallback;
import com.google.android.gms.cast.internal.Logger;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes.dex */
public final class zzj extends SessionTransferCallback {
    final /* synthetic */ zzk zza;

    public zzj(zzk zzkVar) {
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.cast.framework.SessionTransferCallback
    public final void onTransferFailed(int i, int i2) {
        Logger logger;
        zzm zzmVar;
        zzl zzlVar;
        zzg zzgVar;
        logger = zzk.zza;
        logger.d("onTransferFailed with type = %d and reason = %d", Integer.valueOf(i), Integer.valueOf(i2));
        this.zza.zzs();
        zzk zzkVar = this.zza;
        zzmVar = zzkVar.zzd;
        zzlVar = zzkVar.zzh;
        zzno zzf = zzmVar.zzf(zzlVar, i, i2);
        zzgVar = this.zza.zzb;
        zzgVar.zze(zzf, NotificationCenter.appConfigUpdated);
        this.zza.zzj = false;
    }

    @Override // com.google.android.gms.cast.framework.SessionTransferCallback
    public final void onTransferred(int i, SessionState sessionState) {
        Logger logger;
        zzm zzmVar;
        zzl zzlVar;
        zzg zzgVar;
        logger = zzk.zza;
        logger.d("onTransferred with type = %d", Integer.valueOf(i));
        this.zza.zzs();
        zzk zzkVar = this.zza;
        zzmVar = zzkVar.zzd;
        zzlVar = zzkVar.zzh;
        zzno zzg = zzmVar.zzg(zzlVar, i);
        zzgVar = this.zza.zzb;
        zzgVar.zze(zzg, NotificationCenter.commonChatsLoaded);
        this.zza.zzj = false;
        this.zza.zzh = null;
    }

    @Override // com.google.android.gms.cast.framework.SessionTransferCallback
    public final void onTransferring(int i) {
        Logger logger;
        zzm zzmVar;
        zzl zzlVar;
        zzg zzgVar;
        logger = zzk.zza;
        logger.d("onTransferring with type = %d", Integer.valueOf(i));
        this.zza.zzj = true;
        this.zza.zzs();
        zzk zzkVar = this.zza;
        zzmVar = zzkVar.zzd;
        zzlVar = zzkVar.zzh;
        zzno zzg = zzmVar.zzg(zzlVar, i);
        zzgVar = this.zza.zzb;
        zzgVar.zze(zzg, NotificationCenter.messagesFeeUpdated);
    }
}
