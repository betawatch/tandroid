package org.telegram.messenger.voip;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements MediaPlayer.OnPreparedListener {
    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        VoIPPreNotificationService.lambda$startRinging$0(mediaPlayer);
    }
}
