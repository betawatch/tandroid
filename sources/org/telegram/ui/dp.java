package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dp extends org.telegram.ui.Components.t70 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ ep x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp(ep epVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = epVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.t70
    public final boolean a(boolean z10, org.telegram.ui.Components.r70 r70Var) {
        hp hpVar = this.x.d;
        if (hpVar.L) {
            return false;
        }
        hpVar.L = true;
        e(new rd(27, this, r70Var), new bg.d(this, this.w, z10, r70Var, 13));
        return true;
    }

    @Override // org.telegram.ui.Components.t70
    public final boolean b(boolean z10, org.telegram.ui.Components.s70 s70Var) {
        hp hpVar = this.x.d;
        if (hpVar.K) {
            return false;
        }
        hpVar.K = true;
        e(new rd(27, this, s70Var), new bg.d(this, this.w, z10, s70Var, 12));
        return true;
    }

    public final void e(rd rdVar, Runnable runnable) {
        hp hpVar = this.x.d;
        if (ChatObject.isChannel(hpVar.f)) {
            runnable.run();
        } else {
            hpVar.getMessagesController().convertToMegaGroup(hpVar.getParentActivity(), this.w.id, hpVar, new ih.v3(25, this, runnable), rdVar);
        }
    }
}
