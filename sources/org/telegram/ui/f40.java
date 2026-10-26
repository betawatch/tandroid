package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class f40 implements yu0 {
    public final /* synthetic */ v50 a;

    public f40(v50 v50Var) {
        this.a = v50Var;
    }

    @Override // org.telegram.ui.yu0
    public final void B0(MessageObject messageObject) {
        ViewGroup viewGroup;
        v50 v50Var = this.a;
        v50Var.Q.I0(true);
        v50Var.c2.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.yu0
    public final void E(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.a).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.yu0
    public final /* synthetic */ TextureView f0() {
        return null;
    }
}
