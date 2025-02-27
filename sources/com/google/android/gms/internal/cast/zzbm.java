package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.cast.internal.Logger;

/* loaded from: classes.dex */
final class zzbm implements SessionManagerListener {
    final /* synthetic */ zzbn zza;

    /* synthetic */ zzbm(zzbn zzbnVar, zzbl zzblVar) {
        this.zza = zzbnVar;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionEnded(Session session, int i) {
        Logger logger;
        int i2;
        logger = zzbn.zza;
        logger.d("onSessionEnded with error = %d", Integer.valueOf(i));
        zzbn.zzg(this.zza);
        zzbn zzbnVar = this.zza;
        i2 = zzbnVar.zzf;
        if (i2 == 2) {
            return;
        }
        zzbnVar.zzq();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionEnding(Session session) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResumeFailed(Session session, int i) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResumed(Session session, boolean z) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResuming(Session session, String str) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStartFailed(Session session, int i) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStarted(Session session, String str) {
        Logger logger;
        int i;
        CastOptions castOptions;
        int i2;
        logger = zzbn.zza;
        i = this.zza.zzf;
        logger.d("onSessionStarted with transferType = %d", Integer.valueOf(i));
        castOptions = this.zza.zzb;
        if (castOptions.zzg()) {
            zzbn zzbnVar = this.zza;
            i2 = zzbnVar.zzf;
            if (i2 == 2) {
                zzbn.zzi(zzbnVar);
            }
        }
        this.zza.zzq();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStarting(Session session) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionSuspended(Session session, int i) {
    }
}
