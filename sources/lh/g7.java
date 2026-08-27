package lh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class g7 extends h7 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // lh.h7
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override // lh.h7
    public final String b() {
        return this.b.title;
    }

    @Override // lh.h7
    public final void c(org.telegram.ui.ActionBar.n2 n2Var) {
        n2Var.presentFragment(rn.R9(-this.b.id));
    }

    @Override // lh.h7
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        TLRPC.Chat chat = this.b;
        y8Var.q(chat);
        imageReceiver.setForUserOrChat(chat, y8Var);
    }
}
