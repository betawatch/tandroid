package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class g9 extends org.telegram.ui.Components.k41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.k41.h(new g9());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.e51 e51Var) {
        h9 h9Var = (h9) view;
        TLRPC.Chat chat = (TLRPC.Chat) l41Var.H;
        View.OnClickListener onClickListener = l41Var.E;
        h9Var.c = chat;
        org.telegram.ui.Components.ng0 ng0Var = h9Var.b;
        ng0Var.setTag(Long.valueOf(chat.id));
        h9Var.a.x(chat, null, null, (!org.telegram.messenger.v3.T(chat) || chat.megagroup) ? chat.has_geo ? org.telegram.messenger.gd.M0(2131748450, null) : !org.telegram.messenger.v3.t0(chat) ? org.telegram.messenger.gd.M0(2131748449, null).toLowerCase() : org.telegram.messenger.gd.M0(2131748446, null).toLowerCase() : !org.telegram.messenger.v3.t0(chat) ? org.telegram.messenger.gd.M0(2131752318, null).toLowerCase() : org.telegram.messenger.gd.M0(2131752307, null).toLowerCase(), false, false);
        ng0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, org.telegram.ui.Components.ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new h9(context);
    }
}
