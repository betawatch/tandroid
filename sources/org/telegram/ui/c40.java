package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
