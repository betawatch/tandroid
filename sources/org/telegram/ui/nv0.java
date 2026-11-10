package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class nv0 extends org.telegram.ui.Components.mo0 {
    public final /* synthetic */ ProfileActivity U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv0(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.U2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (z9) {
            org.telegram.messenger.g0.i3(new tn0(this, hVar, i7, 26), 250L);
        }
    }
}
