package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class q7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r7 b;

    public /* synthetic */ q7(r7 r7Var, int i10) {
        this.a = i10;
        this.b = r7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r7 r7Var = this.b;
                int i10 = r7Var.v + 1;
                r7Var.v = i10;
                if (i10 != 1) {
                    if (i10 == 2) {
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        break;
                    }
                } else {
                    j8 j8Var = r7Var.H;
                    j8Var.H0 = -1;
                    j8Var.I0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    r7Var.w = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(r7Var.E);
                    break;
                }
                break;
            default:
                r7 r7Var2 = this.b;
                j8 j8Var2 = r7Var2.H;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f7 = j8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = currentTimeMillis - r7Var2.w;
                    r7Var2.w = currentTimeMillis;
                    long j10 = currentTimeMillis - r7Var2.x;
                    int i11 = r7Var2.v;
                    float f10 = ((long) ((f7 * r2) - (j3 * (i11 == 1 ? 3L : i11 == 2 ? 6L : 12L)))) / duration;
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    j8Var2.I0 = f10;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        j8Var2.G0(playingMessageObject, false);
                    }
                    if (j8Var2.H0 == -1 && r7Var2.v > 0) {
                        if (j10 > 200 || j8Var2.I0 == 0.0f) {
                            r7Var2.x = currentTimeMillis;
                            if (j8Var2.I0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
                            }
                        }
                        if (r7Var2.v > 0 && j8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(r7Var2.E, 16L);
                            break;
                        }
                    }
                } else {
                    r7Var2.w = System.currentTimeMillis();
                    break;
                }
                break;
        }
    }
}
