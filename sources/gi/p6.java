package gi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p6 extends q6 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // gi.q6
    public final String a() {
        return bd.M0(2131754819, null);
    }

    @Override // gi.q6
    public final String b() {
        return this.b.title;
    }

    @Override // gi.q6
    public final void c(org.telegram.ui.ActionBar.d2 d2Var) {
        d2Var.presentFragment(wm.ra(-this.b.id));
    }

    @Override // gi.q6
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        TLRPC.Chat chat = this.b;
        u8Var.q(chat);
        imageReceiver.i0(chat, u8Var, null);
    }
}
