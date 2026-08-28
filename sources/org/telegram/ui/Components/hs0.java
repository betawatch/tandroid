package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hs0 extends rp0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs0(Context context, String str, String str2, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null, str, false, str2, false, b6Var);
        this.X0 = o2Var;
    }

    @Override // org.telegram.ui.Components.rp0
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.rl(this.X0, hVar, i9, 15), 100L);
    }
}
