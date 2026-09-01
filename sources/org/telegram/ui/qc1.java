package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class qc1 extends org.telegram.ui.Components.mq0 {
    public final /* synthetic */ sc1 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc1(sc1 sc1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.Y0 = sc1Var;
    }

    @Override // org.telegram.ui.Components.mq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (z4) {
            int m9 = hVar.m();
            sc1 sc1Var = this.Y0;
            if (m9 == 1) {
                sc1Var.a.i0.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i10), 61);
            } else {
                sc1Var.a.i0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
