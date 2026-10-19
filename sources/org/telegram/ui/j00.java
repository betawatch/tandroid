package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class j00 extends g00 {
    public final /* synthetic */ k00 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j00(k00 k00Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, int i11) {
        super(context, n2Var, i10, i11);
        this.E = k00Var;
    }

    @Override // org.telegram.ui.g00
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.e.l0(tL_exportedChatlistInvite);
    }
}
