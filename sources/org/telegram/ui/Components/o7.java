package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p7 b;

    public /* synthetic */ o7(p7 p7Var, int i10) {
        this.a = i10;
        this.b = p7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p7 p7Var = this.b;
                int i10 = p7Var.v + 1;
                p7Var.v = i10;
                if (i10 != 1) {
                    if (i10 == 2) {
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        break;
                    }
                } else {
                    g8 g8Var = p7Var.D;
                    g8Var.D0 = -1;
                    g8Var.E0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    p7Var.w = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(p7Var.A);
                    break;
                }
                break;
            default:
                p7 p7Var2 = this.b;
                g8 g8Var2 = p7Var2.D;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f9 = g8Var2.E0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - p7Var2.w;
                    p7Var2.w = currentTimeMillis;
                    long j11 = currentTimeMillis - p7Var2.x;
                    int i11 = p7Var2.v;
                    float f10 = ((long) ((f9 * r2) - (j10 * (i11 == 1 ? 3L : i11 == 2 ? 6L : 12L)))) / duration;
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    g8Var2.E0 = f10;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        g8Var2.G0(playingMessageObject, false);
                    }
                    if (g8Var2.D0 == -1 && p7Var2.v > 0) {
                        if (j11 > 200 || g8Var2.E0 == 0.0f) {
                            p7Var2.x = currentTimeMillis;
                            if (g8Var2.E0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
                            }
                        }
                        if (p7Var2.v > 0 && g8Var2.E0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(p7Var2.A, 16L);
                            break;
                        }
                    }
                } else {
                    p7Var2.w = System.currentTimeMillis();
                    break;
                }
                break;
        }
    }
}
