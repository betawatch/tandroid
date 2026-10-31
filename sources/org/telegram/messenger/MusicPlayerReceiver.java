package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                if (MediaController.B().H()) {
                    MediaController.B().S(MediaController.B().u0);
                    return;
                } else {
                    MediaController.B().R(MediaController.B().u0, true);
                    return;
                }
            }
            if (keyCode == 87) {
                MediaController.B().U(false);
                return;
            }
            if (keyCode == 88) {
                MediaController.B().V();
                return;
            } else if (keyCode == 126) {
                MediaController.B().S(MediaController.B().u0);
                return;
            } else {
                if (keyCode != 127) {
                    return;
                }
                MediaController.B().R(MediaController.B().u0, true);
            }
        }
        String action = intent.getAction();
        action.getClass();
        switch (action) {
            case "org.telegram.android.musicplayer.repeat":
                tz.E((tz.S0 + 1) % 3);
                break;
            case "org.telegram.android.musicplayer.close":
                MediaController.B().q(true, true, false, false);
                break;
            case "org.telegram.android.musicplayer.pause":
            case "android.media.AUDIO_BECOMING_NOISY":
                MediaController.B().R(MediaController.B().u0, true);
                break;
            case "org.telegram.android.musicplayer.next":
                MediaController.B().U(false);
                break;
            case "org.telegram.android.musicplayer.play":
                MediaController.B().S(MediaController.B().u0);
                break;
            case "org.telegram.android.musicplayer.previous":
                MediaController.B().V();
                break;
            case "org.telegram.android.musicplayer.shuffle":
                if (!tz.N0) {
                    MediaController.B().l0(2);
                    break;
                } else {
                    MediaController.B().l0(0);
                    break;
                }
        }
    }
}
