package ci;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
