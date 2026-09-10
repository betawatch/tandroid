package bi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class v8 extends w8 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // bi.w8
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override // bi.w8
    public final String b() {
        return this.b.title;
    }

    @Override // bi.w8
    public final void c(org.telegram.ui.ActionBar.p2 p2Var) {
        p2Var.presentFragment(eo.R9(-this.b.id));
    }

    @Override // bi.w8
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        TLRPC.Chat chat = this.b;
        g9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, g9Var);
    }
}
