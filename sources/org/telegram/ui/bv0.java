package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bv0 extends org.telegram.ui.Components.oo0 {
    public final /* synthetic */ ProfileActivity S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv0(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.S2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.oo0
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            org.telegram.messenger.g0.i3(new hk0(this, hVar, i3, 29), 250L);
        }
    }
}
