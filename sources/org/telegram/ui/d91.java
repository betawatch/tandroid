package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d91 extends org.telegram.ui.Components.a60 {
    public final /* synthetic */ long v2;
    public final /* synthetic */ f91 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d91(f91 f91Var, Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.e2 e2Var, long j10) {
        super(context, i7, hVar, j3, e2Var, null);
        this.w2 = f91Var;
        this.v2 = j10;
    }

    @Override // org.telegram.ui.Components.a60
    public final boolean R0() {
        TLRPC.Chat M0 = this.w2.b.getMessagesController().M0(Long.valueOf(this.v2));
        return M0 != null && org.telegram.messenger.t3.y(3, M0);
    }
}
