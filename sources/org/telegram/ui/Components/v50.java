package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y50 b;

    public /* synthetic */ v50(y50 y50Var, int i10) {
        this.a = i10;
        this.b = y50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.a;
        y50 y50Var = this.b;
        switch (i10) {
            case 0:
                y50Var.E0.m(false, false);
                break;
            case 1:
                NotificationCenter.getInstance(y50Var.E0.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 2:
                z50 z50Var = y50Var.E0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                z50Var.K = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = z50Var.E;
                videoEditedInfo2.encryptedFile = z50Var.F;
                videoEditedInfo2.key = z50Var.G;
                videoEditedInfo2.iv = z50Var.H;
                videoEditedInfo2.estimatedSize = Math.max(1L, z50Var.I);
                VideoEditedInfo videoEditedInfo3 = z50Var.K;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = z50Var.V.getAbsolutePath();
                y50Var.h(z50Var.V);
                z50Var.K.estimatedDuration = z50Var.c0;
                NotificationCenter.getInstance(z50Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(z50Var.N), z50Var.K, z50Var.V.getAbsolutePath(), y50Var.x0);
                break;
            case 3:
                if (y50Var.D0 && (videoEditedInfo = y50Var.E0.K) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                y50Var.c(y50Var.a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                break;
            case 4:
                y50Var.E0.V0 = null;
                break;
            case 5:
                NotificationCenter.getInstance(y50Var.E0.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 6:
                y50Var.E0.j0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                y50Var.E0.j0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}
