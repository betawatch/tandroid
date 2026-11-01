package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class h9 extends org.telegram.ui.Components.a51 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.a51.h(new h9());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, org.telegram.ui.Components.b51 b51Var, boolean z10, org.telegram.ui.Components.q51 q51Var, org.telegram.ui.Components.v51 v51Var) {
        i9 i9Var = (i9) view;
        TLRPC.Chat chat = (TLRPC.Chat) b51Var.G;
        View.OnClickListener onClickListener = b51Var.D;
        i9Var.c = chat;
        org.telegram.ui.Components.dh0 dh0Var = i9Var.b;
        dh0Var.setTag(Long.valueOf(chat.id));
        i9Var.a.z(chat, null, null, (!org.telegram.messenger.w3.T(chat) || chat.megagroup) ? chat.has_geo ? org.telegram.messenger.dd.L0(2131748657, null) : !org.telegram.messenger.w3.t0(chat) ? org.telegram.messenger.dd.L0(2131748656, null).toLowerCase() : org.telegram.messenger.dd.L0(2131748653, null).toLowerCase() : !org.telegram.messenger.w3.t0(chat) ? org.telegram.messenger.dd.L0(2131752329, null).toLowerCase() : org.telegram.messenger.dd.L0(2131752318, null).toLowerCase(), false, false);
        dh0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, org.telegram.ui.Components.uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new i9(context);
    }
}
