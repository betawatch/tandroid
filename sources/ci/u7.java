package ci;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class u7 extends v7 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // ci.v7
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override // ci.v7
    public final String b() {
        return this.b.title;
    }

    @Override // ci.v7
    public final void c(org.telegram.ui.ActionBar.o2 o2Var) {
        o2Var.presentFragment(bo.R9(-this.b.id));
    }

    @Override // ci.v7
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.f6) null);
        TLRPC.Chat chat = this.b;
        f9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, f9Var);
    }
}
