package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Utilities;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class VoipAudioManager {
    private Boolean isSpeakerphoneOn;

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public static final class InstanceHolder {
        static final VoipAudioManager instance = new VoipAudioManager();

        private InstanceHolder() {
        }
    }

    public static VoipAudioManager get() {
        return InstanceHolder.instance;
    }

    private AudioManager getAudioManager() {
        return (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$isBluetoothAndSpeakerOnAsync$1(Utilities.Callback2 callback2, boolean z4, boolean z10) {
        callback2.run(Boolean.valueOf(z4), Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isBluetoothAndSpeakerOnAsync$2(Utilities.Callback2 callback2) {
        AudioManager audioManager = getAudioManager();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.l(callback2, audioManager.isBluetoothScoOn(), audioManager.isSpeakerphoneOn(), 2));
    }

    public void isBluetoothAndSpeakerOnAsync(Utilities.Callback2<Boolean, Boolean> callback2) {
        Utilities.globalQueue.postRunnable(new h(5, this, callback2));
    }

    public boolean isSpeakerphoneOn() {
        Boolean bool = this.isSpeakerphoneOn;
        return bool == null ? getAudioManager().isSpeakerphoneOn() : bool.booleanValue();
    }

    public void setSpeakerphoneOn(boolean z4) {
        this.isSpeakerphoneOn = Boolean.valueOf(z4);
        Utilities.globalQueue.postRunnable(new kh.f(14, getAudioManager(), z4));
    }

    private VoipAudioManager() {
    }
}
