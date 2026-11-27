// default package

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class bu9 extends cu9 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu9(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // cu9
    public final String a() {
        return ob6.M0(2131754814, null);
    }

    @Override // cu9
    public final String b() {
        return this.b.title;
    }

    @Override // cu9
    public final void c(e eVar) {
        eVar.presentFragment(zu1.ha(-this.b.id));
    }

    @Override // cu9
    public final void d(ImageReceiver imageReceiver) {
        rb0 rb0Var = new rb0((vnb) null);
        TLRPC.Chat chat = this.b;
        rb0Var.p(chat);
        imageReceiver.U(chat, rb0Var, null);
    }
}
