package hi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class v6 extends w6 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // hi.w6
    public final String a() {
        return gd.N0(2131754818, null);
    }

    @Override // hi.w6
    public final String b() {
        return this.b.title;
    }

    @Override // hi.w6
    public final void c(org.telegram.ui.ActionBar.g2 g2Var) {
        g2Var.presentFragment(bn.ua(-this.b.id));
    }

    @Override // hi.w6
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        TLRPC.Chat chat = this.b;
        a9Var.q(chat);
        imageReceiver.j0(chat, a9Var, null);
    }
}
