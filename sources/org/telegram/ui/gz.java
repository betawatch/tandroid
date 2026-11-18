package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class gz extends ez {
    public final /* synthetic */ hz F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz(hz hzVar, Context context, org.telegram.ui.ActionBar.h2 h2Var, int i7, int i10) {
        super(context, h2Var, i7, i10);
        this.F = hzVar;
    }

    @Override // org.telegram.ui.ez
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.F.e.r0(tL_exportedChatlistInvite);
    }
}
