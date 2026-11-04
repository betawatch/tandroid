package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class br0 extends oo0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br0(Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.d2 d2Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.S2 = d2Var;
    }

    @Override // org.telegram.ui.Components.oo0
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        org.telegram.messenger.g0.i3(new org.telegram.ui.f4(this.S2, hVar, i3, 18), 100L);
    }
}
