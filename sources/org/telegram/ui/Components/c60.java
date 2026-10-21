package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                m60 m60Var = f60Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                m60Var.S = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = m60Var.M;
                videoEditedInfo2.encryptedFile = m60Var.N;
                videoEditedInfo2.key = m60Var.O;
                videoEditedInfo2.iv = m60Var.P;
                videoEditedInfo2.estimatedSize = Math.max(1L, m60Var.Q);
                VideoEditedInfo videoEditedInfo3 = m60Var.S;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = m60Var.g0.getAbsolutePath();
                f60Var.h(m60Var.g0);
                m60Var.S.estimatedDuration = m60Var.k0;
                NotificationCenter.getInstance(m60Var.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(m60Var.V), m60Var.S, m60Var.g0.getAbsolutePath(), f60Var.A0);
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
