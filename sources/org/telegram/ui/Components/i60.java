package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l60 b;

    public /* synthetic */ i60(l60 l60Var, int i10) {
        this.a = i10;
        this.b = l60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.a;
        l60 l60Var = this.b;
        switch (i10) {
            case 0:
                l60Var.H0.r(false, false);
                break;
            case 1:
                t60 t60Var = l60Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                t60Var.S = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = t60Var.M;
                videoEditedInfo2.encryptedFile = t60Var.N;
                videoEditedInfo2.key = t60Var.O;
                videoEditedInfo2.iv = t60Var.P;
                videoEditedInfo2.estimatedSize = Math.max(1L, t60Var.Q);
                VideoEditedInfo videoEditedInfo3 = t60Var.S;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = t60Var.g0.getAbsolutePath();
                l60Var.h(t60Var.g0);
                t60Var.S.estimatedDuration = t60Var.k0;
                NotificationCenter.getInstance(t60Var.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(t60Var.V), t60Var.S, t60Var.g0.getAbsolutePath(), l60Var.A0);
                break;
            case 2:
                if (l60Var.G0 && (videoEditedInfo = l60Var.H0.S) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                l60Var.c(l60Var.a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                break;
            case 3:
                l60Var.H0.i1 = null;
                break;
            case 4:
                l60Var.H0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                l60Var.H0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}
