package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class hp0 extends VideoPlayerRewinder {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
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
        org.telegram.ui.Components.j51 j51Var = iVar.F;
        j51Var.e(false);
        j51Var.d(z10);
        j51Var.f(true);
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
