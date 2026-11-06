package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class cz extends az {
    public final /* synthetic */ dz E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz(dz dzVar, Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, int i10) {
        super(context, f2Var, i7, i10);
        this.E = dzVar;
    }

    @Override // org.telegram.ui.az
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.e.r0(tL_exportedChatlistInvite);
    }
}
