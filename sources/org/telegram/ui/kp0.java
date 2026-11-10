package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class kp0 extends VideoPlayerRewinder {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.a = photoViewer;
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindCanceled() {
        ti.i iVar;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.a;
        PhotoViewer.c(photoViewer, obtain);
        photoViewer.z1.f(false);
        ti.o oVar = photoViewer.O8;
        if (oVar == null || (iVar = oVar.e) == null) {
            return;
        }
        iVar.F.f(false);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindStart(boolean z9) {
        ti.i iVar;
        PhotoViewer photoViewer = this.a;
        photoViewer.z1.e(false);
        boolean z10 = !z9;
        photoViewer.z1.d(z10);
        photoViewer.z1.f(true);
        photoViewer.e0.invalidate();
        ti.o oVar = photoViewer.O8;
        if (oVar == null || (iVar = oVar.e) == null) {
            return;
        }
        org.telegram.ui.Components.k51 k51Var = iVar.F;
        k51Var.e(false);
        k51Var.d(z10);
        k51Var.f(true);
        di.b3 b3Var = iVar.o;
        if (b3Var != null) {
            b3Var.invalidate();
        }
        ti.e eVar = iVar.m;
        if (eVar != null) {
            eVar.invalidate();
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void updateRewindProgressUi(long j3, float f10, boolean z9) {
        ti.i iVar;
        PhotoViewer photoViewer = this.a;
        photoViewer.z1.g(Math.abs(j3));
        if (z9) {
            photoViewer.p3.h(false, f10);
            photoViewer.q3.invalidate();
        }
        ti.o oVar = photoViewer.O8;
        if (oVar == null || (iVar = oVar.e) == null) {
            return;
        }
        iVar.F.g(0L);
        if (z9) {
            iVar.I = f10;
            di.b3 b3Var = iVar.o;
            if (b3Var != null) {
                b3Var.invalidate();
            }
            ti.e eVar = iVar.m;
            if (eVar != null) {
                eVar.invalidate();
            }
        }
    }
}
