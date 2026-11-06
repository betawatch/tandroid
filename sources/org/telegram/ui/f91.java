package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class f91 extends org.telegram.ui.Components.x50 {
    public final /* synthetic */ long r2;
    public final /* synthetic */ h91 s2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f91(h91 h91Var, Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.f2 f2Var, long j10) {
        super(context, i7, hVar, j3, f2Var, null);
        this.s2 = h91Var;
        this.r2 = j10;
    }

    @Override // org.telegram.ui.Components.x50
    public final boolean R0() {
        TLRPC.Chat M0 = this.s2.b.getMessagesController().M0(Long.valueOf(this.r2));
        return M0 != null && org.telegram.messenger.t3.y(3, M0);
    }
}
