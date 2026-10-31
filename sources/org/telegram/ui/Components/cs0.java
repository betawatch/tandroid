package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cs0 extends op0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs0(Context context, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.ActionBar.k2 k2Var) {
        super(context, null, str, false, str2, false, p6Var);
        this.R2 = k2Var;
    }

    @Override // org.telegram.ui.Components.op0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        org.telegram.messenger.i0.h3(new ji0(this.R2, hVar, i10, 4), 100L);
    }
}
