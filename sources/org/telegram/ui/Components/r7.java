package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class r7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s7 b;

    public /* synthetic */ r7(s7 s7Var, int i10) {
        this.a = i10;
        this.b = s7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s7 s7Var = this.b;
                int i10 = s7Var.v + 1;
                s7Var.v = i10;
                if (i10 != 1) {
                    if (i10 == 2) {
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        break;
                    }
                } else {
                    k8 k8Var = s7Var.H;
                    k8Var.H0 = -1;
                    k8Var.I0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    s7Var.w = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(s7Var.E);
                    break;
                }
                break;
            default:
                s7 s7Var2 = this.b;
                k8 k8Var2 = s7Var2.H;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f7 = k8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = currentTimeMillis - s7Var2.w;
                    s7Var2.w = currentTimeMillis;
                    long j10 = currentTimeMillis - s7Var2.x;
                    int i11 = s7Var2.v;
                    float f10 = ((long) ((f7 * r2) - (j3 * (i11 == 1 ? 3L : i11 == 2 ? 6L : 12L)))) / duration;
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    k8Var2.I0 = f10;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        k8Var2.G0(playingMessageObject, false);
                    }
                    if (k8Var2.H0 == -1 && s7Var2.v > 0) {
                        if (j10 > 200 || k8Var2.I0 == 0.0f) {
                            s7Var2.x = currentTimeMillis;
                            if (k8Var2.I0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
                            }
                        }
                        if (s7Var2.v > 0 && k8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(s7Var2.E, 16L);
                            break;
                        }
                    }
                } else {
                    s7Var2.w = System.currentTimeMillis();
                    break;
                }
                break;
        }
    }
}
