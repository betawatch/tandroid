package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                    h8 h8Var = p7Var.H;
                    h8Var.H0 = -1;
                    h8Var.I0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    p7Var.w = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(p7Var.E);
                    break;
                }
                break;
            default:
                p7 p7Var2 = this.b;
                h8 h8Var2 = p7Var2.H;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f7 = h8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = currentTimeMillis - p7Var2.w;
                    p7Var2.w = currentTimeMillis;
                    long j10 = currentTimeMillis - p7Var2.x;
                    int i11 = p7Var2.v;
                    float f10 = ((long) ((f7 * r2) - (j3 * (i11 == 1 ? 3L : i11 == 2 ? 6L : 12L)))) / duration;
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    h8Var2.I0 = f10;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        h8Var2.G0(playingMessageObject, false);
                    }
                    if (h8Var2.H0 == -1 && p7Var2.v > 0) {
                        if (j10 > 200 || h8Var2.I0 == 0.0f) {
                            p7Var2.x = currentTimeMillis;
                            if (h8Var2.I0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
                            }
                        }
                        if (p7Var2.v > 0 && h8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(p7Var2.E, 16L);
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
