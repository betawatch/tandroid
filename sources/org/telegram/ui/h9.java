package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h9 extends org.telegram.ui.Components.m41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.m41.h(new h9());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.g51 g51Var) {
        i9 i9Var = (i9) view;
        TLRPC.Chat chat = (TLRPC.Chat) n41Var.H;
        View.OnClickListener onClickListener = n41Var.E;
        i9Var.c = chat;
        org.telegram.ui.Components.og0 og0Var = i9Var.b;
        og0Var.setTag(Long.valueOf(chat.id));
        i9Var.a.z(chat, null, null, (!org.telegram.messenger.v3.T(chat) || chat.megagroup) ? chat.has_geo ? org.telegram.messenger.gd.N0(2131748449, null) : !org.telegram.messenger.v3.t0(chat) ? org.telegram.messenger.gd.N0(2131748448, null).toLowerCase() : org.telegram.messenger.gd.N0(2131748445, null).toLowerCase() : !org.telegram.messenger.v3.t0(chat) ? org.telegram.messenger.gd.N0(2131752317, null).toLowerCase() : org.telegram.messenger.gd.N0(2131752306, null).toLowerCase(), false, false);
        og0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new i9(context);
    }
}
