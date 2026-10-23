package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ep extends org.telegram.ui.Components.e90 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ fp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep(fp fpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = fpVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.e90
    public final boolean a(boolean z10, org.telegram.ui.Components.c90 c90Var) {
        ip ipVar = this.x.d;
        if (ipVar.P) {
            return false;
        }
        ipVar.P = true;
        e(new eh(18, this, c90Var), new ai.x9(this, this.w, z10, c90Var, 15));
        return true;
    }

    @Override // org.telegram.ui.Components.e90
    public final boolean b(boolean z10, org.telegram.ui.Components.d90 d90Var) {
        ip ipVar = this.x.d;
        if (ipVar.O) {
            return false;
        }
        ipVar.O = true;
        e(new eh(18, this, d90Var), new ai.x9(this, this.w, z10, d90Var, 14));
        return true;
    }

    public final void e(eh ehVar, Runnable runnable) {
        ip ipVar = this.x.d;
        if (ChatObject.isChannel(ipVar.f)) {
            runnable.run();
        } else {
            ipVar.getMessagesController().convertToMegaGroup(ipVar.getParentActivity(), this.w.id, ipVar, new m4.w0(22, this, runnable), ehVar);
        }
    }
}
