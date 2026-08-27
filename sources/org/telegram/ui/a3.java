package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        TL_iv.pageBlockVideo pageblockvideo = b3Var.H;
        if (pageblockvideo != null) {
            d70 d70Var = b3Var.a;
            a0.h hVar = d70Var.y;
            long j10 = pageblockvideo.video_id;
            c3 a2 = c3.a(d70Var.w, b3Var);
            b3Var.c(a2);
            hVar.k(a2, j10);
        }
    }
}
