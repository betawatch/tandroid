package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class du0 extends nr0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du0(Context context, String str, String str2, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context, null, str, false, str2, false, u6Var);
        this.a1 = r2Var;
    }

    @Override // org.telegram.ui.Components.nr0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.g4(this.a1, hVar, i10, 18), 100L);
    }
}
