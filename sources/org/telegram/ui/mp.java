package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class mp extends org.telegram.ui.Components.m80 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ np x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp(np npVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = npVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.m80
    public final boolean a(boolean z4, org.telegram.ui.Components.k80 k80Var) {
        qp qpVar = this.x.d;
        if (qpVar.M) {
            return false;
        }
        qpVar.M = true;
        e(new hp(3, this, k80Var), new cg.u0(this, this.w, z4, k80Var, 11));
        return true;
    }

    @Override // org.telegram.ui.Components.m80
    public final boolean b(boolean z4, org.telegram.ui.Components.l80 l80Var) {
        qp qpVar = this.x.d;
        if (qpVar.L) {
            return false;
        }
        qpVar.L = true;
        e(new hp(3, this, l80Var), new cg.u0(this, this.w, z4, l80Var, 10));
        return true;
    }

    public final void e(hp hpVar, Runnable runnable) {
        qp qpVar = this.x.d;
        if (ChatObject.isChannel(qpVar.f)) {
            runnable.run();
        } else {
            qpVar.getMessagesController().convertToMegaGroup(qpVar.getParentActivity(), this.w.id, qpVar, new mg.w(24, this, runnable), hpVar);
        }
    }
}
