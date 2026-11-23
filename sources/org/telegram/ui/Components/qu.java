package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class qu extends zo0 {
    public final /* synthetic */ bv V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu(bv bvVar, Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.V2 = bvVar;
    }

    @Override // org.telegram.ui.Components.zo0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        org.telegram.messenger.g0.h3(new org.telegram.ui.f0(this, hVar, i7, 9), 100L);
    }
}
