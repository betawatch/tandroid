package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class az extends yy {
    public final /* synthetic */ bz F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az(bz bzVar, Context context, org.telegram.ui.ActionBar.d2 d2Var, int i3, int i10) {
        super(context, d2Var, i3, i10);
        this.F = bzVar;
    }

    @Override // org.telegram.ui.yy
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.F.e.r0(tL_exportedChatlistInvite);
    }
}
