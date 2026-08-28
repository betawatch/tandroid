package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gy0 extends org.telegram.ui.Components.rp0 {
    public final /* synthetic */ hy0 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy0(hy0 hy0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.X0 = hy0Var;
    }

    @Override // org.telegram.ui.Components.rp0
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new ys0(this, hVar, i9, 19), 250L);
        }
    }
}
