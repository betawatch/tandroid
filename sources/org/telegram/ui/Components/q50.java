package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class q50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u50 b;

    public /* synthetic */ q50(u50 u50Var, int i10) {
        this.a = i10;
        this.b = u50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.a;
        u50 u50Var = this.b;
        switch (i10) {
            case 0:
                u50Var.H0.q(false, false);
                break;
            case 1:
                c60 c60Var = u50Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                c60Var.S = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = c60Var.M;
                videoEditedInfo2.encryptedFile = c60Var.N;
                videoEditedInfo2.key = c60Var.O;
                videoEditedInfo2.iv = c60Var.P;
                videoEditedInfo2.estimatedSize = Math.max(1L, c60Var.Q);
                VideoEditedInfo videoEditedInfo3 = c60Var.S;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = c60Var.g0.getAbsolutePath();
                u50Var.h(c60Var.g0);
                c60Var.S.estimatedDuration = c60Var.k0;
                NotificationCenter.getInstance(c60Var.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(c60Var.V), c60Var.S, c60Var.g0.getAbsolutePath(), u50Var.A0);
                break;
            case 2:
                if (u50Var.G0 && (videoEditedInfo = u50Var.H0.S) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                u50Var.c(u50Var.a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                break;
            case 3:
                u50Var.H0.d1 = null;
                break;
            case 4:
                u50Var.H0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                u50Var.H0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}
