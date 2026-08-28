package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j00 extends g00 {
    public final /* synthetic */ k00 A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j00(k00 k00Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i9, int i10) {
        super(context, o2Var, i9, i10);
        this.A = k00Var;
    }

    @Override // org.telegram.ui.g00
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.A.e.k0(tL_exportedChatlistInvite);
    }
}
