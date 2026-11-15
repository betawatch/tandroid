package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f71 extends org.telegram.ui.Components.po0 {
    public final /* synthetic */ i71 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f71(i71 i71Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.V2 = i71Var;
    }

    @Override // org.telegram.ui.Components.po0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = hVar.m();
            i71 i71Var = this.V2;
            if (m10 == 1) {
                i71Var.a.n0.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i7), 61);
            } else {
                i71Var.a.n0.k(0L, 61, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
