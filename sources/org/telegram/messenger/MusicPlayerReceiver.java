package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
                if (MediaController.z().G()) {
                    MediaController.z().V(MediaController.z().v0);
                    return;
                } else {
                    MediaController.z().U(MediaController.z().v0, true);
                    return;
                }
            }
            if (keyCode == 87) {
                MediaController.z().X(false);
                return;
            }
            if (keyCode == 88) {
                MediaController.z().Y();
                return;
            } else if (keyCode == 126) {
                MediaController.z().V(MediaController.z().v0);
                return;
            } else {
                if (keyCode == 127) {
                    MediaController.z().U(MediaController.z().v0, true);
                }
                return;
            }
        }
        String action = intent.getAction();
        action.getClass();
        switch (action) {
            case "org.telegram.android.musicplayer.repeat":
                xea.D((xea.O0 + 1) % 3);
                break;
            case "org.telegram.android.musicplayer.close":
                MediaController.z().m(true, true, false, false);
                break;
            case "org.telegram.android.musicplayer.pause":
            case "android.media.AUDIO_BECOMING_NOISY":
                MediaController.z().U(MediaController.z().v0, true);
                break;
            case "org.telegram.android.musicplayer.next":
                MediaController.z().X(false);
                break;
            case "org.telegram.android.musicplayer.play":
                MediaController.z().V(MediaController.z().v0);
                break;
            case "org.telegram.android.musicplayer.previous":
                MediaController.z().Y();
                break;
            case "org.telegram.android.musicplayer.shuffle":
                if (!xea.J0) {
                    MediaController.z().n0(2);
                    break;
                } else {
                    MediaController.z().n0(0);
                    break;
                }
        }
    }
}
