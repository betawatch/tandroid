// default package

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class f88 extends VideoPlayerRewinder {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f88(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.a = photoViewer;
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindCanceled() {
        sj4 sj4Var;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        Drawable[] drawableArr = PhotoViewer.f9;
        PhotoViewer photoViewer = this.a;
        photoViewer.g1(obtain);
        photoViewer.A1.d(false);
        xa8 xa8Var = photoViewer.V8;
        if (xa8Var == null || (sj4Var = xa8Var.e) == null) {
            return;
        }
        sj4Var.F.d(false);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindStart(boolean z) {
        sj4 sj4Var;
        PhotoViewer photoViewer = this.a;
        photoViewer.A1.c(false);
        boolean z2 = !z;
        photoViewer.A1.b(z2);
        photoViewer.A1.d(true);
        photoViewer.f0.invalidate();
        xa8 xa8Var = photoViewer.V8;
        if (xa8Var == null || (sj4Var = xa8Var.e) == null) {
            return;
        }
        rac racVar = sj4Var.F;
        racVar.c(false);
        racVar.b(z2);
        racVar.d(true);
        rj4 rj4Var = sj4Var.o;
        if (rj4Var != null) {
            rj4Var.invalidate();
        }
        lj4 lj4Var = sj4Var.m;
        if (lj4Var != null) {
            lj4Var.invalidate();
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void updateRewindProgressUi(long j, float f, boolean z) {
        sj4 sj4Var;
        PhotoViewer photoViewer = this.a;
        photoViewer.A1.e(Math.abs(j));
        if (z) {
            photoViewer.q3.h(false, f);
            photoViewer.r3.invalidate();
        }
        xa8 xa8Var = photoViewer.V8;
        if (xa8Var == null || (sj4Var = xa8Var.e) == null) {
            return;
        }
        sj4Var.F.e(0L);
        if (z) {
            sj4Var.I = f;
            rj4 rj4Var = sj4Var.o;
            if (rj4Var != null) {
                rj4Var.invalidate();
            }
            lj4 lj4Var = sj4Var.m;
            if (lj4Var != null) {
                lj4Var.invalidate();
            }
        }
    }
}
