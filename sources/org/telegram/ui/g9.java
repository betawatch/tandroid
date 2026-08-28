package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g9 extends org.telegram.ui.Components.k41 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.k41.setup(new g9());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.i51 i51Var) {
        h9 h9Var = (h9) view;
        TLRPC.Chat chat = (TLRPC.Chat) l41Var.G;
        View.OnClickListener onClickListener = l41Var.D;
        h9Var.c = chat;
        org.telegram.ui.Components.jh0 jh0Var = h9Var.b;
        jh0Var.setTag(Long.valueOf(chat.id));
        h9Var.a.t(chat, null, null, (!ChatObject.isChannel(chat) || chat.megagroup) ? chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase() : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase(), false, false);
        jh0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, org.telegram.ui.Components.wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new h9(context);
    }
}
