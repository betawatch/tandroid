package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class a30 extends org.telegram.ui.Components.zo0 {
    public final /* synthetic */ e40 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a30(e40 e40Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.V2 = e40Var;
    }

    @Override // org.telegram.ui.Components.zo0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = hVar.m();
            e40 e40Var = this.V2;
            if (m10 == 1) {
                e40Var.o1().m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i7), 41);
            } else {
                e40Var.o1().k(0L, 41, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
