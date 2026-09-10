package bi;

import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.ui.mv0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class h0 extends VideoPlayerHolderBase {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public boolean needRepeat() {
        switch (this.a) {
            case 0:
                return !((i0) this.b).p.n0;
            default:
                return super.needRepeat();
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                i0 i0Var = (i0) this.b;
                i0Var.f = true;
                i0Var.p.invalidate();
                break;
            default:
                qg.a2 a2Var = (qg.a2) this.b;
                TextureView textureView = a2Var.J;
                if (textureView != null && !a2Var.F) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new mv0(this, 22)).setDuration(200L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public void onStateChanged(boolean z10, int i10) {
        switch (this.a) {
            case 1:
                qg.a2 a2Var = (qg.a2) this.b;
                h0 h0Var = a2Var.H;
                if (h0Var != null) {
                    if (i10 != 4) {
                        if (i10 == 1) {
                            h0Var.play();
                            break;
                        }
                    } else {
                        h0Var.seekTo(0L);
                        a2Var.H.play();
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
                AndroidUtilities.runOnUIThread(new g0(this, i10, i11, i12, 0));
                break;
            default:
                super.onVideoSizeChanged(i10, i11, i12, f7);
                break;
        }
    }
}
