package kg;

import android.view.TextureView;
import bi.b3;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j2 extends VideoPlayerHolderBase {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public boolean needRepeat() {
        switch (this.a) {
            case 1:
                return !((vh.w) this.b).p.n0;
            default:
                return super.needRepeat();
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                k2 k2Var = (k2) this.b;
                TextureView textureView = k2Var.J;
                if (textureView != null && !k2Var.F) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new bg.e(this, 8)).setDuration(200L);
                    break;
                }
                break;
            default:
                vh.w wVar = (vh.w) this.b;
                wVar.f = true;
                wVar.p.invalidate();
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public void onStateChanged(boolean z10, int i10) {
        switch (this.a) {
            case 0:
                k2 k2Var = (k2) this.b;
                j2 j2Var = k2Var.H;
                if (j2Var != null) {
                    if (i10 != 4) {
                        if (i10 == 1) {
                            j2Var.play();
                            break;
                        }
                    } else {
                        j2Var.seekTo(0L);
                        k2Var.H.play();
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
            case 1:
                org.telegram.messenger.i0.g3(new b3(this, i10, i11, i12, 3));
                break;
            default:
                super.onVideoSizeChanged(i10, i11, i12, f7);
                break;
        }
    }
}
