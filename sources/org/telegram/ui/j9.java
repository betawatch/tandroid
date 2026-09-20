package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class j9 extends org.telegram.ui.Components.v51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.v51.setup(new j9());
    }

    @Override // org.telegram.ui.Components.v51
    public final void bindView(View view, org.telegram.ui.Components.w51 w51Var, boolean z10, org.telegram.ui.Components.k61 k61Var, org.telegram.ui.Components.s61 s61Var) {
        k9 k9Var = (k9) view;
        TLRPC.Chat chat = (TLRPC.Chat) w51Var.G;
        View.OnClickListener onClickListener = w51Var.D;
        k9Var.c = chat;
        org.telegram.ui.Components.hi0 hi0Var = k9Var.b;
        hi0Var.setTag(Long.valueOf(chat.id));
        k9Var.a.t(chat, null, null, (!ChatObject.isChannel(chat) || chat.megagroup) ? chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase() : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase(), false, false);
        hi0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.v51
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new k9(context);
    }
}
