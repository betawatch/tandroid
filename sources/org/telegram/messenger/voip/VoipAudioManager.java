package org.telegram.messenger.voip;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import bi.k1;
import li.j3;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v10;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public class VoipAudioManager {
    private Boolean isSpeakerphoneOn;

    /* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
    public static final class InstanceHolder {
        static final VoipAudioManager instance = new VoipAudioManager();

        private InstanceHolder() {
        }
    }

    public static VoipAudioManager get() {
        return InstanceHolder.instance;
    }

    private AudioManager getAudioManager() {
        return (AudioManager) org.telegram.messenger.t0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    public static boolean isBluetoothDevice(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo == null) {
            return false;
        }
        int type = audioDeviceInfo.getType();
        if (type == 7) {
            return true;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 28 || type != 23) {
            return i7 >= 31 && (type == 26 || type == 27);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$isBluetoothAndSpeakerOnAsync$3(v10 v10Var, boolean z9, boolean z10) {
        v10Var.a(Boolean.valueOf(z9), Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isBluetoothAndSpeakerOnAsync$4(v10 v10Var) {
        org.telegram.messenger.g0.h3(new h2.n0(v10Var, isBluetoothOn(), getAudioManager().isSpeakerphoneOn(), 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$stopBluetooth$2(AudioManager audioManager) {
        if (isBluetoothDevice(audioManager.getCommunicationDevice())) {
            audioManager.clearCommunicationDevice();
        }
    }

    public AudioDeviceInfo findBluetoothDevice() {
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        for (AudioDeviceInfo audioDeviceInfo : getAudioManager().getAvailableCommunicationDevices()) {
            if (isBluetoothDevice(audioDeviceInfo)) {
                return audioDeviceInfo;
            }
        }
        return null;
    }

    public void isBluetoothAndSpeakerOnAsync(v10 v10Var) {
        Utilities.e.c(new j3(27, this, v10Var));
    }

    public boolean isBluetoothOn() {
        AudioManager audioManager = getAudioManager();
        return Build.VERSION.SDK_INT >= 31 ? isBluetoothDevice(audioManager.getCommunicationDevice()) : audioManager.isBluetoothScoOn();
    }

    public boolean isSpeakerphoneOn() {
        Boolean bool = this.isSpeakerphoneOn;
        return bool == null ? getAudioManager().isSpeakerphoneOn() : bool.booleanValue();
    }

    public void setBluetoothOn(boolean z9) {
        if (Build.VERSION.SDK_INT < 31) {
            getAudioManager().setBluetoothScoOn(z9);
        } else if (z9) {
            startBluetooth();
        } else {
            stopBluetooth();
        }
    }

    public void setSpeakerphoneOn(boolean z9) {
        this.isSpeakerphoneOn = Boolean.valueOf(z9);
        Utilities.e.c(new k1(16, getAudioManager(), z9));
    }

    public void startBluetooth() {
        AudioManager audioManager = getAudioManager();
        if (Build.VERSION.SDK_INT < 31) {
            audioManager.startBluetoothSco();
            return;
        }
        AudioDeviceInfo findBluetoothDevice = findBluetoothDevice();
        if (findBluetoothDevice == null) {
            return;
        }
        this.isSpeakerphoneOn = Boolean.FALSE;
        Utilities.e.c(new j3(26, audioManager, findBluetoothDevice));
    }

    public void stopBluetooth() {
        AudioManager audioManager = getAudioManager();
        if (Build.VERSION.SDK_INT >= 31) {
            Utilities.e.c(new q0(audioManager, 2));
        } else {
            audioManager.stopBluetoothSco();
        }
    }

    private VoipAudioManager() {
    }
}
