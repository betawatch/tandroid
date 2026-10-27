package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class m00 extends j00 {
    public final /* synthetic */ n00 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m00(n00 n00Var, Context context, org.telegram.ui.ActionBar.r2 r2Var, int i10, int i11) {
        super(context, r2Var, i10, i11);
        this.E = n00Var;
    }

    @Override // org.telegram.ui.j00
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.e.n0(tL_exportedChatlistInvite);
    }
}
