package cg;

import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v2 extends VideoPlayerHolderBase {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public boolean needRepeat() {
        switch (this.a) {
            case 1:
                return !((nh.d0) this.b).p.j0;
            default:
                return super.needRepeat();
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                w2 w2Var = (w2) this.b;
                TextureView textureView = w2Var.F;
                if (textureView != null && !w2Var.B) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new ag.m0(this, 4)).setDuration(200L);
                    break;
                }
                break;
            default:
                nh.d0 d0Var = (nh.d0) this.b;
                d0Var.f = true;
                d0Var.p.invalidate();
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public void onStateChanged(boolean z10, int i10) {
        switch (this.a) {
            case 0:
                w2 w2Var = (w2) this.b;
                v2 v2Var = w2Var.D;
                if (v2Var != null) {
                    if (i10 != 4) {
                        if (i10 == 1) {
                            v2Var.play();
                            break;
                        }
                    } else {
                        v2Var.seekTo(0L);
                        w2Var.D.play();
                        break;
                    }
                }
                break;
            default:
                super.onStateChanged(z10, i10);
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public void onVideoSizeChanged(int i10, int i11, int i12, float f9) {
        switch (this.a) {
            case 1:
                AndroidUtilities.runOnUIThread(new nh.c0(this, i10, i11, i12, 0));
                break;
            default:
                super.onVideoSizeChanged(i10, i11, i12, f9);
                break;
        }
    }
}
