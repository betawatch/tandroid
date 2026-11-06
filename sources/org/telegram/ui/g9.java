package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class g9 extends org.telegram.ui.Components.q31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.q31.h(new g9());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z9, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.k41 k41Var) {
        h9 h9Var = (h9) view;
        TLRPC.Chat chat = (TLRPC.Chat) r31Var.G;
        View.OnClickListener onClickListener = r31Var.D;
        h9Var.c = chat;
        org.telegram.ui.Components.ag0 ag0Var = h9Var.b;
        ag0Var.setTag(Long.valueOf(chat.id));
        h9Var.a.x(chat, null, null, (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? chat.has_geo ? org.telegram.messenger.hd.M0(2131748641, null) : !org.telegram.messenger.t3.t0(chat) ? org.telegram.messenger.hd.M0(2131748640, null).toLowerCase() : org.telegram.messenger.hd.M0(2131748637, null).toLowerCase() : !org.telegram.messenger.t3.t0(chat) ? org.telegram.messenger.hd.M0(2131752329, null).toLowerCase() : org.telegram.messenger.hd.M0(2131752318, null).toLowerCase(), false, false);
        ag0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new h9(context);
    }
}
