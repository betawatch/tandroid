package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class cr0 extends org.telegram.ui.Cells.k7 {
    public final /* synthetic */ er0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr0(er0 er0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, 0, u6Var);
        this.N = er0Var;
    }

    @Override // org.telegram.ui.Cells.k7
    public final String a() {
        return this.N.f.b0 ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
