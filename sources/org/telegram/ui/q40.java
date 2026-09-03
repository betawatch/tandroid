package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class q40 implements yu0 {
    public final /* synthetic */ e60 a;

    public q40(e60 e60Var) {
        this.a = e60Var;
    }

    @Override // org.telegram.ui.yu0
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.a).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.yu0
    public final /* synthetic */ TextureView e0() {
        return null;
    }

    @Override // org.telegram.ui.yu0
    public final void w0(MessageObject messageObject) {
        ViewGroup viewGroup;
        e60 e60Var = this.a;
        e60Var.N.I0(true);
        e60Var.Z1.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
        viewGroup.invalidate();
    }
}
