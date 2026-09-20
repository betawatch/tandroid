package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class p7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q7 b;

    public /* synthetic */ p7(q7 q7Var, int i10) {
        this.a = i10;
        this.b = q7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q7 q7Var = this.b;
                int i10 = q7Var.v + 1;
                q7Var.v = i10;
                if (i10 != 1) {
                    if (i10 == 2) {
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        break;
                    }
                } else {
                    i8 i8Var = q7Var.H;
                    i8Var.H0 = -1;
                    i8Var.I0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    q7Var.w = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(q7Var.E);
                    break;
                }
                break;
            default:
                q7 q7Var2 = this.b;
                i8 i8Var2 = q7Var2.H;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f7 = i8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = currentTimeMillis - q7Var2.w;
                    q7Var2.w = currentTimeMillis;
                    long j10 = currentTimeMillis - q7Var2.x;
                    int i11 = q7Var2.v;
                    float f10 = ((long) ((f7 * r2) - (j3 * (i11 == 1 ? 3L : i11 == 2 ? 6L : 12L)))) / duration;
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    i8Var2.I0 = f10;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        i8Var2.G0(playingMessageObject, false);
                    }
                    if (i8Var2.H0 == -1 && q7Var2.v > 0) {
                        if (j10 > 200 || i8Var2.I0 == 0.0f) {
                            q7Var2.x = currentTimeMillis;
                            if (i8Var2.I0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
                            }
                        }
                        if (q7Var2.v > 0 && i8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(q7Var2.E, 16L);
                            break;
                        }
                    }
                } else {
                    q7Var2.w = System.currentTimeMillis();
                    break;
                }
                break;
        }
    }
}
