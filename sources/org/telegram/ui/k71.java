package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k71 extends org.telegram.ui.Components.mo0 {
    public final /* synthetic */ m71 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k71(m71 m71Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.U2 = m71Var;
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (z9) {
            int m10 = hVar.m();
            m71 m71Var = this.U2;
            if (m10 == 1) {
                m71Var.a.m0.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i7), 61);
            } else {
                m71Var.a.m0.k(0L, 61, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
