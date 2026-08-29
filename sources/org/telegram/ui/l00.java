package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l00 extends i00 {
    public final /* synthetic */ m00 A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l00(m00 m00Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, int i11) {
        super(context, o2Var, i10, i11);
        this.A = m00Var;
    }

    @Override // org.telegram.ui.i00
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.A.e.l0(tL_exportedChatlistInvite);
    }
}
