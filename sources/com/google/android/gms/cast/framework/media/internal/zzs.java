package com.google.android.gms.cast.framework.media.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.Logger;

/* loaded from: classes.dex */
final class zzs extends MediaSessionCompat.Callback {
    final /* synthetic */ zzv zza;

    zzs(zzv zzvVar) {
        this.zza = zzvVar;
    }

    private final void zza(long j) {
        RemoteMediaClient remoteMediaClient;
        remoteMediaClient = this.zza.zzp;
        if (remoteMediaClient == null) {
            return;
        }
        zzb(Math.min(remoteMediaClient.getStreamDuration(), Math.max(0L, remoteMediaClient.getApproximateStreamPosition() + j)));
    }

    private final void zzb(long j) {
        RemoteMediaClient remoteMediaClient;
        remoteMediaClient = this.zza.zzp;
        if (remoteMediaClient == null) {
            return;
        }
        MediaSeekOptions.Builder builder = new MediaSeekOptions.Builder();
        builder.setPosition(j);
        remoteMediaClient.seek(builder.build());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        Logger logger;
        char c;
        NotificationOptions notificationOptions;
        NotificationOptions notificationOptions2;
        SessionManager sessionManager;
        SessionManager sessionManager2;
        SessionManager sessionManager3;
        SessionManager sessionManager4;
        ComponentName componentName;
        Context context;
        logger = zzv.zzb;
        logger.d("onCustomAction with action = %s", str);
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            notificationOptions = this.zza.zzg;
            zza(notificationOptions.getSkipStepMs());
            return;
        }
        if (c == 1) {
            notificationOptions2 = this.zza.zzg;
            zza(-notificationOptions2.getSkipStepMs());
            return;
        }
        if (c == 2) {
            zzv zzvVar = this.zza;
            sessionManager = zzvVar.zzf;
            if (sessionManager != null) {
                sessionManager2 = zzvVar.zzf;
                sessionManager2.endCurrentSession(true);
                return;
            }
            return;
        }
        if (c != 3) {
            Intent intent = new Intent(str);
            componentName = this.zza.zzi;
            intent.setComponent(componentName);
            context = this.zza.zzc;
            context.sendBroadcast(intent);
            return;
        }
        zzv zzvVar2 = this.zza;
        sessionManager3 = zzvVar2.zzf;
        if (sessionManager3 != null) {
            sessionManager4 = zzvVar2.zzf;
            sessionManager4.endCurrentSession(false);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        Logger logger;
        RemoteMediaClient remoteMediaClient;
        RemoteMediaClient remoteMediaClient2;
        logger = zzv.zzb;
        logger.d("onMediaButtonEvent", new Object[0]);
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if (keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) {
            return true;
        }
        zzv zzvVar = this.zza;
        remoteMediaClient = zzvVar.zzp;
        if (remoteMediaClient == null) {
            return true;
        }
        remoteMediaClient2 = zzvVar.zzp;
        remoteMediaClient2.togglePlayback();
        return true;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPause() {
        Logger logger;
        RemoteMediaClient remoteMediaClient;
        RemoteMediaClient remoteMediaClient2;
        logger = zzv.zzb;
        logger.d("onPause", new Object[0]);
        zzv zzvVar = this.zza;
        remoteMediaClient = zzvVar.zzp;
        if (remoteMediaClient != null) {
            remoteMediaClient2 = zzvVar.zzp;
            remoteMediaClient2.togglePlayback();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlay() {
        Logger logger;
        RemoteMediaClient remoteMediaClient;
        RemoteMediaClient remoteMediaClient2;
        logger = zzv.zzb;
        logger.d("onPlay", new Object[0]);
        zzv zzvVar = this.zza;
        remoteMediaClient = zzvVar.zzp;
        if (remoteMediaClient != null) {
            remoteMediaClient2 = zzvVar.zzp;
            remoteMediaClient2.togglePlayback();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSeekTo(long j) {
        Logger logger;
        logger = zzv.zzb;
        logger.d("onSeekTo %d", Long.valueOf(j));
        zzb(j);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToNext() {
        Logger logger;
        RemoteMediaClient remoteMediaClient;
        RemoteMediaClient remoteMediaClient2;
        logger = zzv.zzb;
        logger.d("onSkipToNext", new Object[0]);
        zzv zzvVar = this.zza;
        remoteMediaClient = zzvVar.zzp;
        if (remoteMediaClient != null) {
            remoteMediaClient2 = zzvVar.zzp;
            remoteMediaClient2.queueNext(null);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToPrevious() {
        Logger logger;
        RemoteMediaClient remoteMediaClient;
        RemoteMediaClient remoteMediaClient2;
        logger = zzv.zzb;
        logger.d("onSkipToPrevious", new Object[0]);
        zzv zzvVar = this.zza;
        remoteMediaClient = zzvVar.zzp;
        if (remoteMediaClient != null) {
            remoteMediaClient2 = zzvVar.zzp;
            remoteMediaClient2.queuePrev(null);
        }
    }
}
