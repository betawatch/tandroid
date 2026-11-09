package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class o6 extends p6 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // fi.p6
    public final String a() {
        return id.M0(2131754819, null);
    }

    @Override // fi.p6
    public final String b() {
        return this.b.title;
    }

    @Override // fi.p6
    public final void c(org.telegram.ui.ActionBar.f2 f2Var) {
        f2Var.presentFragment(cn.ta(-this.b.id));
    }

    @Override // fi.p6
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        TLRPC.Chat chat = this.b;
        w8Var.q(chat);
        imageReceiver.i0(chat, w8Var, null);
    }
}
