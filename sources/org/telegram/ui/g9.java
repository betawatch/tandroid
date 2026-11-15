package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g9 extends org.telegram.ui.Components.a41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.a41.h(new g9());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, org.telegram.ui.Components.b41 b41Var, boolean z10, org.telegram.ui.Components.p41 p41Var, org.telegram.ui.Components.u41 u41Var) {
        h9 h9Var = (h9) view;
        TLRPC.Chat chat = (TLRPC.Chat) b41Var.G;
        View.OnClickListener onClickListener = b41Var.D;
        h9Var.c = chat;
        org.telegram.ui.Components.dg0 dg0Var = h9Var.b;
        dg0Var.setTag(Long.valueOf(chat.id));
        h9Var.a.x(chat, null, null, (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? chat.has_geo ? org.telegram.messenger.hd.M0(2131748642, null) : !org.telegram.messenger.t3.t0(chat) ? org.telegram.messenger.hd.M0(2131748641, null).toLowerCase() : org.telegram.messenger.hd.M0(2131748638, null).toLowerCase() : !org.telegram.messenger.t3.t0(chat) ? org.telegram.messenger.hd.M0(2131752329, null).toLowerCase() : org.telegram.messenger.hd.M0(2131752318, null).toLowerCase(), false, false);
        dg0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, org.telegram.ui.Components.uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new h9(context);
    }
}
