package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f91 extends org.telegram.ui.Components.i60 {
    public final /* synthetic */ long v2;
    public final /* synthetic */ h91 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f91(h91 h91Var, Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.g2 g2Var, long j10) {
        super(context, i7, hVar, j3, g2Var, null);
        this.w2 = h91Var;
        this.v2 = j10;
    }

    @Override // org.telegram.ui.Components.i60
    public final boolean S0() {
        TLRPC.Chat O0 = this.w2.b.getMessagesController().O0(Long.valueOf(this.v2));
        return O0 != null && org.telegram.messenger.v3.y(3, O0);
    }
}
