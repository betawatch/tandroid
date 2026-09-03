package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class p81 extends org.telegram.ui.Components.lq0 {
    public final /* synthetic */ w81 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p81(w81 w81Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.Y0 = w81Var;
    }

    @Override // org.telegram.ui.Components.lq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (z4) {
            AndroidUtilities.runOnUIThread(new b11(this, hVar, i10), 250L);
        }
    }
}
