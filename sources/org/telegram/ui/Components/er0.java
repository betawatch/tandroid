package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class er0 extends po0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er0(Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.e2 e2Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.V2 = e2Var;
    }

    @Override // org.telegram.ui.Components.po0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        org.telegram.messenger.g0.i3(new org.telegram.ui.f0(this.V2, hVar, i7, 20), 100L);
    }
}
