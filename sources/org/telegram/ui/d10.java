package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d10 extends a10 {
    public final /* synthetic */ e10 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d10(e10 e10Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, int i11) {
        super(context, p2Var, i10, i11);
        this.E = e10Var;
    }

    @Override // org.telegram.ui.a10
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.e.l0(tL_exportedChatlistInvite);
    }
}
