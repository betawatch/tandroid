package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f60 b;

    public /* synthetic */ c60(f60 f60Var, int i10) {
        this.a = i10;
        this.b = f60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.a;
        f60 f60Var = this.b;
        switch (i10) {
            case 0:
                f60Var.H0.r(false, false);
                break;
            case 1:
                n60 n60Var = f60Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                n60Var.S = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = n60Var.M;
                videoEditedInfo2.encryptedFile = n60Var.N;
                videoEditedInfo2.key = n60Var.O;
                videoEditedInfo2.iv = n60Var.P;
                videoEditedInfo2.estimatedSize = Math.max(1L, n60Var.Q);
                VideoEditedInfo videoEditedInfo3 = n60Var.S;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = n60Var.g0.getAbsolutePath();
                f60Var.h(n60Var.g0);
                n60Var.S.estimatedDuration = n60Var.k0;
                NotificationCenter.getInstance(n60Var.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(n60Var.V), n60Var.S, n60Var.g0.getAbsolutePath(), f60Var.A0);
                break;
            case 2:
                if (f60Var.G0 && (videoEditedInfo = f60Var.H0.S) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                f60Var.c(f60Var.a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                break;
            case 3:
                f60Var.H0.i1 = null;
                break;
            case 4:
                f60Var.H0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                f60Var.H0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}
