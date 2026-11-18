package hi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class m6 extends n6 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // hi.n6
    public final String a() {
        return gd.M0(2131754819, null);
    }

    @Override // hi.n6
    public final String b() {
        return this.b.title;
    }

    @Override // hi.n6
    public final void c(org.telegram.ui.ActionBar.h2 h2Var) {
        h2Var.presentFragment(bn.ua(-this.b.id));
    }

    @Override // hi.n6
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        TLRPC.Chat chat = this.b;
        b9Var.q(chat);
        imageReceiver.i0(chat, b9Var, null);
    }
}
