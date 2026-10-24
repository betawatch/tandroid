package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class m00 extends j00 {
    public final /* synthetic */ n00 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m00(n00 n00Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, int i11) {
        super(context, o2Var, i10, i11);
        this.E = n00Var;
    }

    @Override // org.telegram.ui.j00
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.e.l0(tL_exportedChatlistInvite);
    }
}
