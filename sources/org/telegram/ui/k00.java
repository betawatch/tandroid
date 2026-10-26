package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class k00 extends h00 {
    public final /* synthetic */ l00 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k00(l00 l00Var, Context context, org.telegram.ui.ActionBar.r2 r2Var, int i10, int i11) {
        super(context, r2Var, i10, i11);
        this.E = l00Var;
    }

    @Override // org.telegram.ui.h00
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.e.n0(tL_exportedChatlistInvite);
    }
}
