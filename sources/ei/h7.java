package ei;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class h7 extends i7 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // ei.i7
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override // ei.i7
    public final String b() {
        return this.b.title;
    }

    @Override // ei.i7
    public final void c(org.telegram.ui.ActionBar.o2 o2Var) {
        o2Var.presentFragment(sn.W9(-this.b.id));
    }

    @Override // ei.i7
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        TLRPC.Chat chat = this.b;
        h9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, h9Var);
    }
}
