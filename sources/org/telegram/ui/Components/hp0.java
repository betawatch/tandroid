package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hp0 extends org.telegram.ui.Cells.b7 {
    public final /* synthetic */ jp0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(jp0 jp0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 0, c6Var);
        this.J = jp0Var;
    }

    @Override // org.telegram.ui.Cells.b7
    public final String a() {
        return this.J.f.W ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
