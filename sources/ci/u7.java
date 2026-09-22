package ci;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
    public final void c(org.telegram.ui.ActionBar.n2 n2Var) {
        n2Var.presentFragment(bo.R9(-this.b.id));
    }

    @Override // ci.v7
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
        TLRPC.Chat chat = this.b;
        f9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, f9Var);
    }
}
