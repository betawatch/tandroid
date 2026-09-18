package ci;

import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class c0 extends VideoPlayerHolderBase {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public boolean needRepeat() {
        switch (this.a) {
            case 0:
                return !((d0) this.b).p.n0;
            default:
                return super.needRepeat();
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                d0 d0Var = (d0) this.b;
                d0Var.f = true;
                d0Var.p.invalidate();
                break;
            default:
                rg.z1 z1Var = (rg.z1) this.b;
                TextureView textureView = z1Var.J;
                if (textureView != null && !z1Var.F) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new pg.d0(this, 5)).setDuration(200L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public void onStateChanged(boolean z10, int i10) {
        switch (this.a) {
            case 1:
                rg.z1 z1Var = (rg.z1) this.b;
                c0 c0Var = z1Var.H;
                if (c0Var != null) {
                    if (i10 != 4) {
                        if (i10 == 1) {
                            c0Var.play();
                            break;
                        }
                    } else {
                        c0Var.seekTo(0L);
                        z1Var.H.play();
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
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this, i10, i11, i12, 0));
                break;
            default:
                super.onVideoSizeChanged(i10, i11, i12, f7);
                break;
        }
    }
}
