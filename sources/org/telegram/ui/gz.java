package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class gz extends ez {
    public final /* synthetic */ hz F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz(hz hzVar, Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, int i10) {
        super(context, g2Var, i7, i10);
        this.F = hzVar;
    }

    @Override // org.telegram.ui.ez
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.F.e.r0(tL_exportedChatlistInvite);
    }
}
