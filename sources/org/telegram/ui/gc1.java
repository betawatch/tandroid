package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gc1 extends org.telegram.ui.Components.nr0 {
    public final /* synthetic */ jc1 a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc1(jc1 jc1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.a1 = jc1Var;
    }

    @Override // org.telegram.ui.Components.nr0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = hVar.m();
            jc1 jc1Var = this.a1;
            if (m10 == 1) {
                jc1Var.a.m0.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i10), 61);
            } else {
                jc1Var.a.m0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
