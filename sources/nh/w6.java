package nh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class w6 extends x6 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // nh.x6
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override // nh.x6
    public final String b() {
        return this.b.title;
    }

    @Override // nh.x6
    public final void c(org.telegram.ui.ActionBar.o2 o2Var) {
        o2Var.presentFragment(tn.R9(-this.b.id));
    }

    @Override // nh.x6
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        TLRPC.Chat chat = this.b;
        e9Var.q(chat);
        imageReceiver.setForUserOrChat(chat, e9Var);
    }
}
