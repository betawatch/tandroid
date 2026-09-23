package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class s50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w50 b;

    public /* synthetic */ s50(w50 w50Var, int i10) {
        this.a = i10;
        this.b = w50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.a;
        w50 w50Var = this.b;
        switch (i10) {
            case 0:
                w50Var.H0.m(false, false);
                break;
            case 1:
                NotificationCenter.getInstance(w50Var.H0.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 2:
                x50 x50Var = w50Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                x50Var.N = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = x50Var.H;
                videoEditedInfo2.encryptedFile = x50Var.I;
                videoEditedInfo2.key = x50Var.J;
                videoEditedInfo2.iv = x50Var.K;
                videoEditedInfo2.estimatedSize = Math.max(1L, x50Var.L);
                VideoEditedInfo videoEditedInfo3 = x50Var.N;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = x50Var.b0.getAbsolutePath();
                w50Var.h(x50Var.b0);
                x50Var.N.estimatedDuration = x50Var.f0;
                NotificationCenter.getInstance(x50Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(x50Var.Q), x50Var.N, x50Var.b0.getAbsolutePath(), w50Var.A0);
                break;
            case 3:
                if (w50Var.G0 && (videoEditedInfo = w50Var.H0.N) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                w50Var.c(w50Var.a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                break;
            case 4:
                w50Var.H0.Y0 = null;
                break;
            case 5:
                NotificationCenter.getInstance(w50Var.H0.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 6:
                w50Var.H0.m0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                w50Var.H0.m0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}
