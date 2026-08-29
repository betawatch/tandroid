package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c40 implements hu0 {
    public final /* synthetic */ r50 a;

    public c40(r50 r50Var) {
        this.a = r50Var;
    }

    @Override // org.telegram.ui.hu0
    public final void D(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.hu0
    public final /* synthetic */ TextureView b0() {
        return null;
    }

    @Override // org.telegram.ui.hu0
    public final void x0(MessageObject messageObject) {
        ViewGroup viewGroup;
        r50 r50Var = this.a;
        r50Var.M.I0(true);
        r50Var.Y1.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
        viewGroup.invalidate();
    }
}
