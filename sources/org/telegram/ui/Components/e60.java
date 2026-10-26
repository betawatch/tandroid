package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                h60Var.H0.r(false, false);
                break;
            case 1:
                o60 o60Var = h60Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                o60Var.S = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = o60Var.M;
                videoEditedInfo2.encryptedFile = o60Var.N;
                videoEditedInfo2.key = o60Var.O;
                videoEditedInfo2.iv = o60Var.P;
                videoEditedInfo2.estimatedSize = Math.max(1L, o60Var.Q);
                VideoEditedInfo videoEditedInfo3 = o60Var.S;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = o60Var.g0.getAbsolutePath();
                h60Var.h(o60Var.g0);
                o60Var.S.estimatedDuration = o60Var.k0;
                NotificationCenter.getInstance(o60Var.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(o60Var.V), o60Var.S, o60Var.g0.getAbsolutePath(), h60Var.A0);
                break;
            case 2:
                if (h60Var.G0 && (videoEditedInfo = h60Var.H0.S) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                h60Var.c(h60Var.a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                break;
            case 3:
                h60Var.H0.i1 = null;
                break;
            case 4:
                h60Var.H0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                h60Var.H0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}
