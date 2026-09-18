package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class kz0 extends org.telegram.ui.Components.vq0 {
    public final /* synthetic */ lz0 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz0(lz0 lz0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.b1 = lz0Var;
    }

    @Override // org.telegram.ui.Components.vq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new cy0(this, iVar, i10, 11), 250L);
        }
    }
}
