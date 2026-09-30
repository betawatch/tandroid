package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
