package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fz extends dz {
    public final /* synthetic */ gz F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz(gz gzVar, Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, int i10) {
        super(context, g2Var, i7, i10);
        this.F = gzVar;
    }

    @Override // org.telegram.ui.dz
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.F.e.r0(tL_exportedChatlistInvite);
    }
}
