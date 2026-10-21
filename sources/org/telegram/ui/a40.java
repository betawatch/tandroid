package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class a40 implements ru0 {
    public final /* synthetic */ q50 a;

    public a40(q50 q50Var) {
        this.a = q50Var;
    }

    @Override // org.telegram.ui.ru0
    public final /* synthetic */ TextureView U() {
        return null;
    }

    @Override // org.telegram.ui.ru0
    public final void m0(MessageObject messageObject) {
        ViewGroup viewGroup;
        q50 q50Var = this.a;
        q50Var.Q.I0(true);
        q50Var.c2.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.ru0
    public final void z(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
        viewGroup.invalidate();
    }
}
