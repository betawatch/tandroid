package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class d40 implements uu0 {
    public final /* synthetic */ u50 a;

    public d40(u50 u50Var) {
        this.a = u50Var;
    }

    @Override // org.telegram.ui.uu0
    public final /* synthetic */ TextureView U() {
        return null;
    }

    @Override // org.telegram.ui.uu0
    public final void m0(MessageObject messageObject) {
        ViewGroup viewGroup;
        u50 u50Var = this.a;
        u50Var.Q.I0(true);
        u50Var.c2.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.uu0
    public final void z(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.a).containerView;
        viewGroup.invalidate();
    }
}
