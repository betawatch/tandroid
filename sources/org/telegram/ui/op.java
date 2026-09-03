package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class op extends org.telegram.ui.Components.m80 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ pp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op(pp ppVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = ppVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.m80
    public final boolean a(boolean z4, org.telegram.ui.Components.k80 k80Var) {
        sp spVar = this.x.d;
        if (spVar.M) {
            return false;
        }
        spVar.M = true;
        e(new np(2, this, k80Var), new cg.u0(this, this.w, z4, k80Var, 11));
        return true;
    }

    @Override // org.telegram.ui.Components.m80
    public final boolean b(boolean z4, org.telegram.ui.Components.l80 l80Var) {
        sp spVar = this.x.d;
        if (spVar.L) {
            return false;
        }
        spVar.L = true;
        e(new np(2, this, l80Var), new cg.u0(this, this.w, z4, l80Var, 10));
        return true;
    }

    public final void e(np npVar, Runnable runnable) {
        sp spVar = this.x.d;
        if (ChatObject.isChannel(spVar.f)) {
            runnable.run();
        } else {
            spVar.getMessagesController().convertToMegaGroup(spVar.getParentActivity(), this.w.id, spVar, new mg.w(24, this, runnable), npVar);
        }
    }
}
