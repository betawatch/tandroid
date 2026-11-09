package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g9 extends org.telegram.ui.Components.x31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.x31.h(new g9());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, org.telegram.ui.Components.y31 y31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        h9 h9Var = (h9) view;
        TLRPC.Chat chat = (TLRPC.Chat) y31Var.G;
        View.OnClickListener onClickListener = y31Var.D;
        h9Var.c = chat;
        org.telegram.ui.Components.bg0 bg0Var = h9Var.b;
        bg0Var.setTag(Long.valueOf(chat.id));
        h9Var.a.x(chat, null, null, (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? chat.has_geo ? org.telegram.messenger.id.M0(2131748642, null) : !org.telegram.messenger.t3.t0(chat) ? org.telegram.messenger.id.M0(2131748641, null).toLowerCase() : org.telegram.messenger.id.M0(2131748638, null).toLowerCase() : !org.telegram.messenger.t3.t0(chat) ? org.telegram.messenger.id.M0(2131752329, null).toLowerCase() : org.telegram.messenger.id.M0(2131752318, null).toLowerCase(), false, false);
        bg0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, org.telegram.ui.Components.qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new h9(context);
    }
}
