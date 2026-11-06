package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class h71 extends org.telegram.ui.Components.mo0 {
    public final /* synthetic */ j71 R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h71(j71 j71Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.R2 = j71Var;
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (z9) {
            int m10 = hVar.m();
            j71 j71Var = this.R2;
            if (m10 == 1) {
                j71Var.a.m0.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i7), 61);
            } else {
                j71Var.a.m0.k(0L, 61, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
