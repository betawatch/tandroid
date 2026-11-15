package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class iv0 extends org.telegram.ui.Components.po0 {
    public final /* synthetic */ ProfileActivity V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv0(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.V2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.po0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            org.telegram.messenger.g0.i3(new mp0(this, hVar, i7, 21), 250L);
        }
    }
}
