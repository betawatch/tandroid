// default package

import android.media.MediaPlayer;
import org.telegram.messenger.voip.VoIPPreNotificationService;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class flc implements MediaPlayer.OnPreparedListener {
    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        VoIPPreNotificationService.lambda$startRinging$0(mediaPlayer);
    }
}
