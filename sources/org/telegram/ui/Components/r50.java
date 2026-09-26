package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                v50Var.H0.q(false, false);
                break;
            case 1:
                c60 c60Var = v50Var.H0;
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
                v50Var.h(c60Var.g0);
                c60Var.S.estimatedDuration = c60Var.k0;
                NotificationCenter.getInstance(c60Var.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(c60Var.V), c60Var.S, c60Var.g0.getAbsolutePath(), v50Var.A0);
                break;
            case 2:
                if (v50Var.G0 && (videoEditedInfo = v50Var.H0.S) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                v50Var.c(v50Var.a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                break;
            case 3:
                v50Var.H0.d1 = null;
                break;
            case 4:
                v50Var.H0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                v50Var.H0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}
