package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class e7 extends f7 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // fi.f7
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override // fi.f7
    public final String b() {
        return this.b.title;
    }

    @Override // fi.f7
    public final void c(org.telegram.ui.ActionBar.r2 r2Var) {
        r2Var.presentFragment(wn.ea(-this.b.id));
    }

    @Override // fi.f7
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        TLRPC.Chat chat = this.b;
        j9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, j9Var);
    }
}
