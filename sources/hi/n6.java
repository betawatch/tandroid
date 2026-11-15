package hi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n6 extends o6 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // hi.o6
    public final String a() {
        return hd.M0(2131754819, null);
    }

    @Override // hi.o6
    public final String b() {
        return this.b.title;
    }

    @Override // hi.o6
    public final void c(org.telegram.ui.ActionBar.e2 e2Var) {
        e2Var.presentFragment(an.ua(-this.b.id));
    }

    @Override // hi.o6
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        TLRPC.Chat chat = this.b;
        t8Var.q(chat);
        imageReceiver.i0(chat, t8Var, null);
    }
}
