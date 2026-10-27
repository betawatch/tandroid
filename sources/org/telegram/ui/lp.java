package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lp extends org.telegram.ui.Components.h90 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ mp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp(mp mpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = mpVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.h90
    public final boolean a(boolean z10, org.telegram.ui.Components.f90 f90Var) {
        pp ppVar = this.x.d;
        if (ppVar.P) {
            return false;
        }
        ppVar.P = true;
        e(new ed(29, this, f90Var), new bi.s9(this, this.w, z10, f90Var, 16));
        return true;
    }

    @Override // org.telegram.ui.Components.h90
    public final boolean b(boolean z10, org.telegram.ui.Components.g90 g90Var) {
        pp ppVar = this.x.d;
        if (ppVar.O) {
            return false;
        }
        ppVar.O = true;
        e(new ed(29, this, g90Var), new bi.s9(this, this.w, z10, g90Var, 15));
        return true;
    }

    public final void e(ed edVar, Runnable runnable) {
        pp ppVar = this.x.d;
        if (ChatObject.isChannel(ppVar.f)) {
            runnable.run();
        } else {
            ppVar.getMessagesController().convertToMegaGroup(ppVar.getParentActivity(), this.w.id, ppVar, new m4.s0(25, this, runnable), edVar);
        }
    }
}
