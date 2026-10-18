package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class gp extends org.telegram.ui.Components.e90 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ hp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp(hp hpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = hpVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.e90
    public final boolean a(boolean z10, org.telegram.ui.Components.c90 c90Var) {
        kp kpVar = this.x.d;
        if (kpVar.P) {
            return false;
        }
        kpVar.P = true;
        e(new gh(18, this, c90Var), new ai.x9(this, this.w, z10, c90Var, 15));
        return true;
    }

    @Override // org.telegram.ui.Components.e90
    public final boolean b(boolean z10, org.telegram.ui.Components.d90 d90Var) {
        kp kpVar = this.x.d;
        if (kpVar.O) {
            return false;
        }
        kpVar.O = true;
        e(new gh(18, this, d90Var), new ai.x9(this, this.w, z10, d90Var, 14));
        return true;
    }

    public final void e(gh ghVar, Runnable runnable) {
        kp kpVar = this.x.d;
        if (ChatObject.isChannel(kpVar.f)) {
            runnable.run();
        } else {
            kpVar.getMessagesController().convertToMegaGroup(kpVar.getParentActivity(), this.w.id, kpVar, new m4.w0(22, this, runnable), ghVar);
        }
    }
}
