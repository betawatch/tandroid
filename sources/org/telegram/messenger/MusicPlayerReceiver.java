package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class MusicPlayerReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        if (intent.getAction().equals("android.intent.action.MEDIA_BUTTON")) {
            if (intent.getExtras() == null || (keyEvent = (KeyEvent) intent.getExtras().get("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return;
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (MediaController.w().C()) {
                    MediaController.w().R(MediaController.w().v0);
                    return;
                } else {
                    MediaController.w().Q(MediaController.w().v0, true);
                    return;
                }
            }
            if (keyCode == 87) {
                MediaController.w().T(false);
                return;
            }
            if (keyCode == 88) {
                MediaController.w().U();
                return;
            } else if (keyCode == 126) {
                MediaController.w().R(MediaController.w().v0);
                return;
            } else {
                if (keyCode == 127) {
                    MediaController.w().Q(MediaController.w().v0, true);
                }
                return;
            }
        }
        String action = intent.getAction();
        action.getClass();
        switch (action) {
            case "org.telegram.android.musicplayer.repeat":
                gba.D((gba.O0 + 1) % 3);
                break;
            case "org.telegram.android.musicplayer.close":
                MediaController.w().l(true, true, false, false);
                break;
            case "org.telegram.android.musicplayer.pause":
            case "android.media.AUDIO_BECOMING_NOISY":
                MediaController.w().Q(MediaController.w().v0, true);
                break;
            case "org.telegram.android.musicplayer.next":
                MediaController.w().T(false);
                break;
            case "org.telegram.android.musicplayer.play":
                MediaController.w().R(MediaController.w().v0);
                break;
            case "org.telegram.android.musicplayer.previous":
                MediaController.w().U();
                break;
            case "org.telegram.android.musicplayer.shuffle":
                if (!gba.J0) {
                    MediaController.w().k0(2);
                    break;
                } else {
                    MediaController.w().k0(0);
                    break;
                }
        }
    }
}
