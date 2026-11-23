package hi;

import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.ui.i71;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class l0 extends VideoPlayerHolderBase {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public boolean needRepeat() {
        switch (this.a) {
            case 0:
                return !((m0) this.b).p.o0;
            default:
                return super.needRepeat();
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                m0 m0Var = (m0) this.b;
                m0Var.f = true;
                m0Var.p.invalidate();
                break;
            default:
                ug.x1 x1Var = (ug.x1) this.b;
                TextureView textureView = x1Var.K;
                if (textureView != null && !x1Var.G) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new i71(this, 20)).setDuration(200L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public void onStateChanged(boolean z10, int i7) {
        switch (this.a) {
            case 1:
                ug.x1 x1Var = (ug.x1) this.b;
                l0 l0Var = x1Var.I;
                if (l0Var != null) {
                    if (i7 != 4) {
                        if (i7 == 1) {
                            l0Var.play();
                            break;
                        }
                    } else {
                        l0Var.seekTo(0L);
                        x1Var.I.play();
                        break;
                    }
                }
                break;
            default:
                super.onStateChanged(z10, i7);
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new k0(this, i7, i10, i11, 0));
                break;
            default:
                super.onVideoSizeChanged(i7, i10, i11, f10);
                break;
        }
    }
}
