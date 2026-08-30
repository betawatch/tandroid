package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class o40 implements ru0 {
    public final /* synthetic */ c60 a;

    public o40(c60 c60Var) {
        this.a = c60Var;
    }

    @Override // org.telegram.ui.ru0
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.a).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.ru0
    public final /* synthetic */ TextureView f0() {
        return null;
    }

    @Override // org.telegram.ui.ru0
    public final void w0(MessageObject messageObject) {
        ViewGroup viewGroup;
        c60 c60Var = this.a;
        c60Var.N.I0(true);
        c60Var.Z1.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
        viewGroup.invalidate();
    }
}
