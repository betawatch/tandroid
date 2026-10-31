package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h9 extends org.telegram.ui.Components.z41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.z41.h(new h9());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, org.telegram.ui.Components.a51 a51Var, boolean z10, org.telegram.ui.Components.p51 p51Var, org.telegram.ui.Components.u51 u51Var) {
        i9 i9Var = (i9) view;
        TLRPC.Chat chat = (TLRPC.Chat) a51Var.G;
        View.OnClickListener onClickListener = a51Var.D;
        i9Var.c = chat;
        org.telegram.ui.Components.ch0 ch0Var = i9Var.b;
        ch0Var.setTag(Long.valueOf(chat.id));
        i9Var.a.z(chat, null, null, (!org.telegram.messenger.w3.T(chat) || chat.megagroup) ? chat.has_geo ? org.telegram.messenger.cd.L0(2131748657, null) : !org.telegram.messenger.w3.t0(chat) ? org.telegram.messenger.cd.L0(2131748656, null).toLowerCase() : org.telegram.messenger.cd.L0(2131748653, null).toLowerCase() : !org.telegram.messenger.w3.t0(chat) ? org.telegram.messenger.cd.L0(2131752329, null).toLowerCase() : org.telegram.messenger.cd.L0(2131752318, null).toLowerCase(), false, false);
        ch0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, org.telegram.ui.Components.tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new i9(context);
    }
}
