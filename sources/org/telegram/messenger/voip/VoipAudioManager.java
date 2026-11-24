package org.telegram.messenger.voip;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import org.telegram.messenger.Utilities;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class VoipAudioManager {
    private Boolean isSpeakerphoneOn;

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    private static final class InstanceHolder {
        static final VoipAudioManager instance = new VoipAudioManager();

        private InstanceHolder() {
        }
    }

    public static VoipAudioManager get() {
        return InstanceHolder.instance;
    }

    private AudioManager getAudioManager() {
        return (AudioManager) org.telegram.messenger.a.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    public static boolean isBluetoothDevice(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo == null) {
            return false;
        }
        int type = audioDeviceInfo.getType();
        if (type == 7) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 28 || type != 23) {
            return i >= 31 && (type == 26 || type == 27);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$isBluetoothAndSpeakerOnAsync$3(jac jacVar, boolean z, boolean z2) {
        jacVar.a(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isBluetoothAndSpeakerOnAsync$4(jac jacVar) {
        gm.c3(new c04(jacVar, isBluetoothOn(), getAudioManager().isSpeakerphoneOn(), (byte) 4));
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

    public void isBluetoothAndSpeakerOnAsync(jac jacVar) {
        Utilities.e.c(new qhc((Object) this, (Object) jacVar, (byte) 9));
    }

    public boolean isBluetoothOn() {
        AudioManager audioManager = getAudioManager();
        return Build.VERSION.SDK_INT >= 31 ? isBluetoothDevice(audioManager.getCommunicationDevice()) : audioManager.isBluetoothScoOn();
    }

    public boolean isSpeakerphoneOn() {
        Boolean bool = this.isSpeakerphoneOn;
        return bool == null ? getAudioManager().isSpeakerphoneOn() : bool.booleanValue();
    }

    public void setBluetoothOn(boolean z) {
        if (Build.VERSION.SDK_INT < 31) {
            getAudioManager().setBluetoothScoOn(z);
        } else if (z) {
            startBluetooth();
        } else {
            stopBluetooth();
        }
    }

    public void setSpeakerphoneOn(boolean z) {
        this.isSpeakerphoneOn = Boolean.valueOf(z);
        Utilities.e.c(new n28((byte) 27, (Object) getAudioManager(), z));
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
        Utilities.e.c(new qhc((Object) audioManager, (Object) findBluetoothDevice, (byte) 8));
    }

    public void stopBluetooth() {
        AudioManager audioManager = getAudioManager();
        if (Build.VERSION.SDK_INT >= 31) {
            Utilities.e.c(new rjc(audioManager, (byte) 1));
        } else {
            audioManager.stopBluetoothSco();
        }
    }

    private VoipAudioManager() {
    }
}
