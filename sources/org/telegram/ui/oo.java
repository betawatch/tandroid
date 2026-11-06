package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class oo extends org.telegram.ui.Components.f70 {
    public final /* synthetic */ TLRPC.Chat x;
    public final /* synthetic */ po y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo(po poVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.y = poVar;
        this.x = chat2;
    }

    @Override // org.telegram.ui.Components.f70
    public final boolean a(boolean z9, org.telegram.ui.Components.d70 d70Var) {
        so soVar = this.y.d;
        if (soVar.P) {
            return false;
        }
        soVar.P = true;
        e(new qf(26, this, d70Var), new vn(this, this.x, z9, d70Var, 2));
        return true;
    }

    @Override // org.telegram.ui.Components.f70
    public final boolean b(boolean z9, org.telegram.ui.Components.e70 e70Var) {
        so soVar = this.y.d;
        if (soVar.O) {
            return false;
        }
        soVar.O = true;
        e(new qf(26, this, e70Var), new vn(this, this.x, z9, e70Var, 1));
        return true;
    }

    public final void e(qf qfVar, Runnable runnable) {
        so soVar = this.y.d;
        if (org.telegram.messenger.t3.T(soVar.f)) {
            runnable.run();
        } else {
            soVar.getMessagesController().T(soVar.getParentActivity(), this.x.id, soVar, new ni.c(20, this, runnable), qfVar);
        }
    }
}
