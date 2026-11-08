package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class i71 extends org.telegram.ui.Components.mo0 {
    public final /* synthetic */ k71 R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i71(k71 k71Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.R2 = k71Var;
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (z9) {
            int m10 = hVar.m();
            k71 k71Var = this.R2;
            if (m10 == 1) {
                k71Var.a.m0.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i7), 61);
            } else {
                k71Var.a.m0.k(0L, 61, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
