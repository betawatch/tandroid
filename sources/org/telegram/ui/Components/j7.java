package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    public /* synthetic */ j7(k7 k7Var, int i9) {
        this.a = i9;
        this.b = k7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k7 k7Var = this.b;
                int i9 = k7Var.v + 1;
                k7Var.v = i9;
                if (i9 != 1) {
                    if (i9 == 2) {
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        break;
                    }
                } else {
                    c8 c8Var = k7Var.D;
                    c8Var.D0 = -1;
                    c8Var.E0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    k7Var.w = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(k7Var.A);
                    break;
                }
                break;
            default:
                k7 k7Var2 = this.b;
                c8 c8Var2 = k7Var2.D;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f10 = c8Var2.E0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - k7Var2.w;
                    k7Var2.w = currentTimeMillis;
                    long j11 = currentTimeMillis - k7Var2.x;
                    int i10 = k7Var2.v;
                    float f11 = ((long) ((f10 * r2) - (j10 * (i10 == 1 ? 3L : i10 == 2 ? 6L : 12L)))) / duration;
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    c8Var2.E0 = f11;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        c8Var2.F0(playingMessageObject, false);
                    }
                    if (c8Var2.D0 == -1 && k7Var2.v > 0) {
                        if (j11 > 200 || c8Var2.E0 == 0.0f) {
                            k7Var2.x = currentTimeMillis;
                            if (c8Var2.E0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f11);
                            }
                        }
                        if (k7Var2.v > 0 && c8Var2.E0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(k7Var2.A, 16L);
                            break;
                        }
                    }
                } else {
                    k7Var2.w = System.currentTimeMillis();
                    break;
                }
                break;
        }
    }
}
