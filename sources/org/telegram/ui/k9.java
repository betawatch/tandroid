package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class k9 extends org.telegram.ui.Components.f61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.f61.setup(new k9());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, org.telegram.ui.Components.g61 g61Var, boolean z10, org.telegram.ui.Components.t61 t61Var, org.telegram.ui.Components.b71 b71Var) {
        l9 l9Var = (l9) view;
        TLRPC.Chat chat = (TLRPC.Chat) g61Var.G;
        View.OnClickListener onClickListener = g61Var.D;
        l9Var.c = chat;
        org.telegram.ui.Components.ti0 ti0Var = l9Var.b;
        ti0Var.setTag(Long.valueOf(chat.id));
        l9Var.a.u(chat, null, null, (!ChatObject.isChannel(chat) || chat.megagroup) ? chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase() : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase(), false, false);
        ti0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new l9(context);
    }
}
