package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class dz0 extends org.telegram.ui.Components.hq0 {
    public final /* synthetic */ ez0 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz0(ez0 ez0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.b1 = ez0Var;
    }

    @Override // org.telegram.ui.Components.hq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new by0(this, iVar, i10, 7), 250L);
        }
    }
}
