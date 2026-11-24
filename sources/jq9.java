// default package

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
        dVar.presentFragment(mu1.W9(-this.b.id));
    }

    @Override // kq9
    public final void d(ImageReceiver imageReceiver) {
        pb0 pb0Var = new pb0((wjb) null);
        TLRPC.Chat chat = this.b;
        pb0Var.p(chat);
        imageReceiver.U(chat, pb0Var, null);
    }
}
