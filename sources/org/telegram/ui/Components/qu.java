package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class qu extends yo0 {
    public final /* synthetic */ bv V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu(bv bvVar, Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.V2 = bvVar;
    }

    @Override // org.telegram.ui.Components.yo0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        org.telegram.messenger.g0.h3(new org.telegram.ui.b0(this, hVar, i7, 10), 100L);
    }
}
