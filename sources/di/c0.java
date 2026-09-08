package di;

import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.ui.oj1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class c0 extends VideoPlayerHolderBase {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public boolean needRepeat() {
        switch (this.a) {
            case 0:
                return !((d0) this.b).p.n0;
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
                sg.c2 c2Var = (sg.c2) this.b;
                TextureView textureView = c2Var.J;
                if (textureView != null && !c2Var.F) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new oj1(this, 7)).setDuration(200L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public void onStateChanged(boolean z10, int i10) {
        switch (this.a) {
            case 1:
                sg.c2 c2Var = (sg.c2) this.b;
                c0 c0Var = c2Var.H;
                if (c0Var != null) {
                    if (i10 != 4) {
                        if (i10 == 1) {
                            c0Var.play();
                            break;
                        }
                    } else {
                        c0Var.seekTo(0L);
                        c2Var.H.play();
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
                AndroidUtilities.runOnUIThread(new b0(this, i10, i11, i12, 0));
                break;
            default:
                super.onVideoSizeChanged(i10, i11, i12, f7);
                break;
        }
    }
}
