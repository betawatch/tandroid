package kh;

import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.ui.te1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class d0 extends VideoPlayerHolderBase {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public boolean needRepeat() {
        switch (this.a) {
            case 0:
                return !((e0) this.b).p.j0;
            default:
                return super.needRepeat();
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.b;
                e0Var.f = true;
                e0Var.p.invalidate();
                break;
            default:
                zf.z1 z1Var = (zf.z1) this.b;
                TextureView textureView = z1Var.F;
                if (textureView != null && !z1Var.B) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new te1(this, 13)).setDuration(200L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public void onStateChanged(boolean z10, int i9) {
        switch (this.a) {
            case 1:
                zf.z1 z1Var = (zf.z1) this.b;
                d0 d0Var = z1Var.D;
                if (d0Var != null) {
                    if (i9 != 4) {
                        if (i9 == 1) {
                            d0Var.play();
                            break;
                        }
                    } else {
                        d0Var.seekTo(0L);
                        z1Var.D.play();
                        break;
                    }
                }
                break;
            default:
                super.onStateChanged(z10, i9);
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c0(this, i9, i10, i11, 0));
                break;
            default:
                super.onVideoSizeChanged(i9, i10, i11, f10);
                break;
        }
    }
}
