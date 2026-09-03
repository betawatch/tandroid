package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class a3 extends VideoPlayerHolderBase {
    public final /* synthetic */ b3 a;

    public a3(b3 b3Var) {
        this.a = b3Var;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return true;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        super.onRenderedFirstFrame();
        if (this.firstFrameRendered) {
            return;
        }
        this.firstFrameRendered = true;
        b3 b3Var = this.a;
        b3Var.n.setAlpha(1.0f);
        TL_iv.pageBlockVideo pageblockvideo = b3Var.I;
        if (pageblockvideo != null) {
            p70 p70Var = b3Var.a;
            a0.h hVar = p70Var.y;
            long j10 = pageblockvideo.video_id;
            c3 a2 = c3.a(p70Var.w, b3Var);
            b3Var.c(a2);
            hVar.k(a2, j10);
        }
    }
}
