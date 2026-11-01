package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class d00 extends b00 {
    public final /* synthetic */ e00 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d00(e00 e00Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, int i10, int i11) {
        super(context, k2Var, i10, i11);
        this.E = e00Var;
    }

    @Override // org.telegram.ui.b00
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.e.r0(tL_exportedChatlistInvite);
    }
}
