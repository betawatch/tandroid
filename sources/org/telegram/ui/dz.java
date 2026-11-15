package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class dz extends bz {
    public final /* synthetic */ ez F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz(ez ezVar, Context context, org.telegram.ui.ActionBar.e2 e2Var, int i7, int i10) {
        super(context, e2Var, i7, i10);
        this.F = ezVar;
    }

    @Override // org.telegram.ui.bz
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.F.e.r0(tL_exportedChatlistInvite);
    }
}
