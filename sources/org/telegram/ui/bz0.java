package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class bz0 extends org.telegram.ui.Components.er0 {
    public final /* synthetic */ ProfileActivity c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz0(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.c1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.er0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new jv0(this, hVar, i10, 16), 250L);
        }
    }
}
