package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class m9 extends org.telegram.ui.Components.s61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.s61.setup(new m9());
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, org.telegram.ui.Components.t61 t61Var, boolean z10, org.telegram.ui.Components.j71 j71Var, org.telegram.ui.Components.r71 r71Var) {
        n9 n9Var = (n9) view;
        TLRPC.Chat chat = (TLRPC.Chat) t61Var.G;
        View.OnClickListener onClickListener = t61Var.D;
        n9Var.c = chat;
        org.telegram.ui.Components.wi0 wi0Var = n9Var.b;
        wi0Var.setTag(Long.valueOf(chat.id));
        n9Var.a.s(chat, null, null, (!ChatObject.isChannel(chat) || chat.megagroup) ? chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase() : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase(), false, false);
        wi0Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new n9(context);
    }
}
