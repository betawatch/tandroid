package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class mr0 extends yo0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr0(Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h2 h2Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.V2 = h2Var;
    }

    @Override // org.telegram.ui.Components.yo0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        org.telegram.messenger.g0.h3(new org.telegram.ui.b0(this.V2, hVar, i7, 21), 100L);
    }
}
