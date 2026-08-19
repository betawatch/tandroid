package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Utilities;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes3.dex */
public class VoipAudioManager {
    private Boolean isSpeakerphoneOn;

    private VoipAudioManager() {
    }

    private static final class InstanceHolder {
        static final VoipAudioManager instance = new VoipAudioManager();

        private InstanceHolder() {
        }
    }

    public static VoipAudioManager get() {
        return InstanceHolder.instance;
    }

    public void setSpeakerphoneOn(final boolean z) {
        this.isSpeakerphoneOn = Boolean.valueOf(z);
        final AudioManager audioManager = getAudioManager();
        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.voip.VoipAudioManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                audioManager.setSpeakerphoneOn(z);
            }
        });
    }

    public boolean isSpeakerphoneOn() {
        Boolean bool = this.isSpeakerphoneOn;
        if (bool == null) {
            return getAudioManager().isSpeakerphoneOn();
        }
        return bool.booleanValue();
    }

    public void isBluetoothAndSpeakerOnAsync(final Utilities.Callback2<Boolean, Boolean> callback2) {
        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.voip.VoipAudioManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                VoipAudioManager.$r8$lambda$Gk-upENbEtcGx9B-_eS_5XMimzM(VoipAudioManager.this, callback2);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$Gk-upENbEtcGx9B-_eS_5XMimzM(VoipAudioManager voipAudioManager, final Utilities.Callback2 callback2) {
        AudioManager audioManager = voipAudioManager.getAudioManager();
        final boolean isBluetoothScoOn = audioManager.isBluetoothScoOn();
        final boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.voip.VoipAudioManager$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Utilities.Callback2.this.run(Boolean.valueOf(isBluetoothScoOn), Boolean.valueOf(isSpeakerphoneOn));
            }
        });
    }

    private AudioManager getAudioManager() {
        return (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }
}
