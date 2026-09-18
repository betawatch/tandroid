package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class k9 extends org.telegram.ui.Components.i51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.i51.setup(new k9());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z10, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.f61 f61Var) {
        l9 l9Var = (l9) view;
        TLRPC.Chat chat = (TLRPC.Chat) j51Var.G;
        View.OnClickListener onClickListener = j51Var.D;
        l9Var.c = chat;
        org.telegram.ui.Components.yh0 yh0Var = l9Var.b;
        yh0Var.setTag(Long.valueOf(chat.id));
        l9Var.a.t(chat, null, null, (!ChatObject.isChannel(chat) || chat.megagroup) ? chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase() : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase(), false, false);
        yh0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new l9(context);
    }
}
