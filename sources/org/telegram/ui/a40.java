package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
