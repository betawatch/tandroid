package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class au0 extends ir0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au0(Context context, String str, String str2, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null, str, false, str2, false, g6Var);
        this.e1 = o2Var;
    }

    @Override // org.telegram.ui.Components.ir0
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.h4(this.e1, hVar, i10, 20), 100L);
    }
}
