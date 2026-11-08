package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class gu extends mo0 {
    public final /* synthetic */ ru R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu(ru ruVar, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.R2 = ruVar;
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        org.telegram.messenger.g0.i3(new org.telegram.ui.q8(this, hVar, i7, 6), 100L);
    }
}
