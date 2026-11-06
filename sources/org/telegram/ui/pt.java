package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class pt extends org.telegram.ui.Components.mo0 {
    public final /* synthetic */ qt R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt(qt qtVar, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.R2 = qtVar;
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (z9) {
            org.telegram.messenger.g0.i3(new org.telegram.ui.Components.g51(this, hVar, i7), 250L);
        }
    }
}
