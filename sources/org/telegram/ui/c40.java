package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class c40 implements tu0 {
    public final /* synthetic */ s50 a;

    public c40(s50 s50Var) {
        this.a = s50Var;
    }

    @Override // org.telegram.ui.tu0
    public final /* synthetic */ TextureView U() {
        return null;
    }

    @Override // org.telegram.ui.tu0
    public final void m0(MessageObject messageObject) {
        ViewGroup viewGroup;
        s50 s50Var = this.a;
        s50Var.Q.I0(true);
        s50Var.c2.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.tu0
    public final void z(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
        viewGroup.invalidate();
    }
}
