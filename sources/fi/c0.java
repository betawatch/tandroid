package fi;

import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.ui.r81;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class c0 extends VideoPlayerHolderBase {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0(Object obj, int i7) {
        this.a = i7;
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
                ug.t1 t1Var = (ug.t1) this.b;
                TextureView textureView = t1Var.J;
                if (textureView != null && !t1Var.F) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new r81(this, 19)).setDuration(200L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public void onStateChanged(boolean z9, int i7) {
        switch (this.a) {
            case 1:
                ug.t1 t1Var = (ug.t1) this.b;
                c0 c0Var = t1Var.H;
                if (c0Var != null) {
                    if (i7 != 4) {
                        if (i7 == 1) {
                            c0Var.play();
                            break;
                        }
                    } else {
                        c0Var.seekTo(0L);
                        t1Var.H.play();
                        break;
                    }
                }
                break;
            default:
                super.onStateChanged(z9, i7);
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new b0(this, i7, i10, i11, 0));
                break;
            default:
                super.onVideoSizeChanged(i7, i10, i11, f10);
                break;
        }
    }
}
