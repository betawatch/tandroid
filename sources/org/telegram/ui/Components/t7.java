package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class t7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u7 b;

    public /* synthetic */ t7(u7 u7Var, int i10) {
        this.a = i10;
        this.b = u7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u7 u7Var = this.b;
                int i10 = u7Var.v + 1;
                u7Var.v = i10;
                if (i10 != 1) {
                    if (i10 == 2) {
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        break;
                    }
                } else {
                    m8 m8Var = u7Var.H;
                    m8Var.G0 = -1;
                    m8Var.H0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    u7Var.w = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(u7Var.E);
                    break;
                }
                break;
            default:
                u7 u7Var2 = this.b;
                m8 m8Var2 = u7Var2.H;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f7 = m8Var2.H0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - u7Var2.w;
                    u7Var2.w = currentTimeMillis;
                    long j11 = currentTimeMillis - u7Var2.x;
                    int i11 = u7Var2.v;
                    float f10 = ((long) ((f7 * r2) - (j10 * (i11 == 1 ? 3L : i11 == 2 ? 6L : 12L)))) / duration;
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    m8Var2.H0 = f10;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        m8Var2.M0(playingMessageObject, false);
                    }
                    if (m8Var2.G0 == -1 && u7Var2.v > 0) {
                        if (j11 > 200 || m8Var2.H0 == 0.0f) {
                            u7Var2.x = currentTimeMillis;
                            if (m8Var2.H0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
                            }
                        }
                        if (u7Var2.v > 0 && m8Var2.H0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(u7Var2.E, 16L);
                            break;
                        }
                    }
                } else {
                    u7Var2.w = System.currentTimeMillis();
                    break;
                }
                break;
        }
    }
}
