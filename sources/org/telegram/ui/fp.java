package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fp extends org.telegram.ui.Components.x70 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ gp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp(gp gpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = gpVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.x70
    public final boolean a(boolean z10, org.telegram.ui.Components.v70 v70Var) {
        jp jpVar = this.x.d;
        if (jpVar.L) {
            return false;
        }
        jpVar.L = true;
        e(new rd(27, this, v70Var), new cg.c(this, this.w, z10, v70Var, 12));
        return true;
    }

    @Override // org.telegram.ui.Components.x70
    public final boolean b(boolean z10, org.telegram.ui.Components.w70 w70Var) {
        jp jpVar = this.x.d;
        if (jpVar.K) {
            return false;
        }
        jpVar.K = true;
        e(new rd(27, this, w70Var), new cg.c(this, this.w, z10, w70Var, 11));
        return true;
    }

    public final void e(rd rdVar, Runnable runnable) {
        jp jpVar = this.x.d;
        if (ChatObject.isChannel(jpVar.f)) {
            runnable.run();
        } else {
            jpVar.getMessagesController().convertToMegaGroup(jpVar.getParentActivity(), this.w.id, jpVar, new jh.z1(25, this, runnable), rdVar);
        }
    }
}
