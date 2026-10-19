package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class my0 extends org.telegram.ui.Components.er0 {
    public final /* synthetic */ ny0 c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my0(ny0 ny0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.c1 = ny0Var;
    }

    @Override // org.telegram.ui.Components.er0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new jv0(this, hVar, i10, 15), 250L);
        }
    }
}
