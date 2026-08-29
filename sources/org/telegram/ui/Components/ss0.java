package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ss0 extends dq0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.X0 = o2Var;
    }

    @Override // org.telegram.ui.Components.dq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new rm(this.X0, hVar, i10, 14), 100L);
    }
}
