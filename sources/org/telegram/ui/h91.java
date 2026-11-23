package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class h91 extends org.telegram.ui.Components.l60 {
    public final /* synthetic */ long v2;
    public final /* synthetic */ j91 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h91(j91 j91Var, Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.g2 g2Var, long j10) {
        super(context, i7, hVar, j3, g2Var, null);
        this.w2 = j91Var;
        this.v2 = j10;
    }

    @Override // org.telegram.ui.Components.l60
    public final boolean S0() {
        TLRPC.Chat O0 = this.w2.b.getMessagesController().O0(Long.valueOf(this.v2));
        return O0 != null && org.telegram.messenger.v3.y(3, O0);
    }
}
