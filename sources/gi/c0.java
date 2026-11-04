package gi;

import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.ui.i81;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c0 extends VideoPlayerHolderBase {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public boolean needRepeat() {
        switch (this.a) {
            case 0:
                return !((d0) this.b).p.o0;
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
                vg.w1 w1Var = (vg.w1) this.b;
                TextureView textureView = w1Var.K;
                if (textureView != null && !w1Var.G) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new i81(this, 19)).setDuration(200L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public void onStateChanged(boolean z10, int i3) {
        switch (this.a) {
            case 1:
                vg.w1 w1Var = (vg.w1) this.b;
                c0 c0Var = w1Var.I;
                if (c0Var != null) {
                    if (i3 != 4) {
                        if (i3 == 1) {
                            c0Var.play();
                            break;
                        }
                    } else {
                        c0Var.seekTo(0L);
                        w1Var.I.play();
                        break;
                    }
                }
                break;
            default:
                super.onStateChanged(z10, i3);
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new b0(this, i3, i10, i11, 0));
                break;
            default:
                super.onVideoSizeChanged(i3, i10, i11, f10);
                break;
        }
    }
}
