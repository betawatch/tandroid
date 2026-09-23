package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class q40 implements ev0 {
    public final /* synthetic */ f60 a;

    public q40(f60 f60Var) {
        this.a = f60Var;
    }

    @Override // org.telegram.ui.ev0
    public final void E0(MessageObject messageObject) {
        ViewGroup viewGroup;
        f60 f60Var = this.a;
        f60Var.Q.I0(true);
        f60Var.c2.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.ev0
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.ev0
    public final /* synthetic */ TextureView j0() {
        return null;
    }
}
