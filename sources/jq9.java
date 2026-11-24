// default package

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class jq9 extends kq9 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq9(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // kq9
    public final String a() {
        return k96.M0(2131754818, null);
    }

    @Override // kq9
    public final String b() {
        return this.b.title;
    }

    @Override // kq9
    public final void c(d dVar) {
        dVar.presentFragment(mu1.U9(-this.b.id));
    }

    @Override // kq9
    public final void d(ImageReceiver imageReceiver) {
        pb0 pb0Var = new pb0((wjb) null);
        TLRPC.Chat chat = this.b;
        pb0Var.p(chat);
        imageReceiver.U(chat, pb0Var, null);
    }
}
