package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f9 extends org.telegram.ui.Components.v41 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.v41.setup(new f9());
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, org.telegram.ui.Components.w41 w41Var, boolean z10, org.telegram.ui.Components.k51 k51Var, org.telegram.ui.Components.u51 u51Var) {
        g9 g9Var = (g9) view;
        TLRPC.Chat chat = (TLRPC.Chat) w41Var.G;
        View.OnClickListener onClickListener = w41Var.D;
        g9Var.c = chat;
        org.telegram.ui.Components.th0 th0Var = g9Var.b;
        th0Var.setTag(Long.valueOf(chat.id));
        g9Var.a.t(chat, null, null, (!ChatObject.isChannel(chat) || chat.megagroup) ? chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase() : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase(), false, false);
        th0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, org.telegram.ui.Components.jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new g9(context);
    }
}
