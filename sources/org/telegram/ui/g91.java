package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class g91 extends org.telegram.ui.Components.x50 {
    public final /* synthetic */ long r2;
    public final /* synthetic */ i91 s2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g91(i91 i91Var, Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.f2 f2Var, long j10) {
        super(context, i7, hVar, j3, f2Var, null);
        this.s2 = i91Var;
        this.r2 = j10;
    }

    @Override // org.telegram.ui.Components.x50
    public final boolean R0() {
        TLRPC.Chat M0 = this.s2.b.getMessagesController().M0(Long.valueOf(this.r2));
        return M0 != null && org.telegram.messenger.t3.y(3, M0);
    }
}
