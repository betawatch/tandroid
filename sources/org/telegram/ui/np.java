package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class np extends org.telegram.ui.Components.n80 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ op x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np(op opVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = opVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.n80
    public final boolean a(boolean z4, org.telegram.ui.Components.l80 l80Var) {
        rp rpVar = this.x.d;
        if (rpVar.M) {
            return false;
        }
        rpVar.M = true;
        e(new mp(2, this, l80Var), new dg.t0(this, this.w, z4, l80Var, 11));
        return true;
    }

    @Override // org.telegram.ui.Components.n80
    public final boolean b(boolean z4, org.telegram.ui.Components.m80 m80Var) {
        rp rpVar = this.x.d;
        if (rpVar.L) {
            return false;
        }
        rpVar.L = true;
        e(new mp(2, this, m80Var), new dg.t0(this, this.w, z4, m80Var, 10));
        return true;
    }

    public final void e(mp mpVar, Runnable runnable) {
        rp rpVar = this.x.d;
        if (ChatObject.isChannel(rpVar.f)) {
            runnable.run();
        } else {
            rpVar.getMessagesController().convertToMegaGroup(rpVar.getParentActivity(), this.w.id, rpVar, new ng.w(24, this, runnable), mpVar);
        }
    }
}
