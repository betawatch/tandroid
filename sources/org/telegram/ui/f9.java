package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f9 extends org.telegram.ui.Components.q31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.q31.h(new f9());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z10, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.l41 l41Var) {
        g9 g9Var = (g9) view;
        TLRPC.Chat chat = (TLRPC.Chat) r31Var.G;
        View.OnClickListener onClickListener = r31Var.D;
        g9Var.c = chat;
        org.telegram.ui.Components.dg0 dg0Var = g9Var.b;
        dg0Var.setTag(Long.valueOf(chat.id));
        g9Var.a.x(chat, null, null, (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? chat.has_geo ? org.telegram.messenger.bd.M0(2131748650, null) : !org.telegram.messenger.t3.t0(chat) ? org.telegram.messenger.bd.M0(2131748649, null).toLowerCase() : org.telegram.messenger.bd.M0(2131748646, null).toLowerCase() : !org.telegram.messenger.t3.t0(chat) ? org.telegram.messenger.bd.M0(2131752329, null).toLowerCase() : org.telegram.messenger.bd.M0(2131752318, null).toLowerCase(), false, false);
        dg0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, org.telegram.ui.Components.tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new g9(context);
    }
}
