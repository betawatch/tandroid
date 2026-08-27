package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    public /* synthetic */ j7(k7 k7Var, int i10) {
        this.a = i10;
        this.b = k7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k7 k7Var = this.b;
                int i10 = k7Var.v + 1;
                k7Var.v = i10;
                if (i10 != 1) {
                    if (i10 == 2) {
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        break;
                    }
                } else {
                    b8 b8Var = k7Var.D;
                    b8Var.D0 = -1;
                    b8Var.E0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    k7Var.w = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(k7Var.A);
                    break;
                }
                break;
            default:
                k7 k7Var2 = this.b;
                b8 b8Var2 = k7Var2.D;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f10 = b8Var2.E0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - k7Var2.w;
                    k7Var2.w = currentTimeMillis;
                    long j11 = currentTimeMillis - k7Var2.x;
                    int i11 = k7Var2.v;
                    float f11 = ((long) ((f10 * r2) - (j10 * (i11 == 1 ? 3L : i11 == 2 ? 6L : 12L)))) / duration;
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    b8Var2.E0 = f11;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        b8Var2.G0(playingMessageObject, false);
                    }
                    if (b8Var2.D0 == -1 && k7Var2.v > 0) {
                        if (j11 > 200 || b8Var2.E0 == 0.0f) {
                            k7Var2.x = currentTimeMillis;
                            if (b8Var2.E0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f11);
                            }
                        }
                        if (k7Var2.v > 0 && b8Var2.E0 > 0.0f) {
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
