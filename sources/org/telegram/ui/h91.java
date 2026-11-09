package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h91 extends org.telegram.ui.Components.y50 {
    public final /* synthetic */ long r2;
    public final /* synthetic */ j91 s2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h91(j91 j91Var, Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.f2 f2Var, long j10) {
        super(context, i7, hVar, j3, f2Var, null);
        this.s2 = j91Var;
        this.r2 = j10;
    }

    @Override // org.telegram.ui.Components.y50
    public final boolean R0() {
        TLRPC.Chat M0 = this.s2.b.getMessagesController().M0(Long.valueOf(this.r2));
        return M0 != null && org.telegram.messenger.t3.y(3, M0);
    }
}
