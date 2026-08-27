package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j50 b;

    public /* synthetic */ g50(j50 j50Var, int i10) {
        this.a = i10;
        this.b = j50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.a;
        j50 j50Var = this.b;
        switch (i10) {
            case 0:
                j50Var.D0.m(false, false);
                break;
            case 1:
                NotificationCenter.getInstance(j50Var.D0.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 2:
                k50 k50Var = j50Var.D0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                k50Var.J = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = k50Var.D;
                videoEditedInfo2.encryptedFile = k50Var.E;
                videoEditedInfo2.key = k50Var.F;
                videoEditedInfo2.iv = k50Var.G;
                videoEditedInfo2.estimatedSize = Math.max(1L, k50Var.H);
                VideoEditedInfo videoEditedInfo3 = k50Var.J;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = k50Var.U.getAbsolutePath();
                j50Var.h(k50Var.U);
                k50Var.J.estimatedDuration = k50Var.b0;
                NotificationCenter.getInstance(k50Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(k50Var.M), k50Var.J, k50Var.U.getAbsolutePath(), j50Var.w0);
                break;
            case 3:
                if (j50Var.C0 && (videoEditedInfo = j50Var.D0.J) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                j50Var.c(j50Var.a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                break;
            case 4:
                j50Var.D0.U0 = null;
                break;
            case 5:
                NotificationCenter.getInstance(j50Var.D0.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 6:
                j50Var.D0.i0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                j50Var.D0.i0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}
