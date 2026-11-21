package hi;

import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.ui.k71;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class e0 extends VideoPlayerHolderBase {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public boolean needRepeat() {
        switch (this.a) {
            case 0:
                return !((f0) this.b).p.o0;
            default:
                return super.needRepeat();
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                f0 f0Var = (f0) this.b;
                f0Var.f = true;
                f0Var.p.invalidate();
                break;
            default:
                ug.w1 w1Var = (ug.w1) this.b;
                TextureView textureView = w1Var.K;
                if (textureView != null && !w1Var.G) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new k71(this, 20)).setDuration(200L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public void onStateChanged(boolean z10, int i7) {
        switch (this.a) {
            case 1:
                ug.w1 w1Var = (ug.w1) this.b;
                e0 e0Var = w1Var.I;
                if (e0Var != null) {
                    if (i7 != 4) {
                        if (i7 == 1) {
                            e0Var.play();
                            break;
                        }
                    } else {
                        e0Var.seekTo(0L);
                        w1Var.I.play();
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
                org.telegram.messenger.g0.g3(new d0(this, i7, i10, i11, 0));
                break;
            default:
                super.onVideoSizeChanged(i7, i10, i11, f10);
                break;
        }
    }
}
