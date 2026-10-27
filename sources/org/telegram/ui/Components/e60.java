package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h60 b;

    public /* synthetic */ e60(h60 h60Var, int i10) {
        this.a = i10;
        this.b = h60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.a;
        h60 h60Var = this.b;
        switch (i10) {
            case 0:
                h60Var.H0.s(false, false);
                break;
            case 1:
                p60 p60Var = h60Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                p60Var.R = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = p60Var.L;
                videoEditedInfo2.encryptedFile = p60Var.M;
                videoEditedInfo2.key = p60Var.N;
                videoEditedInfo2.iv = p60Var.O;
                videoEditedInfo2.estimatedSize = Math.max(1L, p60Var.P);
                VideoEditedInfo videoEditedInfo3 = p60Var.R;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = p60Var.f0.getAbsolutePath();
                h60Var.h(p60Var.f0);
                p60Var.R.estimatedDuration = p60Var.j0;
                NotificationCenter.getInstance(p60Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(p60Var.U), p60Var.R, p60Var.f0.getAbsolutePath(), h60Var.A0);
                break;
            case 2:
                if (h60Var.G0 && (videoEditedInfo = h60Var.H0.R) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                h60Var.c(h60Var.a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                break;
            case 3:
                h60Var.H0.h1 = null;
                break;
            case 4:
                h60Var.H0.q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                h60Var.H0.q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}
