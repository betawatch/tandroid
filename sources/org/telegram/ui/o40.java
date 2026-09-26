package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class o40 implements dv0 {
    public final /* synthetic */ d60 a;

    public o40(d60 d60Var) {
        this.a = d60Var;
    }

    @Override // org.telegram.ui.dv0
    public final void E0(MessageObject messageObject) {
        ViewGroup viewGroup;
        d60 d60Var = this.a;
        d60Var.Q.I0(true);
        d60Var.c2.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.dv0
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.dv0
    public final /* synthetic */ TextureView j0() {
        return null;
    }
}
