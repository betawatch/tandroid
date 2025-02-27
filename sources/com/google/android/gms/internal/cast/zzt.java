package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzt implements SessionManagerListener {
    final /* synthetic */ zzv zza;

    public zzt(zzv zzvVar) {
        this.zza = zzvVar;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionEnded(Session session, int i) {
        zzaf zzafVar;
        zzy zzyVar = new zzy(9);
        zzyVar.zzb(Integer.valueOf(i));
        zzafVar = this.zza.zzb;
        zzyVar.zza(Boolean.valueOf(zzafVar.zze()));
        zzv.zzf(this.zza, new zzz(zzyVar));
        this.zza.zzh();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionEnding(Session session) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResumeFailed(Session session, int i) {
        zzy zzyVar = new zzy(8);
        zzyVar.zzb(Integer.valueOf(i));
        zzv.zzf(this.zza, new zzz(zzyVar));
        this.zza.zzh();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResumed(Session session, boolean z) {
        zzx zzxVar;
        zzv.zzf(this.zza, new zzz(new zzy(4)));
        zzxVar = this.zza.zzd;
        ((zzx) Preconditions.checkNotNull(zzxVar)).zzf((CastSession) session);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResuming(Session session, String str) {
        zzx zzxVar;
        zzx zzxVar2;
        zzv.zzf(this.zza, new zzz(new zzy(7)));
        zzxVar = this.zza.zzd;
        ((zzx) Preconditions.checkNotNull(zzxVar)).zzf((CastSession) session);
        zzxVar2 = this.zza.zzd;
        ((zzx) Preconditions.checkNotNull(zzxVar2)).zzg(str);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStartFailed(Session session, int i) {
        zzy zzyVar = new zzy(5);
        zzyVar.zzb(Integer.valueOf(i));
        zzv.zzf(this.zza, new zzz(zzyVar));
        this.zza.zzh();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStarted(Session session, String str) {
        zzx zzxVar;
        zzx zzxVar2;
        zzv.zzf(this.zza, new zzz(new zzy(4)));
        zzxVar = this.zza.zzd;
        ((zzx) Preconditions.checkNotNull(zzxVar)).zzf((CastSession) session);
        zzxVar2 = this.zza.zzd;
        ((zzx) Preconditions.checkNotNull(zzxVar2)).zzg(str);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStarting(Session session) {
        zzaf zzafVar;
        zzx zzxVar;
        zzs zzsVar;
        CastSession castSession = (CastSession) session;
        zzy zzyVar = new zzy(2);
        zzafVar = this.zza.zzb;
        zzyVar.zza(Boolean.valueOf(zzafVar.zze()));
        zzv.zzf(this.zza, new zzz(zzyVar));
        zzxVar = this.zza.zzd;
        ((zzx) Preconditions.checkNotNull(zzxVar)).zzf(castSession);
        zzsVar = this.zza.zze;
        castSession.zzj(zzsVar);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionSuspended(Session session, int i) {
        zzx zzxVar;
        zzy zzyVar = new zzy(6);
        zzyVar.zzb(Integer.valueOf(i));
        zzv.zzf(this.zza, new zzz(zzyVar));
        zzxVar = this.zza.zzd;
        ((zzx) Preconditions.checkNotNull(zzxVar)).zzf((CastSession) session);
    }
}
