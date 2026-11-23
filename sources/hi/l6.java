package hi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class l6 extends m6 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // hi.m6
    public final String a() {
        return hd.N0(2131754818, null);
    }

    @Override // hi.m6
    public final String b() {
        return this.b.title;
    }

    @Override // hi.m6
    public final void c(org.telegram.ui.ActionBar.g2 g2Var) {
        g2Var.presentFragment(bn.ua(-this.b.id));
    }

    @Override // hi.m6
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        TLRPC.Chat chat = this.b;
        b9Var.q(chat);
        imageReceiver.i0(chat, b9Var, null);
    }
}
