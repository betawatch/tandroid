package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class p40 implements yu0 {
    public final /* synthetic */ d60 a;

    public p40(d60 d60Var) {
        this.a = d60Var;
    }

    @Override // org.telegram.ui.yu0
    public final void G(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.a).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.yu0
    public final /* synthetic */ TextureView h0() {
        return null;
    }

    @Override // org.telegram.ui.yu0
    public final void y0(MessageObject messageObject) {
        ViewGroup viewGroup;
        d60 d60Var = this.a;
        d60Var.N.I0(true);
        d60Var.Z1.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
        viewGroup.invalidate();
    }
}
