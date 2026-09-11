package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class r50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v50 b;

    public /* synthetic */ r50(v50 v50Var, int i10) {
        this.a = i10;
        this.b = v50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.a;
        v50 v50Var = this.b;
        switch (i10) {
            case 0:
                v50Var.H0.m(false, false);
                break;
            case 1:
                NotificationCenter.getInstance(v50Var.H0.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 2:
                w50 w50Var = v50Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                w50Var.N = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = w50Var.H;
                videoEditedInfo2.encryptedFile = w50Var.I;
                videoEditedInfo2.key = w50Var.J;
                videoEditedInfo2.iv = w50Var.K;
                videoEditedInfo2.estimatedSize = Math.max(1L, w50Var.L);
                VideoEditedInfo videoEditedInfo3 = w50Var.N;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = w50Var.b0.getAbsolutePath();
                v50Var.h(w50Var.b0);
                w50Var.N.estimatedDuration = w50Var.f0;
                NotificationCenter.getInstance(w50Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(w50Var.Q), w50Var.N, w50Var.b0.getAbsolutePath(), v50Var.A0);
                break;
            case 3:
                if (v50Var.G0 && (videoEditedInfo = v50Var.H0.N) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                v50Var.c(v50Var.a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                break;
            case 4:
                v50Var.H0.Y0 = null;
                break;
            case 5:
                NotificationCenter.getInstance(v50Var.H0.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 6:
                v50Var.H0.m0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                v50Var.H0.m0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}
