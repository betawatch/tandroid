package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d91 extends org.telegram.ui.Components.sq0 {
    public final /* synthetic */ k91 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d91(k91 k91Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.b1 = k91Var;
    }

    @Override // org.telegram.ui.Components.sq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new ey0(this, iVar, i10, 29), 250L);
        }
    }
}
