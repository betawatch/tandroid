package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ru extends op0 {
    public final /* synthetic */ cv R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru(cv cvVar, Context context, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, str, false, str2, false, p6Var);
        this.R2 = cvVar;
    }

    @Override // org.telegram.ui.Components.op0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        org.telegram.messenger.i0.h3(new ag.o0(this, hVar, i10, 23), 100L);
    }
}
