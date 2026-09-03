package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class at0 extends lq0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at0(Context context, String str, String str2, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context, null, str, false, str2, false, g6Var);
        this.Y0 = p2Var;
    }

    @Override // org.telegram.ui.Components.lq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        AndroidUtilities.runOnUIThread(new gy(this.Y0, hVar, i10, 12), 100L);
    }
}
