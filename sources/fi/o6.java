package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        TLRPC.Chat chat = this.b;
        v8Var.q(chat);
        imageReceiver.i0(chat, v8Var, null);
    }
}
