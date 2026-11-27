// default package

import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class il2 extends VideoPlayerHolderBase {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ il2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        switch (this.a) {
            case 0:
                return !((jl2) this.b).p.o0;
            default:
                return super.needRepeat();
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                jl2 jl2Var = (jl2) obj;
                jl2Var.f = true;
                jl2Var.p.invalidate();
                break;
            default:
                yfc yfcVar = (yfc) obj;
                TextureView textureView = yfcVar.K;
                if (textureView != null && !yfcVar.G) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new omb(this, (byte) 15)).setDuration(200L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onStateChanged(boolean z, int i) {
        switch (this.a) {
            case 1:
                yfc yfcVar = (yfc) this.b;
                il2 il2Var = yfcVar.I;
                if (il2Var != null) {
                    if (i != 4) {
                        if (i == 1) {
                            il2Var.play();
                            break;
                        }
                    } else {
                        il2Var.seekTo(0L);
                        yfcVar.I.play();
                        break;
                    }
                }
                break;
            default:
                super.onStateChanged(z, i);
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        switch (this.a) {
            case 0:
                hl.c3(new hl2(this, i, i2, i3, (byte) 0));
                break;
            default:
                super.onVideoSizeChanged(i, i2, i3, f);
                break;
        }
    }
}
