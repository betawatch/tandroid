package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class m9 extends org.telegram.ui.Components.t61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.t61.setup(new m9());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.k71 k71Var, org.telegram.ui.Components.s71 s71Var) {
        n9 n9Var = (n9) view;
        TLRPC.Chat chat = (TLRPC.Chat) u61Var.G;
        View.OnClickListener onClickListener = u61Var.D;
        n9Var.c = chat;
        org.telegram.ui.Components.xi0 xi0Var = n9Var.b;
        xi0Var.setTag(Long.valueOf(chat.id));
        n9Var.a.s(chat, null, null, (!ChatObject.isChannel(chat) || chat.megagroup) ? chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase() : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase(), false, false);
        xi0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, org.telegram.ui.Components.nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new n9(context);
    }
}
