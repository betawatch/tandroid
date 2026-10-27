package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class h40 implements av0 {
    public final /* synthetic */ x50 a;

    public h40(x50 x50Var) {
        this.a = x50Var;
    }

    @Override // org.telegram.ui.av0
    public final void B0(MessageObject messageObject) {
        ViewGroup viewGroup;
        x50 x50Var = this.a;
        x50Var.Q.I0(true);
        x50Var.c2.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.av0
    public final void E(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.a).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.av0
    public final /* synthetic */ TextureView f0() {
        return null;
    }
}
