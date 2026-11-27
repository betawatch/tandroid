package org.telegram.messenger.voip;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import org.telegram.messenger.Utilities;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class VoipAudioManager {
    private Boolean isSpeakerphoneOn;

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    private static final class InstanceHolder {
        static final VoipAudioManager instance = new VoipAudioManager(0);

        private InstanceHolder() {
        }
    }

    public /* synthetic */ VoipAudioManager(int i) {
        this();
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
    public static /* synthetic */ void lambda$isBluetoothAndSpeakerOnAsync$3(icc iccVar, boolean z, boolean z2) {
        iccVar.a(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isBluetoothAndSpeakerOnAsync$4(icc iccVar) {
        hl.c3(new mz3(iccVar, isBluetoothOn(), getAudioManager().isSpeakerphoneOn(), (byte) 4));
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

    public void isBluetoothAndSpeakerOnAsync(icc iccVar) {
        Utilities.e.c(new vlc(this, iccVar, (byte) 6));
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
        Utilities.e.c(new q38((byte) 28, (Object) getAudioManager(), z));
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
        Utilities.e.c(new vlc(audioManager, findBluetoothDevice, (byte) 5));
    }

    public void stopBluetooth() {
        AudioManager audioManager = getAudioManager();
        if (Build.VERSION.SDK_INT >= 31) {
            Utilities.e.c(new ylc(audioManager, (byte) 1));
        } else {
            audioManager.stopBluetoothSco();
        }
    }

    private VoipAudioManager() {
    }
}
