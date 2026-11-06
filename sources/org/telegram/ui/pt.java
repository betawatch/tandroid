package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
            org.telegram.messenger.g0.i3(new org.telegram.ui.Components.l51(this, hVar, i7), 250L);
        }
    }
}
