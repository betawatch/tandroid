package di;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.co;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final class u7 extends v7 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // di.v7
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override // di.v7
    public final String b() {
        return this.b.title;
    }

    @Override // di.v7
    public final void c(org.telegram.ui.ActionBar.n2 n2Var) {
        n2Var.presentFragment(co.R9(-this.b.id));
    }

    @Override // di.v7
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        TLRPC.Chat chat = this.b;
        i9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, i9Var);
    }
}
