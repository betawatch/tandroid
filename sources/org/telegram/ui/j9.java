package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class j9 extends org.telegram.ui.Components.x51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.x51.setup(new j9());
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, org.telegram.ui.Components.y51 y51Var, boolean z10, org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.u61 u61Var) {
        k9 k9Var = (k9) view;
        TLRPC.Chat chat = (TLRPC.Chat) y51Var.G;
        View.OnClickListener onClickListener = y51Var.D;
        k9Var.c = chat;
        org.telegram.ui.Components.ki0 ki0Var = k9Var.b;
        ki0Var.setTag(Long.valueOf(chat.id));
        k9Var.a.t(chat, null, null, (!ChatObject.isChannel(chat) || chat.megagroup) ? chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase() : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase(), false, false);
        ki0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new k9(context);
    }
}
