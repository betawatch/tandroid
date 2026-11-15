package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class lu extends po0 {
    public final /* synthetic */ wu V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu(wu wuVar, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.V2 = wuVar;
    }

    @Override // org.telegram.ui.Components.po0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        org.telegram.messenger.g0.i3(new org.telegram.ui.f0(this, hVar, i7, 9), 100L);
    }
}
