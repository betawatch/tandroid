package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e00 extends c00 {
    public final /* synthetic */ f00 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e00(f00 f00Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, int i10, int i11) {
        super(context, k2Var, i10, i11);
        this.E = f00Var;
    }

    @Override // org.telegram.ui.c00
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.e.q0(tL_exportedChatlistInvite);
    }
}
