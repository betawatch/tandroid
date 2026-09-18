package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                u50Var.H0.r(false, false);
                break;
            case 1:
                NotificationCenter.getInstance(u50Var.H0.d).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 2:
                b60 b60Var = u50Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                b60Var.Q = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = b60Var.K;
                videoEditedInfo2.encryptedFile = b60Var.L;
                videoEditedInfo2.key = b60Var.M;
                videoEditedInfo2.iv = b60Var.N;
                videoEditedInfo2.estimatedSize = Math.max(1L, b60Var.O);
                VideoEditedInfo videoEditedInfo3 = b60Var.Q;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = b60Var.e0.getAbsolutePath();
                u50Var.h(b60Var.e0);
                b60Var.Q.estimatedDuration = b60Var.i0;
                NotificationCenter.getInstance(b60Var.d).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(b60Var.T), b60Var.Q, b60Var.e0.getAbsolutePath(), u50Var.A0);
                break;
            case 3:
                if (u50Var.G0 && (videoEditedInfo = u50Var.H0.Q) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                u50Var.c(u50Var.a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                break;
            case 4:
                u50Var.H0.b1 = null;
                break;
            case 5:
                NotificationCenter.getInstance(u50Var.H0.d).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 6:
                u50Var.H0.p0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                u50Var.H0.p0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}
