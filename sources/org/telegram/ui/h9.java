package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class h9 extends org.telegram.ui.Components.n41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.n41.h(new h9());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, org.telegram.ui.Components.o41 o41Var, boolean z10, org.telegram.ui.Components.c51 c51Var, org.telegram.ui.Components.h51 h51Var) {
        i9 i9Var = (i9) view;
        TLRPC.Chat chat = (TLRPC.Chat) o41Var.H;
        View.OnClickListener onClickListener = o41Var.E;
        i9Var.c = chat;
        org.telegram.ui.Components.pg0 pg0Var = i9Var.b;
        pg0Var.setTag(Long.valueOf(chat.id));
        i9Var.a.x(chat, null, null, (!org.telegram.messenger.v3.T(chat) || chat.megagroup) ? chat.has_geo ? org.telegram.messenger.hd.N0(2131748449, null) : !org.telegram.messenger.v3.t0(chat) ? org.telegram.messenger.hd.N0(2131748448, null).toLowerCase() : org.telegram.messenger.hd.N0(2131748445, null).toLowerCase() : !org.telegram.messenger.v3.t0(chat) ? org.telegram.messenger.hd.N0(2131752317, null).toLowerCase() : org.telegram.messenger.hd.N0(2131752306, null).toLowerCase(), false, false);
        pg0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new i9(context);
    }
}
