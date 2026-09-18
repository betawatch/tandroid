package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class d10 extends a10 {
    public final /* synthetic */ e10 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d10(e10 e10Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, int i11) {
        super(context, o2Var, i10, i11);
        this.E = e10Var;
    }

    @Override // org.telegram.ui.a10
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.e.l0(tL_exportedChatlistInvite);
    }
}
