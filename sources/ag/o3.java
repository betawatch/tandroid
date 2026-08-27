package ag;

import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o3 extends VideoPlayerHolderBase {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public boolean needRepeat() {
        switch (this.a) {
            case 1:
                return !((lh.d0) this.b).p.j0;
            default:
                return super.needRepeat();
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                p3 p3Var = (p3) this.b;
                TextureView textureView = p3Var.F;
                if (textureView != null && !p3Var.B) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new r1(this, 1)).setDuration(200L);
                    break;
                }
                break;
            default:
                lh.d0 d0Var = (lh.d0) this.b;
                d0Var.f = true;
                d0Var.p.invalidate();
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public void onStateChanged(boolean z10, int i10) {
        switch (this.a) {
            case 0:
                p3 p3Var = (p3) this.b;
                o3 o3Var = p3Var.D;
                if (o3Var != null) {
                    if (i10 != 4) {
                        if (i10 == 1) {
                            o3Var.play();
                            break;
                        }
                    } else {
                        o3Var.seekTo(0L);
                        p3Var.D.play();
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
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        switch (this.a) {
            case 1:
                AndroidUtilities.runOnUIThread(new lh.c0(this, i10, i11, i12, 0));
                break;
            default:
                super.onVideoSizeChanged(i10, i11, i12, f10);
                break;
        }
    }
}
