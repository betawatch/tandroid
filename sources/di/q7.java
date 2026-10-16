package di;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class q7 extends r7 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // di.r7
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override // di.r7
    public final String b() {
        return this.b.title;
    }

    @Override // di.r7
    public final void c(org.telegram.ui.ActionBar.m2 m2Var) {
        m2Var.presentFragment(fo.W9(-this.b.id));
    }

    @Override // di.r7
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        TLRPC.Chat chat = this.b;
        k9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, k9Var);
    }
}
