package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gp extends org.telegram.ui.Components.g80 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ hp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp(hp hpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = hpVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.g80
    public final boolean a(boolean z10, org.telegram.ui.Components.e80 e80Var) {
        kp kpVar = this.x.d;
        if (kpVar.L) {
            return false;
        }
        kpVar.L = true;
        e(new vf(24, this, e80Var), new ag.w0(this, this.w, z10, e80Var, 13));
        return true;
    }

    @Override // org.telegram.ui.Components.g80
    public final boolean b(boolean z10, org.telegram.ui.Components.f80 f80Var) {
        kp kpVar = this.x.d;
        if (kpVar.K) {
            return false;
        }
        kpVar.K = true;
        e(new vf(24, this, f80Var), new ag.w0(this, this.w, z10, f80Var, 12));
        return true;
    }

    public final void e(vf vfVar, Runnable runnable) {
        kp kpVar = this.x.d;
        if (ChatObject.isChannel(kpVar.f)) {
            runnable.run();
        } else {
            kpVar.getMessagesController().convertToMegaGroup(kpVar.getParentActivity(), this.w.id, kpVar, new kg.w(25, this, runnable), vfVar);
        }
    }
}
