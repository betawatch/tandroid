package eg;

import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rg;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class t2 extends VideoPlayerHolderBase {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public boolean needRepeat() {
        switch (this.a) {
            case 1:
                return !((ph.x) this.b).p.k0;
            default:
                return super.needRepeat();
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                u2 u2Var = (u2) this.b;
                TextureView textureView = u2Var.G;
                if (textureView != null && !u2Var.C) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new cg.l0(this, 4)).setDuration(200L);
                    break;
                }
                break;
            default:
                ph.x xVar = (ph.x) this.b;
                xVar.f = true;
                xVar.p.invalidate();
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public void onStateChanged(boolean z4, int i10) {
        switch (this.a) {
            case 0:
                u2 u2Var = (u2) this.b;
                t2 t2Var = u2Var.E;
                if (t2Var != null) {
                    if (i10 != 4) {
                        if (i10 == 1) {
                            t2Var.play();
                            break;
                        }
                    } else {
                        t2Var.seekTo(0L);
                        u2Var.E.play();
                        break;
                    }
                }
                break;
            default:
                super.onStateChanged(z4, i10);
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        switch (this.a) {
            case 1:
                AndroidUtilities.runOnUIThread(new rg(this, i10, i11, i12, 1));
                break;
            default:
                super.onVideoSizeChanged(i10, i11, i12, f10);
                break;
        }
    }
}
