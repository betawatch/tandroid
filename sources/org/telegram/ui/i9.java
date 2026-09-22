package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class i9 extends org.telegram.ui.Components.h51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.h51.setup(new i9());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z10, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.e61 e61Var) {
        j9 j9Var = (j9) view;
        TLRPC.Chat chat = (TLRPC.Chat) i51Var.G;
        View.OnClickListener onClickListener = i51Var.D;
        j9Var.c = chat;
        org.telegram.ui.Components.xh0 xh0Var = j9Var.b;
        xh0Var.setTag(Long.valueOf(chat.id));
        j9Var.a.t(chat, null, null, (!ChatObject.isChannel(chat) || chat.megagroup) ? chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase() : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase(), false, false);
        xh0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new j9(context);
    }
}
