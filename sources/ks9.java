// default package

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ks9 extends ls9 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks9(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // ls9
    public final String a() {
        return jb6.M0(2131754818, null);
    }

    @Override // ls9
    public final String b() {
        return this.b.title;
    }

    @Override // ls9
    public final void c(d dVar) {
        dVar.presentFragment(yv1.ga(-this.b.id));
    }

    @Override // ls9
    public final void d(ImageReceiver imageReceiver) {
        pc0 pc0Var = new pc0((ylb) null);
        TLRPC.Chat chat = this.b;
        pc0Var.p(chat);
        imageReceiver.U(chat, pc0Var, null);
    }
}
