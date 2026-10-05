package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class k9 extends org.telegram.ui.Components.g61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.g61.setup(new k9());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.w61 w61Var, org.telegram.ui.Components.e71 e71Var) {
        l9 l9Var = (l9) view;
        TLRPC.Chat chat = (TLRPC.Chat) h61Var.G;
        View.OnClickListener onClickListener = h61Var.D;
        l9Var.c = chat;
        org.telegram.ui.Components.ki0 ki0Var = l9Var.b;
        ki0Var.setTag(Long.valueOf(chat.id));
        l9Var.a.t(chat, null, null, (!ChatObject.isChannel(chat) || chat.megagroup) ? chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase() : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase(), false, false);
        ki0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new l9(context);
    }
}
