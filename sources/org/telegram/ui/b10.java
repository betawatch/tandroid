package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class b10 extends y00 {
    public final /* synthetic */ c10 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b10(c10 c10Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, int i11) {
        super(context, n2Var, i10, i11);
        this.E = c10Var;
    }

    @Override // org.telegram.ui.y00
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.e.l0(tL_exportedChatlistInvite);
    }
}
