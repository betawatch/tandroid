package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dr0 extends org.telegram.ui.Cells.k7 {
    public final /* synthetic */ fr0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr0(fr0 fr0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, 0, u6Var);
        this.N = fr0Var;
    }

    @Override // org.telegram.ui.Cells.k7
    public final String a() {
        return this.N.f.b0 ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
