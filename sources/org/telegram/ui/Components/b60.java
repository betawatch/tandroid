package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class b60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e60 b;

    public /* synthetic */ b60(e60 e60Var, int i10) {
        this.a = i10;
        this.b = e60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.a;
        e60 e60Var = this.b;
        switch (i10) {
            case 0:
                e60Var.H0.m(false, false);
                break;
            case 1:
                NotificationCenter.getInstance(e60Var.H0.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 2:
                f60 f60Var = e60Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                f60Var.N = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = f60Var.H;
                videoEditedInfo2.encryptedFile = f60Var.I;
                videoEditedInfo2.key = f60Var.J;
                videoEditedInfo2.iv = f60Var.K;
                videoEditedInfo2.estimatedSize = Math.max(1L, f60Var.L);
                VideoEditedInfo videoEditedInfo3 = f60Var.N;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = f60Var.b0.getAbsolutePath();
                e60Var.h(f60Var.b0);
                f60Var.N.estimatedDuration = f60Var.f0;
                NotificationCenter.getInstance(f60Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(f60Var.Q), f60Var.N, f60Var.b0.getAbsolutePath(), e60Var.A0);
                break;
            case 3:
                if (e60Var.G0 && (videoEditedInfo = e60Var.H0.N) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                e60Var.c(e60Var.a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                break;
            case 4:
                e60Var.H0.Y0 = null;
                break;
            case 5:
                NotificationCenter.getInstance(e60Var.H0.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 6:
                e60Var.H0.m0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                e60Var.H0.m0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}
