package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class kv0 extends org.telegram.ui.Components.yo0 {
    public final /* synthetic */ ProfileActivity V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv0(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.V2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.yo0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            org.telegram.messenger.g0.h3(new tr0(this, hVar, i7, 16), 250L);
        }
    }
}
