package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class o81 extends org.telegram.ui.Components.lq0 {
    public final /* synthetic */ v81 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o81(v81 v81Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.Y0 = v81Var;
    }

    @Override // org.telegram.ui.Components.lq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (z4) {
            AndroidUtilities.runOnUIThread(new h21(this, hVar, i10), 250L);
        }
    }
}
