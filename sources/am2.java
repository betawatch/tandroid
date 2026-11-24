// default package

import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class am2 extends VideoPlayerHolderBase {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ am2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        switch (this.a) {
            case 0:
                return !((bm2) this.b).p.o0;
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
                bm2 bm2Var = (bm2) obj;
                bm2Var.f = true;
                bm2Var.p.invalidate();
                break;
            default:
                bec becVar = (bec) obj;
                TextureView textureView = becVar.K;
                if (textureView != null && !becVar.G) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new q7b(this, (byte) 18)).setDuration(200L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onStateChanged(boolean z, int i) {
        switch (this.a) {
            case 1:
                bec becVar = (bec) this.b;
                am2 am2Var = becVar.I;
                if (am2Var != null) {
                    if (i != 4) {
                        if (i == 1) {
                            am2Var.play();
                            break;
                        }
                    } else {
                        am2Var.seekTo(0L);
                        becVar.I.play();
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
                gm.c3(new zl2(this, i, i2, i3, (byte) 0));
                break;
            default:
                super.onVideoSizeChanged(i, i2, i3, f);
                break;
        }
    }
}
