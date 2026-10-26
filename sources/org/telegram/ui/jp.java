package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class jp extends org.telegram.ui.Components.g90 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ kp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp(kp kpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = kpVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.g90
    public final boolean a(boolean z10, org.telegram.ui.Components.e90 e90Var) {
        np npVar = this.x.d;
        if (npVar.P) {
            return false;
        }
        npVar.P = true;
        e(new ed(29, this, e90Var), new bi.s9(this, this.w, z10, e90Var, 16));
        return true;
    }

    @Override // org.telegram.ui.Components.g90
    public final boolean b(boolean z10, org.telegram.ui.Components.f90 f90Var) {
        np npVar = this.x.d;
        if (npVar.O) {
            return false;
        }
        npVar.O = true;
        e(new ed(29, this, f90Var), new bi.s9(this, this.w, z10, f90Var, 15));
        return true;
    }

    public final void e(ed edVar, Runnable runnable) {
        np npVar = this.x.d;
        if (ChatObject.isChannel(npVar.f)) {
            runnable.run();
        } else {
            npVar.getMessagesController().convertToMegaGroup(npVar.getParentActivity(), this.w.id, npVar, new m4.s0(25, this, runnable), edVar);
        }
    }
}
