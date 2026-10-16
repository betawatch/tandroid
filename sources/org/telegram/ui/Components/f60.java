package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i60 b;

    public /* synthetic */ f60(i60 i60Var, int i10) {
        this.a = i10;
        this.b = i60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.a;
        i60 i60Var = this.b;
        switch (i10) {
            case 0:
                i60Var.H0.r(false, false);
                break;
            case 1:
                p60 p60Var = i60Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                p60Var.S = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = p60Var.M;
                videoEditedInfo2.encryptedFile = p60Var.N;
                videoEditedInfo2.key = p60Var.O;
                videoEditedInfo2.iv = p60Var.P;
                videoEditedInfo2.estimatedSize = Math.max(1L, p60Var.Q);
                VideoEditedInfo videoEditedInfo3 = p60Var.S;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = p60Var.g0.getAbsolutePath();
                i60Var.h(p60Var.g0);
                p60Var.S.estimatedDuration = p60Var.k0;
                NotificationCenter.getInstance(p60Var.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(p60Var.V), p60Var.S, p60Var.g0.getAbsolutePath(), i60Var.A0);
                break;
            case 2:
                if (i60Var.G0 && (videoEditedInfo = i60Var.H0.S) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                i60Var.c(i60Var.a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                break;
            case 3:
                i60Var.H0.i1 = null;
                break;
            case 4:
                i60Var.H0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                i60Var.H0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}
