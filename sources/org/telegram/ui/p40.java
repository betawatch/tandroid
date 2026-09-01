package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class p40 implements tu0 {
    public final /* synthetic */ d60 a;

    public p40(d60 d60Var) {
        this.a = d60Var;
    }

    @Override // org.telegram.ui.tu0
    public final void G(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.a).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.tu0
    public final /* synthetic */ TextureView h0() {
        return null;
    }

    @Override // org.telegram.ui.tu0
    public final void y0(MessageObject messageObject) {
        ViewGroup viewGroup;
        d60 d60Var = this.a;
        d60Var.N.I0(true);
        d60Var.Z1.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
        viewGroup.invalidate();
    }
}
