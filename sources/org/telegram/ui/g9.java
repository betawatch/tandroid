package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class g9 extends org.telegram.ui.Components.w31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.w31.h(new g9());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.q41 q41Var) {
        h9 h9Var = (h9) view;
        TLRPC.Chat chat = (TLRPC.Chat) x31Var.G;
        View.OnClickListener onClickListener = x31Var.D;
        h9Var.c = chat;
        org.telegram.ui.Components.ag0 ag0Var = h9Var.b;
        ag0Var.setTag(Long.valueOf(chat.id));
        h9Var.a.x(chat, null, null, (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? chat.has_geo ? org.telegram.messenger.hd.M0(2131748641, null) : !org.telegram.messenger.t3.t0(chat) ? org.telegram.messenger.hd.M0(2131748640, null).toLowerCase() : org.telegram.messenger.hd.M0(2131748637, null).toLowerCase() : !org.telegram.messenger.t3.t0(chat) ? org.telegram.messenger.hd.M0(2131752329, null).toLowerCase() : org.telegram.messenger.hd.M0(2131752318, null).toLowerCase(), false, false);
        ag0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new h9(context);
    }
}
