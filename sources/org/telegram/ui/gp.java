package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class gp extends org.telegram.ui.Components.f90 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ hp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp(hp hpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = hpVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.f90
    public final boolean a(boolean z10, org.telegram.ui.Components.d90 d90Var) {
        kp kpVar = this.x.d;
        if (kpVar.P) {
            return false;
        }
        kpVar.P = true;
        e(new eh(18, this, d90Var), new ai.x9(this, this.w, z10, d90Var, 16));
        return true;
    }

    @Override // org.telegram.ui.Components.f90
    public final boolean b(boolean z10, org.telegram.ui.Components.e90 e90Var) {
        kp kpVar = this.x.d;
        if (kpVar.O) {
            return false;
        }
        kpVar.O = true;
        e(new eh(18, this, e90Var), new ai.x9(this, this.w, z10, e90Var, 15));
        return true;
    }

    public final void e(eh ehVar, Runnable runnable) {
        kp kpVar = this.x.d;
        if (ChatObject.isChannel(kpVar.f)) {
            runnable.run();
        } else {
            kpVar.getMessagesController().convertToMegaGroup(kpVar.getParentActivity(), this.w.id, kpVar, new m4.w0(22, this, runnable), ehVar);
        }
    }
}
