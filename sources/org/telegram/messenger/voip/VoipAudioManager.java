package org.telegram.messenger.voip;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j20;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class VoipAudioManager {
    private Boolean isSpeakerphoneOn;

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public static final class InstanceHolder {
        static final VoipAudioManager instance = new VoipAudioManager();

        private InstanceHolder() {
        }
    }

    public static VoipAudioManager get() {
        return InstanceHolder.instance;
    }

    private AudioManager getAudioManager() {
        return (AudioManager) org.telegram.messenger.w0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    public static boolean isBluetoothDevice(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo == null) {
            return false;
        }
        int type = audioDeviceInfo.getType();
        if (type == 7) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28 || type != 23) {
            return i10 >= 31 && (type == 26 || type == 27);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$isBluetoothAndSpeakerOnAsync$3(j20 j20Var, boolean z10, boolean z11) {
        j20Var.a(Boolean.valueOf(z10), Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isBluetoothAndSpeakerOnAsync$4(j20 j20Var) {
        org.telegram.messenger.i0.g3(new e2.m0(j20Var, isBluetoothOn(), getAudioManager().isSpeakerphoneOn(), 3));
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

    public void isBluetoothAndSpeakerOnAsync(j20 j20Var) {
        Utilities.e.c(new mh.k(21, this, j20Var));
    }

    public boolean isBluetoothOn() {
        AudioManager audioManager = getAudioManager();
        return Build.VERSION.SDK_INT >= 31 ? isBluetoothDevice(audioManager.getCommunicationDevice()) : audioManager.isBluetoothScoOn();
    }

    public boolean isSpeakerphoneOn() {
        Boolean bool = this.isSpeakerphoneOn;
        return bool == null ? getAudioManager().isSpeakerphoneOn() : bool.booleanValue();
    }

    public void setBluetoothOn(boolean z10) {
        if (Build.VERSION.SDK_INT < 31) {
            getAudioManager().setBluetoothScoOn(z10);
        } else if (z10) {
            startBluetooth();
        } else {
            stopBluetooth();
        }
    }

    public void setSpeakerphoneOn(boolean z10) {
        this.isSpeakerphoneOn = Boolean.valueOf(z10);
        Utilities.e.c(new k2.v(6, getAudioManager(), z10));
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
        Utilities.e.c(new mh.k(20, audioManager, findBluetoothDevice));
    }

    public void stopBluetooth() {
        AudioManager audioManager = getAudioManager();
        if (Build.VERSION.SDK_INT >= 31) {
            Utilities.e.c(new w0(audioManager, 2));
        } else {
            audioManager.stopBluetoothSco();
        }
    }

    private VoipAudioManager() {
    }
}
