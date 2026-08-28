package kh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i7 extends j7 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // kh.j7
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override // kh.j7
    public final String b() {
        return this.b.title;
    }

    @Override // kh.j7
    public final void c(org.telegram.ui.ActionBar.o2 o2Var) {
        o2Var.presentFragment(qn.R9(-this.b.id));
    }

    @Override // kh.j7
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        TLRPC.Chat chat = this.b;
        z8Var.q(chat);
        imageReceiver.setForUserOrChat(chat, z8Var);
    }
}
