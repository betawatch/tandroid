package fg;

import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rg;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class s2 extends VideoPlayerHolderBase {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public boolean needRepeat() {
        switch (this.a) {
            case 1:
                return !((qh.x) this.b).p.k0;
            default:
                return super.needRepeat();
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                t2 t2Var = (t2) this.b;
                TextureView textureView = t2Var.G;
                if (textureView != null && !t2Var.C) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new dg.l0(this, 4)).setDuration(200L);
                    break;
                }
                break;
            default:
                qh.x xVar = (qh.x) this.b;
                xVar.f = true;
                xVar.p.invalidate();
                break;
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public void onStateChanged(boolean z4, int i10) {
        switch (this.a) {
            case 0:
                t2 t2Var = (t2) this.b;
                s2 s2Var = t2Var.E;
                if (s2Var != null) {
                    if (i10 != 4) {
                        if (i10 == 1) {
                            s2Var.play();
                            break;
                        }
                    } else {
                        s2Var.seekTo(0L);
                        t2Var.E.play();
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
