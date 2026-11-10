package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i91 extends org.telegram.ui.Components.x50 {
    public final /* synthetic */ long u2;
    public final /* synthetic */ k91 v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i91(k91 k91Var, Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.f2 f2Var, long j10) {
        super(context, i7, hVar, j3, f2Var, null);
        this.v2 = k91Var;
        this.u2 = j10;
    }

    @Override // org.telegram.ui.Components.x50
    public final boolean R0() {
        TLRPC.Chat M0 = this.v2.b.getMessagesController().M0(Long.valueOf(this.u2));
        return M0 != null && org.telegram.messenger.t3.y(3, M0);
    }
}
