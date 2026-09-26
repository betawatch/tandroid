package ci;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class r7 extends s7 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // ci.s7
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override // ci.s7
    public final String b() {
        return this.b.title;
    }

    @Override // ci.s7
    public final void c(org.telegram.ui.ActionBar.m2 m2Var) {
        m2Var.presentFragment(wn.R9(-this.b.id));
    }

    @Override // ci.s7
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        TLRPC.Chat chat = this.b;
        h9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, h9Var);
    }
}
