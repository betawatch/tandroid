package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes.dex */
public final class zzi implements SessionManagerListener {
    final /* synthetic */ zzk zza;

    public zzi(zzk zzkVar) {
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionEnded(Session session, int i) {
        this.zza.zzi = (CastSession) session;
        zzk.zzm(this.zza, i);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* synthetic */ void onSessionEnding(Session session) {
        this.zza.zzi = (CastSession) session;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResumeFailed(Session session, int i) {
        this.zza.zzi = (CastSession) session;
        zzk.zzm(this.zza, i);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResumed(Session session, boolean z) {
        Logger logger;
        zzl zzlVar;
        zzm zzmVar;
        zzl zzlVar2;
        zzg zzgVar;
        logger = zzk.zza;
        logger.d("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z));
        this.zza.zzi = (CastSession) session;
        this.zza.zzs();
        zzlVar = this.zza.zzh;
        Preconditions.checkNotNull(zzlVar);
        zzk zzkVar = this.zza;
        zzmVar = zzkVar.zzd;
        zzlVar2 = zzkVar.zzh;
        zzno zzb = zzmVar.zzb(zzlVar2, z);
        zzgVar = this.zza.zzb;
        zzgVar.zze(zzb, NotificationCenter.webViewResolved);
        r5.zzh.zzc(this.zza.zzg);
        this.zza.zzu();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResuming(Session session, String str) {
        Logger logger;
        SharedPreferences sharedPreferences;
        zzl zzlVar;
        zzm zzmVar;
        zzl zzlVar2;
        zzg zzgVar;
        logger = zzk.zza;
        logger.d("onSessionResuming with sessionId = %s", str);
        this.zza.zzi = (CastSession) session;
        zzk zzkVar = this.zza;
        sharedPreferences = zzkVar.zzg;
        zzk.zzn(zzkVar, sharedPreferences, str);
        zzlVar = this.zza.zzh;
        Preconditions.checkNotNull(zzlVar);
        zzk zzkVar2 = this.zza;
        zzmVar = zzkVar2.zzd;
        zzlVar2 = zzkVar2.zzh;
        zzno zzc = zzmVar.zzc(zzlVar2);
        zzgVar = this.zza.zzb;
        zzgVar.zze(zzc, NotificationCenter.channelStarsUpdated);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStartFailed(Session session, int i) {
        this.zza.zzi = (CastSession) session;
        zzk.zzm(this.zza, i);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStarted(Session session, String str) {
        Logger logger;
        zzl zzlVar;
        zzm zzmVar;
        zzl zzlVar2;
        zzg zzgVar;
        logger = zzk.zza;
        logger.d("onSessionStarted with sessionId = %s", str);
        this.zza.zzi = (CastSession) session;
        this.zza.zzs();
        zzk zzkVar = this.zza;
        zzlVar = zzkVar.zzh;
        zzlVar.zzf = str;
        zzmVar = zzkVar.zzd;
        zzlVar2 = zzkVar.zzh;
        zzno zza = zzmVar.zza(zzlVar2);
        zzgVar = this.zza.zzb;
        zzgVar.zze(zza, NotificationCenter.starSubscriptionsLoaded);
        r4.zzh.zzc(this.zza.zzg);
        this.zza.zzu();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStarting(Session session) {
        Logger logger;
        zzl zzlVar;
        zzm zzmVar;
        zzl zzlVar2;
        zzg zzgVar;
        Logger logger2;
        logger = zzk.zza;
        logger.d("onSessionStarting", new Object[0]);
        this.zza.zzi = (CastSession) session;
        zzlVar = this.zza.zzh;
        if (zzlVar != null) {
            logger2 = zzk.zza;
            logger2.w("Start a session while there's already an active session. Create a new one.", new Object[0]);
        }
        this.zza.zzt();
        zzk zzkVar = this.zza;
        zzmVar = zzkVar.zzd;
        zzlVar2 = zzkVar.zzh;
        zzno zzd = zzmVar.zzd(zzlVar2);
        zzgVar = this.zza.zzb;
        zzgVar.zze(zzd, NotificationCenter.starTransactionsLoaded);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionSuspended(Session session, int i) {
        Logger logger;
        zzl zzlVar;
        zzm zzmVar;
        zzl zzlVar2;
        zzg zzgVar;
        logger = zzk.zza;
        logger.d("onSessionSuspended with reason = %d", Integer.valueOf(i));
        this.zza.zzi = (CastSession) session;
        this.zza.zzs();
        zzlVar = this.zza.zzh;
        Preconditions.checkNotNull(zzlVar);
        zzk zzkVar = this.zza;
        zzmVar = zzkVar.zzd;
        zzlVar2 = zzkVar.zzh;
        zzno zze = zzmVar.zze(zzlVar2, i);
        zzgVar = this.zza.zzb;
        zzgVar.zze(zze, NotificationCenter.botStarsTransactionsLoaded);
        r5.zzh.zzc(this.zza.zzg);
        this.zza.zzr();
    }
}
