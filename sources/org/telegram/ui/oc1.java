package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class oc1 extends org.telegram.ui.Components.lq0 {
    public final /* synthetic */ qc1 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc1(qc1 qc1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.Y0 = qc1Var;
    }

    @Override // org.telegram.ui.Components.lq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (z4) {
            int m9 = hVar.m();
            qc1 qc1Var = this.Y0;
            if (m9 == 1) {
                qc1Var.a.i0.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i10), 61);
            } else {
                qc1Var.a.i0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
