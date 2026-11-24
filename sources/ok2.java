// default package

import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ok2 extends VideoPlayerHolderBase {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ok2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        switch (this.a) {
            case 0:
                return !((pk2) this.b).p.o0;
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
                pk2 pk2Var = (pk2) obj;
                pk2Var.f = true;
                pk2Var.p.invalidate();
                break;
            default:
                acc accVar = (acc) obj;
                TextureView textureView = accVar.K;
                if (textureView != null && !accVar.G) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new iab(this, (byte) 16)).setDuration(200L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onStateChanged(boolean z, int i) {
        switch (this.a) {
            case 1:
                acc accVar = (acc) this.b;
                ok2 ok2Var = accVar.I;
                if (ok2Var != null) {
                    if (i != 4) {
                        if (i == 1) {
                            ok2Var.play();
                            break;
                        }
                    } else {
                        ok2Var.seekTo(0L);
                        accVar.I.play();
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
                gl.d3(new nk2(this, i, i2, i3, (byte) 0));
                break;
            default:
                super.onVideoSizeChanged(i, i2, i3, f);
                break;
        }
    }
}
