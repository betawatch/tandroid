package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c40 implements ku0 {
    public final /* synthetic */ s50 a;

    public c40(s50 s50Var) {
        this.a = s50Var;
    }

    @Override // org.telegram.ui.ku0
    public final /* synthetic */ TextureView K() {
        return null;
    }

    @Override // org.telegram.ui.ku0
    public final void w0(MessageObject messageObject) {
        ViewGroup viewGroup;
        s50 s50Var = this.a;
        s50Var.M.I0(true);
        s50Var.Y1.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.e3) s50Var).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.ku0
    public final void y(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
        viewGroup.invalidate();
    }
}
