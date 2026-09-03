package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;

    public /* synthetic */ k7(l7 l7Var, int i10) {
        this.a = i10;
        this.b = l7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l7 l7Var = this.b;
                int i10 = l7Var.v + 1;
                l7Var.v = i10;
                if (i10 != 1) {
                    if (i10 == 2) {
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        break;
                    }
                } else {
                    c8 c8Var = l7Var.E;
                    c8Var.E0 = -1;
                    c8Var.F0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    l7Var.w = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(l7Var.B);
                    break;
                }
                break;
            default:
                l7 l7Var2 = this.b;
                c8 c8Var2 = l7Var2.E;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f10 = c8Var2.F0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - l7Var2.w;
                    l7Var2.w = currentTimeMillis;
                    long j11 = currentTimeMillis - l7Var2.x;
                    int i11 = l7Var2.v;
                    float f11 = ((long) ((f10 * r2) - (j10 * (i11 == 1 ? 3L : i11 == 2 ? 6L : 12L)))) / duration;
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    c8Var2.F0 = f11;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        c8Var2.G0(playingMessageObject, false);
                    }
                    if (c8Var2.E0 == -1 && l7Var2.v > 0) {
                        if (j11 > 200 || c8Var2.F0 == 0.0f) {
                            l7Var2.x = currentTimeMillis;
                            if (c8Var2.F0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f11);
                            }
                        }
                        if (l7Var2.v > 0 && c8Var2.F0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(l7Var2.B, 16L);
                            break;
                        }
                    }
                } else {
                    l7Var2.w = System.currentTimeMillis();
                    break;
                }
                break;
        }
    }
}
